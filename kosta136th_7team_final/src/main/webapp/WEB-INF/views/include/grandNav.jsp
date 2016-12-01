<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<body>

	<nav id="mainNav" class="navbar navbar-default navbar-static-top navbar-default">
	
		<div class="container">
		
			<div class="navbar-header">
			
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> Menu
				</button>
				
				<a href="/" class="navbar-brand">
					<img id="main_logo_image" src="../../resources/img/logo_header.png" alt="bitriver_logo" />
				</a>
				
			</div>
			
			<div class="collapse navbar-collapse navbar-right">
				<ul class="nav navbar-nav">
					<li><a href="/graph">실시간 시세</a></li>
					<li><a href="/news">최신 뉴스</a></li>
					<li><a href="/recommand">거래소 추천</a></li>
					<li><a href="/board">게시판</a></li>
					<li><a href="#" id="signupBtn" data-toggle="modal" data-target="#signup">회원가입</a></li>
					<li><a href="#" id="signinBtn" data-toggle="modal" data-target="#signin">로그인</a></li>
				</ul>
			</div>
			
			<%@ include file="loginout.jsp" %>
			
		</div> <!-- ./mainNav Container -->
	
	</nav> <!-- ./navbar -->
		