<%-- 
    Document   : Login
    Created on : 29 Dec, 2020, 3:04:45 PM
    Author     : Triloknath Nalawade
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta name="viewport" content="width=device-width, initial-scale=1.0  shrink-to-fit=no" />
        <title>E-Notes Register Page</title>
        <link rel="stylesheet" href="bootstrap\dist\css\bootstrap.min.css" />
        <link rel="stylesheet" href="Css/CustomCss.css" />
    </head>
    <body>

        <%@include file="component/Navbar.jsp" %>
         
         <div class=" bg-wallpaper"> 
             <br>
        <div class="container-fluid">
            <div class="col-md-6 offset-md-3">
                <div class="card">
                    <div class="card-header text-center text-white bg-custom">
                        <h4>Login</h4>
                    </div>
                    <div class="card-body">
                        <form>

                            <div class="form-group">
                                <label for="exampleInputEmail1">Email address</label>
                                <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">

                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Password</label>
                                <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                            </div>
                            <br>
                             <button type="submit" class="btn btn-primary">Login</button> 
                             &nbsp;
                             <button type="submit" class="btn btn-primary btn-"> cancel</button>
                             
                    </form>
                    </div>

                   
                </div> 
            </div>
        </div> 
    </div>
    <script src="jquery\dist\jquery.slim.min.js"></script>
    <script src="popper.js\dist\umd\popper.min.js"></script>
    <script src="bootstrap\dist\js\bootstrap.min.js"></script>
</body>
</html>
