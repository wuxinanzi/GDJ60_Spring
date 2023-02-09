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
				<fieldset>
					<legend>상품명</legend>
					<input type="text"  name="bookName" placeholder="제품명 입력">
				</fieldset>
				<fieldset>
					<legend>이자율</legend>
					<input type="text" name="bookRate">
				</fieldset>
				<fieldset>
					<legend>상세정보</legend>
					<textarea rows="" cols="" name="bookDetail"></textarea>
				</fieldset>
				<fieldset>
					<legend>판매여부</legend>
					
					<label for="bs1">판매</label>
	 				<input id="bs1" type="radio" checked name="bookSale" value="1">
	 				
	 				<label for="bs2">판매중단</label>
					<input id="bs2" type="radio" name="bookSale" value="0">	
				</fieldset>
				<fieldset>
					<legend>판매여부</legend>
					<select name="bookSale">
						<option value="1">판매</option>
						<option selected value="0">판매중단</option>
					</select>
				</fieldset>
				<fieldset>
					<input type="submit" value="등록">
					<button type="button">등록</button>
				</fieldset>
			</form>
</body>
</html>