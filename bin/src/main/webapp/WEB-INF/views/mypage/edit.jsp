<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<link type="text/css" rel="stylesheet" href="${path}/resource/css/mypagestyle.css">


<main id="main">

<div id="body">
	<form class="pw-check-form" method="post">
		<div>
			<img id="mypage-logo" src="${path}/resource/images/logo.png" alt="로고" />
		</div>
		<div id="center">
			<label class="pw-check">비밀번호 확인</label> <br /> <label
				class="pw-check">회원님의 정보를 안전하게 보호하기 위해 비밀번호를 다시 확인합니다.</label><br />
			<br /> <input id="edit-pw-input" size="30px;" type="password"
				name="pwd" /> <input class=" btn login-button" type="submit"
				value="확인" /> <br />
			<br />
			<br /> <label>▶ 비밀번호를 잊으셨다면? <a href="">Click</a></label>
		</div>
	</form>
</div>

</main>