<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Fruity Loops</title>
</head>
<body>
    <c:forEach var="fruit" items="${fruits}">
        <p><c:out value="${fruit.name}" /></p>
        <p><c:out value="${fruit.price}" /></p>
    </c:forEach>
</body>
</html>