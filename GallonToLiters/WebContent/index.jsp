<!-- Index page where the user can convert gallons to liters -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style/style.css">
<meta charset="ISO-8859-1">
<title>Gallons to Liters</title>
</head>
<body>
  <h1>Gallons To Liters</h1>
  <form action="getLitersServlet" method="post">
    <label for="gallons">Enter the total amount of Gallons:</label>
    <input type="text" id="gallons" name="gallons" value="0" size = "10"/>  
    <input type="submit" value="Convert to Liters" class="button"/>
  </form>
  <br />
  <a href="liters_to_gallons.jsp" class="button">Switch to liters to Gallons Conversion</a>
</body>
</html>