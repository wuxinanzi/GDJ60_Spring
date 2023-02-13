<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>
<script src="${pageContext.request.contextPath}/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
<div class="container-fluid">
	<div class="row">
		<h1>Member Join</h1>
	</div>
	<div class="row">
		<form action=""></form>
	</div>
</div>

<div class="container">	
	<h2>로그인폼</h2>
	<form action="login.jsp" method="post">
		<div class="mb-3">
			<label class="form-label" for="id">아이디</label> 
			<input class="form-control" type="text" name="id" id="id" />
		</div>
		<div class="mb-3">
			<label class="form-label" for="pwd">비밀번호</label> 
			<input class="form-control" type="password" name="pwd" id="pwd" />
		</div>
		<button class="btn btn-outline-primary btn-sm" type="submit">로그인</button>
	</form>
	</div>
<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>
