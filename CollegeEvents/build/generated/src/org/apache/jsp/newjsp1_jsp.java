package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<title>Region > Country > Division</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("\n");
      out.write("body {\n");
      out.write("\tbackground: #000;\n");
      out.write("}\n");
      out.write("#widget {\n");
      out.write("\twidth: 780px;\n");
      out.write("\theight: 480px;\n");
      out.write("\tfont: normal 10px verdana;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tmargin: 40px auto;\n");
      out.write("\tborder: 5px #aaa;\n");
      out.write("\tborder-style: outset inset inset outset;\n");
      out.write("\tbackground: url(http://www.grsites.com/textures/misc/misc142.jpg);\n");
      out.write("}\n");
      out.write("form {\n");
      out.write("\twidth: 98%;\n");
      out.write("\tmargin: 200px 0 60px 0;\n");
      out.write("}\n");
      out.write("select {\n");
      out.write("\twidth: 190px;\n");
      out.write("\tfont: normal 11px verdana;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tbackground: #000;\n");
      out.write("}\n");
      out.write("#txtregion {\n");
      out.write("\twidth: 98%;\n");
      out.write("\theight: 16px;\n");
      out.write("\tfont: normal 12px verdana;\n");
      out.write("\tletter-spacing: .4em;\n");
      out.write("\tmargin: auto;\n");
      out.write("\tborder-bottom: 1px black solid;\n");
      out.write("}\n");
      out.write("#txtplacename {\n");
      out.write("\twidth: 98%;\n");
      out.write("\theight: 16px;\n");
      out.write("\tfont: normal 10px verdana;\n");
      out.write("\tmargin: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\" ></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"widget\">\n");
      out.write("<form>\n");
      out.write("Region&raquo; <select onchange=\"set_country(this,country,city_state)\" size=\"1\" name=\"region\">\n");
      out.write("<option value=\"\" selected=\"selected\">SELECT REGION</option>\n");
      out.write("<option value=\"\"></option>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("setRegions(this);\n");
      out.write("</script>\n");
      out.write("</select>\n");
      out.write("Country&raquo; <select name=\"country\" size=\"1\" disabled=\"disabled\" onchange=\"set_city_state(this,city_state)\"></select>\n");
      out.write("City/State&raquo; <select name=\"city_state\" size=\"1\" disabled=\"disabled\" onchange=\"print_city_state(country,this)\"></select>\n");
      out.write("</form>\n");
      out.write("<div id=\"txtregion\"></div>\n");
      out.write("<div id=\"txtplacename\"></div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("////////////////////////////////////////////////////////////////////////////\n");
      out.write("// city_state.js ///////////////////////////////////////////////////////////\n");
      out.write("///////\n");
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
