<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> Files</title>
   
  <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <link href="Test.css" rel="stylesheet">
    
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
          
          <a href="Homepage.jsp">Homepage</a>
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
                <a href="#menu1" class="list-group-item" data-toggle="collapse" data-parent="#sidebar">
               <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
                <span class="hidden-sm-down">Files Management </span>
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
               
                <!--/collapsible side bar starts-->
         <a href="#menu2" class="list-group-item" data-toggle="collapse" data-parent="#sidebar">
               <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
                <span class="hidden-sm-down">Inheritance</span> 
            </a>
      
            <!---/collapsible side bar starts-->
     <a href="#menu3" class="list-group-item" data-toggle="collapse" data-parent="#sidebar">
               <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
                <span class="hidden-sm-down">Coupling</span>
            </a>
       
             <!--/collapsible side bar end -->
               <a href="#" class="list-group-item" data-toggle="collapse" data-parent="#sidebar">
               <span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span>
                <span class="hidden-sm-down">Control Structures</span>  
               </a>
            </div>
          </div>     
        <div class="col-md-9">
            <!-- Website Overview -->
           
           
                <div class="panel panel-default">
              <div class="panel-heading main-color-bg">
                <h3 class="panel-title">Upload Files</h3>
              </div>
              <div class="panel-body">
                    
                <form> 
                   
                  
         <div class="row">
           <div class="col-md-6">
             <div class="wrapper">

                  <div class="upload-container">
                     <div class="upload-container">
                        <div class="border-container">
                           <div class="icons fa-4x">
                                     
                 <i class="fas fa-file-image" data-fa-transform="shrink-3 down-2 left-6 rotate--45"></i>
                 <i class="fas fa-file-alt" data-fa-transform="shrink-2 up-4"></i>
                 <i class="fas fa-file-pdf" data-fa-transform="shrink-3 down-2 right-6 rotate-45"></i>
                     </div>
        
                       <label class="btn btn-primary" for="my-file-selector" id ="file">
                        <input id="my-file-selector" type="file" style="display:none;">
                              Select
                        </label>                                        
                           </div>
                          </div>
                         </div>
                        </div>
                       </div>
                       
                       
                    <br>
                       
                    
                     
                    </br>
                  
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
    


<script>
$("#file-upload").css("opacity", "0");

$("#file-browser").click(function(e) {
  e.preventDefault();
  $("#file-upload").trigger("click");
  
});

</script>



</body>
</html>