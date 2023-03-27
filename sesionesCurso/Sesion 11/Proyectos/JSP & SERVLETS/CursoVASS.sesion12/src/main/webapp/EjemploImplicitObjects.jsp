<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!-- Implicit object OUT -->

	<%
	out.print("Today is:" + java.util.Calendar.getInstance().getTime());
	%>
	<br>


	<!-- Implicit object request -->

	<%
	String name = request.getParameter("uname");
	%>
	<br>

	<!-- Implicit object response -->

	<%
	//response.sendRedirect("http://www.google.com");
	%>
	<br>

	<!-- Implicit object application -->

	<%
	String driver = application.getInitParameter("dname");
	out.print("driver name is=" + driver);
	%>

	<br>

		<!-- Implicit object session -->


	<%
	request.setAttribute("name", "Yo");
	name = (String)request.getAttribute("name");
	
	out.print("Welcome " + name);

	session.setAttribute("name", name);
	
	name=(String)session.getAttribute("name");  
	out.print("Hello "+name);  
	
	%>
	
	
	<br>
	
</body>
</html>