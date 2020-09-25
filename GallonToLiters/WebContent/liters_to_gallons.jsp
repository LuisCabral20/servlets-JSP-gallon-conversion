<!-- Page where the user can convert liters to gallons -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style/style.css">
<meta charset="ISO-8859-1">
<title>Liters to Gallons</title>
</head>
<body>
  <h1>Liters to Gallons</h1>
  <form action="getGallonsServlet" method="post">
    <label for="liters">Enter the total amount of Liters:</label>
    <input type="text" id="liters" name="liters" value="0.0" size = "10"/>
    <input type="submit" value="Convert to Gallons" class="button"/>
  </form>
  <br />
  <a href="index.jsp" class="button">Switch to Gallons to liters conversion</a>
</body>
</html>