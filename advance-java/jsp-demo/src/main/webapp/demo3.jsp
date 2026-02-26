<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.util.List" %>
<html>
<body>
<h2>writing java code inside the jsp file - declaration tag</h2>
<%!
    public static List<String> getStrings() {
        return List.of("Bhushan", "Snehal", "Sanskriti");
    }
%>

<h2>Student names </h2><br/>
<%=getStrings()%>

</body>
</html>
