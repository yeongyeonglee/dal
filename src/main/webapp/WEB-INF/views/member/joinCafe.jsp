
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cafedal</title>

<link href="${path}/css/style-newmember-join.css" type="text/css"
	rel="stylesheet" />
	
	<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>

	<div class="join-wrapper">
		<div class="main">
			<div class="join-logo">
				<img src="${path}/images/logo.png" alt="로고" />
			</div>
			
			<form action="?${_csrf.parameterName}=${_csrf.token}"  method="post" enctype="multipart/form-data" >
					<legend>카페 선택</legend><br/><br/>
						<table class="table-basic-cm">
							<tr>
								<th><label class="q-text">이벤트 정보를 받고 싶은 카페를 선택해 주세요</label></th>
								<td colspan="3">
									<div class="cm-check">
										<input type="checkbox" name="check1" />
										 	<label class="cm-check2">공차</label> 
										<input type="checkbox" name="check1" /> 
											<label class="cm-check2">스타벅스</label> 
										<input type="checkbox" name="check1" />
										    <label class="cm-check2">이디야</label>
									   <input type="checkbox" name="check1" /> 
											<label class="cm-check2">커피빈</label> 
									   <input type="checkbox" name="check1" />
									       <label class="cm-check2">투썸플레이스</label>
									   <input type="checkbox" name="check1" />
									       <label class="cm-check2">할리스커피</label>
									</div>
								</td>
							</tr>
						</table>
				<c:if test="${not empty param.error}">
						<!-- 체크가 안되어있을때만 뜨는 화면창 -->
						<div style="color: red">
							하나라도 체크를 하셔야 합니다.<br> <br>
						</div>
					</c:if>
					
					
					<input src="newmember-join" class="btn1 join-button" type="button" onclick="location.href='join'"  value="이전"> 
					<input class="btn1 join-button" type="reset" value="다시 작성"> 
					<input class="btn1 join-button" type="submit" value="다음">
				</form>
					
				</div>
		</div>
		
		<!-- script  -->
		<script type="text/javascript">
		$(document).ready(function() {
			//전체 선택/해제
			$("#check-all").click(function() {
				var chk = $(this).is(":checked");
				if (chk) {
					$('input[name*="check"]').prop('checked', true);
				} else {
					$('input[name*="check"]').prop('checked', false);
				}
			});

			//체크 항목 확인
			$("#check").click(function() {
				$('input[name*="check"]').each(function(i) {
					if ($(this).is(":checked")) {
						alert($(this).val());
					}
				});
			});
		});
	</script>
		
</body>
</html>