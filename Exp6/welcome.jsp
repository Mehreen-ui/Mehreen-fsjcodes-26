<%@ page import="java.util.Date" %>

<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<%
    String name = request.getParameter("name");
    String email = request.getParameter("email");

    Date date = new Date();
%>

<h2>Welcome, <%= name %>!</h2>

<p>Email: <%= email %></p>

<p>Current Date and Time: <%= date %></p>

<%
    out.println("<p>Thank you for submitting the form.</p>");
%>

</body>
</html>