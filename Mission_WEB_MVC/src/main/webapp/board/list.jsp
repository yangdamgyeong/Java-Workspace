<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	document.addEventListener('DOMContentLoaded', function() {
		
		let addBtn = document.querySelector('#addBtn')
		addBtn.addEventListener('click', function(){
			location.href = '/Mission-WEB-MVC/board/writeForm.do'
		})
	})
</script>
</head>
<body>
	<hr>
	<h2>전체게시글 조회</h2>
	<hr>
	<br>
	<table style="width:80; border: 1px solid black;">
		<tr>
			<th width="7%">번호</th>
			<th>제목</th>
			<th width="17%">글쓴이</th>
			<th width="20%">등록일</th>
		</tr>
		<tr>
		<c:forEach var="board" items="${ boardList }">
			<tr>
				<td>${ board.no }</td>
				<td>
					<a href="${ pageContext.request.contextPath }/board/detail.do?no=${ board.no }">
						<c:out value="${ board.title }"></c:out>
					</a>	
				</td>
				<td>${ board.title }</td>
				<td>${ board.writer }</td>
				<td>${ board.regDate }</td>
			</tr>
		</c:forEach>
		</tr>
	</table>
	<br>
	<button id="addBtn">새글등록</button>
</body>
</html>