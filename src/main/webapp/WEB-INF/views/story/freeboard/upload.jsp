<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Doggle</title>
    <meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>자유게시판 글 등록</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">    
    
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700, 900|Vollkorn:400i" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/fonts/icomoon/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/jquery-ui.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/owl.carousel.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/owl.theme.default.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/owl.theme.default.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/jquery.fancybox.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap-datepicker.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/fonts/flaticon/font/flaticon.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/aos.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
    	<!-- Start of Topbar -->
	
<%@include file="../topbar.jsp"%>
    
    <!-- End of Topbar -->
  	<!-- Start of main -->
  	<section style="padding-top: 100px;">
      <div class="container">
        <div class="row">
          <div class="col-md-7 align-self-center text-center text-md-left">
            <div class="intro-text">
				<font size=5px>글 쓰기</font>   	
    		</div>
      	  </div>
     	</div>
      </div>
    </section>
    
    
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
			<div rows="5" cols="50" id="content" contentEditable="true" style=" min-height : 300px; height : height:auto; border : 1px solid black; overflow:hidden;">
			</div>
		</div>

		<!-- <input type="text" id="fb_content" name="fb_content" contentEditable="true"/></div>   -->
		<!-- <div rows="5" cols="50" id="fb_content" name="fb_content" contentEditable="true"></div> </div> -->


		<!-- <input type="hidden" id="fb_content" onchange="valueChange()">  -->
		
		<input type="hidden" id="fb_content" name="fb_content" >
		<input type="hidden" id="user_id" name="user_id" >
		


		<div class="inputArea">
			<label for="fb_photo">이미지</label> 
			<input type="file" id="fb_photo"
				name="file" />
			<!-- <div class="select_img"><img src="" /></div> -->
		</div>


		<script>
			$("#fb_photo").change(
					function() {
						if (this.files && this.files[0]) {
							var reader = new FileReader;
							reader.onload = function(data) {
								document.getElementById('content').add
								var imgarea = document.createElement('img');
								// <img> 와 같은 변수를 만든것 (태그 동적생성)
								imgarea.src = data.target.result;
								alert(data.target.result);
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


		<div class="inputArea">
			<button type="button" id="register_Btn" class="btn btn-primary">등록</button>
			
			<button type="button" class="btn btn-primary" onclick="location.href='../freeboard' ">취소</button>
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
			
			document.getElementById('fb_content').setAttribute('value', abc);
			var a = document.getElementById('fb_content').value;
			document.fbform.submit();
		});
			
	</script>
	
	
	
	
    
    <!-- End of main -->
    
    <!-- Start of footer -->
    
	<%@include file="../../nav/footer.jsp"%>
  	
  	<!-- End of footer --> 
  <!-- .site-wrap -->

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

  
	

</body>
</html>