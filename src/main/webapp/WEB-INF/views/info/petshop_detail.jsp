<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<style>
.tg {
	border-collapse: collapse;
	border-spacing: 0;
	width: 600px;
	height: 1000px;
 	border-right: none;
	border-left: none;
	border-top: none;
	border-bottom: none;  
}
.ta {
	border-collapse: collapse;
	border-spacing: 0;
	width: 600px;
 	border-right: none;
	border-left: none;
	border-top: none;
	border-bottom: none;  
}

.tg td {
	border-color: black;
	border-style: solid;
	border-width: 1px;
	font-family: Arial, sans-serif;
	font-size: 14px;
	overflow: hidden;
	padding: 10px 5px;
	word-break: normal;
  	border-right: none;
	border-left: none;
	border-top: none;
	border-bottom: none;  
}

.tg th {
	border-color: black;
	border-style: solid;
	border-width: 1px;
	font-family: Arial, sans-serif;
	font-size: 14px;
	font-weight: normal;
	overflow: hidden;
	padding: 10px 5px;
	word-break: normal;
  	border-right: none;
	border-left: none;
	border-top: none;
	border-bottom: none;  
}

.tg .tg-0pky {
	border-color: inherit;
	text-align: left;
	vertical-align: top
  	border-right: none;
	border-left: none;
	border-top: none;
	border-bottom: none; 
}
div.left{
float: left;
width: 50%;
        box-sizing: border-box;

}
div.right{
float: right;
        box-sizing: border-box;
width: 50%;
}
</style>

<script type="text/javascript" src="https://dapi.kakao.com/v2/maps/sdk.js?appkey=0c7fc5ef9400d2e001c7d219e0122879&libraries=services"></script>
<body>
<input type="hidden" id="p_no">
	<div class="left">
	<table class="tg">
<thead>
  <tr>
    <td><img class="absolute" id="p_photo" width="600px" height="500px" src="" class="img-fluid"></td>
  </tr>
</thead>
<tbody>
  <tr>
    <td><div class="map_wrap">
	<div id="map1" style="width: 600px; height: 500px;">
	</div>
	</div>
	</td>
  </tr>
</tbody>
</table>
</div>


<div class="right">
<table class="ta">
<thead>
  <tr>
    <td class="tg-0pky" id="p_title" style="text-align:center; width:250px; height:50px; font-size:20px; font-weight:bold;"></td>
    <td class="tg-0pky" id="phone" style="text-align:right; width:150px; height:50px; font-size:15px;"></td>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-0pky" colspan="2" style="word-break:break-all" id="p_content"></td>
  </tr>
</tbody>
</table>

<br>
<br>
<br>


<table id="replyboard" class="tg">
<thead>
  <tr id="detail">
    <th class="tg-0pky" colspan="5" id="r_content" style="text-align:center; width:280px; height=50px;">댓글</th>
	<th class="tg-0pky" id="user-id" style="width:70px; height=50px; text-align:center;">작성자</th>
	<th class="tg-0pky" id="regdate" style="width:70px; height=50px; text-align:center;">등록일</th>
	<th></th>
  </tr>
</thead>
</table>
<c:if test="${sessionScope.user.user_id == null}">
<input type="hidden" style="width:510px; height:50px;" id="replycontent" name="replycontent">
<input type="hidden" style="width:80px; height:50px;" id="write">
</c:if>
<c:if test="${sessionScope.user.user_id != null}">
<input style="width:510px; height:50px;" id="replycontent" name="replycontent">
<button style="width:80px; height:50px;" id="write">등록</button>
</c:if>
</div>





<script type="text/javascript">
	

</script>
</body>
</html>