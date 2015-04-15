
function validate(e){
	
	if( this.guest.value.length == 0){
		
		var messages = document.getElementsByClassName("error-message");
		
		messages[ 0 ].style.display = "block";
		
		e.preventDefault();
		
	}
	
}

document.getElementById("form-name").addEventListener("submit", validate);
