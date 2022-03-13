<%@ page isELIgnored="false" language="java" contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="ProductInsert" method="post" modelAttribute="product">
		<table align="center">

			<tr bgcolor="gray">
				<td colspan="2">
					<center>Product Info</center>
				</td>
			</tr>
			<tr>
				<td><label>ProductId</label></td>
				<td><input type="text" name="productId" /></td>
			</tr>
			<tr>
				<td><label>Product Name</label></td>
				<td><input type="text" name="productName" /></td>
			</tr>
			<tr>
				<td><label>Product Desc</label></td>
				<td><input type="text" name="productDesc" /></td>
			</tr>
			<tr>
				<td><label>Price</label></td>
				<td><input type="text" name="price" /></td>
			</tr>
			<tr bgcolor="gray">
				<td colspan="2"><input type="submit" value="Product Insert" /></td>
			</tr>
		</table>
	</form>


<table>
	<tr>
		<td> Product Id</td>
		<td> Product Name</td>
		<td> Product Desc</td>
		<td> Price</td>
	</tr>
	<c:forEach items="${products}" var="product">
	<tr>
		<td>${product.productId}</td>
		<td>${product.productName}</td>
		<td>${product.productDesc}</td>
		<td>${product.price}</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>