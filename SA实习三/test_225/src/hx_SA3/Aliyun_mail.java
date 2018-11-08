/**
 * Aliyun_mail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package hx_SA3;

public interface Aliyun_mail extends java.rmi.Remote {
    public java.lang.String sendEmailBatch(java.lang.String _url_1, java.lang.String _url_2, java.lang.String _url_3, java.lang.String _payload) throws java.rmi.RemoteException;
    public java.lang.String sendEmail(java.lang.String _url, java.lang.String _payload) throws java.rmi.RemoteException;
    public java.lang.String validateEmailAddress(java.lang.String url) throws java.rmi.RemoteException;
}
