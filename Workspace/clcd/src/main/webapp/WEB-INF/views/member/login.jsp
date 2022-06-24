<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- <link href="//cdn.jsdelivr.net/npm/@sweetalert2/theme-dark@4/dark.css" rel="stylesheet"> --> <!-- dark -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/11.4.8/sweetalert2.min.css" rel="stylesheet"> 
<script src="//cdn.jsdelivr.net/npm/sweetalert2@11/dist/sweetalert2.min.js"></script>
<style type="text/css">
	#login{
		width: 70%;
		padding: 50px 0;
		float:left;
	}
	
	#userid, #userpw {
		width: 30%;
		padding:5px 10px;
		margin-bottom: 10px;
	}
	
	img.social{
		width:200px;
		height:45px;
		margin-top: 20px;
	}
	
	.join{
		float:right;
		width:30%;
		padding:210px 0;
		background: #c2c2c2;
	}
	.join div{
		position: absolute;
		top :50%;
		left: 85%;
		transform:translate(-50%, -50%);
	}
	
	input:focus{
	outline: none;
	} 

</style>
</head>
<body>
<div style="width: 700px; border: 1px solid #ccc;" class="center">
	<div id="login">
		<div>
			<a href='<c:url value="/" />'><img src="imgs/clcd_logo.png" /></a>
		</div>	
		<div>
			<a href='naverLogin'><img src="imgs/naver_login.png" class="social" /></a>
			<a href='kakaoLogin'><img src="imgs/kakao_login.png" class="social" /></a>
			<div style="width:80%; margin:25px auto; border:1px solid #ccc;"></div>	
				<input type="text" id="userid" placeholder="아이디" autofocus/><br/>
				<input type="password" id="userpw" placeholder="비밀번호"
					onkeypress="if (event.keyCode == 13) go_login()" /><br/>
				<a class="btn-fill"  onclick="go_login()">로그인</a>
		</div>	
	</div>
	<div class="join">
		<div>Hello, Guest<br/>
			<a class="btn-fill" href="member">회원가입</a>
		</div>
	</div>
</div>

<script type="text/javascript">

	function go_login() {
		if($("#userid").val()==''){ //아이디 입력값이 없으면
			/* alert("아이디를 입력하세요"); */
			Swal.fire(
  					'아이디가 존재하지않습니다.',  //제목
  					'다시 확인해주세요',		//내용	
  					'warning'				//아이콘
			);
			$("#userid").focus();
			return false;
		}else if($("#userpw").val()==''){
			/* alert("비밀번호를 입력하세요"); */
			Swal.fire('비밀번호를 입력하세요');
			$("#userpw").focus();
			return false;
		}
		
		$.ajax({		//login을 위한 ajax 통신
			url:'memberLogin',
			data: {id:$('#userid').val(), pw:$('#userpw').val()},
			success: function(response) {
				if(response){
					location = "<c:url value='/' />";
				}else{
					/* alert("아이디나 패스워드가 일치하지 않습니다."); */
					Swal.fire('아이디나 패스워드가 일치하지 않습니다');
				}	
			} , error: function(req, text) {
				alert(text + ':'+req.status);
			}			
		}); //ajax
	}



</script>


</body>
</html>