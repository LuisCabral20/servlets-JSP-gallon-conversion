<!-- Result page for gallons to liters -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style/style.css">
<meta charset="ISO-8859-1">
<title>Liters</title>
</head>
<body>
	<h2>User Input: ${toLiters.getGallons()} Gallons</h2>
	<p>Converted Output: There are ${toLiters.getLiters() } in ${toLiters.getGallons() } gallons.</p>
	<a href="liters_to_gallons.jsp" class="button">New Liters to Gallons conversion</a> 
	<a href="index.jsp" class="button">New Gallons to Liters conversion</a>
</body>
</html>