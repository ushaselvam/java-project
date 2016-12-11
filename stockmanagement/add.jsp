<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add an product</title>
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
<form class="form-horizontal center-content" action="update.jsp" method="post">
  <div class="form-group">
    <label for="identity" class="col-sm-4 control-label">Product Id</label>
    <div class="col-sm-8">
      <input type="text" class="form-control" name="identity" id="identity" placeholder="Product Id">
    </div>
  </div>
   <div class="form-group">
    <label for="name" class="col-sm-4 control-label">Product name</label>
    <div class="col-sm-8">
      <input type="text" class="form-control" name="name" id="name" placeholder="Product name">
    </div>
  </div>
  <div class="form-group">
    <label for="quantity" class="col-sm-4 control-label">Quantity</label>
    <div class="col-sm-8">
      <input type="text" class="form-control" name="quantity" id="quantity" placeholder="Quantity in stock">
    </div>
  </div>
  <div class="form-group">
    <label for="mrp" class="col-sm-4 control-label">MRP</label>
    <div class="col-sm-8">
      <input type="text" class="form-control" name="mrp" id="mrp" placeholder="Maximum retail price">
    </div>
  </div>
  <div class="form-group">
    <label for="discount" class="col-sm-4 control-label">Discount</label>
    <div class="col-sm-8">
      <input type="text" class="form-control" name="discount" id="discount" placeholder="DISCOUNT">
    </div>
  </div>
   <div class="form-group">
    <label for="vendor" class="col-sm-4 control-label">vendor</label>
    <div class="col-sm-8">
      <input type="text" class="form-control" name="vendor" id="vendor" placeholder="vendor name">
    </div>
  </div>
   <div class="form-group">
    <label for="manufacturingdate" class="col-sm-4 control-label">Manufacturing Date</label>
    <div class="col-sm-8">
      <input type="text" class="form-control" name="manufacturingdate" id="manufacturingdate" placeholder="Manufacturing Date">
    </div>
  </div>
   <div class="form-group">
    <label for="expirydate" class="col-sm-4 control-label">Expiry Date</label>
    <div class="col-sm-8">
      <input type="text" class="form-control" name="expirydate" id="expirydate" placeholder="Expiry Date">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-4 col-sm-8">
    <button type="submit" class="btn btn-primary col-sm-6">Submit Details</button>
    </div>
</div>
  </form>
</body>
</html>
