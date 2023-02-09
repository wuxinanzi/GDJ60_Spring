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
				
				<input type="hidden" name="bookNumber" value="${dto.bookNumber}">
				
				<fieldset>
					<legend>상품명</legend>
		 			<input type="text" name="bookName" value="${dto.bookName}" placeholder="제품명 입력">
		 		</fieldset>
		 		<fieldset>
		 			<legend>이자율</legend>
					<input type="text" name="bookRate" value="${dto.bookRate}">
				</fieldset>
				<fieldset>
					<legend>상세정보</legend>
					<textarea rows="" cols="" name="bookDetail">${dto.bookDetail}</textarea>
				</fieldset>
				<fieldset>
					<legend>판매여부</legend>
						
						<label for="bs1">판매</label>
						<input id="bs1" type="radio" ${dto.bookSale eq '1' ? 'checked':''} name="bookSale" value="${dto.bookSale}">
						
						<label for="bs2">판매중단</label>
						<input id="bs2" type="radio" ${dto.bookSale eq '0' ? 'checked':''} name="bookSale" value="0">	
						<!-- <option selected value="0">판매중단</option> -->
					
				</fieldset>
				<fieldset>
					<legend>판매여부</legend>
					<select name="bookSale">
						<option value="1">판매</option>
						<option selected value="0">판매중단</option>
					</select>
				</fieldset>
				<fieldset>
					
					<input type="submit" value="수정">
					<button type="button">수정</button>
				</fieldset>
			
		</form>
</body>
</html>