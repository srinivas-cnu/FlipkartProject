<!DOCTYPE html>
<html>
<head>
 
<meta charset="ISO-8859-1">
<title>SignUp</title>
</head>
<body>
<div class="container-fluid">
<div class="jumbotron">
<div class="container text-center">
<h1>  FLIPKART</h1>
</div>
</div>
</div>

<form action="RegistrationController" method="post">
<div class="container">
<h1>Sign Up</h1>
<p>Please fill the form to create an account.</p>
<hr>
<label for="Username"><b>Username:</b></label>
<input type="text" placeholder="Enter First Name" name="Username" required><br><br>
<label for="pwd"><b>Password:</b></label>
<input type="password" placeholder="Enter Password" name="password" required><br><br>

<label for="pwd-repeat"><b>pwd-repeat:</b></label>
<input type="password" placeholder="Repeat Password" name="rpassword" required><br><br>



<p>By Creating an account you agree to our <a href="#" style="color:dodgerblue"> Terms & Privacy </a> </p>
 
 <div class="clearfix">
 <button type="button" class="cancelbtn">Cancel</button>
 <button type="submit" class="signupbtn">Sign Up</button>
 </div> 

</div>

</form>
</body>
</html>