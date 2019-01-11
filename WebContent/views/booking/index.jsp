<%@page import="com.zoyocarz.pojo.*" %>
<%@page import="com.zoyocarz.domain.*" %>
<%@page import="java.util.*" %>
<%! @SuppressWarnings("unchecked") %>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>ZoyoCarz</title>
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/user.css">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/css/booking.css">
		<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
		<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
		<script src="<%=request.getContextPath()%>/js/script.js"></script>
	</head>
	<body style="background-image:url('<%=request.getContextPath()%>/images/background.jpg');">
		<%
			SessionEntity sessionEntity = (SessionEntity)session.getAttribute("sessionEntity");
			User userIns = null;
			if(sessionEntity != null) {
				userIns = sessionEntity.getUserIns();
			}
			HashMap<String,Object> modelMap = (HashMap<String,Object>)request.getAttribute("modelMap");
			List<State> stateList = (List<State>)modelMap.get("stateList");
			List<District> districtList = (List<District>)modelMap.get("districtList");
		%>
		<nav class="navbar navbar-default transparent">
		     <font style="font-size: 35px;font-family: initial;font-style: italic;color: #ffffff;font-weight: bolder;">
		      	Zoyo Carz
		     </font>
		     <div style=" float:right;margin-right:-5%;margin-top:1%;width:45% ">
		     	<%if(userIns != null && userIns.getRole().equalsIgnoreCase("admin")){ %>
			     	<a style="cursor: pointer;color: #ffffff;font-weight: bolder;" onclick="loadPage('<%=request.getContextPath()%>/vehicle/create.do','modalDiv','vehicleModal')">
		          		<span style="font-size:20px;"class="glyphicon glyphicon-plus"></span>&nbsp;Add Vehicle
		       		</a>
		        	<a style="margin-left:2%;cursor: pointer;color: #ffffff;font-weight: bolder;" onclick="loadPage('<%=request.getContextPath()%>/location/create.do','modalDiv','branchModal')">
		          		<span style="font-size:20px;"class="glyphicon glyphicon-plus"></span>&nbsp;Add Branch
		        	</a>
	        	<%} %>
	        	<%if(sessionEntity == null){ %>
		        	<button class="btn btn-warning btn-inverse-warning" style="margin-left:2%;border-radius:0px; width: 23%;" onclick="loadPage('<%=request.getContextPath() %>/user/index.do','modalDiv','loginModal')">
		          		Login
		       		</button>
		        	<button class="btn btn-success btn-inverse-success" style="margin-left:2%;border-radius:0px; width: 23%;" onClick="loadPage('<%=request.getContextPath() %>/user/signUp.do','modalDiv','signUpModal')">
		          		SignUp
		        	</button>
	        	<%} else{%>
		        		<button type="submit" class="btn btn-warning btn-inverse-warning" style="margin-left:2%;border-radius:0px; width: 23%;" onclick="logout('<%=request.getContextPath() %>/user/logout.do','logoutForm')">
			          		Logout
			       		</button>
		       	<%} %>	
       		</div>
	    </nav>
	    <div class="container-fluid">
		    <div class="col-lg-12 col-sm-12 col-xs-12 col-md-12">
			    <div class="row">
			    	<div class="col-xs-3 col-md-3 col-sm-3 col-lg-3"></div>
			    	<div class="col-xs-8 col-md-8 col-sm-8 col-lg-8">
				    	<div class="col-lg-12 col-sm-12 col-xs-12 col-md-12">
				    		<div class="form-group col-xs-4 col-md-4 col-sm-4 col-lg-4">
				    			<label>Select State:</label><select class="form-control" id="state" name="state">
				    				<option>Select</option>
				    				<%if(stateList != null && stateList.size() > 0){
				    					for(State state: stateList){%>
				    						<option value=<%=state.getId() %>><%=state.getName() %></option>
			    					<%	}
			    					} %>
				    			</select>
				    		</div>
				    		<div class="form-group col-xs-4 col-md-4 col-sm-4 col-lg-4">
				    			<label>Select District:</label><select class="form-control" id="district" name="district">
				    				<option>Select</option>
				    				<%if(districtList != null && districtList.size() > 0){
				    					for(District district: districtList){%>
				    						<option value=<%=district.getId() %>><%=district.getName() %></option>
			    					<%	}
			    					} %>
				    			</select>
				    		</div>
				    		<div class="form-group col-xs-4 col-md-4 col-sm-4 col-lg-4">
				    			<button class="btn btn-inverse-info btn-info" id="search">Search Vehicles</button>
				    		</div>
				    	</div>
			    	</div>
			    </div>
		    </div>
	    </div>
	    <div id="modalDiv"></div>
	    <form id="logoutForm"></form>
	</body>
</html>