/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author LENOVO
 */

@WebServlet(urlPatterns = {"/FirUpload"})
@MultipartConfig(fileSizeThreshold=1024*1024*10, 	// 10 MB 
                 maxFileSize=1024*1024*50,      	// 50 MB
                 maxRequestSize=1024*1024*100)
public class AdUpCer extends HttpServlet {
    InputStream is = null;
    String fileName;

    private static final long serialVersionUID = 1L;
    //File directory = new File("D:/temp/");
    //private final String UPLOAD_DIRECTORY = "D:/Files/";
    //ServletFileUpload upload;
    String names=null;
    Part names1;
    String fsize,ftype;

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
            out.println("<title>Servlet AdUpCer</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AdUpCer at " + request.getContextPath() + "</h1>");
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
        
        String dpt=se.getAttribute("dpt").toString();
        System.out.println(">>>>"+dpt);
        
        try{
            
            System.out.println("Going to condition");
      Part filePart = request.getPart("file1");
      String ff=filePart.getName();
      System.out.println(">>>>"+filePart.getName());
      
       fileName = getFileName(filePart);
          System.out.println("FileName:3 4e------>"+fileName);
      InputStream is = filePart.getInputStream();
      System.out.println(fileName);
      String outputfile = this.getServletContext().getRealPath("/");
      String outputfile1=outputfile.concat(dpt+"/"+fileName);
      System.out.println("......"+outputfile1);
      FileOutputStream os = new FileOutputStream (outputfile1);
      int ch = is.read();
            while (ch != -1) {
                 os.write(ch);
                 ch = is.read();
            }
            os.close();
            Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/events","root","password");
         Statement st=con.createStatement();
          //int rs=st.executeUpdate("crime", "insert into crecd(cname,cage,cadd,filename) values('"+uname+"','"+cage+"','"+cadd+"','"+fileName+"')");
            
         int rs=st.executeUpdate("insert into certificate (filename,deptnm) values('"+fileName+"','"+dpt+"')");
         if(rs>0){
             response.sendRedirect("DeptSel.jsp");
         
         }
            
        
        }catch(IOException | ServletException e){
        
            System.out.println(e);
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdUpCer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdUpCer.class.getName()).log(Level.SEVERE, null, ex);
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
 private String getFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        System.out.println("content-disposition header= "+contentDisp);
        String[] tokens = contentDisp.split(";");
        for (String token : tokens) {
            if (token.trim().startsWith("filename")) {
                return token.substring(token.indexOf("=") + 2, token.length()-1);
            }
        }
        return "";
    }
}
