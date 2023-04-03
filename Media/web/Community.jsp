<%-- 
    Document   : BlockComment
    Created on : Mar 21, 2023, 9:44:25 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" 
              rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css" integrity="sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <script src="bootstrap-5.0.2-dist/js/bootstrap.bundle.min.js"></script>
        <title>JSP Page</title>
        <style>
            body {
                background-color: #e9ebee;
                color: #1d2129;
            }

            #app {
                background-color: #fff;
                font-family: helvetica;
                margin: 30px auto;
                width: 60%;
                border: 1px solid;
                border-color: #e5e6e9 #dfe0e4 #d0d1d5;
                border-radius: 3px;
            }

            .creator {
                position: relative;
            }
            .creator img {
                width: 40px;
                height: 40px;
                background-image: url(https://heatherchristenaschmidt.files.wordpress.com/2011/09/facebook_no_profile_pic2-jpg.gif);
                background-size: cover;
                background-position: center;
                margin: 12px 0 0 12px;
                position: absolute;
            }
            .creator div {
                display: inline-block;
                margin-left: 60px;
            }
            .creator div p {
                font-size: 14px;
            }
            .creator div p:first-of-type {
                cursor: pointer;
                font-weight: bold;
                color: #365899;
            }
            .creator div p:first-of-type:hover {
                text-decoration: underline;
            }
            .creator div p:last-of-type {
                font-size: 12px;
                color: #90949c;
                margin-top: -10px;
            }

            .message {
                font-size: 14px;
                margin-top: 8px;
                padding: 0 12px;
                line-height: 18px;
            }

            .bar {
                width: calc(100% - 24px);
                border-top: 1px solid #e5e5e5;
                margin: 0 12px;
            }
            .bar .action-button {
                margin-left: 20px;
                display: inline-block;
                font-size: 12px;
                font-weight: bold;
                color: #7f7f7f;
                cursor: pointer;
            }
            .bar .action-button:before {
                content: '';
                display: inline-block;
                height: 14px;
                margin: 0 6px -3px 0;
                width: 14px;
                background-repeat: no-repeat;
                background-size: auto;
            }
            .bar .action-button:first-of-type {
                margin: 0;
            }
            .bar .action-button:first-of-type:before {
                content: '';
                background-position: -47px -164px;
            }
            .bar .action-button:nth-of-type(2):before {
                background-position: -32px -164px;
            }
            .bar .action-button:nth-of-type(3):before {
                background-position: -45px -181px;
            }
            .bar .action-button:hover {
                text-decoration: underline;
            }

            .input {
                margin-top: 0;
                background-color: #f6f7f9;
                padding: 4px 12px 8px 12px;
                padding: 7px;
                display: block;
            }
            .input input{
                background: skyblue;
                border: 1px solid #bdc7d8;
                box-sizing: border-box;
                font-family: helvetica;
                outline: none;
                resize: none;
                overflow: hidden;
                margin-left: 5px;
                border-radius: 2px;
            }
            .input img {
                margin-top:0.5%;
                width: 32px;
                height: 32px;
                background-image: url(https://heatherchristenaschmidt.files.wordpress.com/2011/09/facebook_no_profile_pic2-jpg.gif);
                background-size: cover;
                background-position: center;
                border: none;
                position: absolute;
            }
            .input input{
                margin-top:0.7%;
                width: 3%;
                background-size: cover;
                background-position: center;
                border: none;
                position: absolute;
            }
            .input textarea {
                margin-top:1%;
                background: #fff;
                border: 1px solid #bdc7d8;
                box-sizing: border-box;
                cursor: text;
                width: 90%;
                margin-left: 40px;
                padding: 7px;
                font-family: helvetica;
                outline: none;
                resize: none;
                overflow: hidden;
                height: 32px;
            }
        </style>
    </head>
    <body>
        <div id="app">
            <div data-reactroot="">
                <div class="creator">

                    <img src="https://th.bing.com/th/id/OIP.PwEh4SGekpMaWT2d5GWw0wHaHt?pid=ImgDet&rs=1" />
                    <div>
                        <p style="margin-top: 10%;">Mark Zuckerberg</p>
                        <p>
                            <!-- react-text: 7 -->4
                            <!-- /react-text -->
                            <!-- react-text: 8 -->h
                            <!-- /react-text -->
                        </p>
                    </div>
                </div>
                <p class="message">Omg it's snowing outside!</p>
                <div class="bar">

                    <a class="action-button" style="text-decoration: none;" href="#comment">Comment</a>
                </div>
                <div>
                    <%@include file="BlockComment.jsp" %>
                    <div class="input">
                        <img src="https://th.bing.com/th/id/OIP.PwEh4SGekpMaWT2d5GWw0wHaHt?pid=ImgDet&rs=1">
                        <textarea id="comment" placeholder="Write a comment..." style="height: 32px; border-radius: 5px; "></textarea>
                        <input type="button" name="toComment" value="Send"/>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
