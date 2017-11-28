<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<link type="text/css" rel="stylesheet" href="${path}/resource/css/visualstyle.css">
<!-- <script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> -->

<div id="div_activate" class="container">
   <div class="title">
      <div class="row">회원목록페이지</div>
   </div>
   <!-- 회원가입 폼 -->
   <div class="row">
      <form action="?${_csrf.parameterName}=${_csrf.token}" method="post" enctype="multipart/form-data">
         <table id="tbl_info" class="table table-user">
          	  <tr>
                	<th id="tr_id">아이디</th>
                 	<th id="tr_pw">비밀번호</th>
                  	<th id="tr_name">이름</th>
                   	<th id="tr_mail">이메일</th>
                   	<th id="tr_birth">생일</th>
                   	<th id="tr_cafes">카페</th>
               </tr>
            <c:forEach var="m" items="${list}">
               <tr>
               		<td id="tr_id">${m.id}</td>
               		<td id="tr_pw">${m.pwd}</td>
               		<td id="tr_name">${m.name}</td>
               		<td id="tr_mail">${m.mail}</td>
               		<td id="tr_birth">${m.birth}</td>
               		<td id="tr_cafes">${m.cafes}</td>
               </tr>
            </c:forEach>
          </table>
	      <div class="buttons">		
				<%-- <input type="hidden" name="id" value="${list.id}" />
				<input type="submit" value="수정" /> --%>
				
				
				<a href="">취소</a>				
		 </div>
      </form>
   </div>
</div>