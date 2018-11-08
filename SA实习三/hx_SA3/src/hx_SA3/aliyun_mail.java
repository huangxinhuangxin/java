package hx_SA3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dm.model.v20151123.SingleSendMailRequest;
import com.aliyuncs.dm.model.v20151123.SingleSendMailResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;

public class aliyun_mail {
	public String sendEmail(String _url,String _payload)
	{			
        IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIhSu2mTkvkKlB", "kkY0z08q1ZR6fShbaaesEz5aH7n9L9");	    
        IAcsClient client = new DefaultAcsClient(profile);	    
        SingleSendMailRequest request = new SingleSendMailRequest();	    
        try {
     //request.setVersion("2017-06-22");// 如果是除杭州region外的其它region（如新加坡region）,必须指定为2017-06-22	    	
        	request.setAccountName("huangxin@mail.hxhuangxin.com");	        
        	request.setFromAlias("黄鑫");	        
        	request.setAddressType(1);
        	request.setTagName("hx");	        
        	request.setReplyToAddress(true);	
        	if(validateEmailAddress(_url)=="Y")
        	{
        		request.setToAddress(_url);//("目标地址");
        	}
        	else
        	{
        		return "N";
        	}
        //可以给多个收件人发送邮件，收件人之间用逗号分开，批量发信建议使用BatchSendMailRequest方式
        //request.setToAddress("邮箱1,邮箱2");	        
        	request.setSubject("单人邮件");	        
        	request.setHtmlBody(_payload);//("邮件正文");	        
        	SingleSendMailResponse httpResponse = client.getAcsResponse(request);	    
        } catch (ServerException e) {	        
        	e.printStackTrace();	        
        	return "N";	    
        }	    
        catch (ClientException e) {	        
        	e.printStackTrace();	        
        	return "N";	    
        }		
        return "Y";		
	}
	public String sendEmailBatch(String _url_1,String _url_2,String _url_3,String _payload)
	{
    IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIhSu2mTkvkKlB", "kkY0z08q1ZR6fShbaaesEz5aH7n9L9");
    IAcsClient client = new DefaultAcsClient(profile);
    SingleSendMailRequest request = new SingleSendMailRequest();
    try {
     //request.setVersion("2017-06-22");// 如果是除杭州region外的其它region（如新加坡region）,必须指定为2017-06-22
    	request.setAccountName("huangxin@mail.hxhuangxin.com");
        request.setFromAlias("黄鑫");
        request.setAddressType(1);
        request.setTagName("hx");
        request.setReplyToAddress(true);
        //request.setToAddress(_url_1);//("目标地址");
        //可以给多个收件人发送邮件，收件人之间用逗号分开，批量发信建议使用BatchSendMailRequest方式
    	if(validateEmailAddress(_url_1)=="Y")
    	{
        	if(validateEmailAddress(_url_2)=="Y")
        	{
            	if(validateEmailAddress(_url_3)=="Y")
            	{
        	        request.setToAddress(_url_1+','+_url_2+','+_url_3);
            	}
            	else
            	{
            		return "N";
            	}
        	}
        	else
        	{
        		return "N";
        	}
    	}
    	else
    	{
    		return "N";
    	}
        request.setSubject("批量发信");
        request.setHtmlBody(_payload);//("邮件正文");
        SingleSendMailResponse httpResponse = client.getAcsResponse(request);
    } catch (ServerException e) {
        e.printStackTrace();
        return "N";
    }
    catch (ClientException e) {
        e.printStackTrace();
        return "N";
    }
	return "Y";
	}
	public  String validateEmailAddress(String url) {
        if (url == null)
            return "N";
        String regEx1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        Pattern p;
        Matcher m;
        p = Pattern.compile(regEx1);
        m = p.matcher(url);
        if (m.matches())
            return "Y";
        else
            return "N";
    }

}
