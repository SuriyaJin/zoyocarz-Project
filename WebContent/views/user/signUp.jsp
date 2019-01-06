<div class="modal fade" id="signUpModal" role="dialog">
	<div class="modal-dialog">
		<div class="modal-body">
			<div class="container">
				<div class="login-form" style="width: 104%;">
					<div class="main-div">
						<div class="panel" style="margin-bottom: 0px !important;">
							<h2
								style="font-family: auto; font-size: 40px; font-weight: bolder; color: #6b556c;">Sign
								Up</h2>
						</div>
						<form id="Login" style="margin-top: 7%" action="/user/saveUser.do">
							<div class="form-group">
								<input type="text" class="form-control" id="firstName"
									placeholder="First Name">
							</div>
							<div class="form-group">
								<input type="text" class="form-control" id="lastName"
									placeholder="Last Name">
							</div>
							<div class="form-group">
								<input type="email" class="form-control" id="inputEmail"
									placeholder="Email Address">
							</div>
							<div class="form-group">
								<input type="password" class="form-control" id="inputPassword"
									placeholder="Password">
							</div>
							<div class="form-group">
								<input type="text" class="form-control" id="mobileNumber"
									placeholder="Mobile Number">
							</div>
							<div class="form-group" style="text-align: left;">
								<font>Address Details</font>
							</div>
							<div class="form-group">
								<input type="text" class="form-control" id="city"
									placeholder="City">
							</div>
							<div class="form-group">
								<input type="text" class="form-control" id="state"
									placeholder="State">
							</div>
							<div class="form-group">
								<input type="text" class="form-control" id="country"
									placeholder="Country">
							</div>
							<div class="form-group">
								<input type="text" class="form-control" id="pincode"
									placeholder="Pincode">
							</div>
							<div class="row">
								<button type="submit" class="btn btn-primary">Create Account</button>
								<button type="button" class="btn btn-default" data-dismiss="modal" style="margin-top: 6%;width: 100%;height: 43px;">Close</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>