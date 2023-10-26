//Solicitar a idade de um número indefinido de pessoas e imprimir a média de idade lidas. O programa se encerra quando a média de idade for superior a 20 anos ou que tenha lido 10 pessoas.

#include <stdio.h>
#include <stdlib.h>

int main(){
    int idade;
    int cont=0;
    float media;
    float soma =0;
    do{
        cont++;
        printf("Digite a idade da pessoa %i:\n", cont);
        scanf("%i%*c", &idade);
        soma = soma + idade;
        media = soma / cont;
    
    }while ((media < 20) && (cont < 10));

printf("Media das idades: %.2f\n", media);
    
    return 0;
}




