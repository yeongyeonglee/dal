<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<link type="text/css" rel="stylesheet" href="${path}/resource/css/mypagestyle.css">


<aside id="aside">
	<br>
	<nav>
		<ul class="accordion-menu">
			<li>
				<div class="dropdownlink">나의 정보</div>
				<ul class="submenuItems">
					<li><a href="../edit">• 정보 수정</a></li>
					<li><a href="">• 회원 탈퇴</a></li>
					<li><a href="">• 카페 등록</a></li>
				</ul>
			</li>
		</ul>
	</nav>
</aside>