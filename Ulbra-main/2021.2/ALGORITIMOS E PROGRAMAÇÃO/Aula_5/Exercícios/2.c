
//FUP para determinar se uma pessoa é maior ou menor de idade.
#include <stdio.h>

int main(){
    int idade;

    printf("Digite a sua idade: ");
    scanf("%i%*c",&idade);

    if(idade >= 18){
        printf("Bebidas liberadas! Let's party!");
    }else{
        printf("Bebidas alcoolicas negadas! Tome seu toddynho!");
    }

    return 0;
}