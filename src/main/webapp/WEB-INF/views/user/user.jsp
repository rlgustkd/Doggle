<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Doggle &mdash; Website Template by Colorlib</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700, 900|Vollkorn:400i"
	rel="stylesheet">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/fonts/icomoon/style.css">

<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" id="bootstrap-css">
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
	
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/custom/member.css">
</head>

<body data-spy="scroll" data-target=".site-navbar-target"
	data-offset="300" id="home-section">

	<div id="overlayer"></div>
	<div class="loader">
		<div class="spinner-border text-primary" role="status">
			<span class="sr-only">Loading...</span>
		</div>
	</div>

	<div class="site-wrap">
	<!-- Header Start -->

		<!-- Header End -->
		<div class="container">
			<div class="row">
				<div class="col-md-6 col-md-offset-3">
					<div class="panel panel-login">
						<div class="panel-heading">
							<div class="row">
								<div class="col-xs-6">
									<a href="#" class="active" id="login-form-link">Login</a>
								</div>
								<div class="col-xs-6">
									<a href="#" id="register-form-link">Register</a>
								</div>
							</div>
							<hr>
						</div>
						<div class="panel-body">
							<div class="row">
								<div class="col-lg-12">
									<form id="login-form" action="login"
										method="post" role="form" style="display: block;">
										<div class="form-group">
											<input type="text" name="loginId" id="loginId" tabindex="1"
												class="form-control" placeholder="ID" value="">
										</div>
										<div class="form-group">
											<input type="password" name="loginPwd" id="loginPwd"
												tabindex="2" class="form-control" placeholder="Password">
										</div>
										<div class="form-group text-center">
											<input type="checkbox" tabindex="3" class="" name="remember"
												id="remember"> <label for="remember">
												Remember Me</label>
										</div>
										<div class="form-group">
											<div class="row">
												<div class="col-sm-6 col-sm-offset-3">
													<input type="submit" name="login-submit" id="login-submit"
														tabindex="4" class="form-control btn btn-login"
														value="Log In">
												</div>
											</div>
										</div>
										<div class="form-group">
											<div class="row">
												<div class="col-lg-12">
													<div class="text-center">
														<a href="https://phpoll.com/recover" tabindex="5"
															class="forgot-password">Forgot Password?</a>
													</div>
												</div>
											</div>
										</div>
									</form>
									<form id="register-form"
										action="user" method="post"
										role="form" style="display: none;">
										<div class="form-group">
											<input type="text" name="userid" id="userid" tabindex="1"
												class="form-control" placeholder="ID" value="">
										</div>
										<div class="form-group">
											<input type="text" name="nickname" id="nickname" tabindex="2"
												class="form-control" placeholder="Nickname" value="">
										</div>
										<div class="form-group">
											<input type="email" name="email" id="email" tabindex="3"
												class="form-control" placeholder="Email Address" value="">
										</div>
										<div class="form-group">
											<input type="password" name="password" id="password"
												tabindex="4" class="form-control" placeholder="Password">
										</div>
										<div class="form-group">
											<input type="password" name="confirm-password"
												id="confirm-password" tabindex="5" class="form-control"
												placeholder="Confirm Password">
										</div>
										<div class="form-group">
											<div class="row">
												<div class="col-sm-6 col-sm-offset-3">
													<input type="submit" name="register-submit"
														id="register-submit" tabindex="6"
														class="form-control btn btn-register" value="Register Now">
												</div>
											</div>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- footer Start -->

		<!-- footer End -->


	</div>
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

	<script type="text/javascript">
		$(function() {

			$('#login-form-link').click(function(e) {
				$("#login-form").delay(100).fadeIn(100);
				$("#register-form").fadeOut(100);
				$('#register-form-link').removeClass('active');
				$(this).addClass('active');
				e.preventDefault();
			});
			$('#register-form-link').click(function(e) {
				$("#register-form").delay(100).fadeIn(100);
				$("#login-form").fadeOut(100);
				$('#login-form-link').removeClass('active');
				$(this).addClass('active');
				e.preventDefault();
			});

		});

		$(document).ready(function() {
			$("#register-submit").on("click", function() {
				if ($("#userid").val() == "") {
					alert("아이디를 입력해주세요.");
					$("#userid").focus();
					return false;
				}
				else if ($("#nickname").val() == "") {
					alert("사용할 이름을 입력해주세요.");
					$("#nickname").focus();
					return false;
				}
				else if ($("#email").val() == "") {
					alert("이메일을 입력해주세요.");
					$("#email").focus();
					return false;
				}
				else if ($("#password").val() == "") {
					alert("비밀번호를 입력해주세요.");
					$("#password").focus();
					return false;
				}
				else if ($("#confirm-password").val() == "") {
					alert("비밀번호를 입력해주세요.");
					$("#confirm-password").focus();
					return false;
				}
				else if ($("#confirm-password").val() != $("#password").val()) {
					alert("비밀번호가 동일하지 않습니다.");
					$("#password").focus();
					return false;
				}
				else {
					alert("회원가입 input 검사 완료");
					$("#userid").val() = "";
					$("#nickname").val() = "";
					$("#email").val() = "";
					$("#password").val() = "";
					$("#confirm-password").val() = "";
				}
			});

			$("#login-submit").on("click", function() {
				if ($("#loginId").val() == "") {
					alert("아이디를 입력해주세요.");
					$("#loginId").focus();
					return false;
				}
				else if ($("#loginPwd").val() == "") {
					alert("비밀번호를 입력해주세요.");
					$("#loginPwd").focus();
					return false;
				}
				else {
					$("#loginId").val() = "";
					$("#loginPwd").val() = "";
				}
			});

		})
	</script>
</body>
</html>
