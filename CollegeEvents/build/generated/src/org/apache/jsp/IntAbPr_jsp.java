package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class IntAbPr_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(' ');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
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
      out.write("    ");

    HttpSession se=request.getSession();
    
    
    
    
      out.write("\n");
      out.write("    <body background=\"img/background03.jpg\">\n");
      out.write("    <center>\n");
      out.write("        <form name=\"onchange\" id=\"first\" action=\"IntAbPr.jsp\" method=\"POST\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<!-- Top Navigation -->\n");
      out.write("                        <br><br><br>\n");
      out.write("\t\t\t<header>\n");
      out.write("                            <h1 style=\"color: #fff\">Participant Information</h1>\t\n");
      out.write("                         </header>\n");
      out.write("                       \n");
      out.write("    <nav class=\"codrops-demos\">\n");
      out.write("        <label for=\"selctfile\" ></label>\n");
      out.write("                            <select name=\"event\" style=\"text-align: center;height: 30px;width: 300px\" onchange=\"document.forms['onchange'].submit();\">\n");
      out.write("                                 <option> -----Select----- </option>\n");
      out.write("                                <option value=\"intra\">Intra Student</option>\n");
      out.write("                                <option value=\"inter\">Inter Student</option>\n");
      out.write("                                \n");
      out.write("                            </select>\n");
      out.write("       \n");
      out.write("    </nav>\n");
      out.write("\t\t\t<br><br><br>\n");
      out.write("\t\t\t<div class=\"component\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t <table border=\"3\" style=\"color: #000; box-shadow: #000; background: #fff;height: 150px; width: 1000px\" >\n");
      out.write("\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>Select</th>\n");
      out.write("\t\t\t\t\t\t\t<th>Student Name</th>\n");
      out.write("                                                        <th>Student RegNo</th>\n");
      out.write("\t\t\t\t\t\t\t<th>Department </th>\n");
      out.write("\t\t\t\t\t\t\t<th>Year</th>\n");
      out.write("                                                        <th>College</th>\n");
      out.write("                                                      <th>Event</th>\n");
      out.write("                                                         <th>Type of Event</th>\n");
      out.write("                                                          <th>Status</th>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t<tbody>\n");
      out.write("                    ");

                        try{
                        String a=request.getParameter("event");
                        if(a.equals("intra")){
                        
                    Class.forName("com.mysql.jdbc.Driver");
        Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/events","root","password");
                    Statement st=con.createStatement();
                    ResultSet rs1=st.executeQuery("SELECT * FROM intrapar");
                    while(rs1.next())
                     
                                                 {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                       <td> <input type=\"radio\" name=\"c1\" value=");
      out.print(rs1.getString(1) );
      out.write(" /></td>\n");
      out.write("                       <td>");
      out.print(rs1.getString("sno") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("stdnm") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("stdreg") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("stddept") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("stdyr") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("stdclg") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("stdso") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("stdevnt") );
      out.write("</td>\n");
      out.write("                         <td>");
      out.print(rs1.getString("status") );
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    ");

                            
                    String c=rs1.getString("sno");
                           se.setAttribute("a", a);
                            se.setAttribute("c", c);
                            System.out.println(a+"1>>?>>?>"+c);                     
                                                 }
                        
                        }
                        if(a.equals("inter")){
                            
                            
                          Class.forName("com.mysql.jdbc.Driver");
        Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/events","root","password");
                    Statement st=con.createStatement();
                    ResultSet rs1=st.executeQuery("SELECT * FROM interstd");
                    while(rs1.next()) {
                    
      out.write("   \n");
      out.write("                          <tr>\n");
      out.write("                     <td> <input type=\"radio\" name=\"c1\" value=");
      out.print(rs1.getString(1) );
      out.write(" /></td>\n");
      out.write("                       <td>");
      out.print(rs1.getString("stdnm") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("stdreg") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("stddept") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("stdyr") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("stdclg") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("stdso") );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(rs1.getString("stdevnt") );
      out.write("</td>\n");
      out.write("                         <td>");
      out.print(rs1.getString("status") );
      out.write("</td>\n");
      out.write("                       \n");
      out.write("                    </tr>\n");
      out.write("                    ");

                    
                     String c=rs1.getString("sno");
                           se.setAttribute("a", a);
                            se.setAttribute("c", c);
                    System.out.println(a+"2>>?>>?>"+c);
                    
                                       }  
                        }
                            
                        }catch(Exception e){
                        System.out.println(e);
                        
                        }
                                
                        
                     
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("\t\t\t\t</table>\n");
      out.write("                        </div>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("\t\t  \t\t\n");
      out.write("\t\t</div>\n");
      out.write("                <br><br><br>\n");
      out.write("        </form>\n");
      out.write("                \n");
      out.write("                <form action=\"ParAttd\" id=\"second\" class=\"main-btn\" method=\"post\">\n");
      out.write("                        <input type=\"submit\" name=\"sub\" value=\"Submit\">\n");
      out.write("                        \n");
      out.write("                            </form>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
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
