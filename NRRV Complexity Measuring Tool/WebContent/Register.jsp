<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>


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



</head>
<body>

				
	<header id="header">
	<div class="container">
	<div class="right-links">
	
	
<ul>
 <!--<li><a href="cart.html"><span class="ico-products"></span>3 products, $4 500.00</a></li> -->




		
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
     
			
	
    
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-t-50 p-b-90">
				<form class="login100-form validate-form flex-sb flex-w" action="login1" method="post">
					<span class="login100-form-title p-b-51">
						Register
					</span>

					
					
					
					<div class="wrap-input100 validate-input m-b-16" data-validate = "Username is required">
						<input class="input100" type="text" name="uname" placeholder="Username">
						<span class="focus-input100"></span>
					</div>
                                         
					<div class="wrap-input100 validate-input m-b-16" data-validate = "valid emaile">
						<input class="input100" type="text" name="emaile" placeholder="Emaile">
						<span class="focus-input100"></span>
					</div>
					
					
					<div class="wrap-input100 validate-input m-b-16" data-validate = "Password is required">
						<input class="input100" type="password" name="password" placeholder="Password">
						<span class="focus-input100"></span>
</div>
					
<div class="flex-sb-m w-full p-t-3 p-b-24">
	<div class="contact100-form-checkbox">
<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
							
<label class="label-checkbox100" for="ckb1">Remember me</label>
<tr>
						
						<td style="font-size: 20px; color: red;">${error}</td>
					</tr>
</div>

</div>

<div class="container-login100-form-btn m-t-17">
						
<button class="login100-form-btn">Register</button>
	</div>

	</form>
   </div>
	</div>
	</div>
	



</body>
</html>