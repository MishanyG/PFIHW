<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html lang="en" >
<head>
    <meta charset="UTF-8">
    <title>addProduct</title>
</head>
<body>
<form method="post" action="<c:url value="/addStudent"/>">
    <h1>Enter new data</h1>
    <label for="id"></label><input id="id" name="id" placeholder="Enter ID" type="number" value="Id"><br>
    <label for="stud"></label><input id="stud" name="stud" placeholder="Enter name" type="text"><br>
    <label for="age"></label><input id="age" name="age" placeholder="Enter age" type="number" value="age">
    <button type="submit">Add student</button>
</form>
</body>
</html>
