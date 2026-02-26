<%@ page import="java.time.LocalDateTime" %>
<html>
<body>
<h2>writing java code inside the jsp file - scriptlet</h2>
<%
    for (int i = 0; i < 10; i++) {
        out.println(i);
    }
    out.println("current time is ="+ LocalDateTime.now());
%>
</body>
</html>
