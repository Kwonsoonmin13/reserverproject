<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<<<<<<< HEAD
html>
    <head>
    


        <style>
             
            body{
                border: solid 0.1px black;
                width: 500px;
                margin-left: auto;
                margin-right: auto;
            }
=======
<html>

<head>
<meta charset="UTF-8">


        <style>
>>>>>>> bde87808d268b115b28f7ebb02986ae5f8d69ece
            #top{
                height: 500px;
                display: block;
                position: relative;
            }
            #icon{
                margin-top :10px;
                position : absolute;
            }
            #email{
                margin-top :10px;
                color:white;
                position: absolute;
                right: 0px;
            }
            #imgcount{
                left:250px;
                top:100px;
                margin-left: -30px;
                width :60px;
                height: 20px;
                background-color: black;
                position: absolute;
                opacity: 0.3;
                border-radius: 10px 10px 10px 10px / 10px 10px 10px 10px;
                text-align: center;
            }
            #front{
                color: white;
            }
            #back{
                color : dimgray
            }
            #slide{
                filter: brightness(50%);
                -webkit-filter: brightness(50%);
            }
            #title{
                position: absolute;
                color: white;
                text-align: center;
                width : 450px;
                top: 200px;
                font-size: 50px;
                left: 250px;
                margin-left: -225px;
                
            }
<<<<<<< HEAD
           
=======
            div{
                border:solid black 0.1px;
            }
            body{
                border: solid 0.1px black;
                width: 500px;
                margin-left: auto;
                margin-right: auto;
            }
>>>>>>> bde87808d268b115b28f7ebb02986ae5f8d69ece
            #topimage{
                width:500px;
                height:500px;
                position:absolute;
            }
            #summarycon{
                clear: both;
                position: relative;
                width:500px;
<<<<<<< HEAD
                display: -webkit-box;
                -webkit-line-clamp: 3;
                text-overflow:ellipsis;
                overflow: hidden;
                -webkit-box-orient: vertical;
            }
            #sumbutton{
                width:490px;
                text-align: center;
                padding-top: 5px;
                padding-bottom: 5px;
                background-color: lightgrey;
                margin-top: 5px;
                margin-left: 5px;
                
            }
            #event{
                width:500px;
                margin-top: 5px;
            }
            #reservebut{
                margin-top: 5px;
                width:490px;
                color: white;
                margin-left: 5px;
                background-color: #02C018;
                padding-top: 5px;
                padding-bottom: 5px;
                text-align: center;
            }
            #commenthead{
                width: 500px;
            }
            #score_count{
                overflow: hidden;
            }
            #total_score{
                float: left;
            }
            #count{
                float: right;
            }
            .comment{
                margin-top: 5px;
                display: inline-block;
            }
            #comment_but{
                width: 490px;
                margin-left: 5px;;
                text-align: center;
                background-color: lightgray;
                padding-top: 5px;
                padding-bottom: 5px;
                margin-top: 5px;
            }
            #detail{
                width: 500px;
                display: inline-block;
            }
            #detail_but{
                width: 246px;
                text-align: center;
                float: left;
            }
            #come_but{
                width: 246px;
                text-align: center;
                float: left;
            }
            #find_navi{
                width: 500px;
                display: inline-block;
            }
            #find_but{
                width :247px;
                float: left;
                text-align: center;
                background-color: lightgray;
            }
            #navi_but{
                width: 247px;
                float: left;
                text-align: center;
                background-color: lightgray;
=======
            }
            #sumbutton{
                width:500px;
                height: 10px;
            }
            #event{
                width:500px;
                height:10px;
            }
            #reservebut{
                width:500px;
                height:10px;
>>>>>>> bde87808d268b115b28f7ebb02986ae5f8d69ece
            }
          
        </style>

    </head>
    <body>
        <div id="top">
            <div id="topimage"><img id="slide" src="./img/1_ma_2.png" style="width: 500px;"></div>
            <div id="icon"><img src="./img/spr_bi-2.png" style="height: 30px;"></div>
            <div id="email">xxx@exercise.com</div>
            <div id="imgcount"><span id="front">1 </span><span id="back">/ 2</span></div>
            <div id="title">Paper,Present:너를 위한 선물</div>
        </div>
        <div id="summarycon">"대림미술관은 오는 12월 7일부터 2018년 5월 27일까지 세계적인 아티스트들의 섬세한 감각과 아날로그적 소재인 종이가 만나 감성적인 매체로 확장되는 과정을 소개하는 전시 PAPER,PRESENT:너를 위한 선물을 개최합니다. 이번 전시에서는 다양한 분야에서 활동하고 있는 아티스트들이 종이의 본래적 속성에 집중하여 재료 자체의 순수한 아름다움을 담은 작품들을 일곱 개의 감각적인 공간에서 선보입니다. 바람,별빛,햇살과 같은 자연 요소와 기억, 설렘과 같은 감정의 요소를 종이와 결합하여 구성한 공간들은, 자연 현상을 감각적으로 경험하고 아날로그적 정서를 자극하는 매체로서 종이를 경험하게 하며 종이에 감성을 입혀 예술로 만나는 특별한 시간을 선물할 것입니다.</div>
