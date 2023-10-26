function potenciacao(base, expoente){
    var result = 0;

    for(var i = 0; i <= expoente; i++){
        result = base ** i;
        console.log(expoente,'^', i,'=',result);
        
    }
    return result;
}