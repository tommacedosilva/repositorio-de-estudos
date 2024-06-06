<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Luv2Code Home Page</title>
</head>
<body>
	<h2>Luv2Code Home Page</h2>
	<hr>
	
	<p>
	Welcome to the Luv2code Home Page!
	</p>
	
	<!-- Adc botão logout -->
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="Logout" />
	</form:form>
	
</body>
</html>