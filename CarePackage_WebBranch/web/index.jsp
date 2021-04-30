<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="refresh" content="5" >
        <meta charset="UTF-8">
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
        <%
            try {
                org.me.care.CareWS_Service service = new org.me.care.CareWS_Service();
                org.me.care.CareWS port = service.getCareWSPort();
                // TODO initialize WS operation arguments here
                java.lang.String itemName = request.getParameter("item");
                java.lang.String quantity = request.getParameter("quantity");
                java.lang.String price = request.getParameter("price");
                java.lang.String discount = request.getParameter("discount");
                // TODO process result here
                java.lang.String result = port.purchase(itemName, quantity, price, discount);
                out.println(result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>

        <%
            double totalAmount = 0;
            try {
                org.me.care.CareWS_Service service = new org.me.care.CareWS_Service();
                org.me.care.CareWS port = service.getCareWSPort();
                // TODO process result here
                totalAmount = Double.parseDouble(port.retrievePurchaseSum());
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
        %>



        <form action="index.jsp" method="POST">

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
                                        <th>Item Name</th> <!--Item Name-->
                                        <th>Quantity</th> <!--Quantity-->
                                        <th>Price</th> <!--Price per Unit-->
                                        <th>Discount</th> <!--Quantity-->                                      
                                        <th>Line Total</th> <!--Line Total-->
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                        try {
                                            org.me.care.CareWS_Service service = new org.me.care.CareWS_Service();
                                            org.me.care.CareWS port = service.getCareWSPort();
                                            // TODO process result here
                                            java.lang.String result = port.retrievePurchase();
                                            out.println(result);
                                        } catch (Exception ex) {
                                            // TODO handle custom exceptions here
                                        }
                                    %>


                                    <tr>
                                        <td></td> <!--ID-->
                                        <td><input type="text" name="item"></td> <!--Item Name-->
                                        <td><input type="text" name="quantity"></td> <!--Quantity-->
                                        <td><input type="text" name="price"></td> <!--Price per Unit-->
                                        <td><input type="text" name="discount"></td> <!--Discount-->
                                        <td></td> <!--Line Total--> 
                                    </tr>
                                </tbody>
                            </table>
                            <object align="right"><input type="SUBMIT" value="Save Item" class="btn btn-success btn-lg"Save Item></object> <br> <br>
                                    <hr>
                                        </div>
                                        <div class="ttl-amts">
                                            <h4> <strong>Total Amount : <%out.println(totalAmount);%> Php</strong> </h4>
                                        </div>
                                        </div>
                                        </div>
                                        <div class="row pad-top-botm">
                                            <div class="col-lg-12 col-md-12 col-sm-12">
                                                <hr />
                                                <a href="evacuee.jsp" class="btn btn-primary btn-lg" >View Evacuee List</a>  
                                                <a href="donator.jsp" class="btn btn-primary btn-lg" >View Donations Lists</a>  
                                            </div>
                                        </div>
                                        </div>
                                        </form>
                                        </body>
                                        </html>


