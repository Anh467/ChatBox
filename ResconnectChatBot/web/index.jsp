<%-- 
    Document   : index.jsp
    Created on : 12 thg 4, 2023, 18:05:16
    Author     : 84384
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .intro{
                width: 50%;
                margin: 0 auto;
                margin-bottom: 5%;
            }
            .content h2 {
                font-size: 60px;
            }
            .content p {
                margin-top: 10px;
                line-height: 25px;
            }
            
            .link {
                margin-top: 30px;
            }
            .hire {
                color: #f3f0f0;
                text-decoration: none;
                background: black;
                padding: 9px 25px;
                font-weight: bold;
                border-radius: 6px;
                transition: 0.5s;
            }
            
            .link .hire:hover {
                background: transparent;
                border: 1px solid #fff;
                color: black;
            }
        </style>
        
    </head>
    <body>
        <%@include file="block/header.jsp" %>
        <div class="intro">
            <div class="content">
                <h2>Hello,<br />We are IRCN V</h2>
                <p>I'm A Web Developer ,<br />You Can Find Me On GitHub.</p>
            </div>
            <div class="link">
                <a href="chat/ircnv.jsp" class="hire">Chat Bot AI</a>
                <a href="#" class="hire">Community</a>
            </div>
        </div>
        <%@include file="block/footer.jsp" %>
    </body>
</html>
