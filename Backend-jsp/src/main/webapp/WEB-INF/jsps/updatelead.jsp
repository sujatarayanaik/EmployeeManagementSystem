<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
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
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<h1>Add Employee  </h1>
<form action="updatesavedata" method="post">
<pre>
<input type="hidden" name="id" value="${leads.id}"/>
First Name  :<input type="text"  name="fname" value="${leads.fname}"/>

Last Name   :<input type="text" name="lname" value="${leads.lname}"/>

    Email   :<input type="email" name="email"value="${leads.email}"/>
    
    Mobile  :<input type="number" name="mobile" value="${leads.mobile}"/>
    
 
    		<input type="submit" value="Update Lead"/>

</pre>
</form>
</body>
</html>