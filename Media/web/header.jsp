<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
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
  height: 100vh;
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
}

.content {
  margin-top: 10%;
  max-width: 600px;
}
.content h2 {
  font-size: 60px;
}
.content p {
  margin-top: 10px;
  line-height: 25px;
}
a {
  color: white;
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
.hire-1 {
  color: #000000;
  text-decoration: none;
  background: white;
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
    <div class="container header">
      <nav>
        <div class="logo">
          <a href="index.jsp"><span>IRCN  V</a>
        </div>
        <ul>
          <li>
            <a href="index.jsp"><span>Home</span></a>
          </li>
          <li>
            <a href="#"><span>About</span></a>
          </li>
          <li>
            <a href="#"><span>Services</span></a>
          </li>
        </ul>
        <div class="buttons">
          <a href="#" class="login"><span>Log in</span></a>
          <a href="#" class="btn">Register</a>
        </div>
      </nav>
      <div class="content">
        <h2>Hello,<br />We are IRCN V</h2>
        <p>I'm A Web Developer ,<br />You Can Find Me On GitHub.</p>
      </div>
      <div class="link">
        <a href="#" class="hire">Chat Bot AI</a>
        <a href="Community.jsp" class="hire-1">Community</a>
      </div>
    </div>
  </body>
</html>
