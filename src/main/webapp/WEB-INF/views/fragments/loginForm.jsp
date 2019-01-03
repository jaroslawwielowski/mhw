<%--
  Created by IntelliJ IDEA.
  User: jaroslawwielowski
  Date: 28/12/2018
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Login</title>
</head>
<body>
<%--@elvariable id="user" type="pl.coderslab.starter.edtityes.User"--%>
<form:form method="post"
           modelAttribute="user" action="login">
    Email: <form:input path="email" />
    Password: <form:password path="password" />
    <input type="submit" value="login">
</form:form>

${message}

</body>
</html>
