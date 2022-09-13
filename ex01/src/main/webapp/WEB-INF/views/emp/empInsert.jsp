<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="insertInfo" method="post">
		<div>
			<label> employeeId : <input type="text" name="employeeId">
			</label>
		</div>
		<div>
			<label> firstName : <input type="text" name="firstName">
			</label>
		</div>
		<div>
			<label> lastName : <input type="text" name="lastName">
			</label>
		</div>
		<div>
			<label> email : <input type="text" name="email">
			</label>
		</div>
		<div>
			<label> jobId : <input type="text" name="jobId">
			</label>
		</div>
		<div>
			<label> salary : <input type="text" name="salary">
			</label>
		</div>
		<div>
			<button type="submit">등록</button>
			<button type="button">목록</button>
		</div>
	</form>
</body>
</html>