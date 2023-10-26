// o usuario informa um numero e uma base...
// transformar o numero num array... dividindo cada digito numa posição
var letra = "a";
if(isNaN(letra)){
    console.log("valor não é um numero");
}else{
    console.log("é um numero");
}

function binaryToDecimal(numero){
    var posicao = 0;
    var resultFormulaNoAlgarismo = 0;
    var resultFinal = 0;

    var arrNumero = numero.split('');
    var posicao = arrNumero.length-1;

   for(i=0; i<arrNumero.length;i++){
    //para cada numero aplicar a*b**p e guardar este resultado 
    //e incrementar sempre nesse resultado ate o final do array
    resultFormulaNoAlgarismo = (arrNumero[i] * (2 ** posicao));
    resultFinal = resultFinal + resultFormulaNoAlgarismo;
    posicao--;
   }
   return resultFinal;
}


function convertToDecimal(numero, base){
    var posicao = 0;
    var resultFormulaNoAlgarismo = 0;
    var resultFinal = 0;
    var numeroReal = 0;
    var arrNumero = numero.split('');
    var posicao = arrNumero.length-1;

   for(i=0; i<arrNumero.length;i++){
    //para cada numero aplicar a*b**p e guardar este resultado 
    //e incrementar sempre nesse resultado ate o final do array
    if(isNaN(arrNumero[i])){
        numeroReal = hexadecimalToDecimal(arrNumero[i]);
    }else{
        numeroReal = arrNumero[i];
    }
        //chamar hexadecimalToDecimal();
    resultFormulaNoAlgarismo = (numeroReal * (base ** posicao));
    resultFinal = resultFinal + resultFormulaNoAlgarismo;
    posicao--;
   }
   return resultFinal;
}

function hexadecimalToDecimal(letra){
    var valor = 0;
    switch (letra) {
        case "A":
            return 10;
        break;
        case "B":
            return 11;
        break;
        case "C":
            return 12;
        break;
        case "D":
            return 13;
        break;
        case "E":
            return 14;
        break;
        case "F":
            return 15;
        break;
        default:
            valor = 0;
    }
    return valor;
}



