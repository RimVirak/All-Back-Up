$(document).ready(function () {

    // $("#circle1").click(function(){
    //     $("#slider").animate({left: "-30%",opacity:"100" , rigth: "1200px" },1000);
    //     $(".line ").animate({ left: "30%" }, 500 ); 
    //     $("#data ").animate({ left: "45%" } );
    //     $(".info").animate({ left: "100%" }, 1000 ); 
    //     $(".title").css({  width: "100%", height: "100%", right: "100%" }, 1000 );
    // });
    // $("#circle2").click(function(){
    //     $("#slider").animate({left: "-100%",opacity:"100" },1000);
    //     $(".line").animate({ left: "2%" }, 500 );
    //     $("#data2,$data3 ").animate({ left: "45%" } );
    //     $(".info").animate({ left: "100%" }, 1000 );  
    //     $(".title").css({  width: "100%", height: "100%", right: "100%" }, 1000 );
    // });
    // $("#circle3").click(function(){
    //     $("#slider").animate({left: "-200%",opacity:"100" },1000);
    //     $(".line").animate({ rigth: "300%" }, 500 ); 
    //      $("#data2,$data").animate({ left: "45%" } );
    //     $(".info").animate({ left: "100%" }, 1000 );  
    //     $(".title").css({  width: "100%", height: "100%", right: "100%" }, 1000 );
    // });
    $('a:nth-child(1)').css("background-color", "blue");
    $("#circle1").click(function () {
        $("#slider").animate({ "left": "5%" }, 600);
        $("#data").fadeIn(700);
        $("#data2,#data3").fadeOut(500);
        $(".line").animate({ "left": "60%" }, 600);
        $('a:nth-child(1)').css("background-color", "white");
        $('a:nth-child(2),a:nth-child(3)').css("background-color", "black");
    });
    $("#circle2").click(function () {
        $("#slider").animate({ "left": "-30%" }, 600);
        $("#data2").fadeIn(700);
        $("#data,#data3").fadeOut(500);
        $(".line").animate({ "left": "25%" }, 600);
        $('a:nth-child(2)').css("background-color", "white");
        $('a:nth-child(1),a:nth-child(3)').css("background-color", "black");
    });
    $("#circle3").click(function () {
        $("#slider").animate({ "left": "-190%" }, 600);
        $("#data3").fadeIn(700);
        $("#data,#data2").fadeOut(500);
        $(".line").animate({ "left": "55%" }, 600);
        $('a:nth-child(3)').css("background-color", "white");
        $('a:nth-child(2),a:nth-child(1)').css("background-color", "black");
    });
});