<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.PreparedStatement, java.sql.ResultSet, com.bank.util.Database, com.bank.util.Cookies, java.sql.Statement, java.sql.Connection" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
<%
String delete = request.getParameter("id");
Database db = new Database();
PreparedStatement ps = db.getPS("delete from item where identity = ?");
ps.setString(1, delete);
ps.executeUpdate();
out.println("<meta http-equiv='refresh' content='0,url=index.jsp'/>");
%>
