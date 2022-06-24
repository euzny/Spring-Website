<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	병원코드 : ${vo.hp_code} <br/>
	종별코드 : ${vo.hp_type} <br/>
	시군구코드 : ${vo.l_code} <br/>
	병원이름 : ${vo.hp_name} <br/>
	주소 : ${vo.hp_addr} <br/>
	전화번호 : ${vo.hp_tel} <br/>
	병원링크 :<a href="${vo.hp_url}">${vo.hp_url}</a>
</body>
</html>