<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
td {
	text-align: center;
}

body {
	display: flex;
	justify-content: center;
	align-items: center;
}

#postInfo>td {
	width: 200px;
	text-align: center;
	border: 1px solid black;
}

td {
	border-bottom: 1px solid black;
}
</style>
</head>
<body>
	<table>
		<!-- 게시글 정보 -->
		<tr id="postInfo">
			<td>No</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
		</tr>

		<c:forEach var="post" items="${post}">

			<tr>

				<td>${post.bno}</td>

				<td><a
					href="${pageContext.request.contextPath}/boardDetail?bno=${post.bno}">
						${post.title}</a></td>

				<td>${post.writer}</td>
				<td>${post.updatedate}</td>

			</tr>

		</c:forEach>


		<tr>
			<c:choose>
				<c:when test="${isLoggedIn}">
					<form>
						<td><input type="submit" value="글쓰기" formaction="posting"></td>
						<td><input type="submit" value="로그아웃하기" formaction="logout"></td>
					</form>
				</c:when>

				<c:otherwise>
					<form action="/a">
						<td><input type="submit" value="로그인하기"
							formmethod="get"></td>
					</form>
				</c:otherwise>
			</c:choose>
		</tr>
	</table>
</body>
</html>
