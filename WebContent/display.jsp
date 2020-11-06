<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    
<%@ page import="java.util.*, com.search.dao.SearchDao,com.video.Video" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>java web zzZ</title>
<link href="text.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="project.js"></script>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "0");
		
		if(session.getAttribute("username") == null) {
			response.sendRedirect("index.jsp");
		}
	%>

	<div class="page-content">
		<div class="welcome-header display-header">
			<div class="header-menu"><a href="#">About</a></div>
			<div class="header-welcome-content">
				<span>Welcome ${username}</span>
				<form action="Logout"><input type="submit" value="Log out"></form>
			</div>	
		</div>
		<br>
		<div class="search display-search">
			<form action="Search">
				<input class="search-input"type="text" id="search" name="search" placeholder="Search..." <% 
					String str = String.valueOf(session.getAttribute("search-content"));
					if(str.isEmpty()) {
						out.println("");
					} else {
						out.println("value='" + str + "'");
					}
				%>>
				<input class="search-btn" type="submit" value="Search">
			</form>
		</div>
		
		<div class="search-res">
			The Search Result will display here!<br>
			<ul>
				<%
					String sc = String.valueOf(request.getParameter("search"));
					System.out.println(sc);
					if(sc.isEmpty() || sc.equals("null")) {
						response.sendRedirect("welcome.jsp");
					} else {
						
						SearchDao sd = new SearchDao();
						
						List<Video> videos = sd.search(sc);
						
						for(Video v: videos) {
							out.println("<li><span class='name'>E-Name: </span><span>" + v.getEname() + "</span><span class='name'> C-Name: </span><span>" + v.getCname() + "</span><br>" +
	  							"<span class='name'>Title: </span><span>" + v.getTitle() + "</span><br><span><a href='"+ v.getLink() +"'>this is the youtube link</a></span></li>");
						}
					}
				%>
			</ul>
			
		</div>
	
	</div>
</body>
</html>