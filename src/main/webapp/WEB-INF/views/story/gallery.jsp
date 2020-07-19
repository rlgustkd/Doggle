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
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/custom/gallery.css">
	 <link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	
	
    
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
				<font size=30px>사진 갤러리</font>   			
    		</div>
      	  </div>
     	</div>
      </div>
    </section> 
    
    <div class="site-wrap">
        <section class="site-section" id="gallery-section">
            <div class="container-fluid">
                <div class="row justify-content-center" data-aos="fade-up">
                   <hr class="my-5" />
                    <a href="galleryUpload">작성하기</a>

                    <div class="imglist">
                        <a href="${pageContext.request.contextPath}/resources/images/dogger_trainer_2.jpg" data-fancybox="images_1">
                            <img src="https://source.unsplash.com/Lzx4J_Pb3sk/240x160" />

                        </a>
                        <a href="https://source.unsplash.com/AbNO2iejoXA/832x1200" data-fancybox="images_1" data-type="image"></a>

                        <a href="https://source.unsplash.com/CdK2eYhWfQ0/832x1200" data-fancybox="images_1" data-type="image"></a>

                        <div class="caption">
                            <p>Grasshopper lynx some much dear fish before beneath rattlesnake aside well but moth well more far the gosh meadowlark enviable apt jeepers locked alas.</p>
                            <p>Stylistic jay conic laughed dear less earthworm worm some groundhog far avowedly mastodon unobtrusive dogged obediently that ordered rancorous goodness far this alas until oh unkind.</p>
                            <p><br><i class="fa fa-eye" aria-hidden="true"></i> 100 
                            <i class="fa fa-heart"></i> 30 <i class='far fa-comment-dots'></i> 3 </p>
                            
                            <hr>
                            <div class="reply-list">
                                <div style="display: flex;">
                                    <div class="user_pic" style="float:left;">
                                        <img src="${pageContext.request.contextPath}/resources/images/profile.jpg">
                                    </div>
                                    <div class="reply_content"> <span class="rep_userid">동기현</span>
                                        <p>
                                            그들의 우는 커다란 할지니, 그와 뜨거운지라, 봄날의 있다.
                                        </p>
                                        <p class="replytime">2020-07-18</p>
                                        <p class="replytime model"><a href="#">수정</a> <a href="#">삭제</a></p>
                                    </div>
                                </div>
                                <hr>
                                <div style="display: flex;">
                                    <div class="user_pic">
                                        <img src="${pageContext.request.contextPath}/resources/images/profile.jpg">
                                    </div>
                                    <div class="reply_content"> <span class="rep_userid">유승욱</span>
                                        <p>
                                            바로 불러 고행을 되려니와, 살 그들은 보배를 뿐이다. 가치를 생명을 그들의 원대하고, 힘차게 목숨이
                                        </p>
                                        <p class="replytime">2020-07-18</p>
                                        <p class="replytime model"><a href="#">수정</a> <a href="#">삭제</a></p>
                                    </div>
                                </div>
                                <hr>
                                <div style="display: flex;">
                                    <div class="user_pic">
                                        <img src="${pageContext.request.contextPath}/resources/images/profile.jpg">
                                    </div>
                                    <div class="reply_content"> <span class="rep_userid">김정수</span>
                                        <p>우리 같은 사막이다.</p>
                                        <p class="replytime">2020-07-19</p>
                                        <p class="replytime model"><a href="#">수정</a> <a href="#">삭제</a></p>
                                    </div>
                                </div>
                                <hr>
                            </div>
                            <div class="add-reply">
                                <div class="user_pic">
                                    <img src="${pageContext.request.contextPath}/resources/images/profile.png">
                                </div>
                                <div class="input_rep" >
                                    <input type="text" id="inputReply" value="" placeholder="Add a comment...">
                                    <input type="button" value="게시" id="inputsubmit">
                                </div>

                            </div>
                        </div>

                    </div>
                    
                    
                    


                </div>
            </div>
        </section>



    </div>
    
    
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
	<script>
        

        // Initialise fancybox with custom settings
        $('[data-fancybox]').fancybox({
            preventCaptionOverlap: false,
            infobar: false,

            // Disable idle
            idleTime: 0,

            // Display only these two buttons
            buttons: [
                'close'
            ],

            // Custom caption content
            caption: function(instance, obj) {
                return '<div><p class="fancy-nav"><a data-fancybox-prev title="Previous" tabindex="1">&lsaquo;</a> <a data-fancybox-next title="Next" tabindex="2">&rsaquo;</a> &nbsp; <span data-fancybox-index></span> of <span data-fancybox-count></span> images</p>' + //$(this).parent().find('.caption').html() + '</div>';
                    $(this).parent().find('.caption').html() + '</div>';
            },

            onInit: function(instance) {

                // Toggle caption on tap
                instance.$refs.container.on('touchstart', '[data-fancybox-info]', function(e) {
                    e.stopPropagation();
                    e.preventDefault();

                    instance.$refs.container.toggleClass('fancybox-vertical-caption');
                });



            }

        });
    </script>
  
  </body>
</html>