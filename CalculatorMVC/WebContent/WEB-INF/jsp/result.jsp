<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result</title>
</head>
<body>
	<form method="post" action="calculate">
		<input type="text" name="add1" size="2"
			value="<c:out value="${add1}"></c:out>" /> +<input type="text"
			name="add2" size="2" value="<c:out value="${add2}"></c:out>" /> =<input
			type="text" name="sum" size="2"
			value="<c:out value="${sum}"></c:out>" readonly /><br /> <input
			type="text" name="mult1" size="2"
			value="<c:out value="${mult1}"></c:out>" /> *<input type="text"
			name="mult2" size="2" value="<c:out value="${mult2}"></c:out>" /> =<input
			type="text" name="product" size="2"
			value="<c:out value="${product}"></c:out>" readonly /><br /> <input
			type="submit" value="Submit" />
	</form>
</body>
</html>
