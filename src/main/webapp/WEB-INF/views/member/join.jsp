<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<head>
<meta charset="UTF-8">
<title>CafeDal</title>
<link type="text/css" rel="stylesheet"  	href="${path}/resource/css/join.css">
</head>

<div id="div_activate" class="container">
	<div class="logo">
				<img src="${path}/resource/images/logo2.png" alt="회원가입 로고" />
	</div>
	<div class="title">
		<h2 class="head">CafeDal 회원가입</h2>
	</div>
	<!-- 회원가입 폼 -->
	<div class="row">
		<form action="?${_csrf.parameterName}=${_csrf.token}" method="post" enctype="multipart/form-data">
			<table id="tbl_info" class="table jointb" style="table-layout: fixed;">
				<tr id="tr_id">
					<th>아이디</th>
					<td>
						<input name="id" id="id" type="text" placeholder="아이디" /><br />
						<!-- <br />아이디를 입력해주세요.<br /> -->
						<span id="checkId"></span>
					</td>
				</tr>
				
				<tr id="tr_pw">
					<th>비밀번호</th>
					<td>
						<div id="div_password_Y">
							<input name="pwd" id="pwd" type="password" placeholder="비밀번호" />
							<div id="guidepwd"></div>
						</div>
					</td>
				</tr>
				
				<tr id="tr_pw">
					<th>비밀번호 확인</th>
					<td>
						<div id="div_password_Y">
							<input name="pwdchk" id="pwdchk" type="password" placeholder="비밀번호 확인" />
							<div id="guidepwdchk"></div>
						</div>
					</td>
				</tr>
				
				<tr id="tr_name">
					<th>이름</th>
					<td>
						<input name="name" id="name" type="text" placeholder="이름" />
					</td>
				</tr>
					
				<tr id="tr_mail">
					<th>이메일</th>
					<td>
						<input name="mail" id="mail" type="text" placeholder="이메일" />
					</td>
				</tr>
				
				<tr id="tr_birth">
					<th>생일</th>
					<td>
						<input name="birth" id="birth" type="text" placeholder="YYMMDD" />
					</td>
				</tr>

				<tr>
					<th>카페 선택</th>
					<td>
						<form name="check" class="cm-check"  id="chbox">
							<div class="cm-check">
								<input type="checkbox"  id="cafes1" name="cafes"  value="1 "/> 
								 	<label class="cm-check2" for="cafes1">공차</label> 
								<input type="checkbox"  id="cafes2" name="cafes"  value="2 "/> 
									<label class="cm-check2" for="cafes2" >스타벅스</label> 
								<input type="checkbox" id="cafes3" name="cafes"  value="3 "/> 
								    <label class="cm-check2"  for="cafes3" >이디야</label>
								 <br />
							   <input type="checkbox"  id="cafes4" name="cafes"  value="4 "/> 
									<label class="cm-check2" for="cafes4" >커피빈</label> 
							   <input type="checkbox"  id="cafes5"name="cafes"  value="5 "/> 
							       <label class="cm-check2" for="cafes5" >투썸플레이스</label>
							   <input type="checkbox"  id="cafes6" name="cafes"  value="6 "/> 
							       <label class="cm-check2" for="cafes6" >할리스커피</label>
							</div>
						</form>
					</td>
				</tr>
				<c:if test="${not empty param.error}">
						<!-- 체크가 안되어있을때만 뜨는 화면창 -->
						<div style="color: red">
							하나라도 체크를 하셔야 합니다.<br> <br>
						</div>
				</c:if>
			</table>
		</form>

		 <div> 
              <input  class="btn cancel-btn"  type="submit"  onclick="location.href='login'" value="취소"  /> 
              <input  class="btn join-btn"  type="submit"  onclick="location.href='login'" value="확인"  /> 
         </div> 
	</div>


</div>


<script>

$(document).ready(function() {

var cfmId = "";		// 중복 체크 완료된 아이디 저장


$('#id').keyup(function() {

	var inputId = $('#id').val();

		$.ajax({

			url: "sameCheckId?${_csrf.parameterName}=${_csrf.token}",
			type: "POST",
			data: { "id" : inputId },
			success: function(result) {

				if ( result.message == "true" )	{
					$('#checkId').html('<strong>이미 존재하는 아이디입니다!</strong>');
					$('#checkId').css("color","red");
					cfmId = '';
				} else {
					$('#checkId').html('<strong>사용 가능한 아이디입니다.</strong>');
					$('#checkId').css("color","green");
					cfmId = inputId;
				}

				$('#id_cfm').text("중복 체크").attr('disabled', false);
			},
			error: function(result) {
				alert("잠시 후 다시 이용해주세요.");
			}
});

});


		// 비밀번호 확인 검사
		$('#pwd').blur(checkPwCfm);
		$('#pwdchk').keyup(checkPwCfm);

		function checkPwCfm() {
			var inputPw = $('#pwd').val();
			var inputPwCfm = $('#pwdchk').val();

			if ( inputPw != inputPwCfm ) {
				$('#guidepwdchk').text("비밀번호가 일치하지 않습니다.");
				$('#guidepwdchk').css("color","red");
				$('#guidepwdchk').show();

				completePwCfm = false;
			} else {
				$('#guidepwdchk').hide();
				completePwCfm = true;
			}
		}



	});


</script>
