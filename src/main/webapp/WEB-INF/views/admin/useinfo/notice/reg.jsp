<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<link type="text/css" rel="stylesheet" href="${path}/resource/css/liststyle.css">

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
 <body>
	<div class="reg-tit">카페 이용정보 등록</div>
	<form action="?${_csrf.parameterName}=${_csrf.token}" method="post" enctype="multipart/form-data">
		<fieldset class="reg-field">
			<legend class="hidden">공지사항 수정정보 필드</legend>
			<table class="table-garo2">
				<tbody>
					<tr>
						<td class="tit w100">제목</td>
						<td><input type="text" name="utitle" /></td>
					</tr>
					<tr>
						<td class="w60">카페 코드</td>
						<td><input type="text" name="cafecode" /></td>
					</tr>
					<tr>
						<td class="w60">카페 이름</td>
						<td><input type="text" name="cname" /></td>
					</tr>					
					
					<tr>
						<td colspan="2"><textarea  class="ckeditor" style="overflow: auto; " name="ucontent" rows="40" cols="100"></textarea>

						</td>
					</tr>
				</tbody>
			</table>
			<div class="buttons">
				<input style="color:white; background: #7b4122; border-style: none;" type="submit" value="등록" />
				<a href="../notice">취소</a>				
			</div>
		</fieldset>
	</form>
</body>

<script type="text/javascript">
    CKEDITOR.replace('Contents',{
            toolbar: 'Full',
            uiColor: '#9AB8F3',
        }
    );
</script>


