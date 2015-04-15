
function toggleErrorMessages( show ){
	
	var messages = document.getElementsByClassName("error-message");
	
	for( var i = 0; i < messages.length; i++ ){
		
		messages[ i ].style.display = show ? "block" : "none";
		
	}
	
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
	
	document.getElementById("submit").style.display = matches == null ? "none" : "block"; 
	
}

var formName = document.getElementById("form-name");
if( formName ) formName.addEventListener("submit", validate);

var formFieldOperands = document.getElementById("form-field-operands");
if( formFieldOperands ) formFieldOperands.addEventListener("keypress", validateOperands);
