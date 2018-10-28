
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculator</title>
</head>
<body>
	<c:if test="${errors != null}">

		<p id="errors">Error(s)!
		<ul>
			<c:forEach var="error" items="${errors}">
				<li>${error}</li>
			</c:forEach>
		</ul>


	</c:if>

	<form method="post" action="calculate">
		<input type="text" name="add1" size="2" value="${form.add1 }" />+<input
			type="text" name="add2" size="2" value="${form.add2 }" /> =<input
			type="text" name="sum" size="2" value="" readonly /><br /> <input
			type="text" name="mult1" size="2" value="${form.mult1 }" />*<input
			type="text" name="mult2" size="2" value="${form.mult2 }" /> =<input
			type="text" name="product" size="2" value="" readonly /><br /> <input
			type="submit" value="Submit" />
	</form>
</body>
</html>