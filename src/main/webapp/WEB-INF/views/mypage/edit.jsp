<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link type="text/css" rel="stylesheet"
	href="${path}/resource/css/mypagestyle.css">
<br />
<br />
<br />
<br />
<main class="main">
<div id="div_activate" class="container">
	<!-- 회원가입 폼 -->
	<form action="?${_csrf.parameterName}=${_csrf.token}" method="post"
		enctype="multipart/form-data">
		<c:forEach var="m" items="${list}">
			<table class="table table-garo2">
				<tr id="tr_id">
					<th>아이디</th>
					<td colspan="6">${m.id}</td>
				</tr>
				<tr id="tr_pw">
					<th>비밀번호</th>
					<td colspan="6">${m.pwd}</td>
				</tr>
				<tr id="tr_name">
					<th>이름</th>
					<td colspan="6">${m.name}</td>
				</tr>
				<tr id="tr_mail">
					<th>이메일</th>
					<td colspan="6">${m.mail}</td>
				</tr>
				<tr id="tr_birth">
					<th>생일</th>
					<td colspan="6">${m.birth}</td>
				</tr>

				<%-- <th>카페</th>
				<c:forEach var="n" items="${listcafe}">
					<tr id="tr_cafename">
						<td>${n.cafename}</td>
					</tr> --%>
				<th>카페</th>
				<c:forEach var="n" items="${listcafe}">
					<td>${n.cafename}</td>
				</c:forEach>
			</table>
			<div class="buttons">
				<a class="eff-1" href="edit2?id=${m.id}">수정</a> 
			</div>
		</c:forEach>
	</form>
</div>
</main>