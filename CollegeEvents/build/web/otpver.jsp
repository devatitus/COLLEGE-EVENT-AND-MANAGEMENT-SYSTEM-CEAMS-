<%-- 
    Document   : otpver
    Created on : 15 Feb, 2019, 2:39:03 PM
    Author     : Prabu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <%
    
    HttpSession se=request.getSession();
    
    String stdrg=se.getAttribute("stdrg").toString();
    String typen=se.getAttribute("typen").toString();
    
    se.setAttribute("stdrg", stdrg);
    se.setAttribute("typen", typen);
     %>
    
    
    <body>
    <center>
        <h1>OTP Verify Page!</h1>
        <form action="StdDow" method="post">
        <br><br><br>
        <div class="input-group">
            
        </div><br>
        <input type="email" name="em" value="" placeholder="Email Id" style="height: 30px;width: 250px"/><br><br>
        <input type="text" name="otp" value="" placeholder="otp" style="height: 30px;width: 250px"/><br><br>
        <input type="submit" value="Verify"/>
        </form>
    </center>
    </body>
</html>
