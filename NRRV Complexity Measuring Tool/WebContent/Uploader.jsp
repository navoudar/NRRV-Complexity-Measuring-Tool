<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page import="model.FileModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@page import="model.FileModel" %>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>


        <meta charset="ISO-8859-1">
<title>Upload files</title>

<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no">
<link rel="stylesheet" media="all" href="design/css/style.css">
	




<title>Login V10</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="login/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="login/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="login/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="login/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="login/vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="login/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="login/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="login/vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="login/vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="login/css/util.css">
	<link rel="stylesheet" type="text/css" href="login/css/main.css">
<!--===============================================================================================-->
	
<![endif]-->

</head>

<body>


				
	<header id="header">
	<div class="container">
	<div class="right-links">
	
	
<ul>
 <!--<li><a href="cart.html"><span class="ico-products"></span>3 products, $4 500.00</a></li> -->
  <li><a href=""><span class="ico-account"></span>Log Out</a></li>




		
<!-- / container -->
	
</header>
	<!-- / header -->
	
<nav id="menu">
		<div class="container">
			<div class="trigger"></div>
	<ul>
	
	<li><a href="Homepage.jsp">Homepage</a></li>
	
     <li><a href="About Us.jsp?id=earing">About Us</a></li>
	
     <li><a href="Contact Us.jsp?id=Ring">Contact Us</a></li>
				
		<li><a href="Gallery.jsp?id=Ring">FQA</a></li>
		
     </ul>
	</div>
		<!-- / container -->
	</nav>
	<!-- / navigation -->

	

</br> 

		
		
 <div id="breadcrumbs">
    	<div class="container">
	    
	 </div>
</div>
     
			
	



















<title>Insert title here</title>
</head>
<body>
 <%
                 
                    if (request.getParameter("div") == (null)) {
        %>
<div>
<form action="Uploader" method="post" enctype="multipart/form-data">
	
	<input type="file" name="file" multiple/>
	<input type="submit">
	
	</form>
 
</div>
	<%                            } else {

        %>
        
        <div>
<form action="Uploader" method="post" enctype="multipart/form-data">
	<a>some link</a>
	
	<c:forEach var="line" items="${filenames}">
   <select>
   <option>${line}</option>
   <option>test</option>
   </select>
   </c:forEach>
   
  
	<label for="filename">Choose a file to display:</label>

<select id="filename">
  <%-- <option value="volvo"><%=fm.getFilename()%></option> --%>
  <option value="mercedes">Mercedes</option>
  <option value="audi">Audi</option>
</select>
	<input type="file" name="file" multiple/>
	<input type="submit">
	
	</form>
 
</div>

 <%

                }
    %>
    
  
</body>
</html>