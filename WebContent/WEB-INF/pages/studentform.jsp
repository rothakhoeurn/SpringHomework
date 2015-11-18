<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="mvc" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>${welcome}</h2>
		<nav>
			<ul class="pagination">
				<li><a href="#" aria-label="Previous"> <span
						aria-hidden="true">&laquo;</span>
				</a></li>
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">5</a></li>
				<li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span>
				</a></li>
			</ul>
		</nav>
		<%-- <table border="1" class="table table-striped table-hover">
			<tr class="active">
				<td><input type="submit" id="btnSubmit" value="${pageContext.request.contextPath}/add"/></td>
			</tr>
			<tr class="active">
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
				<tr class="active">
					<td><mvc:out value="${list.id}" /></td>
					<td><mvc:out value="${list.username}" /></td>
					<td><mvc:out value="${list.email}" /></td>
					<td><mvc:out value="${list.password}" /></td>
					<td><mvc:out value="${list.birthdate}" /></td>
					<td><mvc:out value="${list.registerdate}" /></td>
					<td><mvc:out value="${list.image}" /></td>
					<td><a href="${pageContext.request.contextPath}/update-${list.id}">Update</a>
						<a href="${pageContext.request.contextPath}/delete-${list.id}">Delete</a>
					</td>
				</tr>
			</mvc:forEach>
		</table> --%>
	</div>
	<!-- script references -->
	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>
</body>
</html>