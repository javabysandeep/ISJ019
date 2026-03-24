<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Update Form</title>
</head>
<body>
<form method="post" action="student">
    <table>
        <tr>
            <td>student id</td>
            <td><input type="number" name="id"></td>
        </tr>
        <tr>
            <td>student name</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>email</td>
            <td><input type="email" name="email"></td>
        </tr>
        <tr>
            <td>phone</td>
            <td><input type="text" name="phone"></td>
        </tr>
        <tr>
            <td><input type="submit" value="create-student"></td>
        </tr>
    </table>
</form>
</body>
</html>
