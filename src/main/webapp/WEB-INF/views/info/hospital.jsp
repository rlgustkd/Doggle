<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Dogger &mdash; Website Template by Colorlib</title>
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
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/custom/info.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/custom/gallery.css">
</head>


<!-- Start of Topbar -->

<%@include file="topbar.jsp"%>

<!-- End of Topbar -->

<!-- Start of main -->
<!-- faq section -->
<input id="user" type="hidden" value="${sessionScope.user.user_id}">
<input id="p_no" type="hidden">
<section class="site-section" id="faq-section">
	<div class="container" id="accordion">
		<div class="row justify-content-center" data-aos="fade-up">
			<div class="col-lg-6 text-center heading-section mb-5">
				<div class="paws">
					<span class="icon-paw"></span>
				</div>
				<h2 class="text-black mb-2">
					DOGGLE을 통해 동물 병원을 <br>찾아보세요
				</h2>
				<p>도글 추천 병원, 현재 있는 위치 주변의 동물 병원, 사용자들이 직접 추천하는 동물 병원을 알려줍니다.</p>
			</div>
		</div>

		<div class="row accordion justify-content-center block__76208">

			<div class="row align-self-center text-center" data-aos="fade-up"
				data-aos-delay="100">
				<div class="accordion-item" style="width: 100%;">
					<h3 class="mb-0 heading">
						<a class="btn-block" data-toggle="collapse" href="#collapseFive"
							role="button" aria-expanded="true" aria-controls="collapseFive"
							style="display: inline;">Doggle이 추천하는 동물 병원 알아보기<span
							class="icon"></span>
						</a>
					</h3>

					<div id="collapseFive" class="collapse show"
						aria-labelledby="headingOne" data-parent="#accordion">
						<div class="body-text">
							<p>도글이 선정한 추천 병원 목록입니다. 제휴 문의: dogglemail@gmail.com</p>
							<section class="site-section bg-light block-13"
								id="testimonials-section" data-aos="fade">
								<div class="container">
									<div class="row justify-content-center" data-aos="fade-up"></div>
									<div>
										<div id="image_container"></div>
									</div>
									<div data-aos="fade-up" data-aos-delay="200">
										<div class="owl-carousel nonloop-block-13">
											<c:forEach items="${hospitalinfo}" var="hospitalinfo">
												<div>
													<figure class="mr-4">
														<a data-toggle="modal" name="detail"> <img
															src="${pageContext.request.contextPath}/resources/images/${hospitalinfo.h_photo}"
															alt="" class="img-fluid"> <input type="hidden"
															id="image" name="image" value="${hospitalinfo.p_no }" />
															<c:out value="${hospitalinfo.h_title }" /> <br> <c:out
																value="${hospitalinfo.phone }" />
														</a>
													</figure>
												</div>
											</c:forEach>
										</div>
									</div>
								</div>
							</section>

						</div>
					</div>

				</div>


				<!-- .accordion-item -->

				<div class="accordion-item" style="width: 100%;">
					<h3 class="mb-0 heading">
						<a class="btn-block" id="toggle" data-toggle="collapse"
							href="#collapseSix" role="button" aria-expanded="false"
							aria-controls="collapseSix" style="display: inline;"> 우리 동네의
							동물 병원 알아보기<span class="icon"></span>
						</a>
					</h3>
					<div id="collapseSix" class="collapse" aria-labelledby="headingOne"
						data-parent="#accordion">
						<div class="map_wrap">
							<div id="map" style="width: 100%; height: 500px;"></div>

							<div id="menu_wrap" class="bg_white">
								<div class="option"></div>
								<hr>
								<ul id="placesList"></ul>
								<div id="pagination"></div>
							</div>
						</div>

						<script type="text/javascript"
							src="https://dapi.kakao.com/v2/maps/sdk.js?appkey=0c7fc5ef9400d2e001c7d219e0122879&libraries=services"></script>

					</div>
				</div>
				<!-- .accordion-item -->

				<div class="accordion-item" style="width: 100%;">
					<h3 class="mb-0 heading">
						<a class="btn-block" data-toggle="collapse" href="#collapseSeven"
							role="button" aria-expanded="false" aria-controls="collapseSeven"
							style="display: inline;">동물 병원 게시판<span class="icon"></span>
						</a>
					</h3>
					<div id="collapseSeven" class="collapse"
						aria-labelledby="headingOne" data-parent="#accordion">



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
										<c:forEach items="${FreeboardStory }" var="FreeboardStory">
											<tr>
												<td>${FreeboardStory.p_no }</td>
												<td><a
													href="../story/detailStoryView?p_no=${FreeboardStory.p_no }">${FreeboardStory.fb_title }</a></td>
												<td>${FreeboardStory.user_id }</td>
												<td>${FreeboardStory.regdate }</td>
												<td>${FreeboardStory.viewcnt }</td>
												<td>${FreeboardStory.recommend }</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
								<form action="../story/freeboard.jsp" method="get"
									class="form-inline my-2 my-lg-0">
									<input type="text" name="search" class="form-control mr-sm-2"
										type="search" placeholder="검색어를 입력하세요.">
									<button class="btn btn-outline-success my-2 my-sm-0"
										type="submit">검색</button>
								</form>

								<%
									String context = request.getContextPath();
								%>
								<form action="freeboard/upload" role="form" autocomplete="off"
									method='GET'>
									<div class="inputArea">
										<button type="submit" id="register_Btn"
											class="btn btn-primary">글쓰기</button>
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


								<!-- collapse 내부 section -->
					</div>
				</div>
				<!-- .accordion-item -->

			</div>


		</div>
	</div>
