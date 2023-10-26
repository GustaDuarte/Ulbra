//Ler um número do teclado e imprimir todos os números de 1 até o número lido. Imprimir a soma dos números.

#include <stdio.h>
#include <stdlib.h>

int main(){
    int i, numero, soma = 0;
    printf("\nDigite um numero: ");
        scanf("%d", &numero);
    for (i = 1; i <= numero; i++)
    {
        soma = soma + i;
    }
    printf("\nA soma dos numeros eh: %d", soma);

    return 0;
}