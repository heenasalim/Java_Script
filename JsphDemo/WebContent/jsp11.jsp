<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@taglib  prefix="abc" uri="/WEB-INF/taglib.tld" %>
<%@taglib  prefix="xyz"  uri="/WEB-INF/customtag.tld" %>
<body>
<h1>jsp  11   file</h1>
<form action="jsp11.jsp">
Enter  username:<input type="text"  name="user"  />
Enter  age<input  type="text"   name="age" />
<input  type="submit"  name="signin" />
</form>
<br/>
<b>length  of  user by  expression  tag (nethods) is:=</b>
<br/>
${abc:lengthUser(param.user)}
<br/>
<b>length  of  user by  custom tag  is:=</b>

<xyz:abc></xyz:abc>

<%!  int  i=0;int z; %>
<% 
for(i=0; i<10 ; i++)
{
%>
<%= z=i*i+10 %>	
<% 
}


out.println("i is" + z);

%>
<br/>
<jsp:useBean id="u"  class="pkforjsp.Usebean11"  scope="request"></jsp:useBean>
<jsp:setProperty  name="u"  property="*" />
<jsp:getProperty  name="u" property="user" />
<jsp:getProperty  name="u" property="age" />
</br>
<% 

String  k=u.getUser();
%>
<br/>
<br/>
<b> after  11  year </b>
<br/>
<h1>Age  of  person  is:</h1>
${ abc:heena(param.user) }
  <h1> u  can  open</h1>
  
  
<br/>
<br/>


 <%--out.println("length  of  username  is" + u.getUser());
<br/>
out.println("  age  after    1  year  is "  + (u.getAge()+1));--%>



</body>
</html>