<%-- 
    Document   : share
    Created on : 28 thg 4, 2023, 16:46:50
    Author     : 84384
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
             String uid = (String) session.getAttribute("id");
            if ((uid == null) || (uid.equals(""))) {
                response.sendRedirect("../login.jsp");
            } 
            request.setAttribute("uid", uid);
        %>
        <c:set var="user" value="${param.user}"/>
        <c:set var="chat" value="${param.chat}"/>
        <form>
            <input type="text" value="${uid}" name="id">
            <table>
                <tr>
                    <td>
                        <input type="text" style="display: none" value="${uid}" >
                    </td>
                </tr>
                <tr>
                    <td>
                        User 
                    </td>
                    <td>
                        : <textarea id="user" name="user" rows="4" cols="50">${user}</textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                        Chat 
                    </td>
                    <td>
                        : <textarea id="chat" name="chat" rows="4" cols="50">${chat}</textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                        Problem detail
                    </td>
                    <td>
                        : <textarea id="detail" name="detail" rows="4" cols="50"></textarea>
                    </td>
                </tr>
            </table>
                    <input style="align-items: center" type="submit" value="Commit">
            
        </form>
    </body>
</html>
