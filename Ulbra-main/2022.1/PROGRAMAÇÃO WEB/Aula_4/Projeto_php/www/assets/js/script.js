$(document).ready(function(){

    
  $("#hide").click(function(){
      $("#text").hide();
  });
  $("#show").click(function(){
      $("#text").show();
  });

  $("#about").click(function(){
      $("article").load('about.html')
  });

  $("#home").click(function(){
      $("article").load('home.html')
  });


});