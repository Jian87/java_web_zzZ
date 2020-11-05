/**
 * 
 */

$(document).ready(function(){
	$(".search-btn").click(function(e){
		var content = $(this).parent.find("#search").val();
		alert(content);
	});
});

