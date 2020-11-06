<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*, com.video.Video"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>java_web_zzZ</title>
<link href="text.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body class="welcome-body">
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "0");
		
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
			<form action="Search">
				<div><input class="search-input"type="text" name="search" placeholder="Search..."> </div>
				<div><input class="search-btn" type="submit" value="Search"></div>
			</form>
		</div>
	</div>
</body>
</html>