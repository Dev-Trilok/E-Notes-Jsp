<%-- 
    Document   : index
    Created on : 28 Dec, 2020, 9:51:33 PM
    Author     : Triloknath Nalawade
--%>

<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0  shrink-to-fit=no" />
        <title>E-Notes </title>
      

    </head>
    <body>
        <%@include file="component/BootstrapLinks.jsp" %>
        <%@include file="component/Navbar.jsp" %>

        <div class=" bg-wallpaper"> 
            <div class="txt-middle text-center"> 
                <h1 class="text-white">E-Notes save here notes!</h1>
                <a href="Login.jsp" class="btn btn-primary">Login </a> &nbsp;
                  <a href="Register.jsp" class="btn btn-primary">New User </a>
            
                <% 
                    UserDao sa;
                    UserDetails user = null;
//                = (UserDetails) session.getAttribute("UserData");
                
          if(user != null)
          {
      %>
      <a href="Login.jsp" class="btn btn-primary"><%= user.getFname() +user.getLname()  %></a> &nbsp; &nbsp;
        <a href="Register.jsp" class="btn btn-primary">Register</a> &nbsp; &nbsp;
        <%
          }
          else{
              %>
      
        <a href="Login.jsp" class="btn btn-primary">Login</a> &nbsp; &nbsp;
        <a href="Register.jsp" class="btn btn-primary">Register</a> &nbsp; &nbsp;
        <%
          }
          %>
        </div> 
        </div>
        <%@include file="component/Footer.jsp" %>

    </body>
</html>
