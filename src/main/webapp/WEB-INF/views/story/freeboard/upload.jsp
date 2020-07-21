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
		method="post" autocomplete="off" enctype="multipart/form-data">

		<div class="inputArea">
			<label for="fb_title">제목</label> <input type="text" id="fb_title"
				name="fb_title" />
		</div>


		<div class="inputArea">
			<label for="fb_content">내용</label>
			<!-- <div rows="5" cols="50" id="fb_content" name="fb_content" contentEditable="true" class="select_img" ><img src=""></div> -->
			<div rows="5" cols="50" id="fb_content" name="fb_content"
				contentEditable="true">
			</div>



			<div class="inputArea">
				<label for="fb_photo">이미지</label> <input type="file" id="fb_photo"
					name="file" />
				<!-- 			<div class="select_img"><img src="" /></div> -->
			</div>

			<script>
				$("#fb_photo").change(
						function() {
							if (this.files && this.files[0]) {
								var reader = new FileReader;
								//var html = "<div class=" + "select_img" + "><img src=" + " /></div>"
								reader.onload = function(data) {
									$(".select_img img").attr("src",
											data.target.result).width(500);
									//$("#fb_content").append(html);
								}
								reader.readAsDataURL(this.files[0]);
							}
						});
			</script>


		</div>


		<%=request.getRealPath("/")%>

		<div class="inputArea">
			<button type="submit" id="register_Btn" class="btn btn-primary">등록</button>
		</div>


	</form>



	</form>

</body>
</html>



