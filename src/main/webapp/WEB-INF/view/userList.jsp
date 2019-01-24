<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1px">
		<tr>
			<td>Id</td>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Email</td>
			<td>Address</td>
			<td>Contact Number</td>
			<td>Gender</td>
			<td>Profile</td>
		</tr>
		<c:forEach items="${list }" var="u">
			<tr>
			<c:url value="/user/update" var="editUrl">
				<c:param name="id" value="${u.id }"></c:param>
			</c:url>
			<c:url var="deleteUrl" value="/user/delete/${u.id }">
			</c:url>
				<td><c:out value="${u.id }"></c:out></td>
				<td><c:out value="${u.firstName }"></c:out></td>
				<td><c:out value="${u.lastName }"></c:out></td>
				<td><c:out value="${u.email }"></c:out></td>
				<td><c:out value="${u.address }"></c:out></td>
				<td><c:out value="${u.mobile }"></c:out></td>
				<td><c:out value="${u.gender }"></c:out></td>
				<td><img width="100" height="100" src="data:image/png;base64,${ u.profile}" /></td>
				<td><a href="${editUrl }">EDIT</a></td>
				<td><a href="${deleteUrl }">DELETE</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>