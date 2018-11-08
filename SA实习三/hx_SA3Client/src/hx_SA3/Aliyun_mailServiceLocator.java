/**
 * Aliyun_mailServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package hx_SA3;

public class Aliyun_mailServiceLocator extends org.apache.axis.client.Service implements hx_SA3.Aliyun_mailService {

    public Aliyun_mailServiceLocator() {
    }


    public Aliyun_mailServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Aliyun_mailServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for aliyun_mail
    private java.lang.String aliyun_mail_address = "http://localhost:8080/hx_SA3/services/aliyun_mail";

    public java.lang.String getaliyun_mailAddress() {
        return aliyun_mail_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String aliyun_mailWSDDServiceName = "aliyun_mail";

    public java.lang.String getaliyun_mailWSDDServiceName() {
        return aliyun_mailWSDDServiceName;
    }

    public void setaliyun_mailWSDDServiceName(java.lang.String name) {
        aliyun_mailWSDDServiceName = name;
    }

    public hx_SA3.Aliyun_mail getaliyun_mail() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(aliyun_mail_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getaliyun_mail(endpoint);
    }

    public hx_SA3.Aliyun_mail getaliyun_mail(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            hx_SA3.Aliyun_mailSoapBindingStub _stub = new hx_SA3.Aliyun_mailSoapBindingStub(portAddress, this);
            _stub.setPortName(getaliyun_mailWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setaliyun_mailEndpointAddress(java.lang.String address) {
        aliyun_mail_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (hx_SA3.Aliyun_mail.class.isAssignableFrom(serviceEndpointInterface)) {
                hx_SA3.Aliyun_mailSoapBindingStub _stub = new hx_SA3.Aliyun_mailSoapBindingStub(new java.net.URL(aliyun_mail_address), this);
                _stub.setPortName(getaliyun_mailWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("aliyun_mail".equals(inputPortName)) {
            return getaliyun_mail();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://hx_SA3", "aliyun_mailService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://hx_SA3", "aliyun_mail"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("aliyun_mail".equals(portName)) {
            setaliyun_mailEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
