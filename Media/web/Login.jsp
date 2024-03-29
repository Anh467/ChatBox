<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Login</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    </head>

    <body>
        <%
            String id= (String) session.getAttribute("id");
            if(id!=null)
                response.sendRedirect("index.jsp");
        %>
        <div class="vh-100 d-flex justify-content-center align-items-center">
            <div class="container">
                <div class="row d-flex justify-content-center">
                    <div class="col-12 col-md-8 col-lg-6">
                        <div class="card bg-white">
                            <div class="card-body p-5">
                                <form action="CheckLogin" method="get" class="mb-3 mt-md-4">
                                    <h2 class="fw-bold mb-2 text-uppercase ">Login</h2>
                                    <p class=" mb-5">Please enter your login and password!</p>
                                    <div class="mb-3">
                                        <label for="username" class="form-label ">Username</label>
                                        <input name="user" type="text" class="form-control" id="username">
                                    </div>
                                    <div class="mb-3">
                                        <label for="password" class="form-label ">Password</label>
                                        <input name="pass" type="password" class="form-control" id="password">
                                    </div>
                                    <div class="d-grid">
                                        <button class="btn btn-outline-dark" type="submit">Login</button>
                                    </div>
                                </form>
                                <div>
                                    <p>${status}</p>
                                </div>
                                <div>
                                    <p class="mb-0  text-center">Don't have an account? <a href="Signup.jsp" class="text-primary fw-bold">Sign Up</a></p>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </body>

</html>