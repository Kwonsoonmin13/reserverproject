

function promotion_regist(slide,path_json) {
	var contents="";
	for(var i=0;i<path_json.length;i++){
		contents=contents.concat("<li> <img src=\"http://localhost:8080/reserverproject/"+path_json[i]+"\" width=\"500px\"></li> ");
	}	
	contents=contents.concat("<li> <img src=\"http://localhost:8080/reserverproject/"+path_json[0]+"\" width=\"500px\"></li> ");
	slide.innerHTML=contents;
}

function promotion_play(slide,path_json){
	var left =0;
	var slide_width=10+(500*(path_json.length+1));
	slide.style.width=slide_width+"px";
	setInterval(() => {
		slide.style.left=left+"px";
		
		left-=500;
		if(left==-500*(path_json.length+1)){
			left=comeback_slide();
		}
	}, 3000);
}

function comeback_slide (){
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




function create_CategoryMenu(category,category_json){
	
	var cate_con="<li><a  href=\"#\" style=\"color:green\" >전체리스트</a></li> ";

	var center = 70*(category_json.length+1)/2
	var slide_width =70*(category_json.length+1)+"px";
	
	for(var i=0;i<category_json.length;i++){
		cate_con=cate_con.concat("<li><a   href=\"#\">"+category_json[i]+"</a></li> ");
	}

	category.style.width=slide_width;
	category.innerHTML=cate_con;
	category.style.marginLeft="-"+center+"px";
}

function regist_product_count() {
	var count_align = document.querySelector("#count_align");
	count_align.innerHTML=
		"<span>바로 예매 가능한 행사가</span>"+
		"<span style=\"color: red\"> "+product_Count+"개 </span>"+
		"<span>있습니다.</span>";
}


function regist_product_List(reset){
	var xhr = new XMLHttpRequest();
	var product_List;
	var url = "./api/ProductList/";
	xhr.open("GET",url+catestate+"/"+startstate);
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

function more_button(){
	var more_button = document.querySelector("#more_b");
	
	more_button.addEventListener("click",function(){
		regist_product_List(0,catestate,startstate);
		if(startstate>=product_Count){
			more_button.style.display="none";
		}
	});
}





var product_Count;
var catestate = 0;
var startstate =0;
document.addEventListener("DOMContentLoaded",function(){
	var xhr_promotion= new XMLHttpRequest();
	var xhr_category = new XMLHttpRequest();
	var xhr3 = new XMLHttpRequest();
	
	
	xhr_promotion.addEventListener("load",function(){
		var slide = document.querySelector("#slide");
		var path_json;
		path_json = JSON.parse(xhr_promotion.response);
		
		promotion_regist(slide,path_json);
		promotion_play(slide,path_json);
	});
	
	xhr_category.addEventListener("load",function(){
		var category_json;
		var category = document.querySelector("#category");
		
		category_json= JSON.parse(xhr_category.response);
		
		create_CategoryMenu(category,category_json);
		categoryclick_event(category);
	});
	
	xhr3.addEventListener("load",function(){
		
		product_Count= xhr3.response;
		
		regist_product_count();
		
		regist_product_List(1);
		
		more_button();
	});
	
	var xhr4 = new XMLHttpRequest();
	var product_List ;
	

	xhr_promotion.open("GET","./api/promotions");
	xhr_category.open("GET","./api/category");
	xhr3.open("GET","./api/ProductCount/0");
	
	xhr_promotion.send();
	xhr_category.send();
	xhr3.send();
	
	
	
	
	
});


function categoryclick_event(category){
category.addEventListener("click",function(e){
	var more_button = document.querySelector("#more_b");
	more_button.style.display="block"

	if(e.target.nodeName=="A"){
		for(var i=0;i<category.childElementCount;i++){
			category.children[i].children[0].style.color="black";	
		}
		
	var category_color = e.target;
	var categorytext = e.target.innerText;
	var cateid=null;
	switch(categorytext){
	case "전체리스트":
		cateid=0;
		catestate=0;
		startstate=0;
		category_color.style.color="green";
		break;
	case "뮤지컬":
		cateid=1;
		catestate=1;
		startstate=0;
		category_color.style.color="green";
		break;
	case "콘서트":
		cateid=2;
		catestate=2;
		startstate=0;
		category_color.style.color="green";
		break;
	case "클래식":
		cateid=3;
		catestate=3;
		startstate=0;
		category_color.style.color="green";
		break;
	case "연극":
		cateid=4;
		catestate=4;
		startstate=0;
		category_color.style.color="green";
		break;
	case "전시":
		cateid=5;
		catestate=5;
		startstate=0;
		category_color.style.color="green";
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
			regist_product_count();	
		});
		xhr.open("GET",url);
		xhr.send();
		
		 regist_product_List(1);
		}
	
	}
});
}
