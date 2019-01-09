<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
form {
	text-align: left;
	width: 400px;
	height: 100px;
	padding-left: 38em;
}

td {
	width: 200px;
}

body {
	background-color: midnightblue;
	color: white;
	font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
}
</style>
</head>
<body>
	<form action="validate" >
		<fieldset>
			<legend>ShopDetails</legend>
			<table>
				<tr>
					<td>Shop Id :</td>
					<td><input type="text" name="shopId" /></td>
				</tr>
				<tr>
					<td>ShopName :</td>
					<td><input type="text" name="name" /></td>
				</tr>
					
				<tr>
					<td>Location :</td>
					<td><input type="text" name="location" /></td>
				</tr>
				<tr>
					<td>Mobile Number :</td>
					<td><input type="text" name="mobileNumber" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="SUBMIT" /></td>
				</tr>
			</table>
			</fieldset>
	</form>

</body>
</html>