<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>상품수정 Update Page</h1>
		
		<form action="./update" method="post">
		 		<input type="text" name="bookName" value="${dto.bookName}" placeholder="제품명 입력">
				<input type="text" name="bookRate" value="${dto.bookRate}">
				<textarea rows="" cols="" name="bookDetail">${dto.bookDetail}</textarea>
				<input type="text" name="bookSale" value="${dto.bookSale}">
				<input type="submit" value="수정">
				<button type="button">수정</button>
			
		</form>
</body>
</html>