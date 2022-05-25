<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn"      uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>       

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>프렌차이저 상세 화면</title>

<script src="/myProject_new/script/jquery-1.12.4.js"></script>   <!-- 제이쿼리연결 -->
<script src="/myProject_new/script/jquery-ui.js"></script>
</head>

<style>
body {
	font-size:9pt;
}
button {
	font-size:9pt;
}
table {
	width:600px;
	border-collapse:collapse; /*  cell 간격 없앰*/
}
th, td {
	border: 1px solid #cccccc;
	padding:3px;
}
.input1 {
	width:98%;
}
.textarea {
	width:95%;
	height:70px;
}
</style>

<script>

$(function(){
	$("#title").val("제목입력");
}); 


function fn_submit() {
	
	//trim() -> 앞뒤 공백 제거, java, jsp 있음 javascript는 없음
	
	if( $.trim($("#title").val()) =="") {
		alert("제목을 입력해주세요.");
		$("#title").focus();   //비어있을시 커서 생김
		return false;
	}		//제이쿼리
	$("#title").val($.trim($("#title").val()));  //공백있을시 없어짐
	
	if ( $.trim($("#pass").val()) == "") {
		alert("암호를 입력해주세요.");
		$("#pass").focus();
		return false;	
	}
	$("#pass").val($.trim($("#pass").val()));	
	4
	//AJAX
 	var formData = $("#frm").serialize(); //serialize : frm 안의 구성요소까지 포함
	$.ajax({
		type: "POST",
		data: formData,
		url : "boardWriteSave.do",
		dataType : "text",		//리턴타입
		success:function(data) {  //성공했을경우
			//alert(data);
			if(data == "ok") {      // controller 에서 리턴값 ok
				alert("저장하였습니다.");
				location ="boardList.do";
			}else {
				alert("저장 실패했습니다. 다시 시도해주세요.")
			}
		},
		error: function() {   //실패했을경우
			alert("오류발생");
		}
	});
	 
}

</script>

<body>
<form id="frm"> <!-- 비동기식으로 전송하기 때문에 post, name, action등 지움 -->
<table>
	<caption>프렌차이저 상세</caption>

	<tr>
		<th>번호</th>
		<td>${detailList.fnum}</td>
	</tr>
	<tr>
		<th>프렌차이저</th>
		<td>${detailList.franchiseName}</td>
	</tr>
	
	<tr>
		<th>지점</th>
		<td>${detailList.shopName }</td>
	</tr>
	<tr>
		<th>주소</th>
		<td>${detailList.address}</td>
		
	</tr>

	<tr>
		<th colspan="2">
		<button type="button" onclick="location='franchiseList.do'">취소</button>
		</th>
	</tr>
</table>
</form>
</body>
</html>