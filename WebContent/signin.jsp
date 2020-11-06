<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>java_web_zzZ</title>
<link href="text.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body class="index-body">
	<form class="form-in" action="SignIn" method="post">
		<div style="text-align: center">
	  		<h1>This is our Demo</h1>
	  		<p>Age less than 18 is not allowed!</p>
		</div>

		<div class="form-input-group">
		    <input type="email" id="inputEmail" name="email" placeholder="Email address" required autofocus>
		</div>

  		<div class="form-input-group">
    		<input type="username" id="inputName" name="uname" placeholder="Username" required>
  		</div>
  		
  		<div class="form-input-group">
    		<input type="password" id="inputPassword" name="pass" placeholder="Password" required>
  		</div>
  		<br/>
  		<div class="btn">
  			<input class="sign-btn sign-in-btn" type="submit" value="Sign In">
  		</div>
  		<p style="text-align:center">&copy; 2020-2022</p>
	</form>
</body>
</html>