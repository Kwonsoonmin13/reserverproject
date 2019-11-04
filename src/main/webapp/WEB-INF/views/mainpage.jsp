<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type ="text/css" href="http://localhost:8080/reserverproject/css/mainpage.css"/>
<title>메인</title>
</head>
<body>
<header>
<div class=float_l><img  src="http://localhost:8080/reserverproject/img/spr_bi-2.png" width="100px" height="auto" ></div>
<div class=float_r><span id="id">비회원</span></div>
</header>
<div id="promotion">
<div id="promotion_frame">

<ul id="slide" style="left:0px;"></ul>

</div>
</div>


<nav>
<ul id="category" style="padding:0px;">
<%-- 
<li><a href="#">전체리스트</a></li>
<li><a href="#">전시</a></li>
<li><a href="#">뮤지컬</a></li>
<li><a href="#">콘서트</a></li>
<li><a href="#">클래식</a></li>
<li><a href="#">연극</a></li>
--%>
</ul>
</nav>

<div id="count">
<div id="count_align">
<span>바로 예매 가능한 행사가</span>
<span style="color: red"> 10개 </span>
<span>있습니다.</span>
</div>
</div>

<div id="content_lay">

<ul id="content_li">
<%-- 
<li class="content">
<img class="content_img" src="http://localhost:8080/reserverproject/img/1_th_1.png">
<div class="short"><span>짧은글</span></div>
<div class="long"><span>긴글</span></div>
</li>



<li class="content">
<img class="content_img" src="http://localhost:8080/reserverproject/img/11_th_30.png">
<div class="short"><span>짧은글</span></div>
<div class="long"><span>긴글</span></div>
</li>



<li class="content">
<img class="content_img" src="http://localhost:8080/reserverproject/img/1_th_1.png">
<div class="short"><span>짧은글</span></div>
<div class="long"><span>긴글</span></div>
</li>


--%>
</ul>

<ul id="content_li2">
<%-- 
<li class="content">
<img class="content_img" src="http://localhost:8080/reserverproject/img/10_th_27.png">
<div class="short"><span>짧은글</span></div>
<div class="long"><span>긴글</span></div>
</li>

<li class="content">
<img class="content_img" src="http://localhost:8080/reserverproject/img/12_th_32.png">
<div class="short"><span>짧은글</span></div>
<div class="long"><span>긴글</span></div>
</li>

<li class="content">
<img class="content_img" src="http://localhost:8080/reserverproject/img/1_th_1.png">
<div class="short"><span>짧은글</span></div>
<div class="long"><span>긴글</span></div>
</li>

--%>
</ul>

</div>

<div id="more_b" >
<span>더보기</span>
</div>

<div id="top_b"><a href="#">↑ TOP</a></div>

</body>
<script type="text/javascript" src="http://localhost:8080/reserverproject/js/mainpage.js"></script>
</html>