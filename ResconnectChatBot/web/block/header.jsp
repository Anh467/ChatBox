<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Document</title>
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
            integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />
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

        </style>
    </head>
    <body>
        <%
            if ((session.getAttribute("id") == null) || (((String) session.getAttribute("id")).equals(""))) {
                request.setAttribute("notlogin", "block");
                request.setAttribute("login", "none");
            } else {
                request.setAttribute("notlogin", "none");
                request.setAttribute("login", "block");
            }
        %>
        <div class="container header">
            <nav>
                <div class="logo">
                    <a href="#"><span>IRCN  V</a>
                </div>
                <ul>
                    <li>
                        <a href="#"><span>Home</span></a>
                    </li>
                    <li>
                        <a href="#"><span>About</span></a>
                    </li>
                    <li>
                        <a href="#"><span>Services</span></a>
                    </li>
                </ul>
                <div class="buttons" style="display: ${notlogin}">
                    <a href="login.jsp" class="login"><span>Log in</span></a>
                    <a href="#" class="btn">Register</a>
                </div>
                <div class="buttons" style="display: ${login}; display: flex">
                    <i class="fa-solid fa-user fa-3x"></i>
                    <form style="margin-left: 10px" action="CheckLogin" method="post">
                        <input class="btn" type="submit" value="Log out">
                    </form>
                </div>
            </nav>

        </div>
    </body>
</html>
