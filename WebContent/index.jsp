<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>java_web_zzZ</title>
<link href="text.css" rel="stylesheet">
</head>
<body class="index-body">
	<form class="form-in" action="Login" method="post">
		<div style="text-align: center">
	  		<h1>This is our Demo</h1>
	  		<p>Age less than 18 is not allowed!</p>
		</div>

		<div class="form-input-group">
		    <input type="email" id="inputEmail" name="email" placeholder="Email address" required autofocus>
		</div>

  		<div class="form-input-group">
    		<input type="password" id="inputPassword" name="pass" placeholder="Password" required>
  		</div>

  		<div class="form-checkbox">
    		<label>
      		<input type="checkbox" value="remember-me"> Remember me
    		</label>
  		</div>
  		<br/>
  		<div class="btn">
  			<input class="log-btn" type="submit" value="Log in">
  			<input class="sign-btn" type="submit" value="Sign in">
  		</div>
  		<p style="text-align:center">&copy; 2020-2022</p>
	</form>
</body>
</html>