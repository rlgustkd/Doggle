<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>자유게시판 글 등록</title>

<!-- <script src="/resources/jquery/jquery-3.3.1.min.js"></script> -->
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link rel="stylesheet" href="/resources/bootstrap/bootstrap.min.css">
<link rel="stylesheet"
	href="/resources/bootstrap/bootstrap-theme.min.css">
<script src="/resources/bootstrap/bootstrap.min.js"></script>



<style>
body {
	font-family: '맑은 고딕', verdana;
	padding: 0;
	margin: 0;
}

ul {
	padding: 0;
	margin: 0;
	list-style: none;
}

div#root {
	width: 90%;
	margin: 0 auto;
}

header#header {
	font-size: 60px;
	padding: 20px 0;
}

header#header h1 a {
	color: #000;
	font-weight: bold;
}

nav#nav {
	padding: 10px;
	text-align: right;
}

nav#nav ul li {
	display: inline-block;
	margin-left: 10px;
}

section#container {
	padding: 20px 0;
	border-top: 2px solid #eee;
	border-bottom: 2px solid #eee;
}

section#container::after {
	content: "";
	display: block;
	clear: both;
}

aside {
	float: left;
	width: 200px;
}

div#container_box {
	float: right;
	width: calc(100% - 200px - 20px);
}

aside ul li {
	text-align: center;
	margin-bottom: 10px;
}

aside ul li a {
	display: block;
	width: 100%;
	padding: 10px 0;
}

aside ul li a:hover {
	background: #eee;
}

footer#footer {
	background: #f9f9f9;
	padding: 20px;
}

footer#footer ul li {
	display: inline-block;
	margin-right: 10px;
}
</style>


<style>
.inputArea {
	margin: 10px 0;
}

select {
	width: 100px;
}

label {
	display: inline-block;
	width: 70px;
	padding: 5px;
}

label[for='gdsDes'] {
	display: block;
}

input {
	width: 150px;
}

textarea#gdsDes {
	width: 400px;
	height: 180px;
}

.select_img img {
	margin: 20px 0;
}
</style>

</head>

<body>
	<%
		String context = request.getContextPath();
	%>


	<form action="<%=context%>/story/freeboard/upload" role="form"
		method="post" autocomplete="off" enctype="multipart/form-data"
		name="fbform">

		<div class="inputArea">
			<label for="fb_title">제목</label> 
			<input type="text" id="fb_title" name="fb_title" />
		</div>


		<div class="inputArea">
			<label for="content">내용</label>
			<div rows="5" cols="50" id="content" contentEditable="true">
				<img src="">
			</div>
		</div>

		<!-- <input type="text" id="fb_content" name="fb_content" contentEditable="true"/></div>   -->
		<!-- <div rows="5" cols="50" id="fb_content" name="fb_content" contentEditable="true"></div> </div> -->


		<!-- <input type="hidden" id="fb_content" onchange="valueChange()">  -->
		
		<input type="hidden" id="fb_content" name="fb_content" value="abcdefg">



		<div class="inputArea">
			<label for="fb_photo">이미지</label> <input type="file" id="fb_photo"
				name="file" />
			<!-- <div class="select_img"><img src="" /></div> -->
		</div>


		<script>
			$("#fb_photo").change(
					function() {
						if (this.files && this.files[0]) {
							var reader = new FileReader;
							reader.onload = function(data) {

								var imgarea = document.createElement('img');
								// <img> 와 같은 변수를 만든것 (태그 동적생성)

								imgarea.src = data.target.result;
								// DOM 방식. target?? 대략, 이미지소스를 만들어주고 거기에 우리가 선택한 data(사진)을 넣어주겠다.

								imgarea.style.width = 240 + "px";
								// 사이즈만 변경해줌.

								document.getElementById('content').appendChild(
										imgarea);
								//f_content 를 아이디로 가지고있는 요소에게 접근(가져옴). 자식요소로 imgarea를 넣어주겠다.

							}
							reader.readAsDataURL(this.files[0]);
						}
					});
		</script>


		<%=request.getRealPath("/")%>

		<div class="inputArea">
			<button type="button" id="register_Btn" class="btn btn-primary">등록</button>
		</div>

	</form>
	<script type="text/javascript">
		/* 		function Change() {
		
		 $('#fb_content').val('change!!!!!');
		
		 $('#fb_content').change();
		
		 }

		 */
		$("#register_Btn").click(function() {

			/* String id = request.getParameter("user_id"); */
			
			var abc = $('#content').html();
			alert(abc);
			
			document.getElementById('fb_content').setAttribute('value', abc);

			var a = document.getElementById('fb_content').value;
			alert(a);

			document.fbform.submit();
		});
			
	</script>
	
	
	

</body>
</html>



