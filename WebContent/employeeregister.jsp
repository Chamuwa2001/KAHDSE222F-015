<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMPLOYEE DETAILS</title>
<style>

.stylingTable {
    border-collapse: collapse;
    margin: 25px 0;
    font-size: 0.9em;
    font-family: sans-serif;
    min-width: 400px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
}
</style>
</head>
<body>
 <div align="center">
  <h1>Employee Register Form</h1>
  <form action="<%= request.getContextPath() %>/register" method="post">
   <table style="with: 80%"><tr>
     <td>YOUR ID</td>
     <td><input type="text" name="ID" /></td>
    </tr>
    <tr>
     <td>YOUR NAME</td>
     <td><input type="text" name="YOUR NAME" /></td>
    </tr>
    <tr>
     <td>NIC</td>
     <td><input type="text" name="NIC" /></td>
    </tr>
    <tr>
     <td>DEPARTMENT</td>
     <td><input type="text" name="DEPARTMENT" /></td>
    </tr>
    <tr>
     <td>DESIGNATION</td>
     <td><input type="text" name="DESIGNATION" /></td>
    </tr>
    <tr>
     <td>JOINED DATE</td>
     <td><input type="text" name="JOINED DATE" /></td>
    </tr>
   </table>
   <input type="submit" value="DONE" />
  </form>
 </div>
</body>
</html>