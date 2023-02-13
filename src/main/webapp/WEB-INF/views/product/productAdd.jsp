<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="./template/common_css.jsp"></c:import>
<title>Insert title here</title>
</head>
<body>
	<h1>Product Add</h1>
	<div class="col-6">
		<form action="./productAdd" method="post">
			상품명 : 
			<input type="text" name="product_Name" value=""><br>
			
			상품정보:
			<textarea name="product_Detail" rows="" cols=""></textarea><br>
			
			
			전송버튼:
		    <button type="submit">등록</button>
		</form>
	
	</div>
</body>
</html>