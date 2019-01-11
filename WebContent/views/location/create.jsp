<div class="modal fade" id="branchModal" role="dialog">
	<div class="modal-dialog">
		<div class="modal-body">
			<div class="container">
				<div class="login-form" style="margin-top: 5%;">
					<div class="main-div">
						<div class="panel" style="margin-bottom: 0px !important;">
							<h2
								style="font-family: auto; font-size: 40px; font-weight: bolder; color: #6b556c;">Add Branch</h2>
						</div>
						<form id="Login" style="margin-top: 7%" action="<%=request.getContextPath()%>/location/save.do" method="post">
							<div class="form-group">
								<input type="text" class="form-control" id="state"
									placeholder="State name" name="state" required>
							</div>
							<div class="form-group" style="margin-top: 6%;">
								<input type="text" class="form-control" id="district"
									placeholder="District name" name="district" required>
							</div>
							<input type="submit" class="btn btn-primary" id="create-branch" value="Add Branch"/>
							<div class="row">
								<button type="button" class="btn btn-default" data-dismiss="modal" style="margin-top: 6%;width: 91%;height: 43px;">Close</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>