//converter decimal para qualquer base

//como faz para transformar de decimal pra binario?

function decimalToBinary(numero, base){
    var dividendo = numero;
    var result = "";
    var i = 0;
    var resto = 0;

    while (i == 0) {
        resto = parseInt(dividendo) % base; // resto recebe 10
        if(base === 16){
            resto = decimalToHex(resto); // resto que é 10 se torna A
        }
        result += resto.toString();
        //     += concatena strings
        dividendo = parseInt(dividendo / base); //aqui o dividendo se da igual a 0; 
        console.log(dividendo);
        if(dividendo < base){
            i++;
            if(dividendo != 0){
                result += decimalToHex(dividendo);
                console.log(result);
            }
        }
    }
    return reverse(result);
}

function reverse(result){
    var arr = result.split('');
    var resultFinal = '';
    for(i = arr.length - 1; i >= 0; i--){
        resultFinal += arr[i];
    }

    return resultFinal;
}

function decimalToHex(num){
    console.log(num);
    var valor = 0;
    switch (num) {
        case 10:
            valor= 'A';
            break;
        case 11:
            valor= "B";
            break;
        case 12:
            valor= "C";
            break;
        case 13:
            valor= "D";
            break;
        case 14:
            valor= "E";
            break;
        case 15:
            valor= "F";
            break;
        default:
            valor = num;
    }
    return valor;
}

