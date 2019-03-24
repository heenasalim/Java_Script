<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b> jsp14</b>

<input type="text"    name="user"    value="name"/>
<input type="text"    name="age"     value="18" />



<jsp:usebean id="u"  class="pkforjsp.usebean"  scope="session"></jsp:usebean>
<jsp:setProperty  name="u"  property="*" />
<jsp:getProperty  name="u" property="user" />


<br/>

</body>
</html>