<%-- 
    Document   : Register
    Created on : 29 Dec, 2020, 1:48:42 PM
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
                            <h4>Registration</h4>
                        </div>
                        <%
                             String regMsg = (String) session.getAttribute("reg-sucess");
                            
                             if (regMsg != null) {
                                 
                        %>     
                        
                             <div class="alert alert-primary" role="alert"> 
                                 
                                 <%=regMsg%> 
                                 
                               <a href="Login.jsp">Click here for Login</a></div>
                            
                        <%
                        session.removeAttribute("reg-sucess");
                                }

                          %> 
                            
                         <%
                             
                             String failedMsg = (String) session.getAttribute("reg-failed");
                            
                             if (failedMsg != null) {
                                 
                        %>     
                        
                             <div class="alert alert-danger" role="alert"> 
                                
                                 <%=failedMsg %> 
                                 
                                 </div>                       
                        <%
                                session.removeAttribute("reg-failed");

                                }

                            %> 



                        <div class="card-body">
                            <form action="UserServlet" method="post">
                                <div class="form-row">
                                    <div class="col">
                                        <input type="text" class="form-control" placeholder="First name" name="Fname">
                                    </div>
                                    <div class="col">
                                        <input type="text" class="form-control" placeholder="Last name" name="Lname">
                                    </div>
                                </div>
                                <br>
                                <div class="form-group">

                                    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="Email" placeholder="Enter email">
                                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                </div>
                                <div class="form-row">
                                    <div class="col">
                                        <label for="exampleInputPassword1">New Password</label>
                                        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="Password">
                                    </div>

                                    <div class="col">
                                        <label for="exampleInputPassword1">Verify Password</label>
                                        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                                    </div>
                                </div>
                                <br>
                                <button type="submit" class="btn btn-primary btn-">Submit</button>
                                &nbsp;
                                <button type="submit" class="btn btn-primary btn-">Cancel</button>
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
