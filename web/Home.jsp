<%-- 
    Document   : Home
    Created on : 31 Dec, 2020, 12:05:12 PM
    Author     : Triloknath Nalawade
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
    String id = request.getParameter("userId");
    String driverName = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost/ENotes";
    String dbName = "ENotes";
    String userId = "root";
    String password = "root";

    try {
        Class.forName(driverName);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0  shrink-to-fit=no" />
        <title>E-Notes Home</title>
        <link rel="stylesheet" href="bootstrap\dist\css\bootstrap.min.css" />
        <link rel="stylesheet" href="Css/CustomCss.css" />
    </head>
    <body>            
        <%@include file="component/Navbar.jsp" %>
        <div class="text-center">
            <br>
            <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" >Take A Note</button>
        </div> 
        <%
            String saveMsg = (String) session.getAttribute("save-sucess");
            if (saveMsg != null) {
        %>     
        <script type=\"text/javascript\">alert(" + someMessage + ");</script>
        <%
                session.removeAttribute("save-sucess");
            }
        %> 

        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">New Note</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <form action="saveNoteServlet" method="post">
                        <div class="modal-body">
                            <div class="form-group">
                                <label for="recipient-name" class="col-form-label">Title:</label>
                                <input type="text" class="form-control" id="recipient-name" name="Title">
                            </div>
                            <div class="form-group">
                                <label for="message-text" class="col-form-label">Note:</label>
                                <textarea class="form-control" id="message-text" name="Content"></textarea>
                            </div>

                        </div>
                        <div class="modal-footer">
                            <button type="reset" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <button type="submit" class="btn btn-primary">Save</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <br>
        <div style="position:" class="card-columns">
            <%
                try {
                    connection = DriverManager.getConnection(connectionUrl, userId, password);
                    statement = connection.createStatement();
                    String sql = "SELECT * FROM Notes";

                    resultSet = statement.executeQuery(sql);
                    while (resultSet.next()) {
            %>
                               
                                <div class="card  border-primary mb-3 float-sm-none" style="max-width: 18rem;">
                                    <div class="card-body text-primary ">
                                        <h5 class="card-title"><%=resultSet.getString("Title")%></h5>
                                        <p class="card-text"><%=resultSet.getString("Content")%></p>
                                        <a href="#" class="btn btn-primary">Edit</a>
                                    </div>
                                </div>
                                        <br>
           

                <%
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                %>


            </div>
                   <%@include file="component/Footer.jsp" %>


            <script src="jquery\dist\jquery.slim.min.js"></script>
            <script src="popper.js\dist\umd\popper.min.js"></script>
            <script src="bootstrap\dist\js\bootstrap.min.js"></script>
    </body>
</html>
