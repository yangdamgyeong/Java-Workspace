<%@page import="kr.ac.kopo.board.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="kr.ac.kopo.board.service.BoardService" %>
<%@ page import="kr.ac.kopo.board.service.BoardServiceImpl" %>
<%
    BoardVO b01= new BoardVO(1, "제목이다", "홍길동", "2026-09-07");
    BoardVO b02= new BoardVO(2, "ㅋㅋㅋㅋ", "홍길순", "2026-09-07");
    BoardVO b03= new BoardVO(3, "배고프다", "홍길도", "2026-09-07");

    BoardVO[] list = {b01, b02, b03};
/*    
    http://localhost:8080/Mission-WEB/board/detail.jsp?no=3 요청이 오면, 
    
    1. 게시판번호 파리미터(no) 추출
    2. 번호에 해당하는 게시글 조회
    3. 조회된 게시글을 공유영역에 등록
*/

	String strNo = request.getParameter("no");

	if (strNo == null) {
	    response.sendRedirect("list.jsp");
	    return;
	}
    int boardNo = Integer.parseInt(strNo);
    //System.out.println("boardNo : "+ boardNo);
    
    BoardService boardService = new BoardServiceImpl();
    BoardVO board = boardService.getBoardByNo(boardNo);
    
    pageContext.setAttribute("board", board);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <div align="center">
     <hr>
     <h2>상세페이지</h2>
     <hr>
     <table border ="1" style="width: 80%;">
         <tr>
            <th style="width: 25%;">번호</th>
            <td>${ board.no }</td>
         </tr>
         <tr>
            <th style="width: 25%;">제목</th>
            <td>${ board.title }</td>
         </tr>
         <tr>
            <th style="width: 25%;">작성자</th>
            <td>${ board.writer }</td>
         </tr>
         <tr>
            <th style="width: 25%;">내용</th>
            <td>${ board.content }</td>
         </tr>
         <tr>
            <th style="width: 25%;">조회수</th>
            <td>${ board.viewCnt }</td>
         </tr>
         <tr>
            <th style="width: 25%;">등록일</th>
            <td>${ board.regDate }</td>
         </tr>
     </table>
    </div>
</body>
</html>