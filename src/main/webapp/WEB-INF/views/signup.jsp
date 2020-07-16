<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
    <title>Doggle &mdash; Website Template by Colorlib</title>
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

<!-- 현재 아래 스크립트문 있으나 마나임. 안됨. -->
	<script type="text/javascript">
	$(document).ready(function(){
		// 취소
		$(".cencle").on("click", function(){
			
			location.href = "main";
			
		})
			
			$("#submit").on("click", function(){
				if($("#id").val()==""){
					alert("아이디를 입력해주세요.");
					$("#id").focus();
					return false;
				}
				if($("#pwd").val()==""){
					alert("비밀번호를 입력해주세요.");
					$("#pwd").focus();
					return false;
				}
				if($("#name").val()==""){
					alert("성명을 입력해주세요.");
					$("#name").focus();
					return false;
				}
			});
			
		})
	</script>
	
  <body data-spy="scroll" data-target=".site-navbar-target" data-offset="300" id="home-section">

  <div id="overlayer"></div>
  <div class="loader">
    <div class="spinner-border text-primary" role="status">
      <span class="sr-only">Loading...</span>
    </div>
  </div>

  <div class="site-wrap">

    <div class="site-mobile-menu site-navbar-target">
      <div class="site-mobile-menu-header">
        <div class="site-mobile-menu-close mt-3">
          <span class="icon-close2 js-menu-toggle"></span>
        </div>
      </div>
      <div class="site-mobile-menu-body"></div>
    </div>
    
    <header class="site-navbar js-sticky-header site-navbar-target" role="banner" >

      <div class="container">
        <div class="row align-items-center">
          
          <div class="col-6 col-xl-2">
            <h1 class="mb-0 site-logo"><a href="index.jsp" class="h2 mb-0">Dogger<span class="text-primary">.</span> </a></h1>
          </div>

          <div class="col-12 col-md-10 d-none d-xl-block">
            <nav class="site-navigation position-relative text-right" role="navigation">

              <ul class="site-menu main-menu js-clone-nav mr-auto d-none d-lg-block">
                <li><a href="#home-section" class="nav-link">Home</a></li>
                <li class="has-children">
                  <a href="#about-section" class="nav-link">About</a>
                  <ul class="dropdown">
                    <li><a href="#trainers-section" class="nav-link">Trainers</a></li>
                    <li><a href="#pricing-section" class="nav-link">Pricing</a></li>
                    <li><a href="#faq-section" class="nav-link">FAQ</a></li>
                    <li><a href="#testimonials-section" class="nav-link">Testimonials</a></li>
                    <li><a href="#gallery-section" class="nav-link">Gallery</a></li>
                    <li><a href="#blog-section" class="nav-link">Blog</a></li>
                    <li class="has-children">
                      <a href="#">More Links</a>
                      <ul class="dropdown">
                        <li><a href="#">Menu One</a></li>
                        <li><a href="#">Menu Two</a></li>
                        <li><a href="#">Menu Three</a></li>
                      </ul>
                    </li>
                  </ul>
                </li>
                
                <li><a href="#trainers-section" class="nav-link">Trainers</a></li>
                <li><a href="#services-section" class="nav-link">Services</a></li>
                <li><a href="#contact-section" class="nav-link">Contact</a></li>
              </ul>
            </nav>
          </div>


          <div class="col-6 d-inline-block d-xl-none ml-md-0 py-3" style="position: relative; top: 3px;"><a href="#" class="site-menu-toggle js-menu-toggle float-right"><span class="icon-menu h3"></span></a></div>

        </div>
      </div>
      
    </header>


    <section class="site-section" id="contact-section" style = "padding-top : 100px";>
      <div class="container">
        <div class="row no-gutters" >
          <div class="col-lg-6 bg-primary">
            <form action="signup" method="post" class="p-5 contact-form">
              
              <h2 class="h4 mb-5 heading">회원가입</h2> 

			<div class="row form-group">
                
                <div class="col-md-12">
                  <label for="id">ID</label> 
                  <input type="text" id="id" class="form-control" name="id">
                </div>
              </div>

			  <div class="row form-group">
                <div class="col-md-6 mb-3 mb-md-0">
                  <label for="pwd">Password</label>
                  <input type="password" id="pwd" class="form-control" name="pwd">
                </div>
                <div class="col-md-6">
                  <label for="pwdck">Password check</label>
                  <input type="password" id="pwdck" class="form-control" name="pwdck">
                </div>
              </div>
              
              <div class="row form-group">
                
                <div class="col-md-12">
                  <label for="name">Name</label> 
                  <input type="text" id="name" class="form-control" name="name">
                </div>
              </div>
              
               <div class="row form-group">
                
                <div class="col-md-12">
                  <label for="nickname">Nickname</label> 
                  <input type="text" id="nickname" class="form-control" name="nickname">
                </div>
              </div>
              

              <div class="row form-group">
                
                <div class="col-md-12">
                  <label for="email">Email</label> 
                  <input type="email" id="email" class="form-control" name="email">
                </div>
              </div>

              <div class="row form-group">
                <div class="col-md-12">
                   <input type="submit" value="회원가입" id="submit" name="submit" class="btn btn-dark btn-md text-white" >
                </div>
              </div>
              
              <div class="row form-group">
                <div class="col-md-12">
                <!--   <input type="submit" value="취소" class="btn btn-dark btn-md text-white"> -->
                  
					<button class="cencle btn btn-danger" type="button">취소</button>
                </div>
              </div> 

				
              
            </form>
          </div>
          <div class="col-lg-6 bg-secondary">
            <div class="row justify-content-center align-items-center h-100">
              <div class="col-lg-6 text-center heading-section mb-5 align-self-center">
                <div class="paws">
                  <span class="icon-paw"></span>
                </div>
                <h2 class="text-white mb-5">확인해주세요!</h2>
                <ul class="list-unstyled text-left address">
                  <li>
                    <span class="d-block">빈 공간 없이 써주세요:</span>
                    <p>모두 꽉 채워주세요</p>
                  </li>
                  <li>
                    <span class="d-block">동일하게 써주세요:</span>
                    <p>비밀번호와 비밀번호 확인을 틀리지 말아주세요</p>
                  </li>
                  <li>
                    <span class="d-block">이메일을 확인해주세요:</span>
                    <p>기재하신 이메일로 인증을 해주신 후에 이용이 가능합니다</p>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    
    
    <footer class="site-footer">
      <div class="container">
        <div class="row">
          <div class="col-md-9">
            <div class="row">
              <div class="col-md-5">
                <h2 class="footer-heading mb-4">About Us</h2>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Neque facere laudantium magnam voluptatum autem. Amet aliquid nesciunt veritatis aliquam.</p>
              </div>
              <div class="col-md-3 ml-auto">
                <h2 class="footer-heading mb-4">Quick Links</h2>
                <ul class="list-unstyled">
                  <li><a href="#about-section" class="smoothscroll">About Us</a></li>
                  <li><a href="#trainers-section" class="smoothscroll">Trainers</a></li>
                  <li><a href="#services-section" class="smoothscroll">Services</a></li>
                  <li><a href="#testimonials-section" class="smoothscroll">Testimonials</a></li>
                  <li><a href="#contact-section" class="smoothscroll">Contact Us</a></li>
                </ul>
              </div>
              <div class="col-md-3">
                <h2 class="footer-heading mb-4">Follow Us</h2>
                <a href="#" class="pl-0 pr-3"><span class="icon-facebook"></span></a>
                <a href="#" class="pl-3 pr-3"><span class="icon-twitter"></span></a>
                <a href="#" class="pl-3 pr-3"><span class="icon-instagram"></span></a>
                <a href="#" class="pl-3 pr-3"><span class="icon-linkedin"></span></a>
              </div>
            </div>
          </div>
          <div class="col-md-3">
            <h2 class="footer-heading mb-4">Subscribe Newsletter</h2>
            <form action="#" method="post" class="footer-subscribe">
              <div class="input-group mb-3">
                <input type="text" class="form-control border-secondary text-white bg-transparent" placeholder="Enter Email" aria-label="Enter Email" aria-describedby="button-addon2">
                <div class="input-group-append">
                  <button class="btn btn-primary text-black" type="button" id="button-addon2">Send</button>
                </div>
              </div>
            </form>
          </div>
        </div>
        <div class="row pt-5 mt-5 text-center">
          <div class="col-md-12">
            <div class="border-top pt-5">
              <p class="copyright"><small>
              <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="icon-heart text-danger" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank" >Colorlib</a>
            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></small></p>
        
            </div>
          </div>
          
        </div>
      </div>
    </footer>

  </div> <!-- .site-wrap -->

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

