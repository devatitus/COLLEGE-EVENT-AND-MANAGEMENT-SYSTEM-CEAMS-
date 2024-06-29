 <%@page import="java.sql.*"%>
<%-- 
    Document   : IntAbPr
    Created on : 9 Feb, 2019, 3:55:58 PM
    Author     : Prabu
--%>

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
    <center>
        <form name="onchange" id="first" action="ViewDb" method="POST">
		<div class="container">
			<!-- Top Navigation -->
                        <br><br><br>
			<header>
                            <h1 style="color: #fff">Participant Information</h1>	
                         </header>
                       
<!--    <nav class="codrops-demos">
        <label for="selctfile" ></label>
                            <select name="event" style="text-align: center;height: 30px;width: 300px" onchange="document.forms['onchange'].submit();">
                                 <option> -----Select----- </option>
                                <option value="intra">Intra Student</option>
                                <option value="inter">Inter Student</option>
                                
                            </select>
       
    </nav>-->
			<br><br><br>
			<div class="component">
				
				 <table border="3" style="color: #000; box-shadow: #000; background: #fff;height: 150px; width: 1200px;text-align: center" >
                                     <thead style="background: gray">
						<tr>
							
							<th>Student Name</th>
                                                        <th>Student Result</th>
							<th>Event Name </th>
							<th>Types of Event  </th>
                                                       <th>HOD-Status</th>
                                                        <th>Status</th>
						</tr>
					</thead>
					<tbody>
                    <%
                        try{
                        String a=request.getParameter("event");
                      
                        
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/events","root","password");
                    Statement st=con.createStatement();
                    ResultSet rs1=st.executeQuery("SELECT * FROM windecl where pstatus='Approved' and hstatus='Approved'");
                    while(rs1.next())
                     
                                                 {
                    %>
                    <tr>
                       
                        <td><%=rs1.getString("stdnm") %></td>
                        <td><%=rs1.getString("winrun") %></td>
                        <td><%=rs1.getString("evnt") %></td>
                        <td><%=rs1.getString("typen") %></td>
                        <td><%=rs1.getString("hstatus") %></td>
                         <td><%=rs1.getString("pstatus") %></td>
                        
                        
                    </tr>
                    <%
                                                 }                    
                                                 
                        
                        }
                        catch(Exception e){
                        System.out.println(e);
                        }
                        %>
                                        </tbody>
                                 </table>
                        </div>
		</div>
                <br><br><br>
                
                
                
                
        </form>
                
              
                
               
    </center>
                                        <br><br><a href="AdPg.jsp" class="main-btn">back</a>
    </body>
</html>
