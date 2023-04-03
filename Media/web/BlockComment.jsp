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
        <link href="bootstrap-5.0.2-dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="bootstrap-5.0.2-dist/js/bootstrap.bundle.min.js"></script>
        <title>JSP Page</title>
        <style>
            body {
                background-color: #e9ebee;
                color: #1d2129;
            }
           

            .single-comment {
                padding: 0 0 0 12px;
                margin: 0;
            }
            .single-comment:first-of-type {
                border-top: 1px solid #e1e2e3;
                padding-top: 12px;
            }
            .single-comment:first-of-type img {

            }
            .single-comment:nth-of-type(2) img {

            }
            .single-comment img {
                position: absolute;
                width: 32px;
                height: 32px;
                background-image: url(https://heatherchristenaschmidt.files.wordpress.com/2011/09/facebook_no_profile_pic2-jpg.gif);
                background-size: cover;
                background-position: center;
                border: none;
            }
            .single-comment .single-container {
                padding-left: 40px;
                padding-right: 20px;
            }
            .single-comment .single-container span {
                font-size: 12px;
                margin-left: 5px;
            }
            .single-comment .single-container span:first-of-type {
                cursor: pointer;
                font-weight: bold;
                color: #365899;
                font-size: 12px;
                margin: 0;
            }
            .single-comment .single-container span:first-of-type:hover {
                text-decoration: underline;
            }
            .single-comment .buttons {
                margin-top: 0;
                padding-left: 40px;
            }
            .single-comment .buttons p {
                display: inline-block;
                color: #365899;
                cursor: pointer;
                text-decoration: none;
                font-size: 12px;
                margin-right: 8px;
                margin-top: 5px;
            }
            .single-comment .buttons p:hover {
                text-decoration: underline;
            }
            .single-comment .buttons p:last-of-type {
                color: #90949c;
                cursor: auto;
                text-decoration: none;
            }

            .comment-section {
                background-color: #f6f7f9;
                margin: 0;
            }

            
            
        </style>
    </head>
    <body>
            <style>
                #up-arrow,#down-arrow{
                    margin: 5px;
                    width: 20px;
                    height: 20px;
                }
                #total-count{

                    font-weight: 100;
                    font-size: 20px;
                }
                .container{
                    display: flex;
                    justify-content: center;
                    align-items: center;
                }
            </style>
            
                    <div class="comment-section">
                        <div class="row single-comment col-12">


                            <div class="col-3" >
                                <div class="container">
                                    <div id="increment-count">
                                        <input type="image" id="up-arrow" src="https://freepngimg.com/thumb/direction/21590-3-green-arrow.png" />
                                    </div>
                                    <div id="increase-count">
                                    </div>
                                    <div id="decrement-count">
                                        <input type="image" id="down-arrow" src="https://nemowx.com/cyqs/img/redarrow2.png" />
                                    </div>
                                    <div id="decrease-count">                                        
                                    </div>
                                </div>
                                <script>
                                    // Select increment and decrement buttons
                                    const incrementCount = document.getElementById("increment-count");
                                    const decrementCount = document.getElementById("decrement-count");

                                    // Select total count
                                    const totalCountIN = document.getElementById("increase-count");
                                    const totalCountDE = document.getElementById("decrease-count");

                                    // Variable to track count
                                    var countIN = 0;
                                    var countDE = 0;

                                    // Display initial count value
                                    totalCountIN.innerHTML = countIN;
                                    totalCountDE.innerHTML = countDE;

                                    // Function to increment count
                                    const handleIncrement = () => {
                                        countIN++;
                                        totalCountIN.innerHTML = countIN;
                                    };

                                    // Function to decrement count
                                    const handleDecrement = () => {
                                        countDE++;
                                        totalCountDE.innerHTML = countDE;
                                    };

                                    // Add click event to buttons
                                    incrementCount.addEventListener("click", handleIncrement);
                                    decrementCount.addEventListener("click", handleDecrement);

                                </script>

                            </div>
                            <div class="col-9" style="margin-left: -5vw;">
                                <img src="https://th.bing.com/th/id/OIP.PwEh4SGekpMaWT2d5GWw0wHaHt?pid=ImgDet&rs=1">
                                <div class="single-container">
                                    <span>Bruce Wayne</span>
                                    <span>Mark, we have windows...</span>
                                </div>
                            </div>

                        </div>

                    </div>

    </body>
</html>
