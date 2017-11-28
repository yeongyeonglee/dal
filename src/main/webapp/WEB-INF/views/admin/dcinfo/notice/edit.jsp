<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="path" value="${pageContext.request.contextPath}" />
<link type="text/css" rel="stylesheet"
	href="${path}/resource/css/liststyle.css">

<script src="${path}/resource/ckeditor/ckeditor.js"></script>
<script>
    var editor;
    CKEDITOR.on( 'instanceReady', function( ev ) {
        editor = ev.editor;
        document.getElementById( 'readOnlyOn' ).style.display = '';
        editor.on( 'readOnly', function() {
            document.getElementById( 'readOnlyOn' ).style.display = this.readOnly ? 'none' : '';
            document.getElementById( 'readOnlyOff' ).style.display = this.readOnly ? '' : 'none';
        });
    });
   
    function toggleReadOnly( isReadOnly ) {
        editor.setReadOnly( isReadOnly );
    }
</script>
	<div class="reg-tit">카페 할인정보 수정</div>
	 <form action = "?${_csrf.parameterName}=${_csrf.token}" method="post" enctype="multipart/form-data" >
		<fieldset>
			<legend class="hidden">카페 할인정보 수정 필드</legend>
			<table class="table-garo2">
				<tbody>
				<tr>
						<td style="width: 270px;">제목</td>
						<td colspan="3"><input style="margin-left: -200px;" type="text" name="dtitle" value="${n.dtitle}" /></td>
					</tr>
					<tr>
						<td style="width: 270px;">시작일자</td>
						<td colspan="3">
							<fmt:formatDate pattern="yyyy-MM-dd" value="${n.startdate}" var="sdate"/>				  
							<input type="date" name="startdate" value="${sdate}" name="n.startdate" /> 
						</td>
					</tr>
					<tr>
						<td style="width: 270px;">종료일자</td>
						<td colspan="3">
							<fmt:formatDate pattern="yyyy-MM-dd" value="${n.finishdate}" var="fdate"/>						
						    <input type="date" name="finishdate"  value="${fdate}"  name="n.finishdate" />
						</td>
					</tr>
					<tr>
						<td style="width: 270px;">카페명</td>
						<td style="text-align: left;">${n.cname}</td>
					</tr>
					<%-- <tr>
						<td>첨부파일</td>
						<td colspan="3">
						<c:forEach var="f" items="${files}">
							<span>${f.src}</span>
							<a href="notice-file-del?code=${f.code}&ncode=${n.code}">[X]</a>
						</c:forEach>
						</td>
					</tr> --%>
					<tr>
						<td colspan="4"><textarea  class="ckeditor" style="overflow: auto;" name="dcontent" rows="40" cols="100">${n.dcontent}</textarea>

						</td>
					</tr>
				</tbody>
			</table>
			<div class="buttons">				
				<input style="color:white; background: #7b4122; border-style: none;" type="hidden" name="num" value="${n.num}" />
				<input style="color:white; background: #7b4122; border-style: none;" type="submit" value="저장" />
				<a href="${n.num}">취소</a>				
			</div>
		</fieldset>
</form>

<script type="text/javascript">
    CKEDITOR.replace('Contents',{
            toolbar: 'Full',
            uiColor: '#9AB8F3',
        }
    );
</script>


