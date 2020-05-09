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
   
    
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
    <script src="http://cdn.ckeditor.com/4.6.1/standard/ckeditor.js"></script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
   
  
    <title>Complexity of a single file due to all the factors </title>

.inlineElements{
	display: table;
	text-align: center;
	}
	
.textbox, text inline1{
display: inline-block;
}

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
                <h3 class="panel-title">Complexity of a single file due to all the factors </h3>
              </div>
              <div class="panel-body">
                    
                <form> 
                   
            <div class="inlineElements">
            <input type="textbox" id="programcomplexity" name="programcomplexity" value="Program Complexity" Cssclass="text inline"/>
            
            
            <br>
            <br>
            
            
            <input type="textbox" id="value" name="value" value="" Cssclass="text inline1"/>
            </div>
            
<br>
<br>

<table style="width:100%" border="1px">
  <tr>
  
    <th>Line no</th>
    <th>Program statements</th>
    <th>Cs</th>
    <th>Cv</th>
    <th>Cm</th>
    <th>Ci</th>
    <th>Ccp</th>
    <th>Ccs</th>
    <th>TCps</th>
  </tr>

  <tr>
  <td>1</td>
  <td>claas Pattern {</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr>
   <tr>
   <td>2</td>
  <td>public static void main(String[] args){</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>3</td>
  <td>   int row=5;</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>4</td>
  <td>for(int i=1;i<=rows;++i) {</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>5</td>
  <td>for(int j=1;j<=i;++j) {</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>6</td>
  <td>System.out.print(j+" ");</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>7</td>
  <td>}</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>8</td>
  <td>System.out.println("");</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>9</td>
  <td>}</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>10</td>
  <td>}</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>11</td>
  <td>}</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td colspan="2"><b>Total</b></td>
   
   <td><b>0</b></td>
    <td><b>0</b></td>
    <td><b>0</b></td>
    <td><b>0</b></td>
    <td><b>0</b></td>
    <td><b>0</b></td>
    <td><b>0</b></td>
  </tr>
  
  
  
</table>

                        
                       
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
    






</body>
</html>