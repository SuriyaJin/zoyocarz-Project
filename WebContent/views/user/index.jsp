<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Zoyo Carz</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/user.css">
<link href='https://fonts.google.com/css/Charm?selection.family=Charm' rel='stylesheet'>
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/js/script.js"></script>
</head>
<body id="LoginForm">
	<div class="container">
		<h1 class="form-heading" style="font-family:'Charm';font-size:50px;text-align:center;">Welcome to Zoyocarz</h1>
		<div class="login-form" style="margin-top: 5%;">
			<div class="main-div">
				<div class="panel" style="margin-bottom:0px !important;">
					<h2 style="font-family: auto;font-size: 40px;font-weight: bolder;color: #6b556c;">Login</h2>
				</div>
				<form id="Login" style="margin-top:7%" action="">
					<div class="form-group">
						<input type="email" class="form-control" id="inputEmail"
							placeholder="Email Address">
					</div>
					<div class="form-group" style="margin-top:6%;">
						<input type="password" class="form-control" id="inputPassword"
							placeholder="Password">
					</div>
					<button type="submit" class="btn btn-primary">Login</button>
					<div class="forgot" style="margin-top:4%;">
						<a href="reset.html">Forgot password?</a>
					</div>
				</form>
				<div style="margin-right: -74%;margin-top: -9%;">
					<button onClick="loadPage('<%=request.getContextPath() %>/user/signUp.do')" class="btn" style="color: #ffffff;background-color: #b07685;">Sign Up</button>
				</div>
			</div>
		</div>
	</div>
	<div id="signUpDiv"></div>
</body>
</html>