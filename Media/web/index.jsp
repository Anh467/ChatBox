<%-- 
    Document   : index
    Created on : 22 thg 3, 2023, 08:22:56
    Author     : 84384
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String id= (String) session.getAttribute("id");
            if(id==null)
                response.sendRedirect("Login.jsp");
        %>
        <%@include file="header.jsp" %>
        <h1>Hello World!</h1>
        <form action="CheckLogin" method="post">
            <input type="submit" value="Log out">
        </form>
        <%@include file="footer.jsp" %>
    </body>
</html>
