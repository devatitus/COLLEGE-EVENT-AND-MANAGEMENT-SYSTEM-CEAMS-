<%-- 
    Document   : InterPar
    Created on : 8 Feb, 2019, 9:42:16 PM
    Author     : Prabu
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>CEAMS</title>
<link rel="icon" type="image/x-icon" href="img/icon.png">

<link href="https://fonts.googleapis.com/css?family=Poppins:400,700,900" rel="stylesheet">

<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />

<link type="text/css" rel="stylesheet" href="css/owl.carousel.css" />
<link type="text/css" rel="stylesheet" href="css/owl.theme.default.css" />

<link rel="stylesheet" href="css/font-awesome.min.css">

<link type="text/css" rel="stylesheet" href="css/style.css" />
    </head>
    <%
    
    HttpSession se=request.getSession();
    String so=request.getParameter("source");
    String evnt=request.getParameter("event");
    
    System.out.println(so+"????"+evnt);
    
    se.setAttribute("so", so);
    se.setAttribute("evnt", evnt);
    
    
    %>
   
    <body background="img/background03.jpg">
        <form action="WinDecl" method="post"> 
    <center>
       
         
         <br><br><br><br>
         <br><br><br><br>
         
         <h1 style="color: crimson">"<%=so%>  "    Result Declaration Page </h1><br><br>
       
         <h2 style="color: crimson"><b><i>"<%=evnt%>  "   Event </i></b></h2><br>
<!--        <a href="IntraPar.jsp" class="main-btn" style="height: 70px;width: 300px">Intra Participants</a>-->
<h3 style="color: #fff">Winner student</h3>

 <span class="cd-select">
            <select name="win" id="groupname" style="height: 40px;width: 300px;text-align: center">
                <option value="">---------------Select----------------</option>
                <%
               
                //String pr="Present";
                 try{
                ArrayList li=new ArrayList();
                Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/events","root","password");
            Statement st=con.createStatement();
           ResultSet rr=st.executeQuery("select * from intrapar where status='Present' and stdevnt='"+evnt+"'"); 
           
           
           //ResultSet rr=Common_DB.ViewTable("events","intrapar","status","stdevent",pr,evnt);  
                 while(rr.next())            
                                {
                                  // n=rr.getString("stdnm");
                                 String nw=rr.getString("stdreg");
                                  System.out.println(nw+" 11!!!!!!!!!!!!!");
                                  li.add(nw);             
                                }
                if(!(li.isEmpty()))
                {
                    
                
                               for(int ij=0; ij<li.size(); ij++)                   
                                {
                                %>
                               <option value="<%=li.get(ij)%>"> <%=li.get(ij)%></option>
                                <%
                                System.out.println("1********");
                                 }
                }
                                else {                                 
                                %>
                               <option value=""> </option>
                                <%
                                     }
                                
                 
                 }catch(Exception e){
                 System.out.println(e);
                 }
           
                
                %>
                
            </select>
            </span>	


         <br><br>
         
         
         
<h3 style="color: #fff">Runner student</h3>




<span class="cd-select">
            <select name="run" id="groupname" style="height: 40px;width: 300px;text-align: center">
                <option value="">---------------Select----------------</option>
                <%
                 try{
                   // String pr1="Present";
                ArrayList l=new ArrayList();
                Class.forName("com.mysql.jdbc.Driver");
            Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/events","root","password");
            Statement ps1=con1.createStatement();
           ResultSet r=ps1.executeQuery("select * from intrapar where status='Present' and stdevnt='"+evnt+"' "); 
          //  ResultSet r=Common_DB.ViewTable("events","intrapar","status","stdevent",pr,evnt);  
                 while(r.next())            
                                {
                                // n1=r.getString("stdnm");
                                String  nn=r.getString("stdreg");
                                System.out.println(nn+" !!!!!!!!!!!!!");
                                  l.add(nn);             
                                }
                if(!(l.isEmpty()))
                {
                    
                
                               for(int ij=0; ij<l.size(); ij++)                   
                                {
                                %>
                               <option value="<%=l.get(ij)%>"> <%=l.get(ij)%></option>
                                <%
                                System.out.println(" ********");
                                 }
                }
                                else {                                 
                                %>
                               <option value=""> </option>
                                <%
                                     }
                                
                
                 }catch(Exception e){
                 System.out.println(e);
                 }
                %>
            </select>
            </span>	


<br><br>

          <input class="main-btn" style=" color: #fff;"type="submit" value="Forward" />
    </center>
       
            <a href="AdPg.jsp" class="main-btn">back</a>
            <div class="section-bg" style="background-image:url(./img/background03.jpg)" data-stellar-background-ratio="0.5"></div>
            
           
        </form>
        
     </body>
</html>
