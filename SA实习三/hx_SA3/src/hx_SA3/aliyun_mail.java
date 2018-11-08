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
     //request.setVersion("2017-06-22");// ����ǳ�����region�������region�����¼���region��,����ָ��Ϊ2017-06-22	    	
        	request.setAccountName("huangxin@mail.hxhuangxin.com");	        
        	request.setFromAlias("����");	        
        	request.setAddressType(1);
        	request.setTagName("hx");	        
        	request.setReplyToAddress(true);	
        	if(validateEmailAddress(_url)=="Y")
        	{
        		request.setToAddress(_url);//("Ŀ���ַ");
        	}
        	else
        	{
        		return "N";
        	}
        //���Ը�����ռ��˷����ʼ����ռ���֮���ö��ŷֿ����������Ž���ʹ��BatchSendMailRequest��ʽ
        //request.setToAddress("����1,����2");	        
        	request.setSubject("�����ʼ�");	        
        	request.setHtmlBody(_payload);//("�ʼ�����");	        
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
     //request.setVersion("2017-06-22");// ����ǳ�����region�������region�����¼���region��,����ָ��Ϊ2017-06-22
    	request.setAccountName("huangxin@mail.hxhuangxin.com");
        request.setFromAlias("����");
        request.setAddressType(1);
        request.setTagName("hx");
        request.setReplyToAddress(true);
        //request.setToAddress(_url_1);//("Ŀ���ַ");
        //���Ը�����ռ��˷����ʼ����ռ���֮���ö��ŷֿ����������Ž���ʹ��BatchSendMailRequest��ʽ
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
        request.setSubject("��������");
        request.setHtmlBody(_payload);//("�ʼ�����");
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
