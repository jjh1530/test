<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>   


<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="<c:url value='/css/bootstrap/css/bootstrap.min.css'/>">
<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="/franchise/script/jquery-1.12.4.js"></script>   <!-- 제이쿼리연결 -->
<script src="/franchise/script/jquery-ui.js"></script>
<script src="/franchise/script/jdetects.min.js"></script>
<script src="css/js/jquery-3.3.1.min.js"></script>
<script src="<c:url value='/css/bootstrap/js/bootstrap.min.js'/>"></script>
 

<script type="text/javascript">
//스크랩 방지
var omitformtags=["input", "textarea", "select"]

omitformtags=omitformtags.join("|")

function disableselect(e){
if (omitformtags.indexOf(e.target.tagName.toLowerCase())==-1)
return false
}

function reEnable(){
return true
}

if (typeof document.onselectstart!="undefined")
document.onselectstart=new Function ("return false")
else{
document.onmousedown=disableselect
document.onmouseup=reEnable
}

// 우측 클릭 방지
document.onmousedown=disableclick;
status="우클릭은 불가합니다.";

function disableclick(event){
    if (event.button==2) {
        alert(status);
        return false;
    }
}

//
// F12 버튼 방지
    $(document).ready(function(){
        $(document).bind('keydown',function(e){
            if ( e.keyCode == 123 /* F12 */) {
                e.preventDefault();
                e.returnValue = false;
            }
        });
    });
function nosession() {
	String USERID = (String) session.getAttribute("seesionUserID");  
	if (USERID == null) {
		alert("세션만료")
		
	}
}
     
    
</script>



<meta charset="UTF-8">
<title>목록</title>
</head>
<style>
body {
	font-size:9pt;
}
button {
	font-size:9pt;
}
table {
	width:900px;
	border-collapse:collapse; /*  cell 간격 없앰*/
	margin-left : 400pt;
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
.div1 {
width: 900px;
test-align : center;
margin-left:685pt;
font-size:15pt;
}

.div2 {
width:600px;
text-aling:left;
margin-left:50pt;
font-size:8pt;
}
</style>

<body oncontextmenu='return false' onselectstart='return false' ondragstart='return false'>

<div class="div1">프렌차이즈 목록</div>

<table>
	<tr>
		<th width="20%">서울</th>
		<th width="20%">인천</th>
		<th width="20%">경기도</th>
		
		<th width="20%">대전</th>
		<th width="20%">세종</th>
	</tr>
	<tr>
		<td>${seoulTotal} </td>
		<td>${incheonTotal}</td>
		<td>${gyeonggiTotal}</td>
		<td>${daejeonTotal}</td>
		<td>${sejongTotal}</td>
	</tr>
	<tr>
		<th width="20%">강원도</th>
		<th width="20%">부산</th>
		<th width="20%">광주</th>
		<th width="20%">울산</th>
		<th width="20%">대구</th>
	</tr>
	<tr>
		<td>${gangwonTotal} </td>
		<td>${busanTotal}</td>
		<td>${gwangjuTotal}</td>
		<td>${ulsanTotal}</td>
		<td>${daeguTotal}</td>
	</tr>
	<tr>
		<th width="20%">경상북도</th>
		<th width="20%">경상남도</th>
		<th width="20%">충청남도</th>
		<th width="20%">충청북도</th>
		<th width="20%">제주도</th>
	</tr>
	<tr>
		<td>${gyeongbukTotal} </td>
		<td>${gyeongnamTotal}</td>
		<td>${chungnamTotal}</td>
		<td>${chungbukTotal}</td>
		<td>${jejuTotal}</td>
	</tr>
	<tr>
		<th width="20%">전라남도</th>
		<th width="20%">전라북도</th>
		<th width="20%"></th>
		<th width="20%"></th>
		<th width="20%">총합</th>
	</tr>
	<tr>
		<td>${jeonnamTotal} </td>
		<td>${jeonbukTotal}</td>
		<td></td>
		<td></td>
		<td> ${total }</td>
	</tr>
</table>


<form name="searchFrm" method="post" action="franchiseList.do" style= " margin-top:20pt; margin-left:400pt">
	<select name="searchGubun" id="searchGubun">
		<option value="franchiseName">프렌차이즈명</option>
		<option value="shopName">지점</option>
		<option value="local">지역</option>
		<option value="address">주소</option>
	</select>
	<input type="text" name="searchText" id="searchText">
	<button type="submit">검색</button>
</form>



<!-- 프렌차이즈명, 지점명, 주소 -->
<table>
	 <tr>
		<th width="5%">번호</th>
		<th width="15%">프렌차이즈명</th>
		<th width="25%">지점</th>
		<th width="10%">지역</th>
		<th width="45%">주소</th>
	</tr>
	
	<c:set var="cnt" value="${rowNumber }"/>
	
	<c:forEach var="result" items="${franchiseList }">
	
	<tr>
		<td>${result.fnum }</td>
		<td><a href="franchiseDetail.do?fnum=${result.fnum }">${result.franchisename}</a></td>
		<td>${result.shopname}</td>
		<td>${result.local}</td>
		<td>${result.address}</td>
	</tr>
	
		<c:set var="cnt" value="${cnt -1 }"/>
	</c:forEach> 
</table> 



<div style="width:600px; margin-top:5px; text-align:center; margin-left : 500pt; ">
	<c:forEach var="i" begin="1" end="${totalPage }">
		<a href="franchiseList.do?viewPage=${i }" >${i }</a>
	</c:forEach>
</div> 


</body>
</html>