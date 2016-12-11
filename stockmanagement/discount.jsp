<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Discount</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" type="text/css" />
<link rel="stylesheet" href="bootstrap/css/bootstrap-theme.min.css" type="text/css" />
</head>
<style>
.center-content{
	width:512px;
	margin:150px auto;
}
</style>
<body>
<form class="form-inline center-content" action="updatediscount.jsp" method="post">
  <div class="form-group">
    <label for="discount" >Discount</label>  
    <input type="text" class="form-control" id="discount" name="discount" placeholder="discount" >
  </div>
  <div class="form-group">
    <div class="col-sm-offset-4 col-sm-8">
    <button type="submit" class="btn btn-primary col-sm-15 ">Update Discount</button>
    </div>
</div>  
</form>
</body>
</html>
