<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@ page import="pkg.service.*"%>
<%@ page import="pkg.model.*"%>

<%
@SuppressWarnings("unchecked")
List<MemberVO> li = (List<MemberVO>) request.getAttribute("li");

String path = request.getContextPath();
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
				<th>이름</th>
				<th>암호</th>
				<th>이메일</th>
			</tr>
			<%
			for (MemberVO vo : li) {
			%>
			<tr>
				<td><%=vo.getId()%></td>
				<td><a href="<%=path%>/JoinController?id=<%=vo.getId()%>&sw=e">
						<%=vo.getName()%></a></td>
				<td><%=vo.getPwd()%></td>
				<td><%=vo.getEmail()%></td>
			</tr>
			<%
			}
			%>
		</table>
	</div>
	<div class="practice1" align="center">
		<a href="<%=path%>/index.jsp" style="--clr: #1e9bff"><span>홈으로</span><i></i></a>
	</div>
</body>
</html>