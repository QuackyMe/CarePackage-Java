<%-- 
    Document   : donate
    Created on : 04 19, 19, 5:48:03 PM
    Author     : James
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">

    </head>
    <body>


        <article class="card">
            <div class="card-body p-5">
                <p> <img src="images/icons/pay-visa.png" width="64"> 
                    <img src="images/icons/pay-mastercard.png" width="64"> </p>
                <p class="alert alert-success">Some text success or error</p>

                <form role="form">
                    <div class="form-group">
                        <label for="username">Full name (on the card)</label>
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text"><i class="fa fa-user"></i></span>
                            </div>
                            <input type="text" class="form-control" name="username" placeholder="" required="">
                        </div> <!-- input-group.// -->
                    </div> <!-- form-group.// -->

                    <div class="form-group">
                        <label for="cardNumber">Card number</label>
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text"><i class="fa fa-credit-card"></i></span>
                            </div>
                            <input type="text" class="form-control" name="cardNumber" placeholder="">
                        </div> <!-- input-group.// -->
                    </div> <!-- form-group.// -->

                    <div class="row">
                        <div class="col-sm-8">
                            <div class="form-group">
                                <label><span class="hidden-xs">Expiration</span> </label>
                                <div class="form-inline">
                                    <select class="form-control" style="width:45%">
                                        <option>MM</option>
                                        <option>01 - Janiary</option>
                                        <option>02 - February</option>
                                        <option>03 - February</option>
                                    </select>
                                    <span style="width:10%; text-align: center"> / </span>
                                    <select class="form-control" style="width:45%">
                                        <option>YY</option>
                                        <option>2018</option>
                                        <option>2019</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-4">
                            <div class="form-group">
                                <label data-toggle="tooltip" title="" data-original-title="3 digits code on back side of the card">CVV <i class="fa fa-question-circle"></i></label>
                                <input class="form-control" required="" type="text">
                            </div> <!-- form-group.// -->
                        </div>
                    </div> <!-- row.// -->
                    <button class="subscribe btn btn-primary btn-block" type="button"> Confirm  </button>
                </form>
            </div> <!-- card-body.// -->
        </article> <!-- card.// -->


    </body>
</html>
