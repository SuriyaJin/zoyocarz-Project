<%@page import="com.zoyocarz.domain.District"%>
<%@page import="java.util.List" %>
<%! @SuppressWarnings("unchecked") %>
<%
	List<District> districtList = (List<District>)request.getAttribute("districtList");
%>
<div class="modal fade" id="vehicleModal" role="dialog">
	<div class="modal-dialog">
		<div class="modal-body">
			<div class="container">
				<div class="login-form" style="width: 104%;">
					<div class="main-div">
						<div class="panel" style="margin-bottom: 0px !important;">
							<h2
								style="font-family: auto; font-size: 40px; font-weight: bolder; color: #6b556c;">Create Vehicle</h2>
						</div>
						<form id="vehicleForm" style="margin-top: 7%" action="<%=request.getContextPath() %>/vehicle/save.do" method="post" enctype="multipart/form-data">
							<div class="form-group">
								<input type="text" class="form-control" id="name" name="name"
									placeholder="Vehicle Name" required>
							</div>
							<div class="form-group">
								<input type="text" class="form-control" id="vehicleNo" name="vehicleNo"
									placeholder="Vehicle No" required>
							</div>
							<div class="form-group">
								<input type="text" class="form-control" id="pricePerKm" name="pricePerKm"
									placeholder="Price Per Km" required>
							</div>
							<div class="form-group">
								<select class="form-control" id="districtId" name="districtId">
									<option value="select">Select</option>
									<%
										if(districtList.size() > 0) {
											for(District district:districtList) 
											{
									%>
									<option value="<%=district.getId() %>"><%=district.getName() %></option>
									<%		
											}
										}
									%>
								</select>
							</div>
							<div class="form-group">
								<label style="text-align:left;">Upload Picture:</label><input type="file" class="form-control" id="vehicleImage" name="vehicleImage" required>
							</div>
							<button type="submit" class="btn btn-primary">Save Vehicle</button>
							<button type="button" class="btn btn-default" data-dismiss="modal" style="margin-top: 6%;width: 100%;height: 43px;">Close</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>