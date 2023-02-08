<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Detail Page</h1>
		<c:if test="${not empty dto}">
		<h3>번호 : ${dto.bookNumber}</h3>
		<h3>이름 : ${dto.bookName}</h3>
		<h3>이자율 : ${dto.bookRate}</h3>
		<h3>판매량 : ${dto.bookSale}</h3>
		<h3>상세내용 : ${dto.bookDetail}</h3>
		<a href="./delete?bookNumber=${dto.bookNumber}">상품삭제</a>
		</c:if>
		
		
		<c:if test="${empty dto}">
				<h3>존재하지 않는 상품입니다.</h3>		
	    </c:if>
	    <a href="./update?bookNumber=${dto.bookNumber}">상품수정</a>
	    <a href="./list">목록으로</a>
</body>
</html>