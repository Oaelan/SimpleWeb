<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

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
    <form action="글쓰기를 등록하는서버로" method="post">
        <table border="1">
            <tr>
                <td>
                    <h1 style="text-align: center;">게시판 글작성하기</h1>
                </td>
            </tr>
            <tr><td><input type="text" name="title"  style="display: block; width: 100%; text-align: center; font-size: 30px;"></td></tr>
            <tr>
                <td style="display: flex; align-items: center; justify-content: center;"><textarea style="width: 100%"
                        rows="50" cols="200" name="content"></textarea></td>
            </tr>
            <tr>
                <td><input type="submit" value="등록하기" formaction="posted" formmethod="post" style="width: 100%;"></td>
            </tr>
        </table>
    </form>
</body>

</html>