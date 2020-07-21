<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>
	<div class="container py-5">
	
	
	<form action="gallery" enctype="multipart/form-data" method="post">
									<div>
									제목: <input type="text">
									내용: <input type="text">
									</div>
										<input multiple="multiple" type="file" name="file" onchange="fileCheck(this)"
											accept="image/gif, image/jpeg, image/png" /> <input type="submit"
											value="작성" /> 
	</form>
									<div id="image_container" style="display: inline;"></div>
									
	</div>
	
	
	
	<script src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery-ui.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/owl.carousel.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.countdown.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.easing.1.3.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/aos.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.fancybox.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.sticky.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/isotope.pkgd.min.js"></script>

<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
	
	<script>
	//이미지 업로드시 이미지 파일만
	function fileCheck(obj) {
		pathpoint = obj.value.lastIndexOf('.');
		filepoint = obj.value.substring(pathpoint + 1, obj.length);
		filetype = filepoint.toLowerCase();
		if (filetype == 'jpg' || filetype == 'gif' || filetype == 'png'
				|| filetype == 'jpeg' || filetype == 'bmp') {

			// 정상적인 이미지 확장자 파일일 경우 ...

		} else {
			alert('이미지 파일만 선택할 수 있습니다.');

			parentObj = obj.parentNode
			node = parentObj.replaceChild(obj.cloneNode(true), obj);

			return false;
		}
		if (filetype == 'bmp') {
			upload = confirm('BMP 파일은 웹상에서 사용하기엔 적절한 이미지 포맷이 아닙니다.\n그래도 계속 하시겠습니까?');
			if (!upload)
				return false;
		}
		$('#image_container').empty();
	      for (var image of event.target.files) {
	          var reader = new FileReader();
	          reader.onload = function(event) {
	              
	              var img = document.createElement("img");
	              img.setAttribute("src", event.target.result); 
	              img.setAttribute("style", 'width: 100px; height: 100px;');
	              document.querySelector("div#image_container").appendChild(img);
	               }; 
	               reader.readAsDataURL(image); }
	}

	</script>
</body>
</html>