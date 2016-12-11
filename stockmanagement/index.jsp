<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.PreparedStatement, java.sql.ResultSet, com.bank.util.Database, com.bank.util.Cookies, java.sql.Statement, java.sql.Connection,java.util.LinkedList,java.util.List,com.stock.dao.Item,compare.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Stock Management</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" type="text/css" />
<link rel="stylesheet" href="bootstrap/css/bootstrap-theme.min.css" type="text/css" />
</head>

<style>
.center-content{
	width:512px;
	margin:150px auto;
}
.main-content{
	width:612px;
	margin:150px auto;
}
</style>
<body>
<form class="form-inline center-content" action="search.jsp" method="post">
  <div class="form-group">
    <label for="search" ">Search</label>  
    <input type="text" class="form-control" id="search" name="search" placeholder="Search">
  </div>
  <button type="submit" class="btn btn-default">
  <span class="glyphicon glyphicon-search" aria-hidden="true"></span>
  </button> 
  <div class="row"> <p>  </p></div>
  <div class="row">
  <div class="col-xs-3">
    <a class="btn btn-primary" href="discount.jsp" role="button">Apply Discount</a>
  </div>
  <div class="col-xs-3">
     <a class="btn btn-primary" href="filter.jsp" role="button">Filter By Vendor</a>
  </div>
  <div class="col-xs-2">
    <a class="btn btn-primary" href="add.jsp" role="button">Add new</a> 
  </div>
</div> 
</form>


    <form class="navbar-form main-content" role="search" >
	  <div class="form-group">
	  	<label for="fields">Sort By Field   </label>
<select name="sortby" id="sortby">
<option value="identity">Identity</option>
<option value="name">Name</option>
<option value="quantityinstock">Quantity in stock</option>
<option value="mrp">MRP</option>
<option value="discount">Discount</option>
</select>
 </div>
	  <div class="form-group">
	  	<label for="sorting">Order  </label>
<select name="order" id="order">
<option value="ascending">Ascending</option>
<option value="descending">Descending</option>
</select>
</div>
	  <button type="submit" class="btn btn-primary">Get View</button>
	</form>

 

</body>
</html>
<%

Database db = new Database();
PreparedStatement ps = db.getPS("select * from item");
ResultSet rs = ps.executeQuery();
String identity="";
String name="";
int quantity=0;
double mrp=0;
double discount=0;
String vendor="";
String manufacture="";
String expiry="";
List<Item> li = new LinkedList<Item>();
while(rs.next()) {
    identity = rs.getString(1);
    name=rs.getString(2);
    quantity=rs.getInt(3);
    mrp=rs.getDouble(4);
    discount=rs.getDouble(5);
    vendor = rs.getString(6);
    manufacture = rs.getString(7);
    expiry = rs.getString(8);
    li.add(new Item(identity,name,quantity,mrp,discount,vendor,manufacture,expiry));   
}
String sort = request.getParameter("sortby");
String order = request.getParameter("order");
if(sort!=null && order!=null)
if(sort.equals("identity") && order.equals("ascending"))
	li.sort(new	IdentityComparatorAscending()); 
else if(sort.compareTo("identity")==0 && order.compareTo("descending")==0)
	li.sort(new	IdentityComparatorDescending());
else if(sort.compareTo("name")==0 && order.compareTo("ascending")==0)
	li.sort(new	NameComparatorAscending());
else if(sort.compareTo("name")==0 && order.compareTo("descending")==0)
	li.sort(new	NameComparatorDescending());
else if(sort.compareTo("quantityinstock")==0 && order.compareTo("ascending")==0)
	li.sort(new	QuantityInStockComparatorAscending());
else if(sort.compareTo("quantityinstock")==0 && order.compareTo("descending")==0)
	li.sort(new	QuantityInStockComparatorDescending());
else if(sort.compareTo("mrp")==0 && order.compareTo("ascending")==0)
	li.sort(new	MaximumRetailPriceComparatorAscending());
else if(sort.compareTo("mrp")==0 && order.compareTo("descending")==0)
	li.sort(new	MaximumRetailPriceComparatorDescending());
else if(sort.compareTo("discount")==0 && order.compareTo("ascending")==0)
	li.sort(new	DiscountComparatorAscending());
else if(sort.compareTo("discount")==0 && order.compareTo("descending")==0)
	li.sort(new	DiscountComparatorDescending());
out.println("<table class=\"table table-bordered\" >");
%>
<html>
<tr>
<td> <b>iIDENTITY </b> </td>
<td> <b>NAME</b> </td>
<td><b>QUANTITY</b> </td>
<td> <b>MRP </b></td>
<td> <b>DISCOUNT</b> </td>
<td> <b>VENDOR </b></td>
<td> <b>EDIT </b></td>
<td> <b>DELETE </b></td>
</tr>
<tr>
</html>
<%
for(Item each:li) {
	out.println("<tr><td>"+each.getIdentity()+"</td><td>"+each.getName()+"</td><td>"+each.getQuantityInStock()+"</td><td>"+each.getMaximumRetailPrice()+"</td><td>"+each.getDiscount()+"</td><td>"+each.getVendor()+"</td>");
	out.println("<td> <form action=\"edit.jsp\" method=\"get\" ><input type=\"hidden\" name=\"id\" value="+each.getIdentity() +" /> <input type=\"submit\" value=\"Edit\" class=\"btn btn-success btn-xs\" />");
	out.println(" </form> </td>");
	out.println("<td> <form action=\"delete.jsp\" method=\"get\" ><input type=\"hidden\" name=\"id\" value="+each.getIdentity() +" /> <input type=\"submit\" value=\"Delete\" class=\"btn btn-danger btn-xs\" />");
	out.println(" </form> </td></tr>");
}
out.println("</table>");
%>
