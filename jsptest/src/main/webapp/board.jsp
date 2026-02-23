<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board.jsp</title>
</head>
<body>

	<div id="wrap">
		<jsp:include page="menu.jsp"/>
		
		<main id="main">
			<p>여기는 게시판이다.</p>
			<div id="listWrap">
				<a href="/board/write.do">글쓰기</a>
				
				<table id="boardList">
					<tr>
						<td> <a href="/board/detail.do">나는 글제목</a>  </td>
					</tr>
				</table>
			</div>
		</main>
	
	</div>

</body>
</html>