<%@page import="pkg.model.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
MemberVO vo = (MemberVO) request.getAttribute("vo");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
	<div align="center">
		<br> <br> <br> <br> <br> <br>
		<h2>회원 목록 보기</h2>
		<table border=1>
			<tr>
				<th>아이디</th>
				<td><%=vo.getId()%></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><%=vo.getName()%></td>
			</tr>
			<tr>
				<th>암호</th>
				<td><%=vo.getPwd()%></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><%=vo.getEmail()%></td>
			</tr>
		</table>
		<div class="practice1" align="center">
			<a href="<%=path%>/JoinController?id=<%=vo.getId()%>&sw=d" style="--clr: #ff1867"><span>삭제하기</span><i></i></a>
			<a href="<%=path%>/JoinController?sw=l"	style="--clr: #ff1867"><span>뒤로</span><i></i></a>
		</div>
		
	</div>
</body>
</html>