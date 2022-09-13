<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="update" name="updateForm" method="post"
		onsubmit="return false">
		<div>
			<h3>게시글 등록</h3>
		</div>
		<table>
			<tr>
				<th>번호</th>
				<td><input type="text" name="bno" value=${board.bno } readonly></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" value=${board.title }></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer" value=${board.writer }></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="3" cols="2" name="contents" style="width: 100px">${board.contents }</textarea></td>
			</tr>
			<tr>
				<th>첨부파일</th>
				<td><img src="<c:url value="/resources/images/${board.image }"/>" alt="이미지"></td>
			</tr>
			<tr>
				<th>작성일자</th>
				<td><fmt:formatDate value="${board.regdate }" pattern="yyyy/MM/dd" /></td>
			</tr>
		</table>
		<button type="submit" onclick="formOption()">수정</button>
		<button type="button" onclick="location.href='./list'">목록</button>
	</form>

	<script>
		function formOption() {
			let title = document.getElementsByName('title')[0];
			let writer = document.getElementsByName('writer')[0];
			let contents = document.getElementsByName('contents')[0];

			if (title.value == "") {
				alert("제목이 입력되지 않았습니다.")
				title.focus();
				return;
			}
			if (writer.value == "") {
				alert("작성자가 입력되지 않았습니다.")
				writer.focus();
				return;
			}
			if (contents.value == "") {
				alert("내용이 입력되지 않았습니다.");
				contents.focus();
				return;
			}

			updateForm.submit();
		}
	</script>
</body>
</html>