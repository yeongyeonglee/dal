<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<link type="text/css" rel="stylesheet" href="${path}/resource/css/liststyle.css">


 <body>
	<div class="reg-tit">카페 할인정보 등록</div>
	<form action="?${_csrf.parameterName}=${_csrf.token}" method="post" enctype="multipart/form-data">
		<fieldset class="reg-field">
			<legend class="hidden">공지사항 수정정보 필드</legend>
			<table class="table-garo2-admin">
				<tbody>
					<tr>
						<td class="tit w100">카페 이름</td>
						<td><input type="text" name="name" /></td>
					</tr>
				
				</tbody>
			</table>
			<div class="buttons">
				<input style="color:white; background: #7b4122; border-style: none;" type="submit" value="등록" />
				<a href="../manage">취소</a>				
			</div>
		</fieldset>
	</form>
</body>