</section>
<!-- modal -->
<div class="modal" id="myModal" tabindex="-1" role="dialog"
	aria-labelledby="myFullsizeModalLabel" aria-hidden="true">
	<div class="modal-dialog"
		style="max-width: 100%; width: auto; height: 1100px; display: table;">

		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title" id="myModalLabel">상세보기</h4>
				<button type="button" id="test" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">×</span>
				</button>
			</div>
			<div class="modal-body">
				<%@include file="hospital_detail.jsp"%>
			</div>
			<div class="modal-footer"></div>


		</div>
	</div>
</div>


<!-- End of main -->

<!-- Start of footer -->

<%@include file="../nav/footer.jsp"%>

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

<script type="text/javascript">
	function loadfunction() {
		// 마커를 담을 배열입니다
		var markers = [];
		var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
		mapOption = {
			center : new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 초기 중심좌표
			level : 6
		// 지도의 확대 레벨
		};
		// 지도를 생성합니다    
		var map = new kakao.maps.Map(mapContainer, mapOption);
		var locPosition = map.getCenter();
		if (navigator.geolocation) {
			// GeoLocation을 이용해서 접속 위치를 얻어옵니다
			navigator.geolocation.getCurrentPosition(function(position) {
				var lat = position.coords.latitude, // 위도
				lon = position.coords.longitude; // 경도
				locPosition = new kakao.maps.LatLng(lat, lon); // 마커가 표시될 위치를 geolocation으로 얻어온 좌표로 생성합니다
				alert(lat + ", " + lon + ' 여기에 계신가요?!'); // 인포윈도우에 표시될 내용입니다
			});
		} else { // HTML5의 GeoLocation을 사용할 수 없을때 마커 표시 위치와 인포윈도우 내용을 설정합니다
			locPosition = new kakao.maps.LatLng(33.450701, 126.570667);
			alert('geolocation을 사용할수 없어요..');
		}
		//사용하는 유저의 위치
		map.setCenter(locPosition);
		var ps = new kakao.maps.services.Places();
		// 검색 결과 목록이나 마커를 클릭했을 때 장소명을 표출할 인포윈도우를 생성합니다
		var infowindow = new kakao.maps.InfoWindow({
			zIndex : 1
		});
		// 키워드로 장소를 검색합니다
		window.setTimeout(function() {
			searchPlaces();
		}, 4000);
		// 키워드 검색을 요청하는 함수입니다
		function searchPlaces() {
			map.setCenter(locPosition);
			var keyword = "동물병원";
			// 장소검색 객체를 통해 키워드로 장소검색을 요청합니다
			ps.keywordSearch(keyword, placesSearchCB, {
				location : locPosition,
				sort : kakao.maps.services.SortBy.DISTANCE
			});
		}
		// 장소검색이 완료됐을 때 호출되는 콜백함수 입니다
		function placesSearchCB(data, status, pagination) {
			if (status === kakao.maps.services.Status.OK) {
				// 정상적으로 검색이 완료됐으면
				// 검색 목록과 마커를 표출합니다
				displayPlaces(data);
				// 페이지 번호를 표출합니다
				displayPagination(pagination);
			} else if (status === kakao.maps.services.Status.ZERO_RESULT) {
				alert('검색 결과가 존재하지 않습니다.');
				return;
			} else if (status === kakao.maps.services.Status.ERROR) {
				alert('검색 결과 중 오류가 발생했습니다.');
				return;
			}
		}
		// 검색 결과 목록과 마커를 표출하는 함수입니다
		function displayPlaces(places) {
			var listEl = document.getElementById('placesList'), menuEl = document
					.getElementById('menu_wrap'), fragment = document
					.createDocumentFragment(), bounds = new kakao.maps.LatLngBounds(), listStr = '';
			// 검색 결과 목록에 추가된 항목들을 제거합니다
			removeAllChildNods(listEl);
			// 지도에 표시되고 있는 마커를 제거합니다
			removeMarker();
			for (var i = 0; i < places.length; i++) {
				// 마커를 생성하고 지도에 표시합니다
				var placePosition = new kakao.maps.LatLng(places[i].y,
						places[i].x), marker = addMarker(placePosition, i), itemEl = getListItem(
						i, places[i]); // 검색 결과 항목 Element를 생성합니다
				// 검색된 장소 위치를 기준으로 지도 범위를 재설정하기위해
				// LatLngBounds 객체에 좌표를 추가합니다
				bounds.extend(placePosition);
				// 마커와 검색결과 항목에 mouseover 했을때
				// 해당 장소에 인포윈도우에 장소명을 표시합니다
				// mouseout 했을 때는 인포윈도우를 닫습니다
				(function(marker, title) {
					kakao.maps.event.addListener(marker, 'mouseover',
							function() {
								displayInfowindow(marker, title);
							});
					kakao.maps.event.addListener(marker, 'mouseout',
							function() {
								infowindow.close();
							});
					itemEl.onmouseover = function() {
						displayInfowindow(marker, title);
					};
					itemEl.onmouseout = function() {
						infowindow.close();
					};
				})(marker, places[i].place_name);
				fragment.appendChild(itemEl);
			}
			// 검색결과 항목들을 검색결과 목록 Elemnet에 추가합니다
			listEl.appendChild(fragment);
			menuEl.scrollTop = 0;
			// 검색된 장소 위치를 기준으로 지도 범위를 재설정합니다
			map.setBounds(bounds);
		}
		// 검색결과 항목을 Element로 반환하는 함수입니다
		function getListItem(index, places) {
			var el = document.createElement('li'), itemStr = '<span class="markerbg marker_'
					+ (index + 1)
					+ '"></span>'
					+ '<div class="info">'
					+ '   <h5>' + places.place_name + '</h5>';
			if (places.road_address_name) {
				itemStr += '    <span>' + places.road_address_name + '</span>'
						+ '   <span class="jibun gray">' + places.address_name
						+ '</span>';
			} else {
				itemStr += '    <span>' + places.address_name + '</span>';
			}
			itemStr += '  <span class="tel">' + places.phone + '</span>'
					+ '</div>';
			el.innerHTML = itemStr;
			el.className = 'item';
			return el;
		}
		// 마커를 생성하고 지도 위에 마커를 표시하는 함수입니다
		function addMarker(position, idx, title) {
			imageSize = new kakao.maps.Size(36, 37), // 마커 이미지의 크기
			imgOptions = {
				spriteSize : new kakao.maps.Size(36, 691), // 스프라이트 이미지의 크기
				spriteOrigin : new kakao.maps.Point(0, (idx * 46) + 10), // 스프라이트 이미지 중 사용할 영역의 좌상단 좌표
				offset : new kakao.maps.Point(13, 37)
			// 마커 좌표에 일치시킬 이미지 내에서의 좌표
			}, marker = new kakao.maps.Marker({
				position : position, // 마커의 위치
			});
			marker.setMap(map); // 지도 위에 마커를 표출합니다
			markers.push(marker); // 배열에 생성된 마커를 추가합니다
			return marker;
		}
		// 지도 위에 표시되고 있는 마커를 모두 제거합니다
		function removeMarker() {
			for (var i = 0; i < markers.length; i++) {
				markers[i].setMap(null);
			}
			markers = [];
		}
		// 검색결과 목록 하단에 페이지번호를 표시는 함수입니다
		function displayPagination(pagination) {
			var paginationEl = document.getElementById('pagination'), fragment = document
					.createDocumentFragment(), i;
			// 기존에 추가된 페이지번호를 삭제합니다
			while (paginationEl.hasChildNodes()) {
				paginationEl.removeChild(paginationEl.lastChild);
			}
			for (i = 1; i <= pagination.last; i++) {
				var el = document.createElement('a');
				el.innerHTML = i;
				if (i === pagination.current) {
					el.className = 'on';
				} else {
					el.onclick = (function(i) {
						return function() {
							pagination.gotoPage(i);
						}
					})(i);
				}
				fragment.appendChild(el);
			}
			paginationEl.appendChild(fragment);
		}
		// 검색결과 목록 또는 마커를 클릭했을 때 호출되는 함수입니다
		// 인포윈도우에 장소명을 표시합니다
		function displayInfowindow(marker, title) {
			var content = '<div style="padding:5px;z-index:1;">' + title
					+ '</div>';
			infowindow.setContent(content);
			infowindow.open(map, marker);
		}
		// 검색결과 목록의 자식 Element를 제거하는 함수입니다
		function removeAllChildNods(el) {
			while (el.hasChildNodes()) {
				el.removeChild(el.lastChild);
			}
		}
	}

	//상세보기 지도 가져오기
	function loadfunction1(lng, lat) {
		var mapContainer = document.getElementById('map1'), // 지도를 표시할 div 
		mapOption = {
			center : new kakao.maps.LatLng(lng, lat), // 지도의 중심좌표
			level : 3
		// 지도의 확대 레벨
		};

		var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

		// 마커가 표시될 위치입니다 
		var markerPosition = new kakao.maps.LatLng(lng, lat);

		// 마커를 생성합니다
		var marker = new kakao.maps.Marker({
			position : markerPosition
		});
		// 아래 코드는 지도 위의 마커를 제거하는 코드입니다
		marker.setMap(null);

		// 마커가 지도 위에 표시되도록 설정합니다
		marker.setMap(map);

	}

	//댓글 불러오기
	function replylist() {
		var image = $('#p_no').val();
		var user = $('#user').val();

		$('#detail').nextAll().remove();
		$
				.ajax({
					url : "../detail/hospital", // 전송 URL
					type : "POST", // GET or POST 방식
					traditional : true,
					data : {
						image : image
					// 보내고자 하는 data 변수 설정
					},
					success : function(jsonArray) {

						for (var i = 0; i < jsonArray.length; i++) {
							if (user == jsonArray[i].user_id) {
								$("#detail")
										.after(
												"<tr><td class='tg-0pky' colspan='5' style='text-align:center'>"
														+ jsonArray[i].r_content
														+ "</td><td class='tg-0pky' style='text-align:center'>"
														+ jsonArray[i].user_id
														+ "</td><td class='tg-0pky' style='text-align:center'>"
														+ jsonArray[i].regdate
														+ "</td><td><button class='del'>"
														+ "삭제"
														+ "</button>"
														+ "<input type='hidden' class='r_no' value='"+jsonArray[i].r_no+"'>"
														+ "</td></tr>");
							} else if (user != jsonArray[i].user_id) {
								$("#detail")
										.after(
												"<tr><td class='tg-0pky' colspan='5' style='text-align:center'>"
														+ jsonArray[i].r_content
														+ "</td><td class='tg-0pky' style='text-align:center'>"
														+ jsonArray[i].user_id
														+ "</td><td class='tg-0pky' style='text-align:center'>"
														+ jsonArray[i].regdate
														+ "</td><td></td></tr>");
							}
						}

					},
					error : function(request, status, error) {

					}
				});

	}
