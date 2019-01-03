<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: jaroslawwielowski
  Date: 19/12/2018
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>register</title>
</head>
<body>

<%--@elvariable id="user" type="pl.coderslab.starter.edtityes.User"--%>
<form:form method="post"
           modelAttribute="user" action="/register">
    <form:input path="firstName" placeholder="Imię"/><br>
    <form:input path="lastName" placeholder="Nazwisko" /><br>
    <form:input path="email" placeholder="Email"/><br>
    <form:password path="password" placeholder="Hasło" /><br>
    <form:select path="userDetail.sex" items="${sex}" /><br>

    Data Urodzenia: <br>
    <form:select path="userDetail.dayOfBirth" items="${dayOfBirth}"/>
    <form:select path="userDetail.monthOfBirth" items="${monthOfBirth}" />
    <form:select path="userDetail.yearsOfBirth" items="${yearOfBirth}" /><br>
    <input type="submit" value="Rejestracja"><br>
</form:form>

<h1>${param.message}</h1>


</body>
</html>
