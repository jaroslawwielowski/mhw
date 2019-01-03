<%--
  Created by IntelliJ IDEA.
  User: jaroslawwielowski
  Date: 28/12/2018
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>All Users</title>
</head>
<body>

<table border="5">
    <tr>
        <td><b>Id</b></td>
        <td><b>Create</b></td>
        <td><b>Imię</b></td>
        <td><b>Nazwisko</b></td>
        <td><b>Email</b></td>
        <td><b>zalogowany</b></td>
        <td><b>uprawnienia</b></td>
        <td><b>ślad</b></td>
        <td><b>Akcja</b></td>


    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.createDateTime}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.email}</td>
            <td>${user.online}</td>
            <td>${user.administrativeRights}</td>
            <td><a href="user/${user.id}">${user.trace}</a></td>

            <td><a href="delete/${user.id}">Usuń</a></td>
            <td><a href="edit/${user.id}">Edytuj</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
