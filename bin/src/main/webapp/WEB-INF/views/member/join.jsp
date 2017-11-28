<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>puppyfood101JOIN</title>
<link href="${path}/css/style-newmember-join.css" type="text/css"
   rel="stylesheet" />
</head>
<body>
   
   
   <div class="join-wrapper">
      <div class="main">
         <div class="join-logo">
            <img src="${path}/images/logo.png" alt="로고" />
         </div>
         
         <form action="?${_csrf.parameterName}=${_csrf.token}"  class="center" method="post" name="addjoin" enctype="multipart/form-data">
      
            <legend>개인 정보</legend>
            <br> <br>
            <ol>
              <li>
                 <label for="id">아이디</label> 
                 <input type="text"   id="id"   name="id"   placeholder="아이디를 입력해주세요"  autocomplete="off" size=30 style="border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px; height: 30px;" />
                     <div class="check">
                       <button class="btn join-button" onclick="idCheck()" type="button" style="width: 80px;font-size: 12px; margin-left: 60px;">중복체크</button>
                     </div>
               </li>
               <li>
                 <label for="pwd1">비밀번호</label> 
                 <input type="password"  id="password" name="pwd" placeholder="비밀번호를 입력하세요" autocomplete="off" onkeyup="chkPassword"  size=30 style="border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px; height: 30px;"  />
                 <c:if test="">
						<!-- 체크가 안되어있을때만 뜨는 화면창 -->
						<div style="color: red">모든 내용에 동의를 하셔야 합니다.<br><br></div>
					</c:if>
               </li>
               <!-- <li>
                 <label for="pwd2">비밀번호 확인</label> 
                 <input type="password" id="passwordCheck" name="pwdCheck" placeholder="비밀번호를 한번 더 입력해주세요" autocomplete="off" onkeyup="chkPassword"  size=30 style="border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px; height: 30px;"/>
               </li> -->
               <li>
                 <label for="username">이름</label> 
                 <input type="text" id="name" name="name" placeholder="이름을 입력해주세요" autocomplete="off"  size=30 style="border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px; height: 30px;" />
               </li>               
               <li>
                 <label for="birth">생년월일</label> 
                 <input type="text" id="birth" name="birth" placeholder="YYMMDD로 입력해주세요" autocomplete="off"  size=30 style="border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px; height: 30px;"/>
               </li>
               
               <li>
                 <label for="email">이메일 주소</label>
                 <input type="text" id="mail" name="mail" placeholder="이메일을 입력하세요" autocomplete="off"    size=30 style="border:none;border-right:0px; border-top:0px; boder-left:0px; boder-bottom:0px; height: 30px;"/>     
                  <div class="check">
                     </div>
               </li>
               
               <legend>카페 선택</legend><br/><br/>
						<table class="table-basic-cm">
							<tr>
								<th><label class="q-text">이벤트 정보를 받고 싶은 카페를 선택해 주세요</label></th>
								<td colspan="3">
								<form name="check">
									<div class="cm-check">
										<input type="checkbox"  id="cafes" name="cafes"  value="1 "/> 
										 	<label class="cm-check2">공차</label> 
										<input type="checkbox"  id="cafes" name="cafes"  value="2 "/> 
											<label class="cm-check2">스타벅스</label> 
										<input type="checkbox" id="cafes" name="cafes"  value="3 "/> 
										    <label class="cm-check2">이디야</label>
									   <input type="checkbox"  id="cafes" name="cafes"  value="4 "/> 
											<label class="cm-check2">커피빈</label> 
									   <input type="checkbox"  id="cafes"name="cafes"  value="5 "/> 
									       <label class="cm-check2">투썸플레이스</label>
									   <input type="checkbox"  id="cafes" name="cafes"  value="6 "/> 
									       <label class="cm-check2">할리스커피</label>
										</div>
									</form>
								</td>
							</tr>
						</table>
				<c:if test="${not empty param.error}">
						<!-- 체크가 안되어있을때만 뜨는 화면창 -->
						<div style="color: red">
							하나라도 체크를 하셔야 합니다.<br> <br>
						</div>
					</c:if>
            </ol>
    
         <br> <br>
         
         <!-- <fieldset id="button"> -->
            <div id="center">
               <input class="btn1 join-button"  type="button"  onclick="location.href='login'" value="이전">
               <input class="btn1 join-button"  type="reset"  value="다시작성">
               <%-- <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />  --%>
               <input  class="btn1 join-button"  type="submit"  onclick="location.href='joinCafe'" value="다음"  />
               <!-- 나중에 디비연동과 같이 수정 -->
            </div>
        </form>
      </div>
   </div>
   
    <script
      src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript">
/*     function chkEmail() {
        var chkblank = /[\s]/g;
        var chkEmail = $("#email").val();
        
        if(chkEmail==""){
           alert("이메일을 입력하지 않았습니다.");
           $("#email").focus();
        }else if(chkblank.test(chkEmail)==true){
           alert("공백은 입력할 수 없습니다.");
           $("#email").focus();
        } else {
        $.ajax({
           type : "POST",
           url : "../../checkEmailController",
           data : {
              chkEmail : chkEmail
           },
           success : function(result) {
              if (result == 1) {
                 alert("사용 가능한 이메일입니다.");
                 $("#id").focus();
              } else if(result == 0){
                 alert("중복된 이메일입니다.");
                 $("#email").focus();
                 
              } 
           }
        })
        }
     } */

       function idCheck() {
         var chkBlank = /[\s]/g;
         var chkId = $("#id").val();
         if(chkId==""){
            alert("아이디를 입력하지 않았습니다.");
            $("#id").focus();
         }else if(chkBlank.test(chkId)==true){
            alert("공백은 입력할 수 없습니다.");
            $("#id").focus();
            
         }else{
         $.ajax({
            type : "POST",
            url : "../../IdCheckController",
            data : {
             chkId : chkId
            },
            success : function(result) {
               if (result == 1) {
                  alert("사용 가능한 아이디입니다.");
                  $("#mail").focus();
               } else{
                  alert("중복된 아이디입니다.");
                  $("#id").focus();
               } 
            }
         })
         }
      }
   </script>
   
   
   
</body>
</html> 