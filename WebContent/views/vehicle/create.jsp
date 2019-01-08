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
						<form id="signUpForm" style="margin-top: 7%" action="<%=request.getContextPath() %>/user/createUser.do">
							<div class="form-group">
								<font id="firstNameError" style="color:red;display:none;">First name cannot be blank.</font>
								<input type="text" class="form-control" id="firstName" name="firstName"
									placeholder="First Name">
							</div>
							<div class="form-group">
								<font id="lastNameError" style="color:red;display:none;">Last name cannot be blank.</font>
								<input type="text" class="form-control" id="lastName" name="lastName"
									placeholder="Last Name">
							</div>
							<div class="form-group">
								<font id="emailError" style="color:red;display:none;">Email cannot be blank.</font>
								<input type="email" class="form-control" id="email" name="email"
									placeholder="Email Address">
							</div>
							<div class="form-group">
								<font id="passwordError" style="color:red;display:none;">Password cannot be blank.</font>
								<input type="password" class="form-control" id="password" name="password"
									placeholder="Password">
							</div>
							<div class="form-group">
								<font id="passwordError" style="color:red;display:none;">Re-enter Password cannot be blank.</font>
								<input type="password" class="form-control" id="reenterPassword"
									placeholder="Re-Enter password">
							</div>
							<div class="form-group">
								<font id="mobileNumberError" style="color:red;display:none;">Mobile number cannot be blank.</font>
								<input type="text" class="form-control" id="mobileNumber" name="mobileNumber"
									placeholder="Mobile Number">
							</div>
							<div class="form-group" style="text-align: left;">
								<font>Address Details</font>
							</div>
							<div class="form-group">
								<font id="streetError" style="color:red;display:none;">Street cannot be blank.</font>
								<input type="text" class="form-control" id="street" name="street"
									placeholder="Street">
							</div>
							<div class="form-group">
								<font id="cityError" style="color:red;display:none;">City cannot be blank.</font>
								<input type="text" class="form-control" id="city" name="city"
									placeholder="City">
							</div>
							<div class="form-group">
								<font id="stateError" style="color:red;display:none;">State cannot be blank.</font>
								<input type="text" class="form-control" id="state" name="state"
									placeholder="State">
							</div>
							<div class="form-group">
								<font id="pincodeError" style="color:red;display:none;">Pincode cannot be blank.</font>
								<input type="text" class="form-control" id="pincode" name="pincode"
									placeholder="Pincode">
							</div>
							<div class="row">
								<button type="button" class="btn btn-primary" onclick="validateForm();">Create Account</button>
								<button type="button" class="btn btn-default" data-dismiss="modal" style="margin-top: 6%;width: 100%;height: 43px;">Close</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>