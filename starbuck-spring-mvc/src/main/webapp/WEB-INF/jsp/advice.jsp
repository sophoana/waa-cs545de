<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Starbuck's</title>
</head>
<body>
	<h2>Ask for advice about your favorite roast:</h2>
	<p />
	<form method="get" action="advice">
		<select name="roast">
			<option value="">--Choose Roast--</option>
			<option value="dark">Dark</option>
			<option value="medium">Medium</option>
			<option value="light">Light</option>
		</select> <br /> <br /> <input type="submit" value="Submit" />
	</form>

</body>
</html>