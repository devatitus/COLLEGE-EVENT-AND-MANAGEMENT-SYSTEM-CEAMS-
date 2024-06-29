<%-- 
    Document   : success
    Created on : 4 Mar, 2019, 9:11:37 PM
    Author     : LENOVO
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
    String f1=se.getAttribute("file").toString();
    
    
    %>
    <body>
        <center>
            <br><br><br><br>
        <h1>File ...<%=f1%> //// Upload Successfully......!!!!!</h1>
        
        <br><br>
        <a href="index.jsp">Exist......></a>
        </center>
    </body>
</html>
