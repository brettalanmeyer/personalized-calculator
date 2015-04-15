<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="name" value="${sessionScope.guest}" />
<!doctype html>
<html>

	<head>
		
		<title>${name}&#39;s Personalized Calculator</title>
		<meta charset="utf-8" />
		<link rel="stylesheet" type="text/css" href="/assets/stylesheets/all.css">
	
	<body>
	
		<h1>Hi, ${name}</h1>
		
		<form method="GET" action="/calculator">
		
			<div class="form-group">
			
				<label for="form-field-operand">What would you like to do?</label>
				<select id="form-field-operand" name="operation">
					
					<option value="1">Add</option>
					<option value="2">Subtract</option>
					<option value="3">Multiply</option>
					<option value="4">Divide</option>
					<option value="5">Factorial</option>
					
				</select>
				
			</div>
			
			<div class="form-group">
			
				<label for="form-field-operands">Please enter some numbers (separated by spaces)</label>
				<input type="text" id="form-field-operands" name="operands" required />
				
			</div>
			
			<div class="form-group error-message">
				Please enter valid numbers
			</div>
			
			<div id="submit" class="form-group" style="display: none;">
				<button type="submit">Calculate</button>
			</div>
		
		</form>
		
		<div class="form-group">
			${requestScope.resultText}
		</div>
		
		<a href="/logout">Log Out</a>
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
		<script src="/assets/javascripts/all.js"></script>
		
	</body>
	
</html>