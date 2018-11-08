package hx_SA3;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.apache.axis.AxisFault;


public class test_server {
	public static void main(String[] args){ 
		try {
			Aliyun_mailServiceLocator service=new Aliyun_mailServiceLocator();
			java.net.URL url=new java.net.URL("http://localhost:8080/hx_SA3/services/aliyun_mail?wsdl");
			Aliyun_mailSoapBindingStub stub = new Aliyun_mailSoapBindingStub(url, service); 
			String s=stub.sendEmail("605130291@qq.com", "8.20");
		    System.out.println(s);
			
		} catch (RemoteException e) {
	        // TODO Auto-generated catch block20
	        e.printStackTrace();
	    } catch (MalformedURLException e) {
	        // TODO Auto-generated catch block23
	        e.printStackTrace();
	    }
	}
	
}
