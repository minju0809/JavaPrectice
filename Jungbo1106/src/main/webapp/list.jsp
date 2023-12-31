<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="pkg.JungVO"%>
<%@ page import="java.util.*"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/style.css" rel="stylesheet" type="text/css">

</head>
<body>
	<header> (과정평가형 정보처리기능사) 성적조회 프로그램 Ver 1.0 </header>
	<nav>
		&emsp;<a href="JungboController?sw=F">성적입력</a> &emsp;<a
			href="JungboController?sw=S">성적조회</a> &emsp;<a href="index.jsp">홈으로</a>
	</nav>
	<%
	List<JungVO> li = (List<JungVO>) request.getAttribute("li");
	%>
	<section>
		<br>
		<div align=center>
			<h2>성적조회목록</h2>
		</div>
		<div align=center>
			<table border=1 width=80%>
				<tbody align=center>
					<tr>
						<th>학년</th>
						<th>반</th>
						<th>번호</th>
						<th>성명</th>
						<th>국어</th>
						<th>영어</th>
						<th>수학</th>
						<th>역사</th>
						<th>총점</th>
						<th>평균</th>
					</tr>
					<%
					for (JungVO m : li) {
						String sNo = m.getsNo();
						String sName = m.getsName();
						int kor = m.getKor();
						int eng = m.getEng();
						int math = m.getMath();
						int hist = m.getHist();
						int sum = m.getKor() + m.getEng() + m.getMath() + m.getHist();
						double avg = (double) sum / 4;
					%>
					<tr>
						<td><%=sNo.substring(0, 1)%></td>
						<td><%=sNo.length() >= 3 ? sNo.substring(1, 3) : ""%></td>
						<td><%=sNo.length() >= 3 ? sNo.substring(3, 5) : ""%></td>
						<td><a style='color: green'
							href="JungboController?sw=E&sNo=<%=sNo%>"><%=sName%></a></td>
						<td><%=kor%></td>
						<td><%=eng%></td>
						<td><%=math%></td>
						<td><%=hist%></td>
						<td><%=sum%></td>
						<td><a style='color: red' href="JungboController?sw=D&sNo=<%=sNo%>"><%=avg%></a></td>
					</tr>
					<%
					}
					int korSum = 0;
					int engSum = 0;
					int mathSum = 0;
					int histSum = 0;
					int totalSum = 0;
					double totalSumAvg = 0;
					int korAvg = 0;
					int engAvg = 0;
					int mathAvg = 0;
					int histAvg = 0;
					int totalAvg = 0;
					double totalAvgAvg = 0;

					for (JungVO n : li) {
					korSum += n.getKor();
					engSum += n.getEng();
					mathSum += n.getMath();
					histSum += n.getHist();
					korAvg = korSum / li.size();
					engAvg = engSum / li.size();
					mathAvg = mathSum / li.size();
					histAvg = histSum / li.size();

					totalSum = korSum + engSum + mathSum + histSum;
					totalSumAvg = (double) totalSum / 4;
					totalAvg = korAvg + engAvg + mathAvg + histAvg;
					totalAvgAvg = (double) Math.round(totalSumAvg / li.size() * 1000) / 1000.0;
					}
					%>
					<tr>
						<td></td>
						<td></td>
						<td></td>
						<th>총점</th>
						<td><%=korSum%></td>
						<td><%=engSum%></td>
						<td><%=mathSum%></td>
						<td><%=histSum%></td>
						<td><%=totalSum%></td>
						<td><%=totalSumAvg%></td>
					</tr>
					<tr>
						<td></td>
						<td></td>
						<td></td>
						<th>총평균</th>
						<td><%=korAvg%></td>
						<td><%=engAvg%></td>
						<td><%=mathAvg%></td>
						<td><%=histAvg%></td>
						<td><%=totalAvg%></td>
						<td><%=totalAvgAvg%></td>
					</tr>
				</tbody>
			</table>
		</div>
		<br>
	</section>
	<footer> HRDKOREA Copyright&copy;2018 All rights reserved.
		Human Resources Development Service of Korea </footer>
</body>
</html>