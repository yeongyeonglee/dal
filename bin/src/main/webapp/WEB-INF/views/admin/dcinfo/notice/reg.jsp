<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<link type="text/css" rel="stylesheet" href="${path}/resource/css/liststyle.css">

<main class="main">
	<div class="reg-tit">카페 할인정보 등록</div>
	<form action="?${_csrf.parameterName}=${_csrf.token}" method="post" enctype="multipart/form-data">
		<fieldset class="reg-field">
			<legend class="hidden">할인정보 등록필드</legend>
			<table class="table-garo2">
				<tbody>
				    <tr>
						<td style="width: 270px;">제목</td>
						<td><input type="text" name="dtitle" /></td>
					</tr>
					<tr>
						<td style="width: 270px;">카페 코드</td>
						<td><input type="text" name="cafecode" /></td>
					</tr>		
					<tr>
						<td style="width: 270px;">카페 이름</td>
						<td><input type="text" name="cname" /></td>
					</tr>
					<tr>
						<td style="width: 270px;">시작일자</td>
						<td><input type="date" name="startdate" /></td>
					</tr>	
						<tr>
						<td style="width: 270px;">종료일자</td>
						<td><input type="date" name="finishdate" /></td>
					</tr>	
										
				    <tr>
						<td>첨부파일</td>
						<td><input type="file" name="file" /></td>
					</tr> 
					<tr>
						<td colspan="2"><textarea style="overflow: auto; " name="dcontent" rows="40" cols="100"></textarea>

						</td>
					</tr>
				</tbody>
			</table>
			<div class="buttons">
				<input style="color:white; background: #7b4122; border-style: none;" type="submit" value="등록" />
				<a href="notice">취소</a>				
			</div>
		</fieldset>
	</form>
</main>






