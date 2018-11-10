<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Starbuck's</title>
</head>
<body>
	<form method="get" action="advice">
		Starbuck's
		<c:out value="${roast}" />
		Roast Coffees:
		<table>
			<c:forEach var="advice" items="${advices}">
				<tr>
					<td>${advice}</td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" value="Back"> <input type="hidden"
			name="roast" value="">
	</form>
</body>
</html>
