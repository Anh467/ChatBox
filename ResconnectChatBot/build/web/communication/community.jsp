<%-- 
    Document   : community
    Created on : May 6, 2023, 7:13:47 AM
    Author     : TCNJK
--%>

<%@page import="model.Vote"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Community</title>
        <link rel="stylesheet" href="stylePost.css">
        <link rel="stylesheet" href="styledropdown.css">
        <script src="scriptdropdown.js"></script>
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

        <!-- HTML code for displaying a post -->
        <jsp:useBean id="list" class="model.ListPost"/>
        <c:forEach var="post" items="${list.post}">
            <div class="post ${post.getPostID()}">
                <div class="iconPost" onclick="toggleMenu(this)">
                    <div class="sub-menu-wrap">
                        <div class="sub-menu">
                            <form action="../EditPost" method="POST">
                                <input type="text" name="pid" value="${post.getPostID()}" readonly style="display: none;">
                                <button class="sub-menu-link edit-btn" type="submit" style="background: none; border: none">
                                    <p class="pEdit">EDIT</p>
                                </button>
                            </form>
                            <form action="../EditPost" method="GET">
                                <input type="text" name="pid" value="${post.getPostID()}" readonly style="display: none;">
                                <button class="sub-menu-link" style="background: none; border: none" type="submit">
                                    <p>DELETE</p>
                                </button>
                            </form>
                        </div>
                    </div>
                </div>
                <h2 class="post-title">Problem ...</h2>
                <p class="post-author">Posted by <span class="author-name">${post.getUname()}</span></p>
                <p class="post-author">Time <span class="author-name">${post.getPostDate()}</span></p>
                <!--<img src="post-image.jpg" alt="Post Image" class="post-image">-->
                <p class="post-content" style="display: block;">${post.getPostContent()}</p>
                <div class="post-actions">
                    <button class="comment-btn">Comment</button>
                </div>
                <div class="comment-input" style="display: none;">
                    <form action="../AddComment" method="post">
                        <input name="pid" style="display: none;" value="${post.getPostID()}">
                        <input name="comment" type="text" placeholder="Write your comment here...">
                        <button class="submit-btn" type="submit">Submit</button>
                    </form>
                </div>
                <button class="view-comments-btn">View Comments</button>
                <div class="comments" style="display:none;">
                    <jsp:useBean id="commentList" class="model.ListComment" />

                    <c:forEach var="comment" items="${commentList.getComment(post.getPostID())}">
                        <div class="comment">
                            <div class="iconPost" onclick="toggleMenu(this)">
                                <div class="sub-menu-wrap">
                                    <div class="sub-menu">
                                        <button class="sub-menu-link edit-btn" style="background: none; border: none" onclick="toggleEdit(this)">
                                            <p class="pEdit">EDIT</p>
                                        </button>
                                        <form action="../EditComment" method="POST">
                                            <button class="sub-menu-link save-btn" style="background: none; border: none;" hidden onclick="toggleSave(this)">
                                                <input style="display: none;" name="comment-edit-cid" value="${comment.getCid()}">
                                                <input style="display: none;" class="comment-get" name="comment-edit-contain">
                                                <p class="hiden pSave">SAVE</p>
                                            </button>
                                        </form>
                                        <form action="../EditComment" method="GET">
                                            <input type="text" name="cid" value="${comment.getCid()}" readonly style="display: none;">
                                            <button class="sub-menu-link" style="background: none; border: none" type="submit">
                                                <p>DELETE</p>
                                            </button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                            <p class="comment-content" contenteditable="false" onblur="updateInput(this)">${comment.getcContent()}</p>
                            <div class="comment-details">
                                <span class="comment-author">${comment.getuName()}</span>
                                <span class="comment-time">${comment.getcTime()}</span>

                                <jsp:useBean id="cid" class="model.Comment" />
                                <jsp:setProperty name="cid" property="cid" value="${comment.getCid()}"/>
                                <%! boolean voteCount;%>
                                <%
                                    String uid2 = (String) session.getAttribute("id");
                                    String commentId = cid.getCid();
                                    voteCount = Vote.getVote(uid2, commentId);
                                    if (voteCount == true) {
                                %>
                                <button class="comment-ike-btnl like-btn" data-comment-id="${comment.getCid()}" data-liked="<%=voteCount%>" >DisLike(<span class="vote-count">${comment.getVoteCount()}</span>)</button>
                                <%} else {%>
                                <button class="comment-ike-btnl like-btn" data-comment-id="${comment.getCid()}" data-liked="<%=voteCount%>" >Like(<span class="vote-count">${comment.getVoteCount()}</span>)</button>

                                <%}%>

                            </div>

                        </div>
                    </c:forEach>
                </div>
            </div>
        </c:forEach>
        <script src="scriptPost.js"></script>
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
                    <span class="copyright_text">Copyright Â© 2023 <a href="#">IRCN V.</a>All rights reserved</span>
                    <span class="policy_terms">
                        <a href="#">Privacy policy</a>
                        <a href="#">Terms & condition</a>
                    </span>
                </div>
            </div>
        </footer>
    </body>
</html>
