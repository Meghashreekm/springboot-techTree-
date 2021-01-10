<!DOCTYPE html >
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<title> home</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<script type="text/javascript">
function validation()
{ 
     var fname = document.myform.firstname.value;
     var emails = document.myform.username.value;
     var lname = document.myform.lastname.value;
     var passwords = document.myform.password.value;


    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
     
     var pass= /(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*]).{4,20}/;
  
     if(fname.length>21)
     { 
     alert("fname must be less than 21 characters long."); 
     return false; 
     } 
     else if(lname.length>21)
     { 
     alert("lname must be less than 21 characters long."); 
     return false; 
     } 
     else if (!filter.test(emails)) {
      alert('Please provide a valid email address');
     return false;  
     }
     else if(!pass.test(passwords)){
         alert("Please provide pass.\npassword between 4 to 20 characters which contain at least one lowercase letter,\n one uppercase letter,\n one numeric digit,\n and one special character "); 
         return false; 

     }
     else if(emails.length>21)
     { 
         alert("email must be less than 21 characters long."); 
         return false; 
      } 

    
  
    
}
	</script>


</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/welcome" class="navbar-brand">Home</a>
			
					<a href="/login">Login</a>
					<a href="/register">New Registration</a>
				
				
			
		</div>
	</div>
	
	<c:choose>
		<c:when test="${mode=='MODE_HOME' }">
			<div class="container" id="homediv">
				<div class="jumbotron text-center">
					<h1>WELCOM..!!</h1>
					<h3>Say hi to spring..!</h3>
				</div>
			</div>

		</c:when>

		<c:when test="${mode=='MODE_REGISTER' }">
			<div class="container text-center">
				<h3>New Registration</h3>
				<hr>
				<form class="form-horizontal" name="myform" method="POST" action="save-user">
					<p>FirstName</p>
				<input type="text" placeholder="Firstname" name="firstname" value="${user.firstname }" required="required">
			
				    <p>LastName</p>
				<input type="text" placeholder="Lastname" name="lastname" value="${user.lastname }" >
				    <p>UserEmail</p>
				<input type="text" placeholder="Username" name="username" value= "${user.username }"  required>
				    <p>Password</p>
			
				<input type="password" placeholder="Password" name="password" value="${user.password }" required>
				<br>
				<br>
				
					 <input type="submit"  value="Register" align="center" onclick="validation()"> <a
					href="/login">Already have Account?</a>
			</form>
			</div>
		</c:when>
		<c:when test="${mode=='MODE_DONE' }">
			<div class="container text-center">
				<h3>Successfully registered !!</h3>
				</div>
		</c:when>
		
		<c:when test="${mode=='MODE_LOGIN' }">
			
				<h3>User Login</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="/login-user">
					<c:if test="${not empty error }">
						<div class= "alert alert-danger">
							<c:out value="${error }"></c:out>
							</div>
					</c:if>
					<div class="form-group">
						<label class="control-label col-md-3">Username</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="username"
								value="${user.username }" required>
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Password</label>
						<div class="col-md-7">
							<input type="password" class="form-control" name="password"
								value="${user.password }" required >
						</div>
					</div>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Login" /><a
					href="/register">Don't have Account?</a>
					</div>
					</form>
					
					</c:when>
		
	</c:choose>


	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>