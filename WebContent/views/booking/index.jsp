<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/user.css">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/booking.css">
		<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
		<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
		<script src="<%=request.getContextPath()%>/js/script.js"></script>
	</head>
	<body style="background-image:url('<%=request.getContextPath()%>/images/background.jpg');">
		<nav class="navbar navbar-default transparent" style="position:absolute;width:100%;">
		     <font style="font-size: 35px;font-family: initial;font-style: italic;color: #ffffff;font-weight: bolder;">
		      	Zoyo Carz
		     </font>
		     <div style="float:right;margin-right:-12%;margin-top:1%;width:30%">
	        	<button class="btn btn-warning btn-inverse-warning" style="border-radius:0px; width: 27%;" onclick="loadPage('<%=request.getContextPath() %>/user/index.do','modalDiv','loginModal')">
	          		Login
	       		</button>
	        	<button class="btn btn-success btn-inverse-success" style="border-radius:0px; width: 27%;" onClick="loadPage('<%=request.getContextPath() %>/user/signUp.do','modalDiv','signUpModal')">
	          		SignUp
	        	</button>
       		</div>
	    </nav>
	    <div id="modalDiv"></div>
	</body>
</html>