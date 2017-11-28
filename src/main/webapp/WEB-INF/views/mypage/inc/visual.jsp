<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<link type="text/css" rel="stylesheet" href="${path}/resource/css/visualstyle.css">

<div id="visual-info">
	<div class="content-container">
		<div>
			<a class="btn-info use-button-info" href="${path}/mypage/edit">정보수정</a>		
			<a class="btn-info sale-button-info" href="${path}/admin/dcinfo/notice">회원탈퇴</a>	
		</div>	
	</div>
</div>



