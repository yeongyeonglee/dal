<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}" />

  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script type="text/javascript">
 
    $(document).ready(function(){
        $("#massiveSelectCheckBox").click(function() {
            
            var isChecked = $(this).prop("checked");
            $(".deleteArticleId").prop("checked", isChecked);
            
        });
        
        $("#massiveDeleteBtn").click(function() {
            
            var isChecked = false;
            
            /* 각각의 클래스를 다 보면서 선택이 됬는지 안됬는지 체크한다. */
            $(".deleteArticleId").each(function(index, data){
                if( data.checked ){
               

                    isChecked = data.checked;
                }
            });
            
            if(!isChecked){
                alert("삭제할 대상을 선택하세요.");
                return;
            }
            
            /* 사용자에게 한번 더 컨펌 */
            if( confirm("정말 삭제하시겠습니까?")){
                alert("삭제되었습니다");
                
                var form = $("#massiveDeleteForm");
                form.attr("method", "post");
                form.attr("action", "<c:url value='manage/delete?${_csrf.parameterName}=${_csrf.token}' />");
                form.submit();
            }
        });
    });
 
</script>


<link type="text/css" rel="stylesheet"
	href="${path}/resource/css/liststyle.css">
<style>
.listnum ul {
	padding-left: 900px;
	list-style: none;
	float: left;
	display: inline;
}

.listnum ul li {
	float: left;
}

.listnum ul li a {
	float: left;
	padding: 4px;
	margin-right: 3px;
	width: 15px;
	color: #000;
	font: bold 12px tahoma;
	border: 1px solid #eee;
	text-align: center;
	text-decoration: none;
}

.listnum ul li a:hover, .listnum ul li a:focus {
	color: #fff;
	border: 1px solid #7b4122;
	background-color: #7b4122;
}
</style>
<main class="main">

<div style="margin-top: 30px; margin-bottom: -10px;">

	<label class="list-tit"> 카페 관리 페이지</label>

</div>


<h3 class="hidden">할인정보 목록</h3>

 <table class="table-garo-admin">
        <tr>
            <th>
               
            </th>
            <th>번호</th>
            <th>제목</th>
           
        </tr>
        
        
    <form id="massiveDeleteForm">
    
        <c:forEach items="${list}" var="n">
            <tr>
                <td>
                    <input type="checkbox" class="deleteArticleId" 
                            name="deleteArticleId" value="${n.code }" />
                </td>
                <td>${n.code }</td>
            
                <td>${n.name}</td>
            </tr>
        </c:forEach>
    </form>    
    
    </table>
  
    <span id="massiveDeleteBtn" class="reg-admin" style="cursor: pointer;">삭제</span>







<div class="reg-admin">
	<a class="eff-1" href="manage/reg">등록</a>
</div>
</main>