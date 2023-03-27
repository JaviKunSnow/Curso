<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!int data = 50;

	public void metodo() {
		System.out.println("Estamos en un metodo");
	}%>
	<%="Value of the variable is:" + data%>

	<%!int cube(int n) {
		return n * n * n;
	}%>

	<br>

	<%="Cube of 3 is:" + cube(3)%>

</body>
</html>