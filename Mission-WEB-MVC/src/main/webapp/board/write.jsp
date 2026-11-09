<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	화면에 '새글등록을 완료하였습니다' 메시지를 띄운 후 전체게시글 조회 페이지로 이동
--%>
<script>
	alert('새글등록을 완료하였습니다')
	location.href = '${pageContext.request.contextPath}/board/list.do''
</script>