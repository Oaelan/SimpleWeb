<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="kr">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Post Detail</title>
<style>
/* 스타일 추가 */
* {
	box-sizing: border-box;
}

.post-detail {
	width: 80%;
	margin: 20px auto;
	border: 1px solid #ccc;
	padding: 20px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.post-detail h1 {
	font-size: 2em;
	margin-bottom: 10px;
}

.post-detail p {
	margin-bottom: 10px;
}

.action-buttons {
	margin-top: 20px;
}

.action-buttons button {
	margin-right: 10px;
}

<
style>* {
	box-sizing: border-box;
}

body {
	font-family: Arial, sans-serif;
	margin: 20px;
	padding: 0;
	background-color: #f4f4f4;
}

#comment-section {
	max-width: 600px;
	margin: 0 auto;
	background: white;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	display: none;
}

#comment-section.style1 {
	display: block;
}

.comment-form {
	margin-bottom: 20px;
}

.comment-form textarea {
	width: 100%;
	height: 100px;
	padding: 10px;
	border: 1px solid #ddd;
	border-radius: 5px;
	resize: none;
	font-size: 14px;
}

.comment-form button {
	padding: 10px 20px;
	border: none;
	background-color: #007bff;
	color: white;
	border-radius: 5px;
	cursor: pointer;
}

.comment-form button:hover {
	background-color: #0056b3;
}

.comments {
	list-style-type: none;
	padding: 0;
}

.comments li {
	margin-bottom: 20px;
	padding: 10px;
	border: 1px solid #ddd;
	border-radius: 5px;
	background: #f9f9f9;
}

.comment-author {
	font-weight: bold;
	margin-bottom: 5px;
}

.comment-date {
	font-size: 12px;
	color: #555;
	margin-bottom: 10px;
}
</style>
</head>
<body>


	<div class="post-detail">
		<h1>${detail.title}</h1>
		<p>
			<strong>작성자:</strong> <label name="writer">${detail.writer}</label>
		</p>
		<p>
			<strong>등록일:</strong> <label name="updatedate">${detail.updatedate}</label>
		</p>
		<p>
			<strong>내용:</strong> <label name="content">${detail.content}</label>
		</p>
		
		<!-- 안보여줘도댐 -->






		<div class="action-buttons">
			<!-- 로그인 상태에서만 수정 및 삭제 버튼 표시 -->

			<!-- 삭제 버튼 값을 보낼 때는 항상 폼태그 안에 넣어서 보내주자-->
			<form action="/a/delete">
				<c:if test="${sameUser}">
					<input type="submit" value="삭제" formmethod="post" />
					<input type="hidden" name="bno" value="${detail.bno}">
					<input type="submit" value="수정" formaction="edit">
				</c:if>
			</form>
			
			<form action="/a/board">
				<input type="submit" value="목록" formmethod="get" />				
			</form>
			<button id="commentB" onclick="showComment()">댓글</button>

		</div>
	</div>

	<div id="comment-section">
		<h2>Comments</h2>

		<!-- Comment Form -->
		<div class="comment-form">
			<form method="post">
			<textarea name="comment" id="comment-text" placeholder="Write your comment here..."></textarea>
			<input type="hidden" name="bno" value="${detail.bno}">
			<input type="submit" value="댓글 작성" formaction="commentUpload">
			</form>
		</div>

		<!-- Comments List -->
	</div>
	
	<ul class="comments" id="comment-list">
		<!-- Example Comment -->
		<c:forEach var="comments" items="${comments}" >
		
		<li>
			<div class="comment-author">${comments.writer}</div>
			<div class="comment-date">${comments.updatedate}</div>
			<div class="comment-text" >${comments.comment}</div>
		</li>
		
		</c:forEach>
		
	</ul>
	<script type="text/javascript">
		function showComment() {
			document.getElementById("comment-section").classList.toggle("style1");
		}
	</script>
</body>
</html>