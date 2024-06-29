package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class eventPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags-->\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"Colorlib Templates\">\n");
      out.write("    <meta name=\"author\" content=\"Colorlib\">\n");
      out.write("    <meta name=\"keywords\" content=\"Colorlib Templates\">\n");
      out.write("\n");
      out.write("    <!-- Title Page-->\n");
      out.write("    <title>Event Management</title>\n");
      out.write("\n");
      out.write("    <!-- Icons font CSS-->\n");
      out.write("    <link href=\"vendor/mdi-font/css/material-design-iconic-font.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/font-awesome-4.7/css/font-awesome.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <!-- Font special for pages-->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Vendor CSS-->\n");
      out.write("    <link href=\"vendor/select2/select2.min.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("    <link href=\"vendor/datepicker/daterangepicker.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("\n");
      out.write("    <!-- Main CSS-->\n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\" media=\"all\">\n");
      out.write("</head>\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("    \n");
      out.write("  function dynamicdropdown(listindex)\n");
      out.write("    {\n");
      out.write("        switch (listindex)\n");
      out.write("        {\n");
      out.write("        case \"sym\" :\n");
      out.write("            document.getElementById(\"status\").options[0]=new Option(\"Select status\",\"\");\n");
      out.write("            document.getElementById(\"status\").options[1]=new Option(\"Mock Interview\",\"int\");\n");
      out.write("            document.getElementById(\"status\").options[2]=new Option(\"PPT\",\"ppt\");\n");
      out.write("            document.getElementById(\"status\").options[3]=new Option(\"Just a minute\",\"just\");\n");
      out.write("            document.getElementById(\"status\").options[4]=new Option(\"Web Desugning\",\"web\");\n");
      out.write("            break;\n");
      out.write("            \n");
      out.write("        case \"conf\" :\n");
      out.write("            document.getElementById(\"status\").options[0]=new Option(\"Select status\",\"\");\n");
      out.write("            document.getElementById(\"status\").options[1]=new Option(\"IEEE Collogium on 3D image\",\"ieee\");\n");
      out.write("            document.getElementById(\"status\").options[2]=new Option(\"5G for ubiquitous computing\",\"5g\");\n");
      out.write("            document.getElementById(\"status\").options[3]=new Option(\" \",\"\");\n");
      out.write("            document.getElementById(\"status\").options[4]=new Option(\" \",\"\");\n");
      out.write("            \n");
      out.write("            break;\n");
      out.write("            case \"work\" :\n");
      out.write("            document.getElementById(\"status\").options[0]=new Option(\"Select status\",\"\");\n");
      out.write("            document.getElementById(\"status\").options[1]=new Option(\"IOT\",\"iot\");\n");
      out.write("            document.getElementById(\"status\").options[2]=new Option(\"BigData\",\"big\");\n");
      out.write("            document.getElementById(\"status\").options[3]=new Option(\"Cloud\",\"cloud\");\n");
      out.write("             document.getElementById(\"status\").options[4]=new Option(\"\",\"\");\n");
      out.write("            break;\n");
      out.write("        }\n");
      out.write("        return true;\n");
      out.write("    }  \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</script>\n");
      out.write("<body>\n");
      out.write("    <div class=\"page-wrapper bg-red p-t-180 p-b-100 font-robo\">\n");
      out.write("        <div class=\"wrapper wrapper--w960\">\n");
      out.write("            <div class=\"card card-2\">\n");
      out.write("                <div class=\"card-heading\"></div>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h2 class=\"title\">Event Page</h2>\n");
      out.write("                    <form method=\"POST\" action=\"PartiPage.jsp\">\n");
      out.write("                     <div class=\"input-group\">\n");
      out.write("                        <div class=\"rs-select2 js-select-simple select--no-search\">   \n");
      out.write("                    <option disabled=\"disabled\" selected=\"selected\"> </option>\n");
      out.write("        <select id=\"source\" name=\"source\" onchange=\"javascript: dynamicdropdown(this.options[this.selectedIndex].value);\">\n");
      out.write("        <option value=\"\">Select </option>\n");
      out.write("        <option value=\"sym\">Symposium</option>\n");
      out.write("        <option value=\"conf\">Conference</option>\n");
      out.write("        <option value=\"work\">Workshop</option>\n");
      out.write("        </select>\n");
      out.write("                    <div class=\"select-dropdown\"></div>\n");
      out.write("                    </div>\n");
      out.write("</div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                        <div class=\"rs-select2 js-select-simple select--no-search\">   \n");
      out.write("                            <script type=\"text/javascript\" language=\"JavaScript\">\n");
      out.write("        document.write('<select name=\"status\" id=\"status\"><option value=\"\">Select event</option></select>')\n");
      out.write("        </script>\n");
      out.write("                   <noscript>\n");
      out.write("                   <option disabled=\"disabled\" selected=\"selected\"> </option>\n");
      out.write("         <select id=\"status\" name=\"event\">\n");
      out.write("            \n");
      out.write("        </select>\n");
      out.write("        <div class=\"select-dropdown\"></div>\n");
      out.write("                        </div></div>\n");
      out.write("        </noscript>\n");
      out.write("                    <div class=\"select-dropdown\"></div>\n");
      out.write("                      \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("    \n");
      out.write("   \n");
      out.write("                        \n");
      out.write("                        <div class=\"p-t-30\">\n");
      out.write("                            <button class=\"btn btn--radius btn--green\" type=\"submit\">Submit</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Jquery JS-->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <!-- Vendor JS-->\n");
      out.write("    <script src=\"vendor/select2/select2.min.js\"></script>\n");
      out.write("    <script src=\"vendor/datepicker/moment.min.js\"></script>\n");
      out.write("    <script src=\"vendor/datepicker/daterangepicker.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Main JS-->\n");
      out.write("    <script src=\"js/global.js\"></script>\n");
      out.write("    <br><br><br>\n");
      out.write("     <a href=\"index.jsp\" class=\"btn btn--radius btn--green\">Back</a>\n");
      out.write("\n");
      out.write("</body><!-- This templates was made by Colorlib (https://colorlib.com) -->\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("<!-- end document-->");
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
