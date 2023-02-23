<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/common_css.jsp"></c:import>
<style>
    .redResult{
        color: red;
    }
    
    .blueResult{
        color: blue;
    }
</style>
</head>
<body>
<c:import url="../template/header.jsp"></c:import>
<div class="container-fluid my-5">
      
    <div class="row justify-content-center">
		<h1 class="col-md-6 text-center fw-bold">MemberJoin Page</h1>
	</div>
				
				
			<div class="row justify-content-center">
					<form class="col-md-6" id="frm" action="./memberAdd" method="post">
				
					
					<div class="mb-3">
                        <label for="id" class="form-label fw-bold">id</label>
                        <input type="text" name="id" class="form-control" id="id" placeholder="ID를 입력해 주세요">
                        <div id="idResult" class="redResult"></div>
                    </div>
                   
                    <div class="mb-3">
                        <label for="pw">pw</label>
                        <input type="password" name="pw" class="form-control" id="pw" placeholder="비밀번호를 입력해주세요">
                        <div id="pwResult" class="redResult"></div>
                        
                    </div>

                    <div class="mb-3">
                        <label for="pwCheck">pw</label>
                        <input type="password" name="pw" class="form-control" id="pwCheck" placeholder="비밀번호를 입력해주세요">
                        <div id="pwCheckResult" class="redResult"></div>
                    </div>
                 
                    <div class="mb-3">
                        <label for="na">성함</label>
                        <input type="name" name="name" class="form-control" id="na" placeholder="성함을 입력해 주세요">
                        <div id="naResult" class="redResult"></div>
                    </div>

                    <div class="mb-3">
                        <label for="ph">phone</label>
                        <input type="tel" name="phone" class="form-control" id="ph" placeholder="휴대폰번호를 입력해 주세요">
                        <div id="phResult" class="redResult"></div>
                    </div>
                    
                    <div class="mb-3">
                        <label for="em">email</label>
                        <input type="email" name="email" class="form-control" id="em" placeholder="이메일 주소를 입력해주세요">
                        <div id="emResult" class="redResult"></div>
                    </div>

                     <div class="mb-3">
                        <label for="ad">주소</label>
                        <input type="address" name="address" class="form-control" id="ad" placeholder="주소를 입력해 주세요">
                        <div id="adResult" class="redResult"></div>    
                    </div>
                    
                    
              
                   
					<div class="mb-3">
							<button class="btn btn-outline-success fw-bold" id="btn" type="button">등록</button> 
					</div>
                    </form>
		    </div>
				
</div>
<script type="text/javascript" src='/resources/js/memberAdd.js'></script>
<c:import url="../template/common_js.jsp"></c:import>
</body>
</html>