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
    
   
    <body background="img/background03.jpg">
        <form action="AdCerUP.jsp" method="post"> 
    <center>
       
         
        
         
         <h1 style="color: crimson"></h1><br><br>
       
         <h2 style="color: crimson"><b><i> </i></b></h2><br>
<!--        <a href="IntraPar.jsp" class="main-btn" style="height: 70px;width: 300px">Intra Participants</a>-->
<h3 style="color: #fff">Department Select</h3>
<br><br>
         

 <span class="cd-select">
            <select name="dept" id="groupname" style="height: 40px;width: 300px;text-align: center">
                <option value="">Select</option>
                 <option >ECE</option>
                  <option >EEE</option>
                   <option >CSE</option>
                    <option >IT</option>
                    <option >Civil</option>
                    <option >Mech</option>
              
            </select>
            </span>	


         <br><br>
         
         
         








<br><br>

          <input class="main-btn" style=" color: #fff;"type="submit" value="Certificate Upload" />
    </center>
       
            <a href="index.jsp" class="main-btn">Exit</a>
            <div class="section-bg" style="background-image:url(./img/background03.jpg)" data-stellar-background-ratio="0.5"></div>
            
           
        </form>
        
     </body>
</html>
