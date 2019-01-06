function loadPage(url) {
	$.ajax({
		url: url,
		cache: true,
		success:function(html) {
			$("#signUpDiv").html(html);
			$("#signUpModal").modal("show");
		}
	});
}