<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html lang="en" >
<head>
    <meta charset="UTF-8">
    <title>Update</title>
</head>
<body>
<h1>Update</h1>
<div><c:forEach var="hit" items="${students}">
    <div>
        <h1>Old data</h1>
        <table>
            <tr>
                <th>Id</th>
                <th>Products</th>
                <th>Price</th>
            </tr>
            <tr>
                <td><p ${students.id}></p></td>
                <td><p ${students.name}></p></td>
                <td><p ${students.age}></p></td>
            </tr>
        </table>
    </div>
    <div>
        <form method="post" action="<c:url value="/updateStudent"/>">
            <label for="id"></label><input id="id" name="id" type="number" value="Id" placeholder="Enter ID"><br>
            <label for="stud"></label><input id="stud" name="stud" type="text" placeholder="Enter name"><br>
            <label for="age"></label><input id="age" name="age" type="number" value="Age" placeholder="Enter age">
            <button type="submit">Update product</button>
        </form>
    </div></c:forEach>
</div>
</body>
</html>