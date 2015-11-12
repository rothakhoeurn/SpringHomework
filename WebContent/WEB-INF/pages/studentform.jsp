<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="mvc" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>${welcome}</h2>
	<table border="1" width="100%">
		<tr>
			<th>ID</th>
			<th>Username</th>
			<th>Email</th>
			<th>Password</th>
			<th>Birthdate</th>
			<th>Registerdate</th>
			<th>Image</th>
			<th>Action</th>
		</tr>
		<mvc:forEach var="list" items="${list}">
			<tr>
				<td><mvc:out value="${list.id}" /></td>
				<td><mvc:out value="${list.username}" /></td>
				<td><mvc:out value="${list.email}" /></td>
				<td><mvc:out value="${list.password}" /></td>
				<td><mvc:out value="${list.birthdate}" /></td>
				<td><mvc:out value="${list.registerdate}" /></td>
				<td><mvc:out value="${list.image}" /></td>
				<td>
					<a href="${pageContext.request.contextPath}/update-${list.id}">Update</a>
					<a href="${pageContext.request.contextPath}/delete-${list.id}">Delete</a>
				</td>
			</tr>
			</mvc:forEach>
	</table>
</body>
</html>