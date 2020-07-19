<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Doggle</title>
    <meta charset="utf-8">
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
</head>

	<!-- Start of Topbar -->
	
	<%@include file="topbar.jsp"%>
    
    <!-- End of Topbar -->

  	<!-- Start of main -->
  	<section class="site-blocks-cover overflow-hidden bg-light">
      <div class="container">
        <div class="row">
          <div class="col-md-7 align-self-center text-center text-md-left">
            <div class="intro-text">
				<font size=30px>자유게시판</font>   			
    		</div>
      	  </div>
     	</div>
      </div>
    </section>
    
   <form action='<c:url value='/board/boardInsert'/>' method="post">
        <div class="form-group">
              <label for="exampleFormControlInput1">제목</label>
            <input type="text" class="form-control" id="exampleFormControlInput1" name="title" placeholder="제목을 작성해주세요.">
          </div>
        <div class="form-group">
            <label for="exampleFormControlInput1">작성자id</label>
            <input type="text" class="form-control" id="exampleFormControlInput1" name="crea_id" placeholder="이름을 적어주세요.">
          </div>
          <div class="form-group">
            <label for="exampleFormControlTextarea1">내용</label>
            <textarea class="form-control" id="exampleFormControlTextarea1" name="contents" rows="10"></textarea>
          </div>
        <button type="submit" class="btn btn-info">등록하기</button>
        <button type="button" class="btn btn-secondary">목록으로</button>
    </form>

    
    
    <!-- End of main -->
    
    <!-- Start of footer -->
    
	<%@include file="../nav/footer.jsp"%>
  	
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