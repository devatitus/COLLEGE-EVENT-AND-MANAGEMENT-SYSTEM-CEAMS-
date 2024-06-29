<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>CEAMS</title>
    <link rel="icon" type="image/x-icon" href="img/icon.png">

    <!-- Icons font CSS-->
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="css/main.css" rel="stylesheet" media="all">
</head>
<script language="javascript" type="text/javascript">
    
  function dynamicdropdown(listindex)
    {
        switch (listindex)
        {
        case "Symposium" :
            document.getElementById("status").options[0]=new Option("Select status","");
            document.getElementById("status").options[1]=new Option("Mock Interview","Mock Interview");
            document.getElementById("status").options[2]=new Option("PPT","PPT");
            document.getElementById("status").options[3]=new Option("Just a minute","Just a minute");
            document.getElementById("status").options[4]=new Option("Web Desugning","Web Desugning");
            break;
            
        case "Conference" :
            document.getElementById("status").options[0]=new Option("Select status","");
            document.getElementById("status").options[1]=new Option("IEEE Collogium on 3D image","IEEE Collogium on 3D image");
            document.getElementById("status").options[2]=new Option("5G for ubiquitous computing","5G for ubiquitous computing");
            document.getElementById("status").options[3]=new Option(" ","");
            document.getElementById("status").options[4]=new Option(" ","");
            
            break;
        case "Workshop" :
            document.getElementById("status").options[0]=new Option("Select status","");
            document.getElementById("status").options[1]=new Option("IOT","IOT");
            document.getElementById("status").options[2]=new Option("BigData","BigData");
            document.getElementById("status").options[3]=new Option("Cloud","Cloud");
             document.getElementById("status").options[4]=new Option("","");
            break;
        }
        return true;
    }  
    
    
</script>
<body>
    <div class="page-wrapper bg-red p-t-180 p-b-100 font-robo">
        <div class="wrapper wrapper--w960">
            <div class="card card-2">
                <div class="card-heading"></div>
                <div class="card-body">
                    <h2 class="title">Event Page</h2>
                    <form method="POST" action="InterPar.jsp">
                     <div class="input-group">
                        <div class="rs-select2 js-select-simple select--no-search">   
                    <option disabled="disabled" selected="selected"> </option>
        <select id="source" name="source" onchange="javascript: dynamicdropdown(this.options[this.selectedIndex].value);">
        <option value="">Select </option>
        <option value="Symposium">Symposium</option>
        <option value="Conference">Conference</option>
        <option value="Workshop">Workshop</option>
        </select>
                    <div class="select-dropdown"></div>
                    </div>
</div> <div class="input-group">
                        <div class="rs-select2 js-select-simple select--no-search">   
                             <select id="status" name="event">
                            <script type="text/javascript" language="JavaScript">
        document.write('<select name="status" id="status"><option value=""></option></select>')
        </script>
                   <noscript>
                   <option disabled="disabled" selected="selected"> </option>
        
            
        </select>
        <div class="select-dropdown"></div>
                        </div></div>
        </noscript>
                    <div class="select-dropdown"></div>
                           <div class="p-t-30">
                            <button class="btn btn--radius btn--green" type="submit">Submit</button>
                        </div>
                    </form>
                   
                </div>
            </div>
        </div>
    </div>

    <!-- Jquery JS-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="vendor/select2/select2.min.js"></script>
    <script src="vendor/datepicker/moment.min.js"></script>
    <script src="vendor/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="js/global.js"></script>
    <br><br><br>
     <a href="index.jsp" class="btn btn--radius btn--green">Back</a>

</body><!-- This templates was made by Colorlib (https://colorlib.com) -->

</html>
<!-- end document-->