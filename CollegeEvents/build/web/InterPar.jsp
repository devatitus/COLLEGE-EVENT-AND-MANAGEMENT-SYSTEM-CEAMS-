<%-- 
    Document   : InterPar
    Created on : 8 Feb, 2019, 9:42:16 PM
    Author     : Prabu
--%>

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
        <form action="InterPari" method="post"> 
    <center>
       
         
         <br><br><br><br>
         <br><br><br><br>
         
         <h1 style="color: #fff">STUDENT REGISTRATION</h1>
<!--        <a href="IntraPar.jsp" class="main-btn" style="height: 70px;width: 300px">Intra Participants</a>-->
<input type="text" name="sname" value="" style="height: 40px;width: 300px" placeholder="Student Name">
         <br><br>
<input type="text" name="sreg" value="" style="height: 40px;width: 300px" placeholder="Student RegNo">
<br><br>
<input type="text" name="sdept" value=""  style="height: 40px;width: 300px" placeholder="Department Name">
<br><br>
<input type="email" name="eml" value=""  style="height: 40px;width: 300px" placeholder="Email Id ">
<br><br>
<input type="text" name="syr" value=""  style="height: 40px;width: 300px" placeholder="Year ">
<br><br>
<input type="text" name="sclg" value=""  style="height: 40px;width: 300px" placeholder="College Name">
         <br><br>
         
     
          <input class="main-btn" style="background-color: #fff; color: crimson;"type="submit" value="Submit" />
    </center>
       
            <a href="index.jsp" class="main-btn">BACK</a>
            <div class="section-bg" style="background-image:url(./img/background03.jpg)" data-stellar-background-ratio="0.5"></div>
            
           
        </form>
        
     </body>
</html>
