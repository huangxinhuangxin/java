package hx_SA3;

public class Aliyun_mailProxy implements hx_SA3.Aliyun_mail {
  private String _endpoint = null;
  private hx_SA3.Aliyun_mail aliyun_mail = null;
  
  public Aliyun_mailProxy() {
    _initAliyun_mailProxy();
  }
  
  public Aliyun_mailProxy(String endpoint) {
    _endpoint = endpoint;
    _initAliyun_mailProxy();
  }
  
  private void _initAliyun_mailProxy() {
    try {
      aliyun_mail = (new hx_SA3.Aliyun_mailServiceLocator()).getaliyun_mail();
      if (aliyun_mail != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)aliyun_mail)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)aliyun_mail)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (aliyun_mail != null)
      ((javax.xml.rpc.Stub)aliyun_mail)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public hx_SA3.Aliyun_mail getAliyun_mail() {
    if (aliyun_mail == null)
      _initAliyun_mailProxy();
    return aliyun_mail;
  }
  
  public java.lang.String sendEmailBatch(java.lang.String _url_1, java.lang.String _url_2, java.lang.String _url_3, java.lang.String _payload) throws java.rmi.RemoteException{
    if (aliyun_mail == null)
      _initAliyun_mailProxy();
    return aliyun_mail.sendEmailBatch(_url_1, _url_2, _url_3, _payload);
  }
  
  public java.lang.String sendEmail(java.lang.String _url, java.lang.String _payload) throws java.rmi.RemoteException{
    if (aliyun_mail == null)
      _initAliyun_mailProxy();
    return aliyun_mail.sendEmail(_url, _payload);
  }
  
  public java.lang.String validateEmailAddress(java.lang.String url) throws java.rmi.RemoteException{
    if (aliyun_mail == null)
      _initAliyun_mailProxy();
    return aliyun_mail.validateEmailAddress(url);
  }
  
  
}