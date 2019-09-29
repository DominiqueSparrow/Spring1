<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>

$(document).ready(
	function(){
		$("#searchButton").click(function(){
	  		console.log("Button clicked");
		})
	}

);

</script>


</head>
<body>
	
		<label for="name">First Name:</label> <input name="imie" /> <label
			for="name">Last Name:</label> <input name="nazwisko" />
			<button id="searchButton">Search</button>
			<div id="searchResults">
			
			</div>
	

</body>
</html>