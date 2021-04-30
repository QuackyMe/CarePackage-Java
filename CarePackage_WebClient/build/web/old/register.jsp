<!DOCTYPE html>
<html lang="en">
<head>
    <title>Register</title>

    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <!-- FontAwesome CSS -->
    <link rel="stylesheet" href="css/font-awesome.min.css">

    <!-- ElegantFonts CSS -->
    <link rel="stylesheet" href="css/elegant-fonts.css">

    <!-- themify-icons CSS -->
    <link rel="stylesheet" href="css/themify-icons.css">

    <!-- Swiper CSS -->
    <link rel="stylesheet" href="css/swiper.min.css">

    <!-- Styles -->
    <link rel="stylesheet" href="style.css">
    <style type="text/css">
        .register-form{
            text-align: center;
            margin: 15px 400px;
        }
        #register{
            width: 100%;
            padding: 50px 0px;

        }
        #fname{
            width: 250px;
            padding: 10px;
            border-radius: 5px;
            outline: 0px;
        }
        #butt{
            width: 250px;
            padding: 10px;
            border-radius: 5px;
            outline: 0px;
            background-color: #FF8C00;
            border: 2px solid #01010c;
            color: aliceblue;
            font-size: 18px;
        }

    </style>
</head>
<body class="single-page about-page">
<header class="site-header">
    <div class="top-header-bar">
        <div class="container">
            <div class="row flex-wrap justify-content-center justify-content-lg-between align-items-lg-center">
                <div class="col-12 col-lg-8 d-none d-md-flex flex-wrap justify-content-center justify-content-lg-start mb-3 mb-lg-0">
                    <div class="header-bar-email">
                        MAIL: <a href="#">contact@carepackage.com</a>
                    </div><!-- .header-bar-email -->

                    <div class="header-bar-text">
                        <p>PHONE: <span>+639498209116</span></p>
                    </div><!-- .header-bar-text -->
                </div><!-- .col -->

                <div class="col-12 col-lg-4 d-flex flex-wrap justify-content-center justify-content-lg-end align-items-center">
                    <div class="donate-btn">
                        <a href="login.jsp">Donate Now</a>
                    </div><!-- .donate-btn -->
                </div><!-- .col -->
            </div><!-- .row -->
        </div><!-- .container -->
    </div><!-- .top-header-bar -->

    <div class="nav-bar">
        <div class="container">
            <div class="row">
                <div class="col-12 d-flex flex-wrap justify-content-between align-items-center">
                    <div class="site-branding d-flex align-items-center">
                        <a class="d-block" href="index.jsp" rel="home"><img class="d-block" src="images/logo.jpg" alt="logo"></a>
                    </div><!-- .site-branding -->

                    <nav class="site-navigation d-flex justify-content-end align-items-center">
                        <ul class="d-flex flex-column flex-lg-row justify-content-lg-end align-content-center">
                            <li><a href="index.jsp">Home</a></li>
                            <li><a href="about.jsp">About Us</a></li>
                            <li class="current-menu-item"><a href="register.jsp">Register</a></li>
                            <li><a href="contact.jsp">Contact Us</a></li>
                        </ul>
                    </nav><!-- .site-navigation -->

                    <div class="hamburger-menu d-lg-none">
                        <span></span>
                        <span></span>
                        <span></span>
                        <span></span>
                    </div><!-- .hamburger-menu -->
                </div><!-- .col -->
            </div><!-- .row -->
        </div><!-- .container -->
    </div><!-- .nav-bar -->
</header><!-- .site-header -->

    <div class="page-header">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <h1>Register</h1>
                </div><!-- .col -->
            </div><!-- .row -->
        </div><!-- .container -->
    </div><!-- .page-header -->

   <div class = "register-form">
        <form id = "register">
            <input type="text" name="fname" id="fname" placeholder="Enter First Name"><br><br>
            <input type="text" name="lname" id="lname" placeholder="Enter Last Name"><br><br>
            <input type="text" name="password" id="pass" placeholder="Enter Password"><br><br>
            <input type="text" name="confPassword" id="confPass" placeholder="Confirm Password"><br><br>
            <input type="text" name="contact number" id="fname" placeholder="Enter Contact Number"><br><br>
            <input type="text" name="Address" id="fname" placeholder="Enter Address"><br><br>
            <input class="btn gradient-bg" type="submit" value="Register">
        </form>
   </div>

    <div class="help-us">
        <div class="container">
            <div class="row">
                <div class="col-12 d-flex flex-wrap justify-content-between align-items-center">
                    <h2>Give your share to show you care</h2>

                    <a class="btn orange-border" href="#">Donate now</a>
                </div>
            </div>
        </div>
    </div>


    <script type='text/javascript' src='js/jquery.js'></script>
    <script type='text/javascript' src='js/jquery.collapsible.min.js'></script>
    <script type='text/javascript' src='js/swiper.min.js'></script>
    <script type='text/javascript' src='js/jquery.countdown.min.js'></script>
    <script type='text/javascript' src='js/circle-progress.min.js'></script>
    <script type='text/javascript' src='js/jquery.countTo.min.js'></script>
    <script type='text/javascript' src='js/jquery.barfiller.js'></script>
    <script type='text/javascript' src='js/custom.js'></script>
</body>
</html>