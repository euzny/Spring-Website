<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/js/all.min.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table tr td {text-align:left;}
	.valid, .invalid {font-size:14px; font-weight:bold; font-style:italic;}
	.valid{color:green;}
	.invalid{color:red;}
</style>
</head>
<body>
<h3>회원가입</h3>
<p class="w-pct40" style="margin: 0 auto; text-align: right; padding-bottom:10px font-size:12px;">*은 필수 입력 항목입니다.</p> 
<form action="join" method="post">
<table class="w-pct40">
	<tr>
		<th class="w-px120">*성명</th>
		<td><input type="text" name="name" /></td>
	</tr>
	<tr>
		<th>*아이디</th>
		<td><input type="text" name="id" class="chk"/><a class="btn-fill-s" id="btn-id">아이디 중복확인</a>
		<div class="valid">아이디를 입력하세요(영문소문자, 숫자만 입력 가능)</div></td>
	</tr>
	<tr>
		<th>*비밀번호</th>
		<td><input type="password" name="pw" class="chk"/>
		<div class="valid">비밀번호를 입력하세요(영문대/소문자, 숫자를 모두 포함)</div>
		</td>
	</tr>
	<tr>
		<th>*비밀번호 확인</th>
		<td><input type="password" name="pw_ck" class="chk"/>
		<div class="valid">비밀번호를 다시 입력하세요</div></td>
	</tr>
	<tr>
		<th>*성별</th>
		<td><label><input type="radio" name="gender" value="남"/>남</label>
			<label><input type="radio" name="gender" value="여" checked />여</label>
		</td>
	</tr>
	<tr>
		<th>*이메일</th>
		<td><input type="text" name="email" class="chk"/>
		<div class="valid">이메일을 입력하세요</div>
		</td>
	</tr>
	<tr>
		<th>생년월일</th>
		<td><input type="text" name="birth" readonly="readonly"/>
			<a id="delete" style="display:none; color:red; position : relative; right:40px; cursor:pointer;'">
			<i class="fa-solid fa-circle-xmark"></i></a></td>
	</tr>
	<tr>
		<th>전화번호</th>
		<td><input type="text" name="tel" class="w-px40" maxlength="3"/>
			- <input type="text" name="tel" class="w-px40" maxlength="4"/>
			- <input type="text" name="tel" class="w-px40" maxlength="4"/>
		</td>
	</tr>
	<tr>
		<th>주소</th>
		<td class='addr'><a class='btn-fill-s' onclick='daum_post()'>우편번호 찾기</a>
		<input type="text" name="post" class="w-px60" readonly="readonly" /><br/>
			<input type="text" name='addr' readonly="readonly" /><br/>
			<input type="text" name='addr' />
		</td>
	</tr>
</table>
</form>
<div class="btnSet">
	<a class="btn-fill" onclick="go_join()">회원가입</a>
	<a class="btn-empty" href='<c:url value="/" />'>취소</a>
</div>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
<script type="text/javascript" src="js/join-check.js"></script>
<script>
	
	//회원가입 처리
	function go_join(){
		if($('[name=name]').val()==''){	//이름이 빈칸이면
			$('[name=name]').focus();
			return;
		}
		//중복확인 검사
		if($('[name=id]').hasClass('checked')){
			//중복확인 검사를 했을 경우
			if($('[name=id]').siblings('div').hasClass('invalid')){
				alert('회원가입 불가!\n'+join.id.unUsable.desc);
				$('[name=id]').focus();
				return;
			}
		}else{
			//중복확인을 안 했을 경우
			if(!item_check($('[name=id]'))) return;   
			else{
				alert('회원가입불가!\n'+ join.id.valid.desc); // 사용할 수 있는 id여도 중복확인을 안 했을 경우
				$('[name=id]').focus();
				return;
			}
		}
		
		// 비밀번호, 비밀번호 확인, 이메일 확인(검증) 필요
		if(!item_check($('[name=pw]')))	return;
		if(!item_check($('[name=pw_ck]'))) return;
		if(!item_check($('[name=email]'))) return;
		
		//아이디, 비밀번호, 비밀번호 확인, 이메일 허용(valid) 상태(조건 통과)
		$('form').submit();
		
	}


	function item_check(item){
		var data = join.tag_status(item);
		if(data.code == 'invalid') {
			alert('회원가입불가!\n'+data.desc);
			item.focus();
			return false;
		}
		return true;
	}
	
	
	
	function daum_post() {
		new daum.Postcode({
        	oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
            // 예제를 참고하여 다양한 활용법을 확인해 보세요.
   			$('[name=post]').val(data.zonecode); //우편번호
   			//지번/도로명 구분
            var addr = data.userSelectedType == 'J' ? data.jibunAddress : data.roadAddress;
          	//name이 addr인 태그의 0번지에 addr 값을 할당
   			
          	//건물명이 있을 경우 기존 주소에 건물명 값을 추가
          	if(data.buildingName != '') addr += '('+ data.buildingName +')';
          	
          	$('[name=addr]').eq(0).val(addr);
        	}
        }).open();	
	
	} //daum_post()
	
	$('[name=birth]').change(function () {
		
		$("#delete").css('display','inline');
		
	});
	
	$('#delete').click(function (){
		$('[name=birth]').val('');
		$('#delete').css('display','none');
	});
	
	$('.chk').on('keyup', function (e) {
		//id 입력 후 enter를 누르면 아이디 중복확인 버튼 실행
		if($(this).attr('name') == 'id'){
			if(e.keyCode == 13){
				id_check();
			}
		} 
		var data = join.tag_status($(this)); //입력하고 있는 tag의 값을 보낸 후 결과값 반환
		$(this).siblings('div').text(data.desc).removeClass().addClass(data.code);
	});
	
	$( function() {
		//나이 제한을 두기 위한 처리 (만 13세 이상만 회원가입을 할 수 있다면...)
		var today = new Date();   //오늘 날짜 선언(today)
		// 오늘 날짜의 연도 데이터를 뽑아 13년을 뺌. 월은 그대로 유지, 일자는 오늘 날짜로부터 1일을 뺌
		var endDay = new Date(today.getFullYear() - 13, today.getMonth(), today.getDate() -1 );
		
		$( "[name=birth]" ).datepicker({
			 dayNamesMin: ["일","월", "화", "수", "목", "금", "토" ],
			 monthNamesShort: [ "1월", "2월", "3월","4월", "5월", "6월","7월", "8월", "9월","10월", "11월", "12월"],
			 changeMonth:true,
			 changeYear:true,
			 showMonthAfterYear :true,
			 dateFormat : 'yy-mm-dd',
			
			 /* 달력에 나타날 최대 일자 지정 */
			 maxDate : endDay
		});
	});
	
	//아이디 중복확인(btn-id)을 클릭시
	$('#btn-id').on('click',function (){
		id_check();
	});
	
	//id_check 함수 선언
	function id_check(){
		var $id = $('[name=id]');
		
		var data = join.tag_status($id);
		if(data.code == 'invalid'){
			alert('아이디 중복확인 불필요\n'+ data.desc);
			$id.focus();
			return;
		}
		//DB에서 id 값을 json 형태로 가져와 중복 여부 확인
		$.ajax({
			url : 'id_check',
			data : {id : $id.val()},
			success : function (res){ //res == true > 사용 가능 / false > 사용 불가
				var data = join.id_usable(res);
				$id.siblings('div').text(data.desc).removeClass().addClass(data.code);
				$id.addClass('checked');    //class에 'checked' 부여 중복확인 필요
			},
			error : function (req,text){
				alert(text+":"+req.status);
			}
		});
	}
 
</script>
</body>
</html>