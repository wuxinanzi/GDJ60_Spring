<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Product Add</h1>
	<div class="col-6">
		<form action="./productAdd" method="post">
			상품명 : 
			<input type="text" name="productName" value=""><br>
			
			상품정보:
			<textarea rows="3" cols="10"></textarea><br>
			
			
			전송버튼:
		    <button type="submit">전송</button>
		</form>
	
	</div>
</body>
</html>