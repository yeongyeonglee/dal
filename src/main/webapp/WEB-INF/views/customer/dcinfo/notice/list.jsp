<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}" />

<link type="text/css" rel="stylesheet"
   href="${path}/resource/css/liststyle.css">
<style>
.listnum ul{  
      padding-left: 900px;
    list-style:none;  
    float:left;  
    display:inline;  
}  
.listnum ul li{  
    float:left;  
}  
.listnum ul li a {  
    float:left;  
    padding:4px;  
    margin-right:3px;  
    width:15px;  
    color:#000;  
    font:bold 12px tahoma;  
    border:1px solid #eee;  
    text-align:center;  
    text-decoration:none;  
}  
.listnum ul li a:hover, .listnum ul li a:focus {  
    color:#fff;  
    border:1px solid  #7b4122;  
    background-color: #7b4122;  
} 
</style>
<main class="main">

<div style="margin-top:30px; margin-bottom: -10px;">

<label class="list-tit" > 카페 할인 정보</label>

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
   




<h3 class="hidden">할인정보 목록</h3>
<table class="table-garo2">
   <thead>
      <tr>
         <th class="w60">카페</th>
         <th class="tit w100">제목</th>
         <th class="w60">시작일자</th>
         <th class="w60">종료일자</th>
         <th class="w60">조회수</th>
      </tr>
   </thead>
   <tbody>
      <c:forEach var="n" items="${list}">
         <tr>
            <td>${n.cname}</td>
            <td class="con w100"><a href="notice/${n.num}">${n.dtitle}</td>
            <td><fmt:formatDate pattern="yyyy-MM-dd" value="${n.startdate}"/></td>   
               <td><fmt:formatDate pattern="yyyy-MM-dd" value="${n.finishdate}"/></td>   
            
            <td>${n.hit}</td>
         </tr>
      </c:forEach>
   </tbody>
</table>

<!-- <div class="reg">
   <a class="eff-1" href="notice/reg">등록</a>
</div> -->

<h3 class="hidden">공지사항 검색폼</h3>
<div class="d1">
   <form >

      <select
            name="f">
            <option selected="selected" value="dtitle">제목</option>
            <option value="dcontent">내용</option>
         </select> <input class="btn-search" type="text" name="q" placeholder="검색어 입력">
         <input class="btn-button" type="submit" value="▶" />
   
   </form>
</div>

<!-- 리스트 : 이전  1 2 3 4 5 ... 다음 --> <c:set var="page" value="${param.p}" />
<c:set var="startNum" value="${page-((page-1)%5)}" /> <c:set
   var="lastNum"
   value="${fn:substringBefore(count%10 ==0 ? count/10 : count/10+1, '.')}" />
   
   

   <div class="listnum">
      <ul class="listnum">
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





</main>