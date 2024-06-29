<%-- 
    Document   : IntraPar
    Created on : 8 Feb, 2019, 9:42:28 PM
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
    String so=se.getAttribute("so").toString();
    String evnt=se.getAttribute("evnt").toString();
    
    System.out.println("mmmmmmmmm    "+so+"????"+evnt);
    String intr="intra";
    se.setAttribute("so", so);
   se.setAttribute("evnt", evnt);
    se.setAttribute("intr", intr);
    
    
    %>
    <body background="img/background03.jpg">
        <form action="IntraPar.jsp" method="post">
            
            <center><br><br><br><br>
                <h1 style="color: #fff">ATTENDANCE CHECK </h1>
			
				<br><br><br><br>
                                
                                
                                <nav class="codrops-demos">
     <a style="color: #c7254e">Student RegNo : <input type="text" name="stdrg" value=""/></a>&nbsp;&nbsp;&nbsp;&nbsp;<br><br>
         <a style="color: #c7254e">Student Department : <input type="text" name="stdclg" value=""/></a>&nbsp;&nbsp;&nbsp;&nbsp;<br><br>
        <button class="button" type="submit" name="search" style="vertical-align:middle"><span>Search </span></button>
       
        
    </nav>
                                
         
                            <table border="3" style="color: #000; box-shadow: #000; background: #fff;height: 150px; width: 1000px" >
                                <thead style="background: gray">
						<tr>
							<th>Select Student</th>
							<th>Student Name</th>
                                                        <th>Student RegNo</th>
                                                         <th>Student Email Id</th>
							<th>Department </th>
							<th>Year</th>
                                                        <th>College</th>
							
							
						</tr>
					</thead>
					<tbody>
                    <%
                   
                   try{
                       String s1=request.getParameter("stdrg");
                        String s2=request.getParameter("stdclg");
                     Class.forName("com.mysql.jdbc.Driver");
        Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/events","root","password");
                    Statement st=con.createStatement();
                    ResultSet rs1=st.executeQuery("SELECT * FROM intrapar where stdrg='"+s1+"' and stddept='"+s2+"'");
                    while(rs1.next())
                     
                                                 {
                    %>
                    <tr>
                        
                        <td> <input type="radio" name="c1" value=<%=rs1.getString("sno") %> /></td>
                        <td><%=rs1.getString("stdnm") %></td>
                        <td><%=rs1.getString("stdrg") %></td>
                        <td><%=rs1.getString("stdem") %></td>
                         <td><%=rs1.getString("stddept") %></td>
                        <td><%=rs1.getString("stdyr") %></td>
                        <td><%=rs1.getString("stdclg") %></td>
                        
                        
                    </tr>
                    <%
                             
//                    String c=rs1.getString("sno");
//                    se.setAttribute("chk", c);
                    
                    
                                                 
                                                 }
                   }catch(Exception e){
                   
                   System.out.println(e);
                   }
                     %>
                </tbody>
				</table>
                        </div>
                <br><br><br>
                
               <button class="button" type="submit" name="submit" style="vertical-align:middle" onclick="form.action='IntraParti';"><span>Submit </span></button>
                
    </center>
       
            <a href="index.jsp" class="main-btn">BACK</a>
            <div class="section-bg" style="background-image:url(./img/background03.jpg)" data-stellar-background-ratio="0.5"></div>
            
            </form>
    </body>
</html>
