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
        <title>POST</title>
    </head>
    <body>
        <%
            String uid = (String) session.getAttribute("id");
            if ((uid == null) || (uid.equals(""))) {
                response.sendRedirect("../login.jsp");
            }
            request.setAttribute("uid", uid);
        %>

        <script src="share.js">
        </script>
        <%!
            String userChat,botChat;
        %>
        <%
            userChat = (String) session.getAttribute("userChat");
            botChat = (String) session.getAttribute("botChat");
        %>

        <c:set var="user" value="${userChat}"/>
        <c:set var="chat" value="${botChat}"/>
        <form action="../GetPostData" method="post">
            <input type="text" value="${uid}" name="id" readonly>
            <table>
                <tr>
                    <td>
                        <input id="uid" name="uid" type="text" style="display: none" value="${uid}" >
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
                <tr>
                    <td>Tag 1</td>
                    <td>
                        <div id="input-container">
                            <input type="text" class="input-field tag1" id="tag1" name="tag1" onkeyup="checkInputs()">
                            <div id="error-message" style="display: block; color: red;">Please enter at least one tag.</div>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>Tag 2</td>
                    <td>
                        <div id="input-container">
                            <input type="text" class="input-field tag2" id="tag2" name="tag2" onkeyup="checkInputs()">
                        </div>
                    </td>
                </tr>
                <tr>
                    <td>Tag 3</td>
                    <td>
                        <div id="input-container">
                            <input type="text" class="input-field tag3" id="tag3" name="tag3" onkeyup="checkInputs()">
                        </div>
                    </td>
                </tr>

            </table>
            <input style="align-items: center" type="submit" value="Commit" disabled id="submit-button">

        </form>
    </body>
</html>
