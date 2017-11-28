<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<script
   src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<div id="div_activate" class="container">
   <div class="title">
      <div class="row">마이페이지</div>
   </div>
   <!-- 회원가입 폼 -->
   <div class="row">
      <form action="?${_csrf.parameterName}=${_csrf.token}" method="post"
         enctype="multipart/form-data">
         <table id="tbl_info" class="table table-user">
            <c:forEach var="m" items="${list}">
               <tr id="tr_id">
                  <th>아이디</th>
                  <td>${m.id}</td>
               </tr>
               <tr id="tr_pw">
                  <th>비밀번호</th>

                  <td>${m.pwd}</td>
               </tr>
               <tr id="tr_name">
                  <th>이름</th>

                  <td>${m.name}</td>
               </tr>
               <tr id="tr_mail">
                  <th>이메일</th>
                  <td>${m.mail}</td>
               </tr>
               <tr id="tr_birth">
                  <th>생일</th>
                  <td>${m.birth}</td>
               </tr>
            </c:forEach>
               <th>카페</th>
               <c:forEach var="n" items="${listcafe}">
                  <tr id="tr_cafename">
                     <td>${n.cafename}</td>
                  </tr>
               </c:forEach>
         </table>
      </form>

      <div>
         <input class="btn1 join-button" type="submit"
            onclick="location.href='login'" value="수정" />
      </div>
   </div>
</div>