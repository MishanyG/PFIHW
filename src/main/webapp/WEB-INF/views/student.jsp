<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>AllStudents</title>
</head>
<body>
<h1>All students</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Age</th>
    </tr>
    <tr>
        <c:forEach var="hit" items="${students}">
            <td><p ${hit.id}></p></td>
            <td><p ${hit.name}></p></td>
            <td><p ${hit.age}></p></td>
            <form method="get" action="<c:url value="/editStudent"/>">
                <label for="id"><input name="id" id="id" value="${hit.id}" type="number"
                                       placeholder="Enter ID"></label>
                <button type="submit">Edit student</button>
            </form>
            <form method="get" action="<c:url value="/newStudent"/>">
                <button type="submit">Add student</button>
            </form>
            <form method="get" action="<c:url value="/deleteStudent"/>">
                <label for="idDel"><input name="id" id="idDel" value="${hit.id}" type="number"
                                       placeholder="Enter ID"></label>
                <button type="submit">Remove student</button>
            </form>
        </c:forEach>
    </tr>
</table>
</body>
</html>