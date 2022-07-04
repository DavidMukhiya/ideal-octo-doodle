<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
</head>
<body>
	<form action="process-homepage" method="get" >
		<div align="center">
		<hr>
		<h1>Love Calculator</h1>
		<p>
		<label for="yourName">Your Name:</label> <input type="text"
			id="yourName"	name="userName"> 
		</p>
		<p>
		<label for="yourCrush">Your Crush:</label> <input
			type="text" id="yourCrush" name="crushName"> 
			</p>
		<input type="submit"
			value="Calculate">
	</div>
	</form>
</body>
</html>