<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
<h3>공지글 수정</h3>
<form action="update.no" method="post" enctype="multipart/form-data">
<input type="hidden" name="id"  value="${vo.id}" />
<table>
	<tr>
		<th class="w-px120">제목</th>
		<td><input type="text" name="title" value="${vo.title}" title="제목" class="chk"/></td>
	</tr>
	<tr>
		<th>내용</th>
		<td><textarea name="content" class="chk" title="내용">${vo.content}</textarea></td>
	</tr>
	<tr>
		<th>첨부파일</th>
		<td class="left">
			<label><a><img src="imgs/select.png" class="file-img"/></a>
			<input type="file" name="file" id="attach-file" /></label>
			<span id="file-name" >${vo.filename}</span>
			<a id='delete-file' style='display: ${!empty vo.filename? "inline":"none"}'><i class="fa-solid fa-circle-xmark"></i></a>
		</td>
	</tr>
</table>
<input type="hidden" name="attach" />  <!-- 첨부파일 저장시 사용 -->

</form>
<div class="btnSet">
	<a class="btn-fill" onclick="if(emptyCheck()) $('form').submit()" >수정</a>
	<a class="btn-empty" href="detail.no?id=${vo.id}">취소</a>
</div>
</body>
</html>