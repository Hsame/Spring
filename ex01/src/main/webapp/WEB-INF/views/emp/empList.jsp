<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체조회</title>
<style>
table, tr, th, td {
border : 1px solid black
 }
</style>
</head>
<body>

	<table>
		<thead>
			<tr>
				<th>employee_id</th>
				<th>first_name</th>
				<th>last_name</th>
				<th>email</th>
				<th>hire_date</th>
				<th>job_id</th>
				<th>salary</th>
				<th>Delete</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${empList }" var="emp">
				<tr>
					<td><a href="getInfo?employeeId=${emp.employeeId }">${emp.employeeId }</a></td>
					<td>${emp.firstName }</td>
					<td>${emp.lastName }</td>
					<td>${emp.email}</td>
					<td>${emp.hireDate }</td>
					<td>${emp.jobId }</td>
					<td>${emp.salary }</td>
					<td><button type="button" onclick="Delete(${emp.employeeId}, event)">삭제</button>
				</tr>
			</c:forEach>
		</tbody>
	</table> 
	<br>
	<button type="button" onclick="location.href='empInsert'">등록</button>

<script type="text/javascript">
function Delete(id, event) {
	event.stopPropagation()
	location.href = './deleteInfo/'+id;
}
</script>
</body>
</html>