<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../resources/styles/board/get.css">

</head>
<body>

	<h1>조회 페이지</h1>
	
		<div class="input_wrap">
			<label>게시판 번호</label>
			<input name="bno" readonly="readonly" value='<c:out value="${pageInfo.bno}"/>' >
		</div>
		
		<div class="input_wrap">
			<label>게시판 제목</label>
			<input name="title" readonly="readonly" value='<c:out value="${pageInfo.title}"/>' >
		</div>
		
		<div class="input_wrap">
			<label>게시판 내용</label>
			<textarea rows="3" name="content" readonly="readonly"><c:out value="${pageInfo.content}"/></textarea>
		</div>
		
		<div class="input_wrap">
			<label>게시판 작성자</label>
			<input name="writer" readonly="readonly" value='<c:out value="${pageInfo.writer}"/>' >
		</div>
		
		<div class="input_wrap">
			<label>게시판 등록일</label>
			<input name="regdater" readonly="readonly" value='<fmt:formatDate pattern="yyyy/MM/dd" value="${pageInfo.regdate}"/>' >
		</div>
		
		<div class="input_wrap">
			<label>게시판 수정일</label>
			<input name="updateDate" readonly="readonly" value='<fmt:formatDate pattern="yyyy/MM/dd" value="${pageInfo.updateDate}"/>' >
		</div>	
			
		<div class="btn_wrap">
			<a class="btn" id="list_btn">목록 페이지</a> 
			<a class="btn" id="modify_btn">수정 하기</a>
		</div>
		
		<form id="infoForm" action="/board/modify" method="get">
			<input type="hidden" id="bno" name="bno" value='<c:out value="${pageInfo.bno}"/>'>
		</form>
		
</body>
	<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
	<script src="../resources/scripts/get.js"></script>

</html>