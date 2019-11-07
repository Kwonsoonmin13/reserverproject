<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">


        <style>
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
            div{
                border:solid black 0.1px;
            }
            body{
                border: solid 0.1px black;
                width: 500px;
                margin-left: auto;
                margin-right: auto;
            }
            #topimage{
                width:500px;
                height:500px;
                position:absolute;
            }
            #summarycon{
                clear: both;
                position: relative;
                width:500px;
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
        <div id="sumbutton"></div>
        <div id="event"></div>
        <div id="reservebut"></div>
      
    </body>
</html>