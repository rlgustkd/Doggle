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
	
<%@include file="../../nav/topbar.jsp"%>
    
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
    
   
    
    <table class="table table-hover">
							<thead>
								<tr>
									<th>번호</th>
									<th>제목</th>
									<th>작성자</th>
									<th>날짜</th>
									<th>조회수</th>
									<th>추천수</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${FreeboardStory }" var= "FreeboardStory">
								<tr>
								<td>${FreeboardStory.p_no }</td>
								<td><a href="../story/detailStoryView?p_no=${FreeboardStory.p_no }">${FreeboardStory.fb_title }</a></td>
								<td>${FreeboardStory.user_id }</td>
								<td>${FreeboardStory.regdate }</td>
								<td>${FreeboardStory.viewcnt }</td>
								<td>${FreeboardStory.recommend }</td>
								</tr>
								</c:forEach>
							</tbody>
						</table>
						<form action="../story/freeboard.jsp" method="get" class="form-inline my-2 my-lg-0">
          <input type="text" name="search" class="form-control mr-sm-2" type="search" placeholder="검색어를 입력하세요.">
          <button class="btn btn-outline-success my-2 my-sm-0" type="submit">검색</button>
        </form>
						
<% String context = request.getContextPath(); %>
   <form action="freeboard/upload" role="form" autocomplete="off" method='GET'>
      <div class="inputArea">
         <button type="submit" id="register_Btn" class="btn btn-primary">글쓰기</button>
      </div>
      </form>
      
						<div class="text-center">
							<ul class="pagination">
								<li><a href="#">1</a></li>
								<li><a href="#">2</a></li>
								<li><a href="#">3</a></li>
								<li><a href="#">4</a></li>
								<li><a href="#">5</a></li>
							</ul>
						</div>
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