<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>View Shops</title>
	<style>
		table{
			margin-left:350px;
			width: 50%;
			cellpadding: 2;
			border: 2px solid black;
			color:white;
		}
	</style>
</head>
<body style="background-color:midnightblue">

	<h1>Shops List</h1>
	<table border="2">
		<tr>
			<th>Id</th><th>ShopName</th><th>Location</th><th>MOBILE NUMBER</th>
		</tr>
		
		<c:forEach var="u" items="${list1}">
			<tr>
				<td>${u.shopId}</td>
				<td>${u.name}</td>
				<td>${u.location}</td>
				<td>${u.mobileNumber}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>