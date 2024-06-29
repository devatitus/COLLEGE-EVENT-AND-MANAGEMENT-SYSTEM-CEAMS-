/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Prabu
 */
public class InterPari extends HttpServlet {

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
            out.println("<title>Servlet InterPari</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InterPari at " + request.getContextPath() + "</h1>");
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
    
    System.out.println(so+"????"+evnt);
    
            Connection con=null;
            Statement st=null;
            ResultSet rs1=null;
        try
        {
            String s1=request.getParameter("sname");
            String s2=request.getParameter("sreg");
            String s3=request.getParameter("sdept");
            String s4=request.getParameter("syr");
            String s5=request.getParameter("sclg");
            String s6=request.getParameter("eml");
           
            
     byte[] encryptArray1 = Base64.encodeBase64(s6.getBytes());        
     String encstr = new String(encryptArray1,"UTF-8");   
     System.out.println("Enc   >>  "+ encstr);
     
     
     byte[] encryptArray2 = Base64.encodeBase64(s2.getBytes());        
     String encstr1 = new String(encryptArray2,"UTF-8");   
     System.out.println("Enc   >>  "+ encstr1);
     
     
             
             
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/events","root","password");
          st=con.createStatement();
          int rs=st.executeUpdate("Insert into intrapar(stdnm,stdreg,stddept,stdem,stdyr,stdclg,stdso,stdevnt) VALUES('"+s1+"','"+s2+"','"+s3+"','"+s6+"','"+s4+"','"+s5+"','"+so+"','"+evnt+"')");
          if(rs>0)
           {   
           response.sendRedirect("index.jsp");
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
