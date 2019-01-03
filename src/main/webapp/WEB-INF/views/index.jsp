<%--
  Created by IntelliJ IDEA.
  User: jaroslawwielowski
  Date: 28/12/2018
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<div><jsp:include page="/user/login"/></div>--%>
<%--<div><jsp:include page="/user/register"/></div>--%>

<div>
    <table border="5" align="center">
        <tr><td><b>---------------------</b></td><td><b>---------------------</b></td><td><b>Logowanie</b></td>
            <td><b><div><jsp:include page="/login"/></div>
        </b></td></tr>

        <tr>
            <td><h1>${message}</h1></td>
            <td><h1>${message}</h1></td>
            <td>Rejestracja :</td>
            <td><div><jsp:include page="/register"/></div></td>
        </tr>

    </table>

</div>
<center><h1>${message}</h1></center>
</body>
</html>
