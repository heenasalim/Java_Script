<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>heena  salim   shaikh</title>
</head>
<body>
<h1>Hello   henaaaaaaaaaaaaa    this  is  login.jsp  content  which  is  inclused  in  practice .jsp</h1>
<jsp:useBean id="u" class="pk.SimplePojoModel"  >this  is  use  bean</jsp:useBean>
<jsp:setProperty  name="u"  property="*" />
<jsp:getProperty  name="u"  property="schoolname" />
<%
 String  h1=( String)request.getAttribute("schoolname");
String  h=(String)session.getAttribute("schoolname");
out.println("schhol  name  value  is" +  h);

%>
<*************************************>
<%-- 
String  h=request.getParameter("schoolname");
application.setAttribute("schoolname",schoolname);
application.getAttribute(schoolname);
out.println("schhol  name  value  is" +  h1);
--%>
</body>
</html>