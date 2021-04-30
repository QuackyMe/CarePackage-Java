<!DOCTYPE html>
<html lang="zxx" class="no-js">
    <head>
        <!-- Mobile Specific Meta -->
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Favicon-->
        <link rel="shortcut icon" href="img/fav.png">
        <!-- Author Meta -->
        <meta name="author" conten  t="Colorlib">
        <!-- Meta Description -->
        <meta name="description" content="">
        <!-- Meta Keyword -->
        <meta name="keywords" content="">
        <!-- meta character set -->
        <meta charset="UTF-8">
        <!-- Site Title -->
        <title>Charity</title>

        <link href="https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700" rel="stylesheet">
        <!--
        CSS
        ============================================= -->
        <link rel="stylesheet" href="css/linearicons.css">=
        <link rel="stylesheet" href="css/font-awesome.min.css">
        <link rel="stylesheet" href="css/magnific-popup.css">
        <link rel="stylesheet" href="css/nice-select.css">
        <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/main.css">
    </head>
    <body>
        <!-- Start Header Area -->
        <header class="default-header">
            <div class="container">
                <div class="header-wrap">
                    <div class="header-top d-flex justify-content-between align-items-center">
                        <div class="logo">
                            <a href="#home"><img src="img/logo.png" alt=""></a>
                        </div>
                        <div class="main-menubar d-flex align-items-center">
                            <nav class="hide">
                                <a href="#home">Home</a>
                                <a href="#project">Projects</a>
                                <a href="#about">About</a>
                                <a href="#donate">Donate</a>
                                <a href="#volunteer">Volunteer</a>
                            </nav>
                            <div class="menu-bar"><span class="lnr lnr-menu"></span></div>
                        </div>

                    </div>                  
                </div>
            </div>        
        </div>
    </header>
    <!-- End Header Area -->

    <!-- start banner Area -->
    <%
        try {
            org.me.care.CareWS_Service service = new org.me.care.CareWS_Service();
            org.me.care.CareWS port = service.getCareWSPort();
            // TODO process result here
            java.lang.String result = port.donate();
            out.println(result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
    %>    
    <%
        try {
            org.me.care.CareWS_Service service = new org.me.care.CareWS_Service();
            org.me.care.CareWS port = service.getCareWSPort();
            // TODO initialize WS operation arguments here
            java.lang.String site = request.getParameter("site");
            java.lang.String name = request.getParameter("fname") + " " + request.getParameter("lname");
            java.lang.String email = request.getParameter("email");
            java.lang.String message = request.getParameter("message");
            // TODO process result here
            java.lang.String result = port.volunteer(site, name, email, message);
            out.println("Result = " + result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
    %>

    <section class="banner-area relative" id="home">
        <div class="overlay overlay-bg"></div>
        <div class="container">
            <div class="row fullscreen align-items-center justify-content-start" style="height: 915px;">
                <div class="banner-content col-lg-9 col-md-12">
                    <h1>
                        Disaster Relief <br>
                        Donation Services
                    </h1>
                    <a href="#donate" class="head-btn head-btn2 btn text-uppercase">Donate Now</a> &nbsp;
                    <a href="#volunteer" class="head-btn head-btn2 btn text-uppercase">Volunteer Now</a>
                </div>
            </div>
        </div>
    </section>
    <!-- End banner Area -->

    <!-- Start project Area -->
    <section class="project-area section-gap" id="project">
        <div class="container">
            <div class="row d-flex justify-content-center">
                <div class="col-md-8 pb-80 header-text">
                    <h1>Every contribution counts.</h1>
                    <p>
                        There may be evacuees nearby in need of your help. <br> 
                        Below are few of the many evacuation sites that receiver your donations. <br>
                        Fill up our donation form if you wish to make a contribution, and we'll do the rest.
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-4 col-md-4 project-wrap">
                    <div class="single-project">
                        <div class="content">
                            <a href="#" target="_blank">
                                <div class="content-overlay"></div>
                                <img class="content-image img-fluid d-block mx-auto" src="img/p1.jpg" alt="">
                                <div class="content-details fadeIn-bottom">
                                    <a href="#" class="head-btn btn text-uppercase">Donate Now</a>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="details">
                        <a href="#"><h2>Veterans Memorial Medical Center</h2></a>
                        <p>Trunkline: (632) 927-6426 to 45. Emergency direct line: 920-8251. Email: veteransmed@gmail.com. </p>
                        <a class="text-uppercase" href="#">read more</a>
                    </div>

                </div>
                <div class="col-lg-4 col-md-4 project-wrap">
                    <div class="single-project">
                        <div class="content">
                            <a href="#" target="_blank">
                                <div class="content-overlay"></div>
                                <img class="content-image img-fluid d-block mx-auto" src="img/p2.jpg" alt="">
                                <div class="content-details fadeIn-bottom">
                                    <a href="#" class="head-btn btn text-uppercase">Donate Now</a>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="details">
                        <a href="#"><h2>Intramuros Golf Course</h2></a>
                        <p>Trunkline: +632 506 3134. Mobile: +63917 673 4653. Email: admin@golfph.com</p>
                        <a class="text-uppercase" href="#">read more</a>
                    </div>
                </div>
                <div class="col-lg-4 col-md-4 project-wrap">
                    <div class="single-project">
                        <div class="content">
                            <a href="#" target="_blank">
                                <div class="content-overlay"></div>
                                <img class="content-image img-fluid d-block mx-auto" src="img/p3.jpg" alt="">
                                <div class="content-details fadeIn-bottom">
                                    <a href="#" class="head-btn btn text-uppercase">Donate Now</a>
                                </div>
                            </a>
                        </div>
                    </div>
                    <div class="details">
                        <a href="#"><h2>Villamor Airbase Golf Club</h2></a>
                        <p>Trunkline: (632) 927-6426 to 45. Emergency direct line: 920-8251. Email: veteransmed@gmail.com.</p>
                        <a class="text-uppercase" href="#">read more</a>
                    </div>
                </div>

            </div>
        </div>
    </section>
    <!-- End project Area -->

    <!-- Start about Area -->
    <section class="about-area" id="about">
        <div class="container-fluid">
            <div class="row d-flex justify-content-end align-items-center">
                <div class="col-lg-6 col-md-12 about-left no-padding">
                    <img class="img-fluid" src="img/about-img.jpg" alt="">
                </div>
                <div class="col-lg-6 col-md-12 about-right">
                    <h1>You Provide. <br>
                        We Deliver.</h1>
                    <p>
                        Whatever amount you choose to give, we carefuly allocate for goods as needed by evacuees.
                    </p>
                    <button class="primary-btn mt-20 text-uppercase ">learn more<span class="lnr lnr-arrow-right"></span></button>
                </div>
            </div>
        </div>
    </section>
    <!-- End about Area 
     
    <!--Start volunteer Area-->
    <section class="volunteer-area section-gap" id="volunteer">					
        <div class="container">
            <div class="row d-flex justify-content-end ">
                <div class="col-lg-6 col-sm-12 pb-80 header-text">
                    <h1>Join Us</h1>
                    <p>
                        We need someone like you <br> who is passionate about helping someone in need
                    </p>
                </div>
            </div>
            <h3> Our Volunteers </h3> <br>
            <div class="row d-flex justify-content-center">			
                <div class="col-lg-6 contact-left">				
                    <ul class="list-unstyled">
                        <%
                            try {
                                org.me.care.CareWS_Service service = new org.me.care.CareWS_Service();
                                org.me.care.CareWS port = service.getCareWSPort();
                                // TODO process result here
                                java.lang.String result = port.retrieveVolunteer();
                                out.println(result);
                            } catch (Exception ex) {
                                // TODO handle custom exceptions here
                            }
                        %>

                    </ul>
                </div>
                <div class="col-lg-6 contact-right">
                    <form class="booking-form" id="myForm" action="index.jsp">
                        <div class="row">
                            <div class="col-lg-12 d-flex flex-column">
                                <select name="site" class="app-select form-control" required>
                                    <option value="" data-display="Site near you">Site you want to donate to</option>
                                    <option value="1">Veterans Memorial Medical Center</option>
                                    <option value="2">Intramuros Golf Course</option>
                                    <option value="3">Villamor Airbase Golf Club</option>
                                </select>
                            </div>
                            <div class="col-lg-6 d-flex flex-column">
                                <input name="fname" placeholder="Enter your first name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter your name'" class="form-control mt-20" required="" type="text" required>
                            </div>
                            <div class="col-lg-6 d-flex flex-column">
                                <input name="lname" placeholder="Enter your last name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter your name'" class="form-control mt-20" required="" type="text" required>
                            </div>
                            <div class="col-lg-12 d-flex flex-column">
                                <input name="email" placeholder="Enter email address" pattern="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{1,63}$" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter email address'" class="form-control mt-20" required="" type="email">
                            </div>
                            <div class="col-lg-12 d-flex flex-column">	
                                <textarea class="form-control mt-20" name="message" placeholder="Messege" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Messege'" required=""></textarea>
                            </div>

                            <div class="col-lg-12 d-flex justify-content-end send-btn">
                                <button class="submit-btn primary-btn mt-20 text-uppercase ">Volunteer<span class="lnr lnr-arrow-right"></span></button>
                            </div>

                            <div class="alert-msg"></div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </section>
    <!--End volunteer Area -->


    <!-- Start donate Area -->
    <section class="donate-area relative section-gap" id="donate">
        <div class="overlay overlay-bg"></div>
        <div class="container">
            <div class="row d-flex justify-content-end">
                <div class="col-lg-6 col-sm-12 pb-80 header-text">
                    <h1>A Small Donation Could Change a Life</h1>
                    <p>
                        Any amount of change could change someone's life for eternity.
                    </p>
                </div>
            </div>
            <div class="row d-flex justify-content-center">
                <div class="col-lg-6 contact-left">
                    <div class="single-info">
                        <h4>Divided Evenly</h4>
                        <p>
                            We assure you that whatver amount you give will be divided evenly among those in need.<br> Every donation counts.
                        </p>
                    </div>
                    <div class="single-info">
                        <h4>Transperancy All the Way</h4>
                        <p>
                            We provide tracking of whether your contribution has been recieved or not. <br> Click away.
                        </p>
                    </div>
                    <div class="single-info">
                        <h4>Trustworthy</h4>
                        <p>
                            Our job is to be the bridge between you and the needy.<br> Trust that we are dedicated to bring what you have provided.
                        </p>
                    </div>
                </div>
                <div class="col-lg-6 contact-right">
                    <form class="booking-form" id="myForm" action="payment.jsp">
                        <div class="row">

                            <div class="col-lg-6 d-flex flex-column">
                                <input name="fname" placeholder="Enter your first name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter your name'" class="form-control mt-20" required="" type="text" required>
                            </div>
                            <div class="col-lg-6 d-flex flex-column">
                                <input name="lname" placeholder="Enter your last name" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter your name'" class="form-control mt-20" required="" type="text" required>
                            </div>
                            <div class="col-lg-12 d-flex flex-column">
                                <input name="email" placeholder="Enter email address" pattern="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{1,63}$" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter email address'" class="form-control mt-20" required="" type="email">
                            </div>
                            <div class="col-lg-12 d-flex flex-column">
                                <input name="amount" placeholder="Donation amount (Php)" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Donation amount (Php)'" class="form-control mt-20" required="" type="text">
                            </div>
                            <div class="col-lg-12 d-flex justify-content-end send-btn">
                                <button class="submit-btn primary-btn mt-20 text-uppercase">donate<span class="lnr lnr-arrow-right"></span></button>
                            </div>

                            <div class="alert-msg submit-btn"></div>
                        </div>
                    </form>
                    <p class="payment-method">
                        We Accept :   <img src="img/payment.png" alt="">
                    </p>
                </div>
            </div>
        </div>
    </section>
    <!-- End donate Area -->


    <!-- start footer Area -->
    <footer class="footer-area section-gap">
        <div class="container">
            <div class="row d-flex flex-column justify-content-center">
                <ul class="footer-menu">
                    <li><a href="#home">Home</a></li>
                    <li><a href="#project">Projects</a></li>
                    <li><a href="#about">About</a></li>
                    <li><a href="#donate">Donate</a></li>
                    <li><a href="#volunteer">Volunteer</a></li>
                </ul>
                <div class="footer-social">
                    <a href="#"><i class="fa fa-facebook"></i></a>
                    <a href="#"><i class="fa fa-twitter"></i></a>
                    <a href="#"><i class="fa fa-dribbble"></i></a>
                    <a href="#"><i class="fa fa-behance"></i></a>
                </div>
            </div>
        </div>
    </footer>
    <!-- End footer Area -->

    <script src="js/vendor/jquery-2.2.4.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    <script src="js/vendor/bootstrap.min.js"></script>
    <script src="js/jquery.ajaxchimp.min.js"></script>
    <script src="js/jquery.nice-select.min.js"></script>
    <script src="js/jquery.sticky.js"></script>
    <script src="js/parallax.min.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script src="js/jquery.magnific-popup.min.js"></script>
    <script src="js/main.js"></script>
</body>
</html>
