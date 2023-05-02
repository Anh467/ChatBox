<%@page import="model.BoxChatInfor"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Chatbot</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
            integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/axios/1.2.3/axios.min.js"></script>

        <style>
            @import url("https://fonts.googleapis.com/css2?family=Karla:wght@300;400;500;600;700&display=swap");
            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: "Karla", sans-serif;
            }
            body {
                color: black;
            }
            .container {
                width: 100%;
                height: 20vh;
                background-image: url(back.jpg);
                background-position: center;
                background-size: cover;
                padding-top: 35px;
                padding-left: 8%;
                padding-right: 8%;
            }
            nav {
                padding: 10px 0;
                display: flex;
                align-items: center;
                justify-content: space-between;
            }
            .logo a {
                font-size: 40px;
                text-decoration: none;
            }
            span {
                color: black;
            }
            nav ul li {
                display: inline-block;
                list-style: none;
                margin: 10px 15px;
            }
            nav ul li a {
                text-decoration: none;
                transition: 0.5s;
            }
            nav ul li a:hover {
                color: black;
            }
            .login {
                text-decoration: none;
                margin-right: 15px;
                font-size: 18px;
            }
            .btn {
                background: #000;
                border-radius: 6px;
                padding: 9px 25px;
                text-decoration: none;
                transition: 0.5s;
                font-size: 18px;
                color: white;
            }
            a {
                color: white;
            }
            footer {
                background: #140b5c;
                width: 100%;
                bottom: 0;
                left: 0;
            }
            footer::before {
                content: "";
                position: absolute;
                left: 0;
                top: 100px;
                height: 1px;
                width: 100%;
                background: #afafb6;
            }
            footer .content {
                max-width: 1250px;
                margin: auto;
                padding: 30px 40px 40px 40px;
            }
            footer .content .top {
                display: flex;
                align-items: center;
                justify-content: space-between;
                margin-bottom: 50px;
            }
            .content .top .logo-details {
                color: #fff;
                font-size: 30px;
            }
            .content .top .media-icons {
                display: flex;
            }
            .content .top .media-icons a {
                height: 40px;
                width: 40px;
                margin: 0 8px;
                border-radius: 50%;
                text-align: center;
                line-height: 40px;
                color: #fff;
                font-size: 17px;
                text-decoration: none;
                transition: all 0.4s ease;
            }
            .top .media-icons a:nth-child(1) {
                background: #4267b2;
            }
            .top .media-icons a:nth-child(1):hover {
                color: #4267b2;
                background: #fff;
            }
            .top .media-icons a:nth-child(2) {
                background: #1da1f2;
            }
            .top .media-icons a:nth-child(2):hover {
                color: #1da1f2;
                background: #fff;
            }
            .top .media-icons a:nth-child(3) {
                background: #e1306c;
            }
            .top .media-icons a:nth-child(3):hover {
                color: #e1306c;
                background: #fff;
            }
            .top .media-icons a:nth-child(4) {
                background: #0077b5;
            }
            .top .media-icons a:nth-child(4):hover {
                color: #0077b5;
                background: #fff;
            }
            .top .media-icons a:nth-child(5) {
                background: #ff0000;
            }
            .top .media-icons a:nth-child(5):hover {
                color: #ff0000;
                background: #fff;
            }
            footer .content .link-boxes {
                width: 100%;
                display: flex;
                justify-content: space-between;
            }
            footer .content .link-boxes .box {
                width: calc(100% / 5 - 10px);
            }
            .content .link-boxes .box .link_name {
                color: #fff;
                font-size: 18px;
                font-weight: 400;
                margin-bottom: 10px;
                position: relative;
            }
            .link-boxes .box .link_name::before {
                content: "";
                position: absolute;
                left: 0;
                bottom: -2px;
                height: 2px;
                width: 35px;
                background: #fff;
            }
            .content .link-boxes .box li {
                margin: 6px 0;
                list-style: none;
            }
            .content .link-boxes .box li a {
                color: #fff;
                font-size: 14px;
                font-weight: 400;
                text-decoration: none;
                opacity: 0.8;
                transition: all 0.4s ease;
            }
            .content .link-boxes .box li a:hover {
                opacity: 1;
                text-decoration: underline;
            }
            .content .link-boxes .input-box {
                margin-right: 55px;
            }
            .link-boxes .input-box input {
                height: 40px;
                width: calc(100% + 55px);
                outline: none;
                border: 2px solid #afafb6;
                background: #140b5c;
                border-radius: 4px;
                padding: 0 15px;
                font-size: 15px;
                color: #fff;
                margin-top: 5px;
            }
            .link-boxes .input-box input::placeholder {
                color: #afafb6;
                font-size: 16px;
            }
            .link-boxes .input-box input[type="button"] {
                background: #fff;
                color: #140b5c;
                border: none;
                font-size: 18px;
                font-weight: 500;
                margin: 4px 0;
                opacity: 0.8;
                cursor: pointer;
                transition: all 0.4s ease;
            }
            .input-box input[type="button"]:hover {
                opacity: 1;
            }
            footer .bottom-details {
                width: 100%;
                background: #0f0844;
            }
            footer .bottom-details .bottom_text {
                max-width: 1250px;
                margin: auto;
                padding: 20px 40px;
                display: flex;
                justify-content: space-between;
            }
            .bottom-details .bottom_text span,
            .bottom-details .bottom_text a {
                font-size: 14px;
                font-weight: 300;
                color: #fff;
                opacity: 0.8;
                text-decoration: none;
            }
            .bottom-details .bottom_text a:hover {
                opacity: 1;
                text-decoration: underline;
            }
            .bottom-details .bottom_text a {
                margin-right: 10px;
            }
            @media (max-width: 900px) {
                footer .content .link-boxes {
                    flex-wrap: wrap;
                }
                footer .content .link-boxes .input-box {
                    width: 40%;
                    margin-top: 10px;
                }
            }
            @media (max-width: 700px) {
                footer {
                    position: relative;
                }
                .content .top .logo-details {
                    font-size: 26px;
                }
                .content .top .media-icons a {
                    height: 35px;
                    width: 35px;
                    font-size: 14px;
                    line-height: 35px;
                }
                footer .content .link-boxes .box {
                    width: calc(100% / 3 - 10px);
                }
                footer .content .link-boxes .input-box {
                    width: 60%;
                }
                .bottom-details .bottom_text span,
                .bottom-details .bottom_text a {
                    font-size: 12px;
                }
            }
            @media (max-width: 520px) {
                footer::before {
                    top: 145px;
                }
                footer .content .top {
                    flex-direction: column;
                }
                .content .top .media-icons {
                    margin-top: 16px;
                }
                footer .content .link-boxes .box {
                    width: calc(100% / 2 - 10px);
                }
                footer .content .link-boxes .input-box {
                    width: 100%;
                }
            }
        </style>
    </head>
    <body>
        <%
            String uid = (String) session.getAttribute("id");
            if ((uid == null) || (uid.equals(""))) {
                request.setAttribute("notlogin", "block");
                request.setAttribute("login", "none");
            } else {
                request.setAttribute("notlogin", "none");
                request.setAttribute("login", "flex");
            }
            request.setAttribute("uid", uid);
        %>
        <span id="uid" vaule="${uid}"> ${uid}</span>
        <div class="container header">
            <nav>
                <div class="logo">
                    <a href="../index.jsp"><span>IRCN  V</a>
                </div>
                <ul>
                    <li>
                        <a href="../index.jsp"><span>Home</span></a>
                    </li>
                    <li>
                        <a href="#"><span>About</span></a>
                    </li>
                    <li>
                        <a href="#"><span>Services</span></a>
                    </li>
                </ul>
                <div class="buttons" style="display: ${notlogin}">
                    <a href="../login.jsp" class="login"><span>Log in</span></a>
                    <a href="../signup.jsp" class="btn">Register</a>
                </div>
                <div class="buttons" style="display: ${login}">
                    <i class="fa-solid fa-user fa-3x"></i>
                    <form style="margin-left: 10px" action="../CheckLogin" method="post">
                        <input class="btn" type="submit" value="Log out">
                    </form>
                </div>
            </nav>

        </div>


        <c:set var="id_user" value="${uid}"></c:set>            
        <jsp:useBean id="api" class="model.API"></jsp:useBean>
            <div id="chat-window">

                <div class="main-title">CHAT BOT IRCN V WITH CHAT-GPT</div>
                <div id="chat-messages">
                <c:if test="${uid!=null}">
                    <c:forEach var="ele" items="${api.getChatText(uid)}">
                        <div>
                            <div class="message user-message">
                                <img src="icons/user.png" alt="user icon">
                                <span>${ele.getUser()}</span>
                            </div>
                            <div class="message bot-message">
                                <img src="icons/chatbot.png" alt="bot icon">
                                <span>${ele.getChat()}</span>
                            </div>   
                            <button style="background: none; border: none" onclick="openNewWindow('../block/share.jsp', '?user=${ele.getUser()}&chat=${ele.getChat()}')">
                                <i class="fa-solid fa-share fa-3x"></i>
                            </button>
                        </div>
                    </c:forEach>
                </c:if>
            </div>
            <form id="chat-form">
                <input
                    type="text"
                    id="chat-input"
                    autocomplete="off"
                    placeholder="Type your message here"
                    required
                    />
                <button type="submit">Send</button>
            </form>

            <button id="clear">Clear Boxchat</button>

        </div>
        <script>
            
            const clearboxchat = document.getElementById("clear");
            const message = document.getElementById("chat-messages");
            clearboxchat.addEventListener("click", function () {
                $.ajax({
                    url: '/ResconnectChatBot/Clear',
                    type: 'get',
                    data: {id: '${uid}'
                    },
                    success: function (result) {
                        message.innerHTML = "";
                    },
                    error: function (xhr) {
                        alert("st wrong");
                    }
                });
            });
            function openNewWindow(st, para)
            {
                //   window.open("https://www.w3schools.com");
                window.open(st + para, "", "width=600px; height=400;");
            }
        </script>



        <script src="app.js"></script>
        <footer>
            <div class="content">
                <div class="top">
                    <div class="logo-details">
                        <i class="fab fa-slack"></i>
                        <span class="logo_name" style="color:white;">IRCN V</span>
                    </div>
                    <div class="media-icons">
                        <a href="#"><i class="fab fa-facebook-f"></i></a>
                        <a href="#"><i class="fab fa-twitter"></i></a>
                        <a href="#"><i class="fab fa-instagram"></i></a>
                        <a href="#"><i class="fab fa-linkedin-in"></i></a>
                        <a href="#"><i class="fab fa-youtube"></i></a>
                    </div>
                </div>
                <div class="link-boxes">
                    <ul class="box">
                        <li><a href="#">Home</a></li>
                        <li><a href="#">Contact us</a></li>
                        <li><a href="#">About us</a></li>
                        <li><a href="#">Get started</a></li>
                    </ul>
                    <ul class="box">
                        <li class="link_name">Services</li>
                        <li><a href="#">App design 1</a></li>
                        <li><a href="#">App design 1</a></li>
                        <li><a href="#">App design 1</a></li>
                        <li><a href="#">App design 1</a></li>
                    </ul>
                    <ul class="box">
                        <li class="link_name">Account</li>
                        <li><a href="#">Profile</a></li>
                        <li><a href="#">My account</a></li>
                        <li><a href="#">Prefrences</a></li>
                    </ul>
                    <ul class="box">
                        <li class="link_name">CHAT BOT</li>
                        <li><a href="#">App design 1</a></li>
                        <li><a href="#">App design 1</a></li>
                        <li><a href="#">App design 1</a></li>
                        <li><a href="#">App design 1</a></li>
                    </ul>
                    <ul class="box input-box">
                        <li class="link_name">Subscribe</li>
                        <li><input type="text" placeholder="Enter your email" /></li>
                        <li><input type="button" value="Subscribe" /></li>
                    </ul>
                </div>
            </div>
            <div class="bottom-details">
                <div class="bottom_text">
                    <span class="copyright_text">Copyright © 2023 <a href="#">IRCN V.</a>All rights reserved</span>
                    <span class="policy_terms">
                        <a href="#">Privacy policy</a>
                        <a href="#">Terms & condition</a>
                    </span>
                </div>
            </div>
        </footer>
    </body>
</html>
