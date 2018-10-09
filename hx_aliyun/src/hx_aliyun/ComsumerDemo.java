package hx_aliyun;

import com.aliyun.mns.client.CloudAccount;
import com.aliyun.mns.client.CloudQueue;
import com.aliyun.mns.client.MNSClient;
import com.aliyun.mns.common.ClientException;
import com.aliyun.mns.common.ServiceException;
import com.aliyun.mns.common.utils.ServiceSettings;
import com.aliyun.mns.model.Message;

public class ComsumerDemo {
	public String _message;
	public  void comsumer() {
        CloudAccount account = new CloudAccount(
                ServiceSettings.getMNSAccessKeyId(),
                ServiceSettings.getMNSAccessKeySecret(),
                ServiceSettings.getMNSAccountEndpoint());
        MNSClient client = account.getMNSClient(); //this client need only initialize once

        // Demo for receive message code
        try{
            CloudQueue queue = client.getQueueRef("cloud-queue-demo");// replace with your queue name
                Message popMsg = queue.popMessage();
                if (popMsg != null){
                    System.out.println("message handle: " + popMsg.getReceiptHandle());
                    System.out.println("message body: " + popMsg.getMessageBodyAsString());
                    _message=popMsg.getMessageBodyAsString();
                    System.out.println("message id: " + popMsg.getMessageId());
                    //<<to add your special logic.>>
                    
                    //remember to  delete message when consume message successfully.
                    queue.deleteMessage(popMsg.getReceiptHandle());
                    System.out.println("delete message successfully.\n");
                }

        } catch (ClientException ce)
        {
        	_message="暂时没有消息可以接受了";
            System.out.println("Something wrong with the network connection between client and MNS service."
                    + "Please check your network and DNS availablity.");
            ce.printStackTrace();
        } catch (ServiceException se)
        {
            if (se.getErrorCode().equals("QueueNotExist"))
            {
                System.out.println("Queue is not exist.Please create queue before use");
            } else if (se.getErrorCode().equals("TimeExpired"))
            {
                System.out.println("The request is time expired. Please check your local machine timeclock");
            }
            /*
            you can get more MNS service error code in following link.
            https://help.aliyun.com/document_detail/mns/api_reference/error_code/error_code.html?spm=5176.docmns/api_reference/error_code/error_response
            */
            se.printStackTrace();
        } catch (Exception e)
        {
            System.out.println("Unknown exception happened!");
            e.printStackTrace();
        }

        client.close();
    }

}
