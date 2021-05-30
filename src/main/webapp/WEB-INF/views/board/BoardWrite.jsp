<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Simple Board Write</title>
<link
	href="${pageContext.request.contextPath }/resources/css/defaultCss/index.css"
	rel="stylesheet" type="text/css">
<%@ include file="../default/header.jsp"%>
<script src="${pageContext.request.contextPath }/resources/js/board.js"></script>

</head>

<body>
	<div class="BoardBox">
	<div style="margin-left: 30px;margin-top: 30px;">
	<label style="font-weight: bold;">제목 : </label><input id="title" style="width: 400px; height: 40px; background-color: black;
	color: white;" type="text" placeholder="제목">
	
	<br><br>
	</div>
	 
		<div id="summernote"></div>
		


	</div>

</body>
<script
	src="${pageContext.request.contextPath }/resources/js/summernoteJS.js"></script>
<%@ include file="../default/footer.jsp"%>
</html>