<<<<<<< HEAD
        <div id="sumbutton">펼쳐보기 밑화살표</div>
        <div id="event">
            <span>선물상자 이벤트 정보</span>
            <span>[네이버예약 특별할인] R석 50% S석 60% 할인</span>
        </div>
        <div id="reservebut">달력 예약하기</div>
        <div id="comment_head">
            <span >예매자 한줄평</span>
            <div id="score_count">
            <div id="total_score">그림 <span>현재스코어</span> <span style="color: lightgray;">/총스코어</span></div>
            <div id="count"><span style="color: green;">52건</span> 등록<span></span></div>
            </div>
        </div>
        <div class="comment">
            <span>뮤지컬 로미오와 줄리엣</span>
            <img src="/img/10_ma_28.png" style="float:right; 100px; height: 100px;">
            <div>2층이어서 걱정했는데 꽤 잘보여서 좋았습니다. 고마오 너무 멋있었습니다. 사진은 커튼콜 때 찍었습니다. 끝나고 퇴근길도 봬서 너무 좋았어요</div>
            <div><span style="font-weight: bold;">점수</span><span style="color:lightgray"> email</span><span style="color: lightgray;"> 날짜</span></div>
        </div>
        <div class="comment">
                <span>뮤지컬 로미오와 줄리엣</span>
                <img src="/img/10_ma_28.png" style="float:right; 100px; height: 100px;">
                <div>2층이어서 걱정했는데 꽤 잘보여서 좋았습니다. 고마오 너무 멋있었습니다. 사진은 커튼콜 때 찍었습니다. 끝나고 퇴근길도 봬서 너무 좋았어요</div>
                <div><span style="font-weight: bold;">점수</span><span style="color:lightgray"> email</span><span style="color: lightgray;"> 날짜</span></div>
        </div>
        <div class="comment">
                <span>뮤지컬 로미오와 줄리엣</span>
                <img src="/img/10_ma_28.png" style="float:right; 100px; height: 100px;">
                <div>2층이어서 걱정했는데 꽤 잘보여서 좋았습니다. 고마오 너무 멋있었습니다. 사진은 커튼콜 때 찍었습니다. 끝나고 퇴근길도 봬서 너무 좋았어요</div>
                <div><span style="font-weight: bold;">점수</span><span style="color:lightgray"> email</span><span style="color: lightgray;"> 날짜</span></div>
        </div>
        <div id="comment_but">예몌자 한줄평 더보기 오른쪽화살표</div>
        <duv id="detail">
            <div id="detail_but">상세정보</div>
            <div id="come_but">오시는길</div>
        </duv>

        <div>
            [소개]
            <div id="intro">
                핀란드 독립 100주년,캐릭터 무민 탄생 70주년 기념! MOONMIN ORIGINAL,ARTWORKS EXHiBITION
            </div>
            <div id="notice_img">
                [공지사항]
                <img src="img/9_et_26.png" width="500px">
            </div>
            
        </div>
      
        <div>
            <div>
            <img src="img/1_map_1.png" width="500px">
            <div>연극 작업의 정석</div>
            <div>마크이미지 서울특별시 종로구 대학로10길 11</div>
            <div>지번 서울특별시 종로구 동숭동 1-61</div>
            <div>대학로 연극 순위 아트홀 1관</div>
            <div>전화기이미지 02-766-7667</div>
            </div>
            <div id="find_navi">
            <div id="find_but">꺾인화살표 길찾기</div>
            <div id="navi_but">오락기 네비게이션</div>
            </div>
        </div>

        <div style="text-align: center;">↑ TOP</div>

=======
        <div id="sumbutton"></div>
        <div id="event"></div>
        <div id="reservebut"></div>
      
>>>>>>> bde87808d268b115b28f7ebb02986ae5f8d69ece
    </body>
</html>