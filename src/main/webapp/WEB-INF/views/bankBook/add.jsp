<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			<h1>상품 등록 Page</h1>
			<form action="./add" method="post">
				
				<input type="text"  name="bookName" placeholder="제품명 입력">
				<input type="text" name="bookRate">
				<textarea rows="" cols="" name="bookDetail"></textarea>
				<input type="text" name="bookSale">
				<input type="submit" value="등록">
				<button type="button">등록</button>
			</form>
</body>
</html>