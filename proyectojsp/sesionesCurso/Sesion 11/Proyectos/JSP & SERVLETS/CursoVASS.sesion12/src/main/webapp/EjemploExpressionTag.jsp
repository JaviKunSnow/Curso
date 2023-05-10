<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= "welcome to jsp" %>  
<br>
Current Time: <%= java.util.Calendar.getInstance().getTime() %>
<br>  
<% request.setAttribute("nombre", "Yo"); %>
<br>
<%= "Welcome "+request.getAttribute("nombre") %>  
</body>
</html>