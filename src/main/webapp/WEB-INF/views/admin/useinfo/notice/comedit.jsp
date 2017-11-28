<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%  //줄바꿈 관련 설정
	pageContext.setAttribute("br", "<br />");
	pageContext.setAttribute("cn", "\n");
%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<link type="text/css" rel="stylesheet"
	href="${path}/resource/css/liststyle.css">
<main>
<div class="main-tit">
	<!-- 카페 이용정보 -->
</div>

<div class="path2">
	<h3 class="hidden">경로</h3>
	<!--    <ul>
            <li>home</li>
            <li>고객센터</li>
            <li>공지사항</li>
         </ul> -->
</div>

<div style="margin-bottom:40px; margin-top: -10px;">
<label style="margin-left:460px; font-size: 30px; font-weight: bolder; margin-top: -50px;" >이용 방법</label>

</div>

	<div class="tit-content">
		
			<h2 style="padding-left: 20px;">${n.utitle}</h2>
			<div class="tit-content2">
			<ul class="info">
				<li class="part">${n.cname}</li>
				<li class="inq_cnt">카페 달</li>
				<li style="margin-left: 780px;">조회수 &nbsp; ${n.hit}</li>
			</ul>
		</div>
	</div>


<div>
	<h3 class="hidden">이용방법 내용</h3>
	<table class="table-garo2">
		<tbody>
			
				
			
			<tr class="content">
				<td colspan="4" style="height: 400px; text-align: left;"><c:forEach var="f" items="${files}"
						varStatus="s">

					</c:forEach> ${fn:replace(n.ucontent, cn, br)}<br /></td>
			</tr>
		</tbody>
	</table>
</div>

<!--  댓글 -->


<form action="?${_csrf.parameterName}=${_csrf.token}" method="post"
	enctype="multipart/form-data">
	<fieldset>
		<legend class="hidden">카페 할인정보 수정 필드</legend>
		<table class="table-garo2">
			<tbody>

				<tr>
					<td colspan="4"><textarea name="content">${comnum.content}</textarea>

					</td>
				</tr>

			</tbody>
		</table>
		<div class="buttons">
			<input style="color: white; background: #7b4122; border-style: none;"
				type="hidden" name="num" value="${comnum.num}" /> 
				<input style="color: white; background: #7b4122; border-style: none;"
				type="hidden" name="nnum" value="${comnum.noticenum}" />  <input
				style="color: white; background: #7b4122; border-style: none;"
				type="submit" value="저장" /> <a href="${n.num}">취소</a> 
		</div>
	</fieldset>
</form>








<!--  댓글 -->

<div class="path3">
	<ul>
		<li><a class="" href="../notice">목록</a></li>


		<li><a href="edit?num=${n.num}">수정</a></li>


		<li><a href="delete?num=${n.num}">삭제</a></li>
	</ul>
</div>

<div class="prep-next">
	<table class="table-list">
		<tbody>
			<tr>
				<c:if test="${empty prev}">

					<td>이전글</td>
					<td></td>
					<td></td>
					<td colspan="3" class="text-align-left text-indent">이전글이 없습니다.</td>

				</c:if>
				<c:if test="${not empty prev}">

					<td>이전글</td>
					<td></td>
					<td></td>
					<td colspan="3" class="text-align-left text-indent"><a
						class="text-blue text-strong" href="${prev.num}">${prev.utitle}</a></td>

				</c:if>
			</tr>
			<tr>
				<c:if test="${empty next}">

					<td>다음글</td>
					<td></td>
					<td></td>
					<td colspan="3" class="text-align-left text-indent">다음글이 없습니다.</td>

				</c:if>
				<c:if test="${not empty next}">

					<td>다음글</td>
					<td></td>
					<td></td>
					<td colspan="3" class="text-align-left text-indent"><a
						class="text-blue text-strong" href="${next.num}">${next.utitle}</a></td>

				</c:if>
			</tr>
		</tbody>
	</table>
</div>

</main>