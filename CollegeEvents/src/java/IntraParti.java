/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Prabu
 */
public class IntraParti extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet IntraParti</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet IntraParti at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession se=request.getSession();
    String so=se.getAttribute("so").toString();
    String evnt=se.getAttribute("evnt").toString();
    String intr=se.getAttribute("intr").toString();
    
    System.out.println(intr+"mmmmmmmmm    "+so+"????"+evnt);
        
        try{
        String c=request.getParameter("c1");
                    Class.forName("com.mysql.jdbc.Driver");
        Connection  con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/events","root","password");
                    Statement st1=con1.createStatement();
                    ResultSet rs=st1.executeQuery("SELECT * FROM intrastd where sno='"+c+"'");
                    if(rs.next()){
                    
                        String s1=rs.getString("stdnm");
                        String s2=rs.getString("stdrg");
                        String s3=rs.getString("stddept");
                        String s4=rs.getString("stdyr");
                        String s5=rs.getString("stdclg");
                        String s6=rs.getString("stdem");
                        Class.forName("com.mysql.jdbc.Driver");
         Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/events","root","password");
          Statement st2=con2.createStatement();
          int rs2=st2.executeUpdate("Insert into intrapar(stdnm,stdreg,stddept,stdem,stdyr,stdclg,inraer,stdso,stdevnt) VALUES('"+s1+"','"+s2+"','"+s3+"','"+s6+"','"+s4+"','"+s5+"','"+intr+"','"+so+"','"+evnt+"')");
          if(rs2>0)
           {   
               System.out.println("Success222");
           response.sendRedirect("index.jsp");
           }
                            
                    }
    }catch(ClassNotFoundException | SQLException | IOException e){
        
        
        
    }
    }
            

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
