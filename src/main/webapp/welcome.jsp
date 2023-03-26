<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//page caching is made false
		response.setHeader("Cache-Control","no-cahce,no-store,must-revalidate");
	
		if(session.getAttribute("uname")== null){
			response.sendRedirect("login.jsp");
		}
	%>
	Welcome, ${uname}
	Profile links <a href="socialMedia.jsp">click here</a>
	
	<form action="Logout">
		<button type="sumbit">logout</button>
	</form>
</body>
</html>