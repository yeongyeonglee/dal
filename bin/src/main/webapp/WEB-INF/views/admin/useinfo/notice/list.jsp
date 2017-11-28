<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<link type="text/css" rel="stylesheet"
	href="${path}/resource/css/liststyle.css">

<main class="main">



<div style="margin-top:30px; margin-bottom: -10px;">

<label class="list-tit" > 카페 이용 방법</label>

</div>




	<div class="ph-heart-nav nav">
		<a href="notice">All</a>
		<a href="notice?f=cafecode&q=1">GongCha</a>
		<a href="notice?f=cafecode&q=2">Starbucks</a>
		<a href="notice?f=cafecode&q=3">Ediya</a>
		<a href="notice?f=cafecode&q=4">CoffeeBean</a>
		<a href="notice?f=cafecode&q=5">Twosome</a>
		<a href="notice?f=cafecode&q=6">Hollys</a>
		<div class="effect"></div>
	</div>	


				<h3 class="hidden">공지사항 검색폼</h3>
				<form class="table-form">
					<fieldset class="list-field">
						<legend class="hidden">공지사항 검색 필드</legend>
						<label class="hidden">검색분류</label> 
						<select name="f">
							<option selected="selected" value="utitle">제목</option>
							<option value="ucontent">내용</option>
						</select> 
						<label class="hidden">검색어</label> 
						<input type="text" name="q" /> 
						<input class="" type="submit" value="검색" />
					</fieldset>
				</form>
	

<div style="border-bottom: 1px solid black; width: 900px; margin-left: 490px; margin-bottom: 10px;">

</div>


<h3 class="hidden">카페이용방법</h3>
<table class="table-garo2">
	<thead>
		<tr>
			<th class="w60">카페</th>
			<th class="tit w100">제목</th>
			<th class="w70">작성자</th>
			<th class="w60">조회수</th>

		</tr>
	</thead>
	<tbody>
		<c:forEach var="n" items="${list}">
			<tr>
				<td>${n.cname}</td>
				<td class="con w100"><a href="notice/${n.num}">${n.utitle}</a></td>
				<td>카페 달</td>
				<td>${n.hit}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>



<c:set var="startNum" value="${page-((page-1)%5)}" /> <c:set
	var="lastNum"
	value="${fn:substringBefore(count%10 ==0 ? count/10 : count/10+1, '.')}" />
<div class="listnum">

	<a href="?p=1">이전</a>

	<div>
		<ul>
			<c:forEach var="i" begin="0" end="4">
				<c:set var="strong" value="" />
				<c:if test="${page == startNum+i }">
					<c:set var="strong" value="text-strong" />
				</c:if>
				<c:if test="${startNum+i <= lastNum }">
					<li><a class="${strong }" href="?p=${startNum+i}">${startNum+i}</a></li>
				</c:if>
				<c:if test="${startNum+i > lastNum }">
					<li><a href="?p=${startNum+i}">${startNum+i}</a></li>
				</c:if>
			</c:forEach>
		</ul>
		<div>
			<c:if test="${lastNum >= startNum+5 }">
				<a href="?p=${startNum+5}">다음</a>
			</c:if>
		</div>
	</div>
</div>


<div class="reg">
	<a href="notice/reg">등록</a>
</div>


</main>


