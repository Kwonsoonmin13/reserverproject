var contents="";

function promotion_regist(path_json) {
	var slide = document.querySelector("#slied");
	for(var i=0;i<path_json.length;i++){
		contents=contents.concat("<li> <img src=\"http://localhost:8080/reserverproject/"+path_json[i]+"\" width=\"500px\"></li> ");
	}	
	contents=contents.concat("<li> <img src=\"http://localhost:8080/reserverproject/"+path_json[0]+"\" width=\"500px\"></li> ");
	
}

function promotion_play(){
	var slide = document.querySelector("#slide");
	var left =0;
	setInterval(() => {
		slide.style.left=left+"px";
		
		left-=500;
		if(left==-2500){
			left=comeback_sl();
			
		}
		
		
	}, 3000);
}

function comeback_sl (){
	var left = 0;
	setTimeout(() => {
		
		slide.style.transition="0s";
		slide.style.left=left+"px";
	},  1000);
	setTimeout(() => {
		slide.style.transition="1s";
	}, 2000);
	
	return left;
}
//id=\"cate0\" id=\"cate"+(i+1)+"\"

var cate_con="<li><a  href=\"#\" style=\"color:green\" >전체리스트</a></li> ";

function create_CategoryMenu(category_json){
	var category = document.querySelector("#category");
	
	for(var i=0;i<category_json.length;i++){
		cate_con=cate_con.concat("<li><a   href=\"#\">"+category_json[i]+"</a></li> ");
	}
	var cent = 70*(category_json.length+1)/2
	category.style.width=70*(category_json.length+1)+"px";
	category.innerHTML=cate_con;
	category.style.marginLeft="-"+cent+"px";
	
}

function regist_product_count(product_Count) {
	var count_align = document.querySelector("#count_align");
	count_align.innerHTML=
		"<span>바로 예매 가능한 행사가</span>"+
		"<span style=\"color: red\"> "+product_Count+"개 </span>"+
		"<span>있습니다.</span>";
}

var catestate = 0;
var startstate =0;
function regist_product_List(reset,cate,start){
	var xhr = new XMLHttpRequest();
	var product_List;
	var url = "./api/ProductList/";
	xhr.open("GET",url+cate+"/"+start);
	xhr.send();
    xhr.addEventListener("load",function(){
    	
		
		product_List =JSON.parse(xhr.response);
		console.log(product_List[0][1]);
		
		var content_li = document.querySelector("#content_li");
		var content_li2 = document.querySelector("#content_li2");
		
		if(reset==1){
			content_li.innerHTML="";
			content_li2.innerHTML="";
		}
		
		for(var i=0;i<product_List.length;i++){
			
			if(i%2==0){
			content_li.innerHTML+=
			"<li class=\"content\">"+
			"<img class=\"content_img\" src=\"http://localhost:8080/reserverproject"+"/"+product_List[i][2]+"\">"+
			"<div class=\"short\"><span>"+product_List[i][0]+"</span></div>"+
			"<div class=\"spot\"><span>"+product_List[i][3]+"</span></div>"+
			"<div class=\"long\"><span>"+product_List[i][1]+"</span></div></li>";
		
			}		
			else{
				content_li2.innerHTML+=
				"<li class=\"content\">"+
				"<img class=\"content_img\" src=\"http://localhost:8080/reserverproject/"+product_List[i][2]+"\">"+
				"<div class=\"short\"><span>"+product_List[i][0]+"</span></div>"+
				"<div class=\"spot\"><span>"+product_List[i][3]+"</span></div>"+
				"<div class=\"long\"><span>"+product_List[i][1]+"</span></div></li>";
			}
			
		}
		
		
	
	});
	
	startstate+=4;
}

function thebogi(){
	var more_b = document.querySelector("#more_b");
	
	more_b.addEventListener("click",function(){
		regist_product_List(0,catestate,startstate);
		if(startstate>=product_Count){
			more_b.style.display="none";
		}
		
	});
}





var product_Count;
document.addEventListener("DOMContentLoaded",function(){
	var xhr = new XMLHttpRequest();
	var xhr2 = new XMLHttpRequest();
	var xhr3 = new XMLHttpRequest();
	

	var path_json;
	var category_json;
	
	
	xhr.addEventListener("load",function(){
		
		path_json = JSON.parse(xhr.response);
		
		
		
		
		promotion_regist(path_json);
		slide.innerHTML=contents;
		promotion_play();
		
		
		
		
		
		
		
	});
	
	xhr2.addEventListener("load",function(){
		category_json= JSON.parse(xhr2.response);
		
		create_CategoryMenu(category_json);
		
		categoryclick_event();
	});
	
	xhr3.addEventListener("load",function(){
		product_Count= xhr3.response;
		
		regist_product_count(product_Count);
		
		regist_product_List(1,catestate,startstate);
		
		thebogi();
	});
	
	var xhr4 = new XMLHttpRequest();
	var product_List ;
	

	xhr.open("GET","./api/promotions");
	xhr2.open("GET","./api/category");
	xhr3.open("GET","./api/ProductCount/0");
	
	xhr.send();
	xhr2.send();
	xhr3.send();
	
	
	
	
	
});


function categoryclick_event(){
var category = document.querySelector("#category");

category.addEventListener("click",function(e){
	var more_b = document.querySelector("#more_b");
	more_b.style.display="block"
	
	
	console.log(e);
	if(e.target.nodeName=="A"){
		for(var i=0;i<category.childElementCount;i++){
			category.children[i].children[0].style.color="black";	
		}
		
	console.log(e.target.innerText);
	var category_col = e.target;
	var categorytext = e.target.innerText;
	var cateid=null;
	switch(categorytext){
	
	case "전체리스트":
		cateid=0;
		catestate=0;
		startstate=0;
		category_col.style.color="green";
		break;
	case "뮤지컬":
		cateid=1;
		catestate=1;
		startstate=0;
		category_col.style.color="green";
		break;
	case "콘서트":
		cateid=2;
		catestate=2;
		startstate=0;
		category_col.style.color="green";
		break;
	case "클래식":
		cateid=3;
		catestate=3;
		startstate=0;
		category_col.style.color="green";
		break;
	case "연극":
		cateid=4;
		catestate=4;
		startstate=0;
		category_col.style.color="green";
		break;
	default:
		cateid=null;
		break;
	}
	if(cateid!=null){
		var xhr = new XMLHttpRequest();
		var url ="./api/ProductCount/"+cateid
		xhr.addEventListener("load",function(){
			product_Count=xhr.response;
			regist_product_count(product_Count);	
		});
		xhr.open("GET",url);
		xhr.send();
		
		 regist_product_List(1,catestate,startstate);
		}
	
	}
});
}
