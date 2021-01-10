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

</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/welcome" class="navbar-brand">Logout</a>
			
		</div>
	</div>
 <div class="container" id="homediv">
		<div class="jumbotron text-center">
			<h1>Welcome to TechTree</h1>
			<h3>TechTree IT Systems Pvt Ltd is well established and successful 250 associates strong ICT company, specializing in Digital Solutions</h3>
</div>
</div>
<!--	<o:choose>
<o:when test="${mode=='ALL_USERS' }">
			<div class="container text-center" id="tasksDiv">
				<h3>All Users</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Id</th>
								<th>UserName</th>
								<th>First Name</th>
								<th>LastName</th>
								
							</tr>
						</thead>
						<tbody>
							<o:forEach var="user" items="${users }">
								<tr>
									<td>${user.id}</td>
									<td>${user.username}</td>
									<td>${user.firstname}</td>
									<td>${user.lastname}</td>
									
								</tr>
							</o:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</o:when>
	</o:choose>-->

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>



<!--  <div class="container" id="homediv">
		<div class="jumbotron text-center">
			<h1>Welcome to TechTree</h1>
			<h3>TechTree IT Systems Pvt Ltd is well established and successful 250 associates strong ICT company, specializing in Digital Solutions</h3>
		      <c:forEach var="user" items="${users }">
								<tr>
									<td>${user.id}</td>
									<td>${user.username}</td>
									<td>${user.firstname}</td>
									<td>${user.lastname}</td>
									<td>${user.age}</td>
									
								</tr>
							</c:forEach>
		
		</div>
	</div>
-->