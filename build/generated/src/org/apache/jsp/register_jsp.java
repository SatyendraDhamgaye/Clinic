package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("    <title>clinic</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <style type=text/css> .ddd { float: left; } .ddd{ padding : 1%; color: white; width: 70%; color: black; } .dddd { float: left; } .dddd{ padding : 1%; color: white; background-color: lightgrey; width: 30%; color: black; } </style> <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <img src=\"DSC%20clinicnow.jpg\" width=\"100%\" height=\"30%\">\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-dark\">\n");
      out.write("  <!-- Navbar content -->\n");
      out.write("     \n");
      out.write("        <a class=\"navbar-brand\" style=\"color: white\" >Caring For Life</a>\n");
      out.write("  <button  class=\"navbar-toggler\" style=\"color: white\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span style=\"color: white\" class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("    <ul class=\"navbar-nav\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"index.jsp\" style=\"color: white\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"about.jsp\" style=\"color: white\">About</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"gallery.jsp\" style=\"color: white\">Gallery</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"register.jsp\" style=\"color: white\">Register</a>\n");
      out.write("      </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"login.jsp\" style=\"color: white\">Login</a>\n");
      out.write("      </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"contact.jsp\" style=\"color: white\">Contact</a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("    \n");
      out.write("   <div class=\"ddd\"> \n");
      out.write("         <h2>Registeration Form</h2> \n");
      out.write("         \n");
      out.write("       <div class=\"col\">\n");
      out.write("       \n");
      out.write("       </div>\n");
      out.write("         <form action=\"ClinicControler\" method=\"get\">\n");
      out.write("       <input type=\"hidden\" name=\"action\" value=\"insert\">\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\">Name</label>\n");
      out.write("    <input type=\"name\" name=\"name\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter name\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\">Email</label>\n");
      out.write("    <input type=\"email\" name=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\n");
      out.write("  \n");
      out.write("  </div> <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\">Mobile</label>\n");
      out.write("    <input type=\"name\" name=\"mobile\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter Ph.No.\">\n");
      out.write("   \n");
      out.write("  </div> <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\">Username</label>\n");
      out.write("    <input type=\"name\" name=\"username\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter username\">\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("    <input type=\"password\" name=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\n");
      out.write("  </div>\n");
      out.write("       <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputPassword1\">Confirm Password</label>\n");
      out.write("    <input type=\"password\" name=\"conpass\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password1\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group form-check\">\n");
      out.write("    <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("    <label class=\"form-check-label\" for=\"exampleCheck1\"><a href=\"#\">Terms</a> and <a href=\"#\">Condition</a></label>\n");
      out.write("  </div>\n");
      out.write("       <input type=\"submit\" value=\"Insert\" name=\"action\" class=\"btn btn-outline-success\">\n");
      out.write("</form>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write(" <div class=\"dddd\"> \n");
      out.write("         <h1>Latest Clinic News</h1> \n");
      out.write("     <h5 style=\"color: green\">22.05.2019</h5>\n");
      out.write("     <p><b>Doctor Appointment</b> When a patientbooks an appointment with the doctor can approve the appointment.</p>    <h5 style=\"color: green\">20.05.2019</h5>\n");
      out.write("     <p><b>Appointment Booking</b> The doctor will always approve the request for the appointment ,until and unless he?she has a valid reason not to.</p>\n");
      out.write("<h5 style=\"color: green\">21.05.2019</h5>\n");
      out.write("         <p><b>Doctor Schedule</b> Due to some reason, a patient who has made an appointment, cannot attend the doctor that day\n");
      out.write("      </p> \n");
      out.write("      </div> \n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\" https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
