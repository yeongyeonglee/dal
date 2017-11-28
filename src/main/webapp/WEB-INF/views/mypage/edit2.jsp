<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="?${_csrf.parameterName}=${_csrf.token}" method="post" enctype="multipart/form-data">
			<table id="tbl_info" class="table table-user">
				<tr id="tr_id">
					<th>아이디</th>
					<td>
						${n.id}
					</td>
				</tr>
				
				<tr id="tr_pw">
					<th>비밀번호</th>
					<td>
						<input name="pwd" id="pwd" type="password" placeholder="비밀번호" />
					</td>
				</tr>
				
				<tr id="tr_name">
					<th>이름</th>
					<td>
						<input name="name" id="name" type="text" placeholder="이름" />
					</td>
				</tr>
					
				<tr id="tr_mail">
					<th>이메일</th>
					<td>
						<input name="mail" id="mail" type="text" placeholder="이메일" />
					</td>
				</tr>
				
				<tr id="tr_birth">
					<th>생일</th>
					<td>
						${n.birth}
					</td>
				</tr>
				
				<tr>
				<th><label>이벤트 정보를 받고 싶은 카페를 선택해 주세요</label></th>
				<td>
					<form name="check">
						<div class="cm-check">
							<input type="checkbox"  id="cafes" name="cafes" value="1 "/> 
							 	<label class="cm-check2">공차</label> 
							<input type="checkbox"  id="cafes" name="cafes" value="2 "/> 
								<label class="cm-check2">스타벅스</label> 
							<input type="checkbox" id="cafes" name="cafes" value="3 "/> 
							    <label class="cm-check2">이디야</label>
						   <input type="checkbox"  id="cafes" name="cafes" value="4 "/> 
								<label class="cm-check2">커피빈</label> 
						   <input type="checkbox"  id="cafes"name="cafes" value="5 "/> 
						       <label class="cm-check2">투썸플레이스</label>
						   <input type="checkbox"  id="cafes" name="cafes" value="6 "/> 
						       <label class="cm-check2">할리스커피</label>
						</div>
					</form>
				</td>
			</tr>
</body>
</html>