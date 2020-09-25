<!-- Result page for liters to gallons -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style/style.css">
<meta charset="ISO-8859-1">
<title>Gallons</title>
</head>
<body>
	<h2>User Input: ${toGallons.getLiters()} liters</h2>
	<p>Converted Output: There are ${toGallons.getGallons() } gallons in ${toGallons.getLiters() } liters.</p>
	<a href="liters_to_gallons.jsp" class="button">New Liters to Gallons conversion</a> 
	<a href="index.jsp" class="button">New Gallons to Liters conversion</a>
</body>
</html>