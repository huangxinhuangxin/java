<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleAliyun_mailProxyid" scope="session" class="hx_SA3.Aliyun_mailProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleAliyun_mailProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleAliyun_mailProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleAliyun_mailProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        hx_SA3.Aliyun_mail getAliyun_mail10mtemp = sampleAliyun_mailProxyid.getAliyun_mail();
if(getAliyun_mail10mtemp == null){
%>
<%=getAliyun_mail10mtemp %>
<%
}else{
        if(getAliyun_mail10mtemp!= null){
        String tempreturnp11 = getAliyun_mail10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String _url_1_1id=  request.getParameter("_url_116");
            java.lang.String _url_1_1idTemp = null;
        if(!_url_1_1id.equals("")){
         _url_1_1idTemp  = _url_1_1id;
        }
        String _url_2_2id=  request.getParameter("_url_218");
            java.lang.String _url_2_2idTemp = null;
        if(!_url_2_2id.equals("")){
         _url_2_2idTemp  = _url_2_2id;
        }
        String _url_3_3id=  request.getParameter("_url_320");
            java.lang.String _url_3_3idTemp = null;
        if(!_url_3_3id.equals("")){
         _url_3_3idTemp  = _url_3_3id;
        }
        String _payload_4id=  request.getParameter("_payload22");
            java.lang.String _payload_4idTemp = null;
        if(!_payload_4id.equals("")){
         _payload_4idTemp  = _payload_4id;
        }
        java.lang.String sendEmailBatch13mtemp = sampleAliyun_mailProxyid.sendEmailBatch(_url_1_1idTemp,_url_2_2idTemp,_url_3_3idTemp,_payload_4idTemp);
if(sendEmailBatch13mtemp == null){
%>
<%=sendEmailBatch13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sendEmailBatch13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 24:
        gotMethod = true;
        String _url_5id=  request.getParameter("_url27");
            java.lang.String _url_5idTemp = null;
        if(!_url_5id.equals("")){
         _url_5idTemp  = _url_5id;
        }
        String _payload_6id=  request.getParameter("_payload29");
            java.lang.String _payload_6idTemp = null;
        if(!_payload_6id.equals("")){
         _payload_6idTemp  = _payload_6id;
        }
        java.lang.String sendEmail24mtemp = sampleAliyun_mailProxyid.sendEmail(_url_5idTemp,_payload_6idTemp);
if(sendEmail24mtemp == null){
%>
<%=sendEmail24mtemp %>
<%
}else{
        String tempResultreturnp25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sendEmail24mtemp));
        %>
        <%= tempResultreturnp25 %>
        <%
}
break;
case 31:
        gotMethod = true;
        String url_7id=  request.getParameter("url34");
            java.lang.String url_7idTemp = null;
        if(!url_7id.equals("")){
         url_7idTemp  = url_7id;
        }
        java.lang.String validateEmailAddress31mtemp = sampleAliyun_mailProxyid.validateEmailAddress(url_7idTemp);
if(validateEmailAddress31mtemp == null){
%>
<%=validateEmailAddress31mtemp %>
<%
}else{
        String tempResultreturnp32 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(validateEmailAddress31mtemp));
        %>
        <%= tempResultreturnp32 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>