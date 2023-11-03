<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
System.out.println("경로:" + path);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css">
</head>
<body>
	<div class="practice1" align="center">
		<br> <br> <br> <br> <br> <br>
		<h1>시작페이지</h1>
		<a href="<%=path%>/member/member_form.jsp" style="--clr: #1e9bff"><span>회원가입</span><i></i></a> 
		<a href="<%=path%>/JoinController?sw=l"	style="--clr: #ff1867"><span>회원목록</span><i></i></a>
	</div>
</body>
</html>