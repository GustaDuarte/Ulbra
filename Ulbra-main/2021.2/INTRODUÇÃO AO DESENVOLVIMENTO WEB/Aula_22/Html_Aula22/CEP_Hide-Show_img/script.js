$(document).ready(function(){

    $('#search').click(function(){

        var cep = $('#cep').val();
        var url = 'https://viacep.com.br/ws/'+ cep +'/json/';
        $.get(url, function(data){
            $('#result').html(
                'Localidade: ' + data.localidade + '<br>' +
                'Código IBGE: ' + data.ibge + '<br>' 
            )
        });
    });
  
});

$(document).ready(function(){
    $("#hide").click(function(){
      $("p").hide();
    });
    $("#show").click(function(){
      $("p").show();
    });
  });

