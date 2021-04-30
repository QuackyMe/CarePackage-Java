<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta charset="UTF-8">
            <meta http-equiv="refresh" content="10;URL=donator.jsp">
            <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
            <meta name="description" content="" />
            <meta name="author" content="" />

            <title>Free Bootstrap Invoice</title>
            <!-- BOOTSTRAP CORE STYLE  -->
            <link href="assets/css/bootstrap.css" rel="stylesheet" />
            <!-- CUSTOM STYLE  -->
            <link href="assets/css/custom-style.css" rel="stylesheet" />
            <!-- GOOGLE FONTS -->
            <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css' />

    </head>
    <body>

            <div class="container">

                <div class="row pad-top-botm ">
                    <div class="col-lg-6 col-md-6 col-sm-6 ">
                        <img src="assets/img/logo.PNG" style="padding-bottom:20px;" /> 
                    </div>
                    <div class="col-lg-9 col-md-9 col-sm-9">
                        <br>
                            <strong>CarePackage</strong>
                            <br />
                            <i>Address :</i> North Ave, Diliman
                            <br />
                            Quezon City, Metro Manila
                            <br />
                            Philippines.
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12 col-md-12 col-sm-12">
                        <div class="table-responsive">
                            <table class="table table-striped table-bordered table-hover">
                                <thead>
                                    <tr>
                                        <th>ID</th> <!--ID-->
                                        <th>Site</th> <!--Site ID-->
                                        <th>Name</th> <!--Name-->
                                        <th>E-Mail</th> <!--Email-->
                                        <th>Amount</th> <!--Amount-->                                      
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                        try {
                                            org.me.care.CareWS_Service service = new org.me.care.CareWS_Service();
                                            org.me.care.CareWS port = service.getCareWSPort();
                                            // TODO process result here
                                            java.lang.String result = port.retrieveDonation("1");
                                            out.println(result);
                                        } catch (Exception ex) {
                                            // TODO handle custom exceptions here
                                        }
                                    %>
                                </tbody>
                            </table>
                                    <hr>
                                        </div>
                                        </div>
                                        </div>
                                        <div class="row pad-top-botm">
                                            <div class="col-lg-12 col-md-12 col-sm-12">
                                                <hr />
                                                <a href="evacuee.jsp" class="btn btn-primary btn-lg" >View Evacuee List</a>  
                                            </div>
                                        </div>
                                        </div>
                                        </body>
                                        </html>
