<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.ac.kopo.board.vo.BoardVO" %>
<%@ page import="kr.ac.kopo.board.service.BoardService" %>
<%@ page import="kr.ac.kopo.board.service.BoardServiceImpl" %>
<%
  	// http://localhost:8080/Mission-WEB/board/write.jsp?title=안녕&writer=hong&content=안녕하세요 요청했습니다.
  	
  	/*
  		***작업순서***
  		1. 파라미터 추출(제목, 작성자, 내용)
  		2. 추출된 데이터를 DB 저장(t_board)
  		3. 전체게시글 조회 페이지(list.jsp) 이동
  	*/
%>
<% 
	//1. 파라미터 추출
	request.setCharacterEncoding("UTF-8");
	String title = request.getParameter("title");
	String writer = request.getParameter("writer");
	String content = request.getParameter("content");
	

	BoardVO newBoard = new BoardVO();
	newBoard.setTitle(title);
	newBoard.setWriter(writer);
	newBoard.setContent(content);
	
	//2. BoardVO 객체를 DB(t_board) 저장
	BoardService boardservice = new BoardServiceImpl();
	boardservice.addBoard(newBoard);
	
%>
<script type="text/javascript">
	alert('새글 등록이 완료되었습니다.')
	location.href = 'list.jsp' //3.전체 게시글 조회 페이지로 이동
</script>



