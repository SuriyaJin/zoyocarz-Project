<div class="modal fade" id="loginModal" role="dialog">
	<div class="modal-dialog">
		<div class="modal-body">
			<div class="container">
				<h1 class="form-heading"
					style="font-family: 'Charm'; font-size: 50px; text-align: center;">Welcome
					to Zoyocarz</h1>
				<div class="login-form" style="margin-top: 5%;">
					<div class="main-div">
						<div class="panel" style="margin-bottom: 0px !important;">
							<h2
								style="font-family: auto; font-size: 40px; font-weight: bolder; color: #6b556c;">Login</h2>
						</div>
						<form id="Login" style="margin-top: 7%"
							action="<%=request.getContextPath()%>/user/login.do" method="post">
							<%
								if (request.getAttribute("error") != null) {
							%>
							<font style="color: red;" id="error"><%=request.getAttribute("error")%></font>
							<%
								}
							%>
							<div class="form-group">
								<input type="email" class="form-control" id="inputEmail"
									placeholder="Email Address" name="username" required>
							</div>
							<div class="form-group" style="margin-top: 6%;">
								<input type="password" class="form-control" id="inputPassword"
									placeholder="Password" name="password" required>
							</div>
							<button type="submit" class="btn btn-primary" id="login">Login</button>
							<div class="row">
								<button type="button" class="btn btn-default" data-dismiss="modal" style="margin-top: 6%;width: 91%;height: 43px;">Close</button>
							</div>
							<div class="forgot" style="margin-top: 4%;">
								<a href="reset.html">Forgot password?</a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>