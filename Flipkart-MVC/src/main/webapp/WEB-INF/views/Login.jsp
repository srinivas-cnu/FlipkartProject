<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Loginpage</title>
</head>
<body>
<div class="jumbotron">
<div class="container text-center">
<h1>FLIPKART</h1>
</div>
</div>

<div class="container-fluid">

<form action="LoginController" method="post">
<div class="form-group">
<label for="Username">Username:</label>
<input type="Username" class="form-control" name="Username" placeholder="Enter Username">
</div>

<div class="form-group">
<label for="pwd">Password:</label>
<input type="password" class="form-control" name="password" placeholder="Enter Password">
</div>

<input type="submit" value="Login">
<a href="signup">SignUp</a>
<!-- <button type="button" class="btn btn-default">SignUp</button> -->


<div class="checkbox">
<label><input type="checkbox">Remember me</label>

</div>
</form>
</div>


</body>
</html>