<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<style>
body {
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100%;
	margin: 0;
}

textarea {
	font-size: 20px;
}
</style>
</head>

<body style="margin: 0 auto 0 auto; width: 100%;">
	<form action="/a/update" method="post">
		<table border="1">
			<tr>
				<td>
					<h1 style="text-align: center;">게시글 수정하기</h1>
				</td>
			</tr>
			<tr>
				<td><input type="text" name="title" value="${getEditPost.title}"
					style="display: block; width: 100%; text-align: center; font-size: 30px;"></td>
			</tr>
			<tr>
				<td
					style="display: flex; align-items: center; justify-content: center;"><textarea
						style="width: 100%" rows="50" cols="200" name="content">${getEditPost.content}</textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="수정하기" formaction="update"
					formmethod="post" style="width: 100%;"></td>
					<input type="hidden" name="bno" value="${getEditPost.bno}">
			</tr>
		</table>
	</form>
</body>
</html>