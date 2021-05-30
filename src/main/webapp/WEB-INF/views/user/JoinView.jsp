<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="${pageContext.request.contextPath }/resources/css/defaultCss/index.css"
	rel="stylesheet" type="text/css">
<meta charset="UTF-8">
<title>simple Join</title>
<%@ include file="../default/header.jsp"%>
<script src="${pageContext.request.contextPath }/resources/js/user.js"></script>
</head>
<body>
<div class="joinBox">
<form >
<input type="text" id="userName" placeholder="아이디를 입력하세요"><br><br>
<input type="password" id="password" placeholder="패스워드를 입력하세요"><br><br>
<button type="button" onclick="saveUser()">회원가입</button>
</form>
</div>
</body>
<%@ include file="../default/footer.jsp"%>
</html>