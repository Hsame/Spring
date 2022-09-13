<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updateInfo" method="post">
		<div>
			<label> ID : <input type="text" name="employeeId"
				value="${empInfo.employeeId }" readonly>
			</label>
		</div>
		<div>
			<label> firstName : <input type="text" name="firstName"
				value="${empInfo.firstName }">
			</label>
		</div>
		<div>
			<label> lastName : <input type="text" name="lastName"
				value="${empInfo.lastName }">
			</label>
		</div>
		<div>
			<label> email : <input type="text" name="email"
				value="${empInfo.email }" >
			</label>
		</div>
		<div>
			<label> phoneNumber : <input type="text" name="phoneNumber"
				value="${empInfo.phoneNumber }" >
			</label>
		</div>
		<div>
			<label> hireDate : <input type="text" name="hireDate"
				value="${empInfo.hireDate }" >
			</label>
		</div>
		<div>
			<label> jobId : <input type="text" name="jobId"
				value="${empInfo.jobId }" >
			</label>
		</div>
		<div>
			<label> salary : <input type="text" name="salary"
				value="${empInfo.salary }" >
			</label>
		</div>
		<div>
			<label> commissionPct : <input type="text"
				name="commissionPct" value="${empInfo.commissionPct }" readonly>
			</label>
		</div>
		<div>
			<label> managerId : <input type="text" name="managerId"
				value="${empInfo.managerId }" readonly>
			</label>
		</div>
		<div>
			<label> departmentId : <input type="text" name="departmentId"
				value="${empInfo.departmentId }" readonly>
			</label>
		</div>
		<div>
			<button type="submit">수정</button>
			<button type="button">목록</button>
		</div>
	</form>
</body>
</html>