<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Control Structures</title>
   
  <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
   
    
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
    <script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
   

</head>
<body>


<header id="header">
      <div class="container">
        <div class="row">
          <div class="col-md-10">
            <h1><span class="glyphicon glyphicon-cog" aria-hidden="true"></span> NRRV Complexity Measuring Tool </h1>
          </div>
        </div>
      </div>
    </header>
 <section id="breadcrumb">
      <div class="col-md-12">
        <ol class="breadcrumb">
          <li class="active">
          
          <a href="Homepage.jsp">Home page</a>
          <a href="Homepage.jsp">About Us</a>
          <a href="Homepage.jsp">Contact Us</a>
          <a href="Homepage.jsp">FQA</a>
          </li>
        </ol>
      </div>
    </section>


    <section id="main">
      <div class="container-fluid">
        <div class="row">
           <div class="col-md-3 " id="sidebar">
            <div class="list-group">
              <a href="dash.jsp" class="list-group-item active main-color-bg">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span> Keys
              </a>
               <!---/collapsible side bar -->
                <a href="#menu1" class="list-group-item" data-toggle="collapse" data-parent="#sidebar">
               <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
                <span class="hidden-sm-down">Upload Files</span>
                </a>
                
                 <a href="#" class="list-group-item" data-toggle="collapse" data-parent="#sidebar">
               <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
                <span class="hidden-sm-down">Measuring Size</span>
                 </a>
                
                 <a href="#menu10" class="list-group-item" data-toggle="collapse" data-parent="#sidebar">
               <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
                <span class="hidden-sm-down">Measuring Variables </span>
                 </a>
      
            <a href="#menu11" class="list-group-item" data-toggle="collapse" data-parent="#sidebar">
                  <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
                  <span class="hidden-sm-down">Measuring Methods </span>
                 </a>
               

         <a href="#menu2" class="list-group-item" data-toggle="collapse" data-parent="#sidebar">
               <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
                <span class="hidden-sm-down">Inheritance</span> 
            </a>
      
           
     <a href="#menu3" class="list-group-item" data-toggle="collapse" data-parent="#sidebar">
               <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
                <span class="hidden-sm-down">Coupling</span>
            </a>
            
                   
     <a href="#menu3" class="list-group-item" data-toggle="collapse" data-parent="#sidebar">
               <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
                <span class="hidden-sm-down">Control Structures</span>
            </a>
       
             <!--/collapsible side bar end -->
               <a href="#" class="list-group-item" data-toggle="collapse" data-parent="#sidebar">
               <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
                <span class="hidden-sm-down">Final Output</span>  
               </a>
            </div>
          </div>   
          
            
        <div class="col-md-9">
            <!-- Website Overview -->
           
           
                <div class="panel panel-default">
              <div class="panel-heading main-color-bg">
                <h3 class="panel-title">Control Structures</h3>
              </div>
              <div class="panel-body">
                    
 <form> 
            
<table style="width:50%">
  <tr>
    <th>Code</th>
    <td>Wtcs</td>
    <td>NC</td>
    <td>Ccspps</td>
    <td>Ccs</td>
  </tr>
  
  <tr>
    <td> 
       <br></br>
    </td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td> 
  </tr>
  
</table>
      
       
       <br> </br>           
       </form>
      </div>
          <div class="panel-footer" id = "myfooter">&nbsp;</div>
    </div>
          
    </section>

    <footer id="footer">
      <p>Copyright NRRV Complexity Measuring Tool, &copy; 2020</p>
    </footer>


  <script>
     CKEDITOR.replace( 'editor1' );
  </script>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script> bootstrapValidate('text-only','alpha:you can only input text');</script>
    






</body>
</html>