<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
	<head>
		<!-- 합쳐지고 최소화된 최신 CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
		<!-- 부가적인 테마 -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	 	
	 	<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<title>회원가입</title>
	</head>
	<script type="text/javascript">
		$(document).ready(function(){
			// 취소
			$(".cencle").on("click", function(){
				
				location.href = "main";
						    
			})
		
			$("#submit").on("click", function(){
				if($("#id").val()==""){
					alert("아이디를 입력해주세요.");
					$("#id").focus();
					return false;
				}
				if($("#pwd").val()==""){
					alert("비밀번호를 입력해주세요.");
					$("#pwd").focus();
					return false;
				}
				if($("#name").val()==""){
					alert("성명을 입력해주세요.");
					$("#name").focus();
					return false;
				}
			});
			
			
			
		})
	</script>
	<body>
		<section id="container">
			<form action="signup" method="post">
				<div class="form-group has-feedback">
					<label class="control-label" for="id">아이디</label>
					<input class="form-control" type="text" id="id" name="id" />
				</div>
				<div class="form-group has-feedback">
					<label class="control-label" for="pwd">패스워드</label>
					<input class="form-control" type="password" id="pwd" name="pwd" />
				</div>
				<div class="form-group has-feedback">
					<label class="control-label" for="name">성명</label>
					<input class="form-control" type="text" id="name" name="name" />
				</div>
				<div class="form-group has-feedback">
					<label class="control-label" for="nickname">닉네임</label>
					<input class="form-control" type="text" id="nickname" name="nickname" />
				</div>
				<div class="form-group has-feedback">
					<label class="control-label" for="email">이메일</label>
					<input class="form-control" type="email" id="email" name="email" />
				</div>
				<div class="form-group has-feedback">
					<button class="btn btn-success" type="submit" id="submit">회원가입</button>
					<button class="cencle btn btn-danger" type="button">취소</button>
				</div>
			</form>
		</section>
		
	</body>
	
</html> --%>
