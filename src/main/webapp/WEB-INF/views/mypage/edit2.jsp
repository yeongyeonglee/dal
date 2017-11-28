<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link type="text/css" rel="stylesheet" href="${path}/resource/css/mypagestyle.css">
<br />
<br />
<br />
<br />
<main class="main">
<div id="div_activate" class="container">
	<form action="?${_csrf.parameterName}=${_csrf.token}" method="post"
		enctype="multipart/form-data">
		<table class="table table-garo2">
			<tr id="tr_id">
				<th>아이디</th>
				<td colspan="2">${list.id}</td>
			</tr>

			<tr id="tr_pw">
				<th>비밀번호</th>
				<td colspan="2"><input name="pwd" id="pwd" type="password"
					placeholder="비밀번호" /></td>
			</tr>

			<tr id="tr_name">
				<th>이름</th>
				<td colspan="2"><input name="name" id="name" type="text" placeholder="이름" />
				</td>
			</tr>

			<tr id="tr_mail">
				<th>이메일</th>
				<td colspan="2"><input name="mail" id="mail" type="text" placeholder="이메일" />
				</td>
			</tr>

			<tr id="tr_birth">
				<th>생일</th>
				<td colspan="2">${list.birth}</td>
			</tr>

			<tr>
				<th><label>이벤트 정보를 받고 싶은 카페를 선택해 주세요</label></th>
				<td colspan="2">
					<form name="check">
						<div class="cm-check">
							<input type="checkbox" id="cafes" name="cafes" value="1" /> <label
								class="cm-check2">공차</label> <input type="checkbox" id="cafes"
								name="cafes" value="2" /> <label class="cm-check2">스타벅스</label>
							<input type="checkbox" id="cafes" name="cafes" value="3" /> <label
								class="cm-check2">이디야</label> <input type="checkbox" id="cafes"
								name="cafes" value="4" /> <label class="cm-check2">커피빈</label> <input
								type="checkbox" id="cafes" name="cafes" value="5" /> <label
								class="cm-check2">투썸플레이스</label> <input type="checkbox"
								id="cafes" name="cafes" value="6" /> <label class="cm-check2">할리스커피</label>
						</div>
					</form>
				</td>
			</tr>
		</table>
		<input type="hidden" name="id" value="${list.id}" />
		<button class="eff-2" type="submit">저장</button>
		<div class="button">
			<a class="eff-1" href="../mypage/edit">취소</a>
		</div>
	</form>
</div>
</html>