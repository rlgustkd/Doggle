<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Doggle</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700, 900|Vollkorn:400i"
	rel="stylesheet">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/fonts/icomoon/style.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/jquery-ui.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/owl.carousel.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/owl.theme.default.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/owl.theme.default.min.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/jquery.fancybox.min.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap-datepicker.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/fonts/flaticon/font/flaticon.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/aos.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
</head>

<!-- Start of Topbar -->

<%@include file="../../nav/topbar.jsp"%>

<!-- End of Topbar -->

<!-- Start of main -->
    <!-- End of Topbar -->
  	<!-- Start of main -->
  	<section style="padding-top: 100px;">
      <div class="container">
        <div class="row">
          <div class="col-md-7 align-self-center text-center text-md-left">
            <div class="intro-text">
				<font size=5px>자유게시판</font>   	
    		</div>
      	  </div>
     	</div>
      </div>
    </section>

<section id="container">
	<form action='<c:url value='/story/detailStoryWriter'/>' method="post">
		<div class="form-group">
			<label for="p_no">게시글 번호</label> <input type="text"
				class="form-control" id="p_no" name="p_no" value="${read.p_no }"
				readonly>
		</div>

	</form>
	<div class="form-group">
		<label for="fb_title">제목</label> <input type="text"
			class="form-control" id="fb_title" name="title"
			value="${read.fb_title }" readonly>
	</div>
	<div class="form-group" ">
		<label for="fb_content">내용</label> 
		<span class="form-control" id="fb_content" name="contents" style=" display : table; height : 300px; border : 1px solid black;"> 
			${read.fb_content }
		</span>
		
		<div class="inputArea">
			<button type="button" class="btn btn-primary" onclick="location.href='freeboard' ">돌아가기</button>
		</div>
		
		
		<%-- <input type="text"
			class="form-control" id="fb_content" name="contents"
			value="${read.fb_content }" readonly> --%>
			<!-- 
			
	</div>
	<button id="modify_btn">수정하기</button>
	<button id="modify_btn">삭제하기</button>
	<button id="modify_btn">추천</button>


	<script>
		// 폼을 변수에 저장
		var formOjb = $("form[role='form']");
		// 수정 버튼 클릭
		$("#modity_btn").click(function() {
			formOjb.attr("action", "http://localhost:8080/doggle/story/modify");
			formOjb.attr("method", "get");
			formObj.submit();
		});
		// 삭제 버튼 클릭
		$("delete_btn").click(function() {
			formOjb.attr("aciton", "/detailStoryView/delete.jsp");
			formOjb.attr("method", "get");
			formOjb.submit();
		});
	</script>
 -->
</section>

<!-- End of main -->

<!-- Start of footer -->

<%@include file="../../nav/footer.jsp"%>

<!-- End of footer -->
<!-- .site-wrap -->

<script
	src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-ui.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/popper.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/owl.carousel.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery.countdown.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery.easing.1.3.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/aos.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery.fancybox.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/jquery.sticky.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/isotope.pkgd.min.js"></script>


<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>


</body>
</html>