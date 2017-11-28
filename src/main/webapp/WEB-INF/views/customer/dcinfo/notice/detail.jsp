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
<label style="margin-left:460px; font-size: 30px; font-weight: bolder; margin-top: -50px;" >할인 정보</label>

</div>

	<div class="tit-content">
		
			<h2 style="padding-left: 20px;">${n.dtitle}</h2>
			<div class="tit-content2">
			<ul class="info">
				<li class="part">${n.cname}</li>
				<li class="inq_cnt part"><fmt:formatDate pattern="yyyy-MM-dd" value="${n.startdate}"/></li>
				<li class="inq_cnt"><fmt:formatDate pattern="yyyy-MM-dd" value="${n.finishdate}"/></li>
				<li class="inq_cnt part">
					<c:forEach var="clist" items="${clist}">
						댓글 ${clist.count}
					</c:forEach>
			    </li>
				<li class="part2">조회수 : ${n.hit}</li>
			</ul>
		</div>
	</div>


<div>
	<h3 class="hidden">이용방법 내용</h3>
	<table class="table-garo2">
		<tbody>
			
			<%-- 	<th>첨부파일</th>
				<td colspan="3"><c:forEach var="f" items="${files}"
						varStatus="s">
						<a href="../download?f=${f.src}">${f.src}</a>
						<c:if test="${!s.last}">,</c:if>
					</c:forEach></td>
			</tr>
			 --%>
			<tr class="content">
				<td colspan="4" style="height: 400px; text-align: left;"><c:forEach var="f" items="${files}"
						varStatus="s">

					</c:forEach> ${fn:replace(n.dcontent, cn, br)}<br /></td>
			</tr>
		</tbody>
	</table>
</div>
<!-- 댓글 ------------------------------------- -->

<c:forEach var="replylist" items="${replylist}" varStatus="status">
    <div style="border: 1px solid gray; width: 600px; padding: 5px; margin-top: 5px;
          margin-left: <c:out value="${20*replylist.redepth}"/>px; display: inline-block">    
        <c:out value="${replylist.writerid}"/> <c:out value="${replylist.date}"/>
        <a href="#" onclick="fn_replyDelete('<c:out value="${replylist.num}"/>')">삭제</a>
        <a href="#" onclick="fn_replyUpdate('<c:out value="${replylist.num}"/>')">수정</a>
        <a href="#" onclick="fn_replyReply('<c:out value="${replylist.num}"/>')">댓글</a>
        <br/>
        <div id="reply<c:out value="${replylist.num}"/>"><c:out value="${replylist.content}"/></div>
    </div><br/>
</c:forEach>


 





<!------------------------------------------- -->



<div class="path3">
	<ul>
		<li><a class="" href="../notice">목록</a></li>
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
						class="text-blue text-strong" href="${prev.num}">${prev.dtitle}</a></td>

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
						class="text-blue text-strong" href="${next.num}">${next.dtitle}</a></td>

				</c:if>
			</tr>
		</tbody>
	</table>
</div>

</main>