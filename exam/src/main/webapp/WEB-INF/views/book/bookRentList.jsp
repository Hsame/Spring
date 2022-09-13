<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table, thead, tr, td, th, tbody {
	border : 1px solid black
}
</style>
</head>
<body>
	<h2>도서별 대여매출현황</h2>
	<table>
		<thead>
			<tr>
				<th>도서번호</th>
				<th>도서명</th>
				<th>대여총계</th>
				<th>대여횟수</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="bookrent" items="${BookRentList }">
				<tr>
					<td>${bookrent.bookNo }</td>
					<td>${bookrent.bookName }</td>
					<td>${bookrent.rentPirce }</td>
					<td>${bookrent.rentStatus }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>