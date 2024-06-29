/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author LENOVO
 */
public class StdDow extends HttpServlet {

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
            out.println("<title>Servlet StdDow</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet StdDow at " + request.getContextPath() + "</h1>");
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
        
        
        
        PrintWriter out = response.getWriter();
        String fileType = "";
        HttpSession se=request.getSession(true);
        String s1=request.getParameter("em");
        String s2=request.getParameter("otp");
        System.out.println(s2+": :::"+s1);
        
        
        
        try
        {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
         LocalDateTime now = LocalDateTime.now();  
         String dateandtime=dtf.format(now);
         System.out.println("Date and Time is: "+dateandtime);
         
         String[] parts=dateandtime.split(" ");
         String dat=parts[0];
         String time1=parts[1];
         
            
            
            
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/events","root","password");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from windecl where stdem='"+s1+"' and otp1='"+s2+"'");
            //ResultSet rs=Common_DB.ViewParticularData("crime", "crecd", "firno", serial);
            if(rs.next())
            {
                
                String etime=rs.getString("time1");
                SimpleDateFormat format = new SimpleDateFormat("HH:mm");
					Date date1 = format.parse(time1);
					Date date2 = format.parse(etime);
					long difference = date2.getTime() - date1.getTime();
					long dif2=difference/(60*1000);
                                        String ftime=String.valueOf(dif2);
                                       
                                        if(dif2>0){
                                        System.out.println(dif2+"time in ; "+ftime);
                                      
                String filename=rs.getString("filename");
                System.out.println("FileName: "+filename);
                
            
                
                String outputfile = this.getServletContext().getRealPath("/files/"+filename);
                FileInputStream filetoDownload=new FileInputStream(outputfile);         
                response.setHeader("Content-Disposition","inline; filename="+filename);
                response.setContentType("application/x-msdownload");  
                int i;   
                while ((i=filetoDownload.read()) != -1) {  
                out.write(i);   
                
            }  
                                        
                
                    
                
            filetoDownload.close();   
            out.close(); 
            }
            
        
        else if(dif2<0){   
                
                System.out.println(dif2+"time out ; "+ftime);
                response.sendRedirect("error1.jsp");
                }
    }
        }
        
        catch(ClassNotFoundException | SQLException | IOException e)
        {
            System.out.println(e);
        } catch (ParseException ex) {
            Logger.getLogger(StdDow.class.getName()).log(Level.SEVERE, null, ex);
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
