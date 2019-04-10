<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Welcome to Restaurant web site</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<style>
body, html {
  height: 100%;
  margin: 0;
}

.bg {
  /* The image used */
  background-image: url("res4.jpg");

  /* Full height */
  height: 100%; 

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
</style>

</head>

<body>
<div class="bg">	

 	<nav class="navbar navbar-inverse">
 		<div class="container-fluid">
 			<div class="navbar-header">
 				<a class="navbar-brand">RESTAURANT</a>
 			</div>
 			<ul class="nav navbar-nav">
 				<li class="active">
 					<a href="#">Home</a>
 				</li>
 				<li>
 					<a href="addRestaurant.jsp">ADD USER</a>
 				</li>
 				<li>
 					<a href="#">EDIT USER</a>
 				</li>
 				<li>
 					<a href="listalluser">LIST ALL USER</a>
 				</li>
 				<li>
 					<a href="signup.jsp">SIGN UP</a>
 				</li>
 				 			</ul>
 		</div>
 	</nav>
 <h1 align="center"><i><b>Welcome to Restaurant</b></i></h1>
<h3 align="center">Rethink your relationship with food</h3>
<h1 align="center">Cook. Taste. Inspire.</h1>

<h3 align="center">SIGN UP HERE<a href="signup.jsp">Start new account</a></h3>
<h3 align="center">Already have account? <a href="login.jsp">To login</a></h3>
<h3>To add a new User <a href="addRestaurant.jsp">click here</a></h3>
<h3>To view all user <a href="listalluser">click here</a></h3>
</div>
</body>
</html>