<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<link type="text/css" rel="stylesheet" href="${path}/resource/css/visualstyle.css">

<div id="visual">
	<div class="content-container">
		<li>
			<a class="btn use-button" href="${path}/customer/useinfo/notice">이용방법</a>
		</li>
		<li>
			<a class="btn sale-button" href="${path}/customer/dcinfo/notice">할인정보</a>		
		</li>
	</div>
	
</div>



