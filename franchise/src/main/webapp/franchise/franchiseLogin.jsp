<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 화면</title>

<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script>
$(function() {
	
	$("#btn_submit").click(function(){
		var userid = $.trim($("#userid").val());
		var pass = $.trim($("#pass").val());
		
		if(userid == "") {
			alert("아이디를 입력해주세요.");	
			$("#userid").focuse();
			return false;
		}
		
		if(pass == "") {
			alert("암호를 입력해주세요.");	
			$("#pass").focuse();
			return false;
		}
		
		$.ajax({
			/* 전송 전 세팅 */
    		type:"POST",
    		data: "userid="+userid+ "&pass=" + pass,
    		url:"franchiseLoginSub.do", //데이터를 보내는 곳
    		dataType:"text",     // 리턴 타입
    		
    		/* 전송 후 세팅  */
    		success: function(result) {
    			if(result == "ok") {
    				alert(userid + "님 로그인 되었습니다.");
    				location = "franchiseList.do";
    			} else {
    				alert("아이디 또는 패스워드를 확인해주세요.");
    			}
    		},
    		error: function() {  // 장애발생
    			alert("오류발생");
    		}
    	});	
	});
});

</script>

</head>

<style>
body {
	font-size:9pt;
	font-color: #333333;
	font-family:맑은 고딕;
}
a {
	text-decoration: none;
}
table {
	width: 600px;
	border-collapse;  
}
th, td {
	border:1px solid #cccccc;
	padding:3px;
	line-height:2s;
}
caption {
	font-size : 15pt;
	font-weight : bold;
	margin-top: 10px;
	padding-bottom : 5px;
}
.div_button {
	width: 600px;
	text-align:center;
	magin-top : 5px;

}
</style>

<body>

<form id="frm" name="frm">

<table>
	<caption>로그인</caption>
	<tr>
		<th><label for="userid">아이디</label></th>
			<td>
				<input type="text" name="userid" id="userid" placeholder="아이디입력">
			</td>
	</tr>
	<tr>
		<th><label for="pass">암호</label></th>
			<td>
				<input type="password" name="pass" id="pass">
			</td>
	</tr>
</table>

<div class="div_button">
	<button type="button" id = "btn_submit" >로그인</button>
</div>

</form>

</body>
</html>