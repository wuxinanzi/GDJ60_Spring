<%@page import="com.iu.s1.product.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<c:import url="../template/common_css.jsp"></c:import>

<title>Insert title here</title>
<c:import url="./template/header_css.jsp"></c:import>
</head>
<body>
	 <h1>Product Detail Page</h1>
	 <% ProductDTO productDTO = (ProductDTO)request.getAttribute("dto"); %>
	 
	 
	 
	<%--  <h3><%= productDTO.getProductName() %></h3>
	 <h3><%= productDTO.getProductDetail() %></h3> --%>
	 
	 <hr>
	 <h3>${requestScope.dto.productName}</h3>
	 <h3>${dto.getProductDetail()}</h3>
	 <h3>${dto.productJumsu * 10}</h3>
	 
	 
	 
<c:import url="../template/common_js.jsp"></c:import>	 
</body>
</html>