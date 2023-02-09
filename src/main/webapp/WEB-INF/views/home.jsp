<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="./resources/css/main.css">
</head>
<body>
<h1>
	Hello world!  
</h1>


<a href="/product/list" class="menu">ProductList</a>
<a href="/member/login" class="menu">MemberLogin</a>
<a href="/member/page" class="menu">MemberPage</a>
<a href="/bankBook/list" class="menu">BankBookList</a>
<a href="./bankBook/list" class="menu">BankBookList</a>

<img alt="그냥 아파트1" src="/resources/images/a.jpg">
<img alt="강가의 아파트" src="./resources/images/abc.jpg">

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
