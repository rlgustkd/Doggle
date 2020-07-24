<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Gaegu&display=swap" rel="stylesheet">
    

</head>
<body>
<div id="overlayer"></div>
  <div class="loader">
    <div class="spinner-border text-primary" role="status">
      <span class="sr-only">Loading...</span>
    </div>
  </div>


  <div class="site-wrap">

    <div class="site-mobile-menu site-navbar-target"  style="font-family: 'Gaegu', cursive; font-size: larger;">
      <div class="site-mobile-menu-header">
        <div class="site-mobile-menu-close mt-3">
          <span class="icon-close2 js-menu-toggle"></span>
        </div>
      </div>
      <div class="site-mobile-menu-body"></div>
    </div>
   
    
    <header class="site-navbar js-sticky-header site-navbar-target" role="banner" >

      <div class="container" >
        <div class="row align-items-center" style="font-family: 'Gaegu', cursive; font-size: 30px;">
          
          <div class="col-6 col-xl-2">
            <h1 class="mb-0 site-logo"><a href="../main" class="h2 mb-0"><img src="${pageContext.request.contextPath}/resources/images/logo.png" style="width:200px; height: 80px; margin-top: 20px;"></a></h1>
          </div>

          <div class="col-12 col-md-10 d-none d-xl-block">
            <nav class="site-navigation position-relative text-right" role="navigation">

              <ul class="site-menu main-menu js-clone-nav mr-auto d-none d-lg-block">
                
                <li class="has-children">
                  <a class="nav-link">Info</a>
                  <ul class="dropdown">
                    <li><a href="../info/hospital" class="nav-link">병원</a></li>
                    <li><a href="../info/hotel" class="nav-link">호텔</a></li>
                    <li><a href="../info/walk" class="nav-link">애견 동반</a></li>
                    <li><a href="../info/petshop" class="nav-link">애견샵</a></li>
                  </ul>
                </li>
                
                <li><a href="../story/story" class="nav-link">Story</a></li>
             <c:set var="user" value="${user.user_id}"/>
                <c:if test="${user != null}">
                <li class="has-children">
                      	<a class="nav-link">My Page</a>
                      	<ul class="dropdown">
                    <li><a href="mypage" class="nav-link">마이페이지</a></li>
                    <li><a href="logout" class="nav-link">Logout</a></li>
                    </ul>
                    </li>
                    </c:if>
                      <c:if test="${user == null}">
                      <li><a href="user" class="nav-link">로그인</a></li>
                    </c:if>
                  </ul>
            </nav>
          </div>

          <div class="col-6 d-inline-block d-xl-none ml-md-0 py-3" style="position: relative; top: 3px;"><a href="#" class="site-menu-toggle js-menu-toggle float-right"><span class="icon-menu h3"></span></a></div>

        </div>
      </div>
      
    </header>
    </div>
</body>
</html>