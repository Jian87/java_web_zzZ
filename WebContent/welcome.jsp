<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>java_web_zzZ</title>
<link href="text.css" rel="stylesheet">
</head>
<body class="welcome-body">
	<%
		if(session.getAttribute("username") == null) {
			response.sendRedirect("index.jsp");
		}
	%>
	
	<div class="page-content">
		<div class="welcome-header">
			<div class="header-menu"><a href="#">About</a></div>
			<div class="header-welcome-content">
				<span>Welcome ${username}</span>
				<form action="Logout"><input type="submit" value="Log out"></form>
			</div>	
		</div>
		<br>
		<div class="search">
			<form>
				
				<div><input class="search-input"type="text" name="search" placeholder="Search..."> </div>
				<div><input class="search-btn" type="submit" value="Search"></div>
			</form>
		</div>
	
	</div>
</body>
</html>