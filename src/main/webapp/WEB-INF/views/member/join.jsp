<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
input{
border: none;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/a/join" method="post">
		<table border="1">
			<h3>회원가입</h3>
			<tr>
				<td>회원ID</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="password" id="pw"></td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>
				<td><input type="password" id="pwRe"></td>
				<td><label id="pwLab"></label></td>
			</tr>
			<script>
			document.getElementById("pwRe").addEventListener('blur', function() {
		        let pw = document.getElementById("pw").value;
		        let pwRe = document.getElementById("pwRe").value;
		        let pwLab = document.getElementById("pwLab");

		        if (pw == pwRe) {
		            pwLab.innerHTML = "비밀번호가 일치합니다.";
		            pwLab.style.color = "green";
		        } else {
		            pwLab.innerHTML = "비밀번호가 틀립니다.";
		            pwLab.style.color = "red";
		        }
		    });

			</script>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>성별</td>
				<td><lable>남성</lable><input type="radio" name="gender"
					value="남성"> <lable>여성</lable><input type="radio"
					name="gender" value="여성"></td>
			</tr>
			<tr>
				<td>집전화</td>
				<td><input type="text" name="homenum"></td>
			</tr>
			<tr>
				<td>휴대전화</td>
				<td><input type="text" name="phonecall"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="email"></td>
			</tr>

			<tr><td colspan="2"><input type="submit" value="회원가입"></td></tr>

		</table>
	</form>
</body>
</html>