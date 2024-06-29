/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author LENOVO
 */
public class OtpVer extends HttpServlet {
    static Properties properties = new Properties();
   static
   {
      properties.put("mail.smtp.host", "smtp.gmail.com");
      properties.put("mail.smtp.socketFactory.port", "465");
      properties.put("mail.smtp.socketFactory.class",
                     "javax.net.ssl.SSLSocketFactory");
      properties.put("mail.smtp.auth", "true");
      properties.put("mail.smtp.port", "465");
   }

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
            out.println("<title>Servlet OtpVer</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet OtpVer at " + request.getContextPath() + "</h1>");
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
       
         String dCase = "abcdefghijklmnopqrstuvwxyz";
   String uCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         Random r=new  Random();  
        String pass = "";
		 while (pass.length () != 6)
{
            int rPick = r.nextInt(2);
            if (rPick == 0){
                int spot = r.nextInt(26);
                pass += dCase.charAt(spot);
            } else if (rPick == 1) {
                int spot = r.nextInt (26);
                pass += uCase.charAt(spot);

            }
        }
      
        
         
        HttpSession se=request.getSession(true);
        String s1=request.getParameter("in1");
        String s2=request.getParameter("in2");
        String s3=request.getParameter("in3");
        System.out.println(s2+": :::"+s1);
        try{
            /// time //
             DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
         LocalDateTime now = LocalDateTime.now();  
         String dateandtime=dtf.format(now);
         System.out.println("Date and Time is: "+dateandtime);
         
         String[] parts=dateandtime.split(" ");
         String date1=parts[0];
         String time1=parts[1];
        
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
         Date d = df.parse(time1); 
         Calendar cal1 = Calendar.getInstance();
         cal1.setTime(d);
         cal1.add(Calendar.MINUTE, 5);
        String newTime = df.format(cal1.getTime());
        System.out.println("current time is ; "+ time1+" extra 5 min ;"+newTime);
            
            
            
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/events","root","password");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from windecl where stdnm='"+s1+"'");
           
            if(rs.next())
            {
                 
                 Class.forName("com.mysql.jdbc.Driver");
            Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/events","root","password");
               Statement st1=con1.createStatement();
               int rs1=st1.executeUpdate("update windecl set stdem='"+s3+"', otp1='"+pass+"',time1='"+newTime+"' where stdnm='"+s1+"'");
               if(rs1>0){
                
                
                final String  from="cloudbean2019@gmail.com";
           final String password="j@v@be@n19";
           final String to="cloudbean2019@gmail.com";
           
         Session session = Session.getInstance(properties, new javax.mail.Authenticator() 
         {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(from, password);
            }});
         
         Message message = new MimeMessage(session);
         message.setFrom(new InternetAddress(from));
         message.setRecipients(Message.RecipientType.TO, 
         InternetAddress.parse(s3));
         message.setSubject("OTP MESSAGE");
         //message.setSubject("private key");
        // String mgs="";
       //  msg="a;
         message.setText(pass);
         //message.setText("private key is "+"\n"+pri);
   
        Multipart multipart = new MimeMultipart();

      //addAttachments(multipart);
      //message.setContent(multipart);
      // Send message
      Transport.send(message);
      
      ////send////
      
                        se.setAttribute("stdrg", s1);
                         se.setAttribute("typen", s2);
                        response.sendRedirect("otpver.jsp");
            }
            
            }
        
        }catch(ClassNotFoundException | SQLException | MessagingException | IOException e){
        
            System.out.println(e);
        } catch (ParseException ex) {
            Logger.getLogger(OtpVer.class.getName()).log(Level.SEVERE, null, ex);
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
