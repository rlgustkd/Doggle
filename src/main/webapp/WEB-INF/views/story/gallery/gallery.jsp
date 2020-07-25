<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<title>Doggle</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="http://fancyapps.com/fancybox/source/jquery.fancybox.js"></script>

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

<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/custom/gallery.css">


</head>
<body>
	<!-- Start of Topbar -->

<%@include file="../../nav/topbar.jsp"%>

	<!-- End of Topbar -->

	<!-- Start of main -->
	<section class="site-blocks-cover overflow-hidden bg-light">
		<div class="container">
			<div class="row">
				<div class="col-md-7 align-self-center text-center text-md-left">
					<div class="intro-text">
						<font size=30px>사진 갤러리</font>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- 여기가 메인 컨텐츠 -->
	<c:set var="user" value="${sessionScope.user}" />
	<c:if test="${user != null }">
		<a href="galleryUpload">작성하기</a>
	</c:if>
	<section class="site-section" id="gallery-section">

		<div class="row justify-content-center" data-aos="fade-up">

			<!-- photoboard의 row 불러오기 -->
			<c:forEach items="${pbposts}" var="pbposts">

				<div class="imglist">

					<c:set var="tel" value="${fn:split(pbposts.pb_photo, ',')}" />
					<c:forEach var="temp" items="${tel}" varStatus="status">
						<c:choose>

							<c:when test="${status.index == 0 }">
								<a href="${pageContext.request.contextPath}/resources/images/${temp}" data-fancybox="${pbposts.p_no}"> 
								<img src="${pageContext.request.contextPath}/resources/images/${temp}" name="thumbnail" style="width: 240px; height: 240px;" />
								</a>
							</c:when>
							<c:otherwise>
								<a href="${pageContext.request.contextPath}/resources/images/${temp}" data-fancybox="${pbposts.p_no}"></a>
							</c:otherwise>
						</c:choose>
					</c:forEach>
					
					<div class="caption" name="caption${pbposts.p_no}">
						<br>
						<div class="user_pic">
							<img src="${pageContext.request.contextPath}/resources/images/${pbposts.pic}" id="profile">
						</div>
						<input type="hidden" class="writer_id" value="${pbposts.user_id }">
						<span class="rep_userid">${pbposts.nickname }</span>
						<span style="float: right;">${pbposts.regdate}</span>
						<ul class="myMenu"> 
							<li class="menu2"><i class="fa fa-ellipsis-v" aria-hidden="true"></i>
								<c:if test="${sessionScope.user.user_id eq pbposts.user_id}">
								<ul class="writer submenu">
									<li onclick="delPost();">삭제</li>
								</ul>
								</c:if>
								<c:if test="${pbposts.user_id ne sessionScope.user.user_id}">
								<ul class="reader submenu">
								<li onclick="report();">신고</li>
								</ul>
								</c:if>
							</li>
						</ul>
						<div class="reply_content">
							<br>
							<p>${pbposts.pb_title }</p>
							<br>
							<p>${pbposts.pb_content }</p>
							<p>
								<br> <i class="fa fa-eye" aria-hidden="true"></i><span name="viewcnt">${pbposts.viewcnt }</span>
								<i class="fa fa-heart" onclick="recommend();"></i><span name="rec">${pbposts.recommend }</span> 
								<i class='fa fa-comment'></i> <span name="com">0</span> 
							</p>
						</div>
						<hr>
						<!-- 댓글 창 시작 -->
						<div class="reply-list">

							<c:forEach var="replies" items="${replies}">
								<c:if test="${replies.p_no == pbposts.p_no }">
									<div style='display: flex;'>
										<div class='user_pic' style='float: left;'>
											<img
												src="${pageContext.request.contextPath}/resources/images/${replies.pic}">
										</div>
										<div class='reply_content'>
											<span class='rep_userid'>${replies.nickname}</span>
											<p>${replies.r_content}</p>
											<p class='replytime'>${replies.regdate }</p>

											<p class='replytime model'>
												<c:if test="${replies.user_id == sessionScope.user_id}">
													<a value="${replies.r_no}" class='delReply'>삭제</a>
												</c:if>
											</p>
										</div>
									</div>
									<hr>

								</c:if>
							</c:forEach>

						</div>
						<!-- 댓글 창 끝 -->
						<c:set var="user" value="${sessionScope.user}" />
						<c:if test="${user != null }">
							<div class="user_pic">
								<img src="${pageContext.request.contextPath}/resources/images/${sessionScope.user.pic}">
							</div>
							<div class="input_rep">
								<input type="hidden" class="your_id" name="${pbposts.p_no }" value="${sessionScope.user.user_id }"> 
								<input type="text" id="inputReply" name="inputReply" value="" placeholder="Add a comment..."> 
								<input type="button" value="게시" id="inputsubmit" name="inputsubmit">
							</div>
						</c:if>
						<c:if test="${user == null}">
							<div class="user_pic">
								<img src="${pageContext.request.contextPath}/resources/images/profile.png">
							</div>
							<div class="input_rep">
								<input type="hidden" class="your_id" value="">
								<input type="text" id="inputReply" value="" placeholder="댓글을 등록하려면 로그인하세요.." onfocus=this.blur(); readonly>

							</div>
						</c:if>
					</div>

				</div>
			</c:forEach>
		</div>
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



	<script>
		var p_no;
		$('img[name=thumbnail]').click(function() {
			p_no = $(this).parent().attr("data-fancybox");
			var user_id = $("div[name=caption" + p_no + "]").find(".your_id").val();
			var writer_id = $("div[name=caption" + p_no + "]").find(".writer_id").val();
			if(user_id != "" && user_id != null && writer_id != user_id) {
				ajaxfunction2(p_no, "", "view");
			}
			else
			
			ajaxfunction(p_no, "", "", "");
			
		});
		function recommend() {
			var user_id = $("div[name=caption" + p_no + "]").find(".your_id").val();
			var writer_id = $("div[name=caption" + p_no + "]").find(".writer_id").val();
			
			if(user_id == "" || user_id == null) {
				alert("추천하려면 로그인하세요!");
			}
			else if (user_id == writer_id) {
				alert("스스로 추천할 수 없습니다.");
			}
			else {
				ajaxfunction2(p_no, user_id, "rec");
			}
			
		}
		function report() {
			var user_id = $("div[name=caption" + p_no + "]").find(".your_id").val();
			
			if(user_id == "" || user_id == null) {
				alert("신고하려면 로그인하세요!");
			} else {
				var user_id = $("div[name=caption" + p_no + "]").find(".your_id").val();
				ajaxfunction2(p_no, user_id, "rep");
			}
		}
		
		$(function() {
			$(document).on('click', '#inputsubmit', function() {
				var r_userId = $(this).parent().children(".your_id").val();
				var r_content = $(this).parent().children("#inputReply").val();
				var p_no = $(this).parent().children(".your_id").attr('name');
				if (r_content == "") {
					alert("댓글 내용을 입력해주세요.");
				} else {
					ajaxfunction(p_no, r_content, r_userId, "");
				}
				$(this).parent().children("#inputReply").val("");
				r_content = "";
			});
			$(document).on('click', '.delReply', function() {
				var r_no = $(this).attr('value');
				var result = confirm('삭제하시겠습니까? 삭제하시면 복구할 수 없습니다.');
				if (result)
					ajaxfunction(p_no, "", "", r_no);
			});
		});
		function ajaxfunction(p_no, r_content, user_id, r_no) {
			$.ajax({
						url : "gallery", // 전송 URL
						type : 'PUT', // GET or POST 방식
						traditional : true,
						dataType : 'json',
						data : {
							p_no : p_no, // 보내고자 하는 data 변수 설정
							r_content : r_content,
							user_id : user_id,
							r_no : r_no
						},
						//Ajax 성공시 호출 
						success : function(msg) {
							$("div[name=caption" + p_no + "]").find('span[name=com]').text(msg.length);
							$("div[name=caption" + p_no + "]").find('.reply-list').empty();
							$(".fancybox-caption__body").find('.reply-list').empty();
							for (var i = 0; i < msg.length; i++) {
								var html = "<div style='display: flex;'><div class='user_pic' style='float:left;'><img src=" 
						+ "${pageContext.request.contextPath}/resources/images/" + msg[i].pic + "></div><div class='reply_content'><span class='rep_userid'>"
										+ msg[i].nickname
										+ "</span><p>"
										+ msg[i].r_content
										+ "</p><p class='replytime'>"
										+ msg[i].regdate
										+ "</p><p class='replytime model'>";
								if (msg[i].user_id == $(".your_id").val()) {
									html = html
											+ "<a value=" + msg[i].r_no + " class='delReply'>삭제</a></p></div></div><hr>";
								} else {
									html = html + "</p></div></div><hr>";
								}
								$("div[name=caption" + p_no + "]").find('.reply-list').append(html);
								$(".fancybox-caption__body").find('.reply-list').append(html);
							}
						},
						//Ajax 실패시 호출
						error : function(jqXHR, textStatus, errorThrown) {
							console.log("jqXHR : " + jqXHR + "textStatus : " + textStatus + "errorThrown : " + errorThrown);
						}
					});
		};
		
		function ajaxfunction2(p_no, user_id, flag) {
			$.ajax({
				url : "gallery", // 전송 URL
				type : 'PATCH', // GET or POST 방식
				traditional : true,
				dataType : 'json',
				data : {
					p_no : p_no, // 보내고자 하는 data 변수 설정
					user_id : user_id,
					flag : flag
				},
						//Ajax 성공시 호출 
				success : function(msg) {
					if(msg == false) {
						alert("추천/신고는 한 번만 할 수 있습니다.");
					}
					else if(msg == true) {
						alert("신고가 접수되었습니다.");
					}
					else {
						$("div[name=caption" + p_no + "]").find('span[name=rec]').text(msg[0]);
						$(".fancybox-caption__body").find('span[name=rec]').text(msg[0]);
						$("div[name=caption" + p_no + "]").find('span[name=viewcnt]').text(msg[1]);
						$(".fancybox-caption__body").find('span[name=viewcnt]').text(msg[1]);
					}
				},
				//Ajax 실패시 호출
				error : function(jqXHR, textStatus, errorThrown) {
					console.log("jqXHR : " + jqXHR + "textStatus : "
							+ textStatus + "errorThrown : "
							+ errorThrown);
					}
			});
		};
		function delPost() {
			var result = confirm('삭제하시겠습니까? 삭제하시면 복구할 수 없습니다.');
			if (result) {
				$.ajax({
					url : "gallery", // 전송 URL
					type : 'DELETE', // GET or POST 방식
					traditional : true,
					data : {
						p_no : p_no // 보내고자 하는 data 변수 설정
					},
							//Ajax 성공시 호출 
					success : function(msg) {
						alert(msg);
						window.location.href = "gallery";					
					},
					//Ajax 실패시 호출
					error : function(jqXHR, textStatus, errorThrown) {
						console.log("jqXHR : " + jqXHR + "textStatus : " + textStatus + "errorThrown : " + errorThrown);
					}
				});
			}	
		};
		// Initialise fancybox with custom settings
		$('[data-fancybox]')
				.fancybox(
						{
							preventCaptionOverlap : false,
							infobar : false,
							loop : true,
							// Disable idle
							idleTime : 0,
							// Display only these two buttons
							buttons : [ 'close' ],
							// Custom caption content
							caption : function(instance, obj) {
								return '<div><p class="fancy-nav"><a data-fancybox-prev title="Previous" tabindex="1">&lsaquo;</a> <a data-fancybox-next title="Next" tabindex="2">&rsaquo;</a> &nbsp; <span data-fancybox-index></span> of <span data-fancybox-count></span> images</p>'
										+ $(this).parent().find('.caption').html() + '</div>';
							},
							onInit : function(instance) {
								// Toggle caption on tap
								instance.$refs.container.on('onmouseup', '[data-fancybox-info]', function(e) {
									instance.$refs.container.toggleClass('fancybox-vertical-caption');
								});
							},
							afterLoad : function(previous, current) {
								if (previous) {
									$.fancybox.getInstance().current.opts.$orig.data('caption', 'New caption');
									$.fancybox.getInstance().group[ $.fancybox.getInstance().current.index ].caption = 'New caption';
									$.fancybox.getInstance().current.opts.caption = '<div><p class="fancy-nav"><a data-fancybox-prev title="Previous" tabindex="1">&lsaquo;</a> <a data-fancybox-next title="Next" tabindex="2">&rsaquo;</a> &nbsp; <span data-fancybox-index></span> of <span data-fancybox-count></span> images</p>'
										+ $("div[name=caption" + p_no + "]").html() + '</div>';
									$.fancybox.getInstance().updateControls();
								}
							}
						});
	</script>

</body>
</html>