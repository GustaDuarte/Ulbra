//Solicitar a idade de 5 pessoas e imprimir a média de idade lidas.


#include <stdio.h>
#include <stdlib.h>

int main(){
    int i, idade, soma = 0; 
    float media;
    for (i = 1; i <= 5; i++){
        printf("\nDigite a idade da %d pessoa:", i);
        scanf("%d", &idade);
        soma += idade; 
    }
    media = soma / 5;
    printf("A media das idades eh %.2f", media);
    
    return 0;
}