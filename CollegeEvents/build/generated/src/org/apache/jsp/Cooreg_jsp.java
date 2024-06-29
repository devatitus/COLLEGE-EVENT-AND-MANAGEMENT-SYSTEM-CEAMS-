package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cooreg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
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
      out.write("        <title>ADMIN</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <form action=\"ComLog\" method=\"post\">  \n");
      out.write("    <center>\n");
      out.write("        <br><br><br>\n");
      out.write("        <br><br><br>\n");
      out.write("        <h1>  <a style=\"color: #bce8f1\"  >COMMON LOGIN</a></h1>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        <br><br><br>\n");
      out.write("        <input type=\"text\" name=\"in1\" value=\"\" style=\"text-align: center;height: 50px;width: 300px\" placeholder=\"Username\"/>\n");
      out.write("        <br><br><br>\n");
      out.write("        <input type=\"password\" name=\"in2\" value=\"\" style=\"text-align: center;height: 50px;width: 300px\" placeholder=\"Password\"/>\n");
      out.write("         <br><br><br>\n");
      out.write("         <input type=\"text\" name=\"in1\" value=\"\" style=\"text-align: center;height: 50px;width: 300px\" placeholder=\"Username\"/>\n");
      out.write("        <br><br><br>\n");
      out.write("        <input type=\"password\" name=\"in2\" value=\"\" style=\"text-align: center;height: 50px;width: 300px\" placeholder=\"Password\"/>\n");
      out.write("         <br><br><br>\n");
      out.write("         <input type=\"text\" name=\"in1\" value=\"\" style=\"text-align: center;height: 50px;width: 300px\" placeholder=\"Username\"/>\n");
      out.write("        <br><br><br>\n");
      out.write("        <input type=\"password\" name=\"in2\" value=\"\" style=\"text-align: center;height: 50px;width: 300px\" placeholder=\"Password\"/>\n");
      out.write("         <br><br><br>\n");
      out.write("          <td>\n");
      out.write("                            <label for=\"selctfile\"></label>\n");
      out.write("                            <select name=\"filename\">\n");
      out.write("                                \n");
      out.write("                                <option> Event 1 </option>\n");
      out.write("                                <option>  Event 2</option>\n");
      out.write("                                <option>  Event 3 </option>\n");
      out.write("                            </select>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         <input type=\"submit\" style=\"height: 50px;width: 200px; background-color: #122b40;color: #000\" value=\"Event Co login\" />\n");
      out.write("       \n");
      out.write("         <input type=\"submit\" style=\"height: 50px;width: 200px; background-color: #122b40;color: #000\" value=\"HOD login\" />\n");
      out.write("         \n");
      out.write("         <input type=\"submit\" style=\"height: 50px;width: 200px; background-color: #122b40;color: #000\" value=\"Department login\" />\n");
      out.write("    </center>\n");
      out.write("        <div class=\"section-bg\" style=\"background-image:url(./img/background02.jpg)\" data-stellar-background-ratio=\"0.5\"></div>\n");
      out.write("\n");
      out.write("      </form>\n");
      out.write("      </html>\n");
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
