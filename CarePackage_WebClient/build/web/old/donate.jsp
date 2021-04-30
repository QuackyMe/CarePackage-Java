<%-- 
    Document   : donate
    Created on : 04 19, 19, 6:19:26 PM
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
    </head>
    <body>
        <div class="card">
            <header class="card-header">
                <h4 class="card-title mt-2">Thank you for your kindness!</h4>
            </header>
            <article class="card-body">
                <form>
                    <div class="form-row">
                        <div class="col form-group">
                            <label>First name</label>
                            <input type="text" class="form-control" placeholder="">
                        </div> <!-- form-group end.// -->
                        <div class="col form-group">
                            <label>Last name</label>
                            <input type="text" class="form-control" placeholder="">
                        </div> <!-- form-group end.// -->
                    </div> <!-- form-row end.// -->
                    <div class="form-group">
                        <label>Email address</label>
                        <input type="email" class="form-control" placeholder="">
                        <small class="form-text text-muted">We'll never share your email with anyone else.</small>
                        <br>

                        <div class="card">
                            <article class="card-group-item">
                                <div class="card-body">
                                    <div class="form-row">
                                        <label>Donation</label>
                                        <input type="number" class="form-control" id="inputEmail4" placeholder="$0">
                                    </div>
                                </div> <!-- card-body.// -->
                            </article> <!-- card-group-item.// -->
                        </div>

                    </div> <!-- form-group end.// -->             
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label>City</label>
                            <input type="text" class="form-control">
                        </div> <!-- form-group end.// -->
                        <div class="form-group col-md-6">
                            <label>Province</label>
                            <select id="inputState" class="form-control">
                                <option> Choose...</option>
                                <option>Metro Manila</option>
                                <option>Russia</option>
                                <option selected="">Palawan</option>
                                <option>Pampanga</option>
                            </select>
                        </div> <!-- form-group end.// -->
                    </div> <!-- form-row.// -->
                    <div class="form-group">
                        <label>Create password</label>
                        <input class="form-control" type="password">
                    </div> <!-- form-group end.// -->  
                    <div class="form-group">
                        <button type="submit" class="btn btn-primary btn-block"> Submit </button>
                    </div> <!-- form-group// -->      
                    <small class="text-muted">By clicking the 'Submit' button, you confirm that you accept our <br> Terms of use and Privacy Policy.</small>                                          
                </form>
                <button class="btn "> Return </button>
            </article> <!-- card-body end .// -->
        </div> <!-- card.// -->

    </body>
</html>
