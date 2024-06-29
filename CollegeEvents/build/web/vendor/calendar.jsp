<%-- 
    Document   : calendar
    Created on : 29 Mar, 2023, 8:52:09 AM
    Author     : ELCOT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calendar</title>
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="evo-calendar.min.css">
        <link rel="stylesheet" href="evo-calendar.midnight-blue.min.css">
        
</head>
<body>
    <div id="calendar"></div>    
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.4.1/dist/jquery.min.js"></script>
    <script src="evo-calendar.min.js"></script>
    <script> $(document).ready(function() { $('#calendar').evoCalendar({ }) }) </script>         
</body>
</html>