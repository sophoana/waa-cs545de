<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculatrice</title>
</head>
<body>
<form method="post" action="calculate">
		<input type="text" name="add1" size="2" value="${calculator.add1 }" />+<input
			type="text" name="add2" size="2" value="${calculator.add2 }" /> =<input
			type="text" name="sum" size="2" value="${calculator.sum }" readonly /><br /> <input
			type="text" name="mult1" size="2" value="${calculator.mult1 }" />*<input
			type="text" name="mult2" size="2" value="${calculator.mult2 }" /> =<input
			type="text" name="product" size="2" value="${calculator.product }" readonly /><br /> <input
			type="submit" value="Submit" />
	</form>
</body>
</html>