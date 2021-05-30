<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-lite.min.js"></script>
<link rel="icon" type="image/png"
	href="${pageContext.request.contextPath }/resources/image/SimpleLogo(Black).png" />
<meta charset="UTF-8">
<link
	href="${pageContext.request.contextPath }/resources/css/defaultCss/header.css"
	rel="stylesheet" type="text/css">
<title>simple</title>

</head>
<body>

	<nav>
		<div class="wrap nav-wrap">
			<a href="${pageContext.request.contextPath }/"> <img
				height="110px"
				src="${pageContext.request.contextPath }/resources/image/SimpleLogo(Black).png">
			</a>
			<ul>
				<c:choose>
					<c:when test="${ResultUserName != null }">
						<li>로그인 ID : ${ResultUserName}</li>
						<li><a href="logout"> 로그아웃</a></li>
						<li><a href="BoardWrite"> 게시글 쓰기</a></li>
						<li><a href=""> 게시판</a></li>
						<li><a href=""> 채팅</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="loginView"> 로그인</a></li>
						<li><a href="joinView"> 회원가입</a></li>
						<li><a href=""> 게시판</a></li>
					</c:otherwise>

				</c:choose>


			</ul>





		</div>
	</nav>

</body>
</html>