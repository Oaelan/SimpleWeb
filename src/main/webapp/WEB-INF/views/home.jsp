<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

Home
<!-- 컨텍스트 경로까지 붙여 주기!! 컨텍스트 경로 /a  -->
<form action="/a/" method="post">
아이디<input type="text" name="id">
비밀번호<input type="password" name="password">
<input type="submit" value="로그인">
                                                      <!-- 해당 속성을 사용하면 method방식 따로 지정 가능 -->
<input type="submit" value="회원가입" formaction="join" formmethod="get">
</form>

</body>
</html>