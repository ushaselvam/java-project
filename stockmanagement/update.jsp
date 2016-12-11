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
    String identity = request.getParameter("identity");
	String name = request.getParameter("name");
	String quantity = request.getParameter("quantity");
	String mrp = request.getParameter("mrp");
	String discount = request.getParameter("discount");
	String vendor = request.getParameter("vendor");
	String manufacturingdate = request.getParameter("manufacturingdate");
	String expirydate = request.getParameter("expirydate");
	Database db = new Database();
	PreparedStatement ps = db.getPS("INSERT INTO item VALUES(?,?,?,?,?,?,?,?)");
	ps.setString(1, identity);
	ps.setString(2, name);
	ps.setInt(3, Integer.parseInt(quantity));
	ps.setDouble(4, Double.parseDouble(mrp));
	ps.setDouble(5, Double.parseDouble(discount));
	ps.setString(6, vendor);
	ps.setString(7, manufacturingdate);
	ps.setString(8, expirydate);
	ps.executeUpdate();
	out.println("<meta http-equiv='refresh' content='0,url=index.jsp'/>");
	
%>
