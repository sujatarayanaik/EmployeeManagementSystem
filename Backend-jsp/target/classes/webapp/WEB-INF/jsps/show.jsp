<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<style type="text/css">
body {
  font-family: Arial, sans-serif;
  margin: 20px;
}

h2 {
  color: #333;
}

table {
  width: 100%;
  border-collapse: collapse;
}

th, td {
  padding: 10px;
  text-align: left;
}

th {
  background-color: #f2f2f2;
}

tr:nth-child(even) {
  background-color: #f9f9f9;
}

a {
  color: #0066cc;
  text-decoration: none;
}

a:hover {
  text-decoration: underline;
}
body {
  font-family: Arial, sans-serif;
  background-color: #f2f2f2;
  margin: 0;
  padding: 20px;
}

h2 {
  color: #333;
  text-align: center;
}

table {
  width: 100%;
  border-collapse: collapse;
  margin-top: 20px;
  background-color: #fff;
  border: 1px solid #ddd;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

th, td {
  padding: 12px;
  text-align: left;
}

th {
  background-color: #f9f9f9;
  font-weight: bold;
  border-bottom: 1px solid #ddd;
}

tr:nth-child(even) {
  background-color: #f2f2f2;
}

a {
  color: #0066cc;
  text-decoration: none;
}

a:hover {
  text-decoration: underline;
}

</style>
<title>Employee Details</title>
</head>


<body>
<h1>Add Employee </h1>
<form action="savedata" method="post">
<pre>

  Click here <a href="http://localhost:8080/listall">List of Employee</a> to see the Employee Details

First Name :<input type="text"  name="fname" />

Last Name  :<input type="text" name="lname"/>

    E-Mail  :<input type="email" name="email"/>
    
    Contact No :<input type="number" name="mobile"/>
    
    
 
    		<input type="submit" value="Save Lead"/>

</pre>
</form>
</body>
</html>