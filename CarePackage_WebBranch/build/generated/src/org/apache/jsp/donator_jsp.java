package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;

public final class donator_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\" />\n");
      out.write("            <meta name=\"description\" content=\"\" />\n");
      out.write("            <meta name=\"author\" content=\"\" />\n");
      out.write("\n");
      out.write("            <title>Free Bootstrap Invoice</title>\n");
      out.write("            <!-- BOOTSTRAP CORE STYLE  -->\n");
      out.write("            <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\n");
      out.write("            <!-- CUSTOM STYLE  -->\n");
      out.write("            <link href=\"assets/css/custom-style.css\" rel=\"stylesheet\" />\n");
      out.write("            <!-- GOOGLE FONTS -->\n");
      out.write("            <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css' />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                <div class=\"row pad-top-botm \">\n");
      out.write("                    <div class=\"col-lg-6 col-md-6 col-sm-6 \">\n");
      out.write("                        <img src=\"assets/img/logo.PNG\" style=\"padding-bottom:20px;\" /> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-9 col-md-9 col-sm-9\">\n");
      out.write("                        <br>\n");
      out.write("                            <strong>   CarePackage</strong>\n");
      out.write("                            <br />\n");
      out.write("                            <i>Address :</i> Jupiter Street,\n");
      out.write("                            <br />\n");
      out.write("                            Makati, Metro Manila,\n");
      out.write("                            <br />\n");
      out.write("                            Philippines.\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("                        <div class=\"table-responsive\">\n");
      out.write("                            <table class=\"table table-striped table-bordered table-hover\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th>ID</th> <!--ID-->\n");
      out.write("                                        <th>Site</th> <!--Site ID-->\n");
      out.write("                                        <th>Name</th> <!--Name-->\n");
      out.write("                                        <th>E-Mail</th> <!--Email-->\n");
      out.write("                                        <th>Amount</th> <!--Amount-->                                      \n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");

                                        try {
                                            org.me.care.CareWS_Service service = new org.me.care.CareWS_Service();
                                            org.me.care.CareWS port = service.getCareWSPort();
                                            // TODO process result here
                                            java.lang.String result = port.retrieveDonation("1");
                                            out.println(result);
                                        } catch (Exception ex) {
                                            // TODO handle custom exceptions here
                                        }
                                    
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                                    <hr>\n");
      out.write("                                        </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row pad-top-botm\">\n");
      out.write("                                            <div class=\"col-lg-12 col-md-12 col-sm-12\">\n");
      out.write("                                                <hr />\n");
      out.write("                                                <a href=\"evacuee.jsp\" class=\"btn btn-primary btn-lg\" >View Evacuee List</a>  \n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        </body>\n");
      out.write("                                        </html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
