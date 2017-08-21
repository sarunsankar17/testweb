<%-- 
    Document   : welcome.jsp
    Created on : Aug 2, 2017, 12:07:45 PM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>Welcome! ${name}</p>
        <%String name=(String) request.getAttribute("name");%>
        <p>Welcome!<%=name%> </p>
    </body>
</html>