</script>
<script type="text/javascript">
	$('#toggle').click(function() {
		window.setTimeout(function() {
			loadfunction();
			map.setCenter(locPosition);
			map.relayout();
		}, 0);
	});

	//댓글 삭제
	$(document).on("click", ".del", function() {
		var r_num = $(this).next().val();
		$.ajax({
			url : "../detail/hospitaldelete", // 전송 URL
			type : "POST", // GET or POST 방식
			traditional : true,
			data : {
				r_num : r_num
			// 보내고자 하는 data 변수 설정
			},
			success : function(msg) {
				alert("삭제되었습니다.")
				replylist();

			},
			error : function(request, status, error) {

			}
		});
	});

	//추천목록 상세보기
	$('a[name=detail]').click(
			function() {
				var image = $(this).children("#image").val();
				$('#p_no').val(image);
				$('#detail').nextAll().remove();

				$.ajax({
					url : "hospital", // 전송 URL
					type : "POST", // GET or POST 방식
					traditional : true,
					data : {
						image : image
					// 보내고자 하는 data 변수 설정
					},
					success : function(data) {

						var photo = data.h_photo;
						$('#h_title').text(data.h_title);
						$('#phone').text(data.phone);
						$('#h_content').text(data.h_content);
						$('#h_photo').attr(
								'src',
								'${pageContext.request.contextPath}/resources/images/'
										+ photo);
						var lng = data.lng;
						var lat = data.lat;
						window.setTimeout(function() {
							loadfunction1(lng, lat);
						}, 0);
						replylist();
						$('#myModal').modal();

					},
					error : function(request, status, error) {

					}
				});

			});

	$('#write').click(function() {
		var p_no = $('#p_no').val();
		var replycontent = $('#replycontent').val();
		var user = $('#user').val();
		$.ajax({
			url : "../detail/hospitalreply", // 전송 URL
			type : "POST", // GET or POST 방식
			traditional : true,
			data : {
				p_no : p_no,
				replycontent : replycontent,
				user_id : user
			},
			success : function(smsg) {
				replylist();
				$('#replycontent').val('');
			},
			error : function(request, status, error) {

			}
		});
	});
</script>

</body>
</html>