/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Prabu
 */
public class ComLog extends HttpServlet {

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
            out.println("<title>Servlet ComLog</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ComLog at " + request.getContextPath() + "</h1>");
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
       String s1=request.getParameter("in1");
        String s2=request.getParameter("in2");
         String s3=request.getParameter("b1");
          System.out.println(s3+"???");
        
        Connection con=null;
         Statement ps=null;
        ResultSet rs=null;
       
       
        try{
        
            if(s3.equals("Co-Event")){
            
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/events","root","password");
             ps=con.createStatement();
            rs=ps.executeQuery("select * from evntco where evname='"+s1+"' and evpass='"+s2+"'");
            if(rs.next())
            {
            
           response.sendRedirect("eventact.jsp");
                    
            }
             else{
            
             response.sendRedirect("error.html");
            }
            
            }
             if(s3.equals("Hod")){
            
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/events","root","password");
             ps=con.createStatement();
            rs=ps.executeQuery("select * from hodreg where hdname='"+s1+"' and hdpass='"+s2+"'");
            if(rs.next())
            {
            
           response.sendRedirect("hodpage.jsp");
                    
            }
             else{
            
             response.sendRedirect("error.html");
            }
            
            }
              if(s3.equals("principal")){
            
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/events","root","password");
             ps=con.createStatement();
            rs=ps.executeQuery("select * from prinlog where depname='"+s1+"' and deppass='"+s2+"'");
            if(rs.next())
            {
            
           response.sendRedirect("priapr.jsp");
                    
            }
             else{
            
             response.sendRedirect("error.html");
            }
            
            }
            
            
            
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
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
