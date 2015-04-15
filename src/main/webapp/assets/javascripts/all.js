
function toggleErrorMessages( show ){
	
	$(".error-message").toggle( show );
	
}

function validate(e){
	
	if( this.guest.value.length == 0){
		
		toggleErrorMessages( true );
		
		e.preventDefault();
		
	}
	
}


function validateOperands(e){
	
	var matches = this.value.match(/^([0-9]+( )?)+$/g);
	
	toggleErrorMessages( matches == null );
	
	$("#submit").toggle( matches != null ); 
	
}

$(function() {
	
	$("#form-name").on("submit", validate);
	$("#form-field-operands").on("keypress", validateOperands);
	
});
