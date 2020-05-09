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
   
  
    <title>Complexity of a program statement due to its all the factors </title>


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
                <h3 class="panel-title">Complexity of a program statement due to its all the factors </h3>
              </div>
              <div class="panel-body">
                    
                <form> 
                   
            
            
<table style="width:100%">
  <tr>
  
    <th>Code</th>
    <th>Cs</th>
    <th>Cv</th>
    <th>Cm</th>
    <th>Ci</th>
    <th>Ccp</th>
    <th>Ccs</th>
    <th>TCps</th>
  </tr>

  <tr>
  <td>import java.util.Scanner;</td>
   
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
  <td>class Years{</td>
   
   <td>2</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>   public int getYear(){</td>
   
   <td>2</td>
    <td>1</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>4</td>
  </tr>
  
  <tr> <tr>
  <td>int year;</td>
   
   <td>0</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>String enteredYear;</td>
   
   <td>0</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>Scanner sc = new Scanner(System.in);</td>
   
   <td>2</td>
    <td>0</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>3</td>
  </tr>
  
  <tr> <tr>
  <td>System.out.println("Enter the year as a number :");</td>
   
   <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>enteredYear = sc.next();</td>
   
   <td>1</td>
    <td>0</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>2</td>
  </tr>
  
  <tr> <tr>
  <td>year = Integer.parseInt(enteredYear);</td>
   
   <td>0</td>
    <td>1</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>2</td>
  </tr>
  
  <tr> <tr>
  <td>return year;</td>
   
   <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
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
  <td>//------------------------------------------------------------------------------------------------------------------------------------</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>class Months extends Years{</td>
   
   <td>4</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>3</td>
  </tr>
  
  <tr> <tr>
  <td>public int getMonth(){</td>
   
   <td>1</td>
    <td>0</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>3</td>
  </tr>
  
  <tr> <tr>
  <td>int month;</td>
   
   <td>0</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>String enteredMonthNumber;</td>
   
   <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>Scanner sc = new Scanner(System.in);</td>
   
   <td>1</td>
    <td>0</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>2</td>
  </tr>
  
  <tr> <tr>
  <td>System.out.println("Enter the month number :");</td>
   
   <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>enteredMonthNumber = sc.next();</td>
   
   <td>0</td>
    <td>1</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>2</td>
  </tr>
  
  <tr> <tr>
  <td>month = Integer.parseInt(enteredMonthNumber);</td>
   
   <td>0</td>
    <td>1</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>2</td>
  </tr>
  
  <tr> <tr>
  <td>return month;</td>
   
   <td>0</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
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
  <td>//------------------------------------------------------------------------------------------------------------------------------------</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>class DaysPerMonth extends Months{ </td>
   
   <td>4</td>
    <td>0</td>
    <td>0</td>
    <td>2</td>
    <td>0</td>
    <td>0</td>
    <td>6</td>
  </tr>
  
  <tr> <tr>
  <td>static int numDays = 0;</td>
   
   <td>1</td>
    <td>2</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>3</td>
  </tr>
  
  <tr> <tr>
  <td> public static void main(String[] args) {</td>
   
   <td>4</td>
    <td>0</td>
    <td>2</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>6</td>
  </tr>
  
  <tr> <tr>
  <td>int year;</td>
   
   <td>0</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>Months m = new Months();</td>
   
   <td>0</td>
    <td>1</td>
    <td>2</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>3</td>
  </tr>
  
  <tr> <tr>
  <td>int month = m.getMonth();</td>
   
   <td>0</td>
    <td>1</td>
    <td>2</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>3</td>
  </tr>
  
  <tr> <tr>
  <td>if((month < 1) || (month > 12)){ </td>
   
   <td>0</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>2</td>
    <td>3</td>
  </tr>
  
  <tr> <tr>
  <td>System.out.println("Kindly enter a number between 0 to 13.");</td>
   
   <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
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
  <td>else {</td>
   
   <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>2</td>
    <td>3</td>
  </tr>
  
  <tr> <tr>
  <td>switch (month) {</td>
   
   <td>0</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>2</td>
    <td>3</td>
  </tr>
  
  <tr> <tr>
  <td> case 1:</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>case 3:</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>case 5:</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>case 7:</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>case 8:</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>case 10:</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>case 12:</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>numDays = 31;</td>
   
   <td>1</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>2</td>
  </tr>
  
  <tr> <tr>
  <td>System.out.println("Month " + month + " consists of " + numDays + " days.");</td>
   
   <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>break;</td>
   
   <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>case 4:</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>case 6:</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>case 9:</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>case 11:</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>numDays = 30;</td>
   
   <td>0</td>
    <td>2</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>2</td>
  </tr>
  
  <tr> <tr>
  <td>System.out.println("Month " + month + " consists of " + numDays + " days.");</td>
   
   <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>break;</td>
   
   <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td> case 2:</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>year = m.getYear();</td>
   
   <td>0</td>
    <td>1</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td> if(year < 1) {</td>
   
   <td>0</td>
    <td>2</td>
    <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>3</td>
  </tr>
  
  <tr> <tr>
  <td>System.out.println("Kindly enter a valid year.");</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
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
  <td>else{</td>
   
   <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td> if(((year % 4 == 0) &&  !(year % 100 == 0)) || (year % 400 == 0)){</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>2</td>
    <td>2</td>
  </tr>
  
  <tr> <tr>
  <td>numDays = 29;</td>
   
   <td>0</td>
    <td>0</td>
    <td>2</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>2</td>
  </tr>
  
  <tr> <tr>
  <td> if(year > 2020){</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>2</td>
    <td>2</td>
  </tr>
  
  <tr> <tr>
  <td>System.out.println("In year " + year + " month " + month + " will consist of " + numDays + " days.");</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
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
  <td>else{</td>
   
   <td>1</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>1</td>
  </tr>
  
  <tr> <tr>
  <td>System.out.println("In year " + year + " month " + month + " has consisted of " + numDays + " days.");</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
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
  <td> }//if at line 61</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>else{</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>numDays = 28;</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>if (year > 2020){</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>2</td>
    <td>2</td>
  </tr>
  
  <tr> <tr>
  <td>System.out.println("In year " + year + " month " + month + " will consist of " + numDays + " days.");</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td> }</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td> else{</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>System.out.println("In year " + year + " month " + month + " has consisted of " + numDays + " days.");</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
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
  <td>break;  </td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>}//else at line 70</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td> }//else at line 60</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>}//switch at line 37</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>}//else at line 36</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td> }//method</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
  </tr>
  
  <tr> <tr>
  <td>}//class</td>
   
   <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
    <td>0</td>
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