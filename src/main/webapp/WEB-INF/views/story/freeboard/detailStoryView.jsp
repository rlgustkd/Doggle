<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Doggle</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
	
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>
	
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

<%@include file="../topbar.jsp"%>

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
	<div class="form-group"">
		<label for="fb_content">내용</label> 
		<span class="form-control" id="fb_content" name="contents" style="display: table; min-height: 300px; height: height:auto; border: 1px solid black; overflow: hidden;">
			${read.fb_content } </span>

		<div class="inputArea">
			<button type="button" class="btn btn-primary"
				onclick="location.href='freeboard' ">돌아가기</button>
		</div>

	</div>

	<input type="hidden" name="your_id" value="${sessionScope.user.user_id}"> 
	<input type="hidden" name="writer" value="${read.user_id}">
	
		<c:if test="${sessionScope.user.user_id != null }"> 
		<button id="recommend_btn">추천하기</button>
		<button id="report_btn">신고하기</button>
		<c:if test="${read.user_id == sessionScope.user.user_id}">
		<button id="delete_btn">삭제하기</button>
		
	</c:if>
	</c:if>
	<script>
	/*
	$(document).ready( function() {
		var user_id = $('input[name=your_id]').val();
		var writer = $('input[name=writer]').val();
		if(user_id != writer) {
			alert("조회!!!");
			ajaxfunction(p_no, "", "view");
		}
	}
	*/
		var p_no = $('input[name=p_no]').val();
		
		$('#recommend_btn').click(function() {
			var user_id = $('input[name=your_id]').val();
			var writer = $('input[name=writer]').val();
			if(user_id == writer) {
				alert("스스로 추천할 수 없습니다.");
			}
			else {
				ajaxfunction(p_no, user_id, "rec");
			}
		});
		$('#report_btn').click(function() {
			var user_id = $('input[name=your_id]').val();
			var writer = $('input[name=writer]').val();
			if(user_id == writer) {
				alert("스스로 신고할 수 없습니다.");
			}
			else {
				ajaxfunction(p_no, user_id, "rep");
			}	
		});
		function ajaxfunction(p_no, user_id, flag) {
			$.ajax({
				url : "detailStoryView", // 전송 URL
				type : 'PUT', // GET or POST 방식
				traditional : true,
				data : {
					p_no : p_no,		// 보내고자 하는 data 변수 설정
					user_id : user_id,
					flag : flag
				},
				//Ajax 성공시 호출 
				success : function(msg) {
					if(msg != 0)
						alert(msg);				
				},
				//Ajax 실패시 호출
				error : function(jqXHR, textStatus, errorThrown) {
					console.log("jqXHR : " + jqXHR
							+ "textStatus : " + textStatus
							+ "errorThrown : " + errorThrown);
				}
			});	
		}
		
		
		$('#delete_btn').click(
				function() {
					var result = confirm('삭제하시겠습니까? 삭제하시면 복구할 수 없습니다.');
					if (result) {
						$.ajax({
							url : "delete", // 전송 URL
							type : 'DELETE', // GET or POST 방식
							traditional : true,
							data : {
								p_no : p_no
							// 보내고자 하는 data 변수 설정
							},
							//Ajax 성공시 호출 
							success : function(msg) {
								alert(msg);
								window.location.href = "freeboard";
							},
							//Ajax 실패시 호출
							error : function(jqXHR, textStatus, errorThrown) {
								console.log("jqXHR : " + jqXHR
										+ "textStatus : " + textStatus
										+ "errorThrown : " + errorThrown);
							}
						});
					}
				});
	</script>
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