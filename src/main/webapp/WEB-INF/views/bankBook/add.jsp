<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>


</head>
<body>
 <c:import url="../template/header.jsp"></c:import>   
	
	<div class="containt-md-7">
			
			<h1 class="col-md-7 mx-auto text-center text-success my-5">상품 등록 Page</h1>
			
			<form action="./add" method="post">
			
				<fieldset>
					<legend class="col-md-2 mx-auto text-center border boder-bottom border-dark text-danger">상품명</legend>
					<input  class="col-md-10 mx-auto text-center border boder-bottom border-red pb-6 " type="text"  name="bookName" placeholder="제품명 입력">
				</fieldset>
				<fieldset>
					<legend class="col-md-2 mx-auto text-center border boder-bottom border-tob pb-3">이자율</legend>
					<input class="col-md-10 mx-auto text-center border boder-bottom border-tob pb-3" type="text" name="bookRate" placeholder="이자율 입력">
				</fieldset>
				<fieldset>
					<legend class="col-md-2 mx-auto text-center border boder-bottom border-red pb-6">상세설명</legend>
					<textarea class="col-md-10 mx-auto text-center border boder-bottom border-red pb-6" rows="" cols="" name="bookDetail" placeholder="상세정보 입력"></textarea>
				</fieldset>
				<fieldset>
					<legend class="col-md-2 mx-auto text-center border boder-bottom border-red pb-6">판매여부</legend>
					
					<label class="col-md-2 mx-auto text-center border boder-bottom border-red pb-6" for="bs1">판매</label>
	 				<input id="bs1" type="radio" checked name="bookSale" value="1">
	 				
	 				<label class="col-md-2 mx-auto text-center border boder-bottom border-red pb-6" for="bs2">판매중단</label>
					<input id="bs2" type="radio" name="bookSale" value="0">	
				</fieldset>
				<fieldset>
					<legend class="col-md-2 mx-auto text-center border boder-bottom border-red pb-6">판매여부</legend>
					<select name="bookSale">
						<option value="1">판매</option>
						<option selected value="0">판매중단</option>
					</select>
				</fieldset>
				<fieldset>
				
					<input  class="btn btn-success btn btn-warning center " type="submit"  value="등록">
					<div align="right">
					<button type="submit" class="btn btn-dark btn btn-warning">등록</button>
					</div>			
				</fieldset>
			</form>
		
		<c:import url="../template/common_js.jsp"></c:import>
		</div>
</body>
</html>