function loadPage(url,div,modal) {
	$.ajax({
		url: url,
		cache: true,
		success:function(html) {
			$("#"+div).html(html);
			$("#"+modal).modal("show");
		}
	});
}

function validateForm() {
	var flag = 0;
	var firstName = document.getElementById("firstName");
	var lastName = document.getElementById("lastName");
	var email = document.getElementById("email");
	var password = document.getElementById("password");
	var mobileNumber = document.getElementById("mobileNumber");
	var street = document.getElementById("street");
	var city = document.getElementById("city");
	var state = document.getElementById("state");
	var pincode = document.getElementById("pincode");
	var reenterPassword = document.getElementById("reenterPassword");
	if(firstName.value === undefined || firstName.value.trim() === '') {
		flag = 1;
		document.getElementById("firstNameError").style.display = "block";
	} 
	if(lastName.value === undefined || lastName.value.trim() === '') {
		flag = 1;
		document.getElementById("lastNameError").style.display = "block";
	} 
	if(email.value === undefined || email.value.trim() === '') {
		flag = 1;
		document.getElementById("emailError").style.display = "block";
	} 
	if(password.value === undefined || password.value.trim() === '') {
		flag = 1;
		document.getElementById("passwordError").style.display = "block";
	} 
	if(mobileNumber.value === undefined || mobileNumber.value.trim() === '') {
		flag = 1;
		document.getElementById("mobileNumberError").style.display = "block";
	}
	if(street.value === undefined || street.value.trim() === '') {
		flag = 1;
		document.getElementById("streetError").style.display = "block";
	} 
	if(city.value === undefined || city.value.trim() === '') {
		flag = 1;
		document.getElementById("cityError").style.display = "block";
	} 
	if(state.value === undefined || state.value.trim() === '') {
		flag = 1;
		document.getElementById("stateError").style.display = "block";
	}
	if(pincode.value === undefined || pincode.value.trim() === '') {
		flag = 1;
		document.getElementById("pincodeError").style.display = "block";
	}
	if(flag == 0 && password.value != reenterPassword.value) {
		flag = 1;
		document.getElementById("passwordError").innerHTML = "Password and re-enter password doesn't match."
		document.getElementById("passwordError").style.display = "block";
	}
	if(flag === 0) {
		$("#signUpForm").submit();
	}
}