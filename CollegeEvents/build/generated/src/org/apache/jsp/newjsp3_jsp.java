package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp3_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("    <script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("    function dynamicdropdown(listindex)\n");
      out.write("    {\n");
      out.write("        switch (listindex)\n");
      out.write("        {\n");
      out.write("        case \"manual\" :\n");
      out.write("            document.getElementById(\"status\").options[0]=new Option(\"Select status\",\"\");\n");
      out.write("            document.getElementById(\"status\").options[1]=new Option(\"OPEN\",\"open\");\n");
      out.write("            document.getElementById(\"status\").options[2]=new Option(\"DELIVERED\",\"delivered\");\n");
      out.write("            break;\n");
      out.write("        case \"online\" :\n");
      out.write("            document.getElementById(\"status\").options[0]=new Option(\"Select status\",\"\");\n");
      out.write("            document.getElementById(\"status\").options[1]=new Option(\"OPEN\",\"open\");\n");
      out.write("            document.getElementById(\"status\").options[2]=new Option(\"DELIVERED\",\"delivered\");\n");
      out.write("            document.getElementById(\"status\").options[3]=new Option(\"SHIPPED\",\"shipped\");\n");
      out.write("            break;\n");
      out.write("        }\n");
      out.write("        return true;\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("    <title>Dynamic Drop Down List</title>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"category_div\" id=\"category_div\">Source:\n");
      out.write("        <select id=\"source\" name=\"source\" onchange=\"javascript: dynamicdropdown(this.options[this.selectedIndex].value);\">\n");
      out.write("        <option value=\"\">Select source</option>\n");
      out.write("        <option value=\"manual\">MANUAL</option>\n");
      out.write("        <option value=\"online\">ONLINE</option>\n");
      out.write("        </select>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"sub_category_div\" id=\"sub_category_div\">Status:\n");
      out.write("        <script type=\"text/javascript\" language=\"JavaScript\">\n");
      out.write("        document.write('<select name=\"status\" id=\"status\"><option value=\"\">Select status</option></select>')\n");
      out.write("        </script>\n");
      out.write("        <noscript>\n");
      out.write("        <select id=\"status\" name=\"status\">\n");
      out.write("            <option value=\"open\">OPEN</option>\n");
      out.write("            <option value=\"delivered\">DELIVERED</option>\n");
      out.write("        </select>\n");
      out.write("        </noscript>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
