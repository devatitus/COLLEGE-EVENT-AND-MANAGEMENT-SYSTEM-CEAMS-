package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class windecl_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("<title>Event Management</title>\n");
      out.write("\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Poppins:400,700,900\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/bootstrap.min.css\" />\n");
      out.write("\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/owl.carousel.css\" />\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/owl.theme.default.css\" />\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"css/style.css\" />\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <body background=\"img/background03.jpg\">\n");
      out.write("        <form action=\"InterPari\" method=\"post\"> \n");
      out.write("    <center>\n");
      out.write("       \n");
      out.write("         \n");
      out.write("         <br><br><br><br>\n");
      out.write("         <br><br><br><br>\n");
      out.write("         \n");
      out.write("         <h1 style=\"color: #fff\">Result Declaration Page </h1><br><br><br>\n");
      out.write("<!--        <a href=\"IntraPar.jsp\" class=\"main-btn\" style=\"height: 70px;width: 300px\">Intra Participants</a>-->\n");
      out.write("<input type=\"text\" name=\"sname\" value=\"\" style=\"height: 40px;width: 300px\" placeholder=\"Student Name\">\n");
      out.write("         <br><br>\n");
      out.write("<input type=\"text\" name=\"sreg\" value=\"\" style=\"height: 40px;width: 300px\" placeholder=\"Student RegNo\">\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("          <input class=\"main-btn\" style=\"background-color: #fff; color: crimson;\"type=\"submit\" value=\"Submit\" />\n");
      out.write("    </center>\n");
      out.write("       \n");
      out.write("            \n");
      out.write("            <div class=\"section-bg\" style=\"background-image:url(./img/background03.jpg)\" data-stellar-background-ratio=\"0.5\"></div>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("     </body>\n");
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
