
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Registration</title>
</head>
<body>

	<h1>Registration Form</h1>
	<br />

	<form:form commandName="student" action="registration" method="post">
		<form:errors path="*" element="div" cssClass="text-danger" />
		<table>

			<!--tr><td colspan="2"><form:errors path="*" cssStyle="color : red;"/></td></tr-->

			<tr>
				<td>Id :</td>
				<td><form:input path="id" /> <form:errors path="id"
						cssClass="text-danger"></form:errors></td>
			</tr>
			<tr>
				<td>FirstName :</td>
				<td><form:input path="firstName" /> <form:errors
						path="firstName" cssClass="text-danger"></form:errors></td>
			</tr>
			<tr>
				<td>LastName :</td>
				<td><form:input path="lastName" /> <form:errors
						path="lastName" cssClass="text-danger"></form:errors></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="email" /> <form:errors path="email"
						cssClass="text-danger"></form:errors></td>
			</tr>
			<tr>
			<%-- <fmt:formatDate value="${student.birthday}" pattern="MM/dd/yyyy" var="myDate" /> --%>
				<td>Birthday :</td>
				<td><form:input path="birthday" placeholder="MM/dd/yyyy" /> <form:errors
						path="birthday" cssClass="text-danger"></form:errors></td>
			</tr>
			<tr>
				<td>Phone :</td>
				<td>
					<form:input path="phone" />
					<form:errors path="phone" cssClass="text-danger"></form:errors>
				</td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><form:select path="gender">
						<form:option value="" label="Select Gender" />
						<form:option value="Male" label="Male" />
						<form:option value="Female" label="Female" />
					</form:select> <form:errors path="gender" cssClass="text-danger"></form:errors></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Save Changes" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>