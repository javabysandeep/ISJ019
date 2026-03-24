<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Request Param</title>
</head>
<body>
<h1>Request Param demo</h1>
<%="Email = "+request.getAttribute("email")%>
<%="Password = "+request.getAttribute("password")%>
<%="Password  Repeat = "+request.getAttribute("passwordRepeat")%>

<h2>Registration Successful</h2>
</body>
</html>
