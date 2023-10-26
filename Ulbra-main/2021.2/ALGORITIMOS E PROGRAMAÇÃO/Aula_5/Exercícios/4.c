/*FUP que leia um número e mostre uma mensagem indicando se este número é par ou ímpar e se é positivo ou negativo.*/

#include <stdio.h>

int main(){

        int x;

            printf("Escreva o numero:\n");
                scanf("%d",&x);

        if (x % 2 == 0)
            printf("O numero %d par\n",x);
        else if(x % 2 != 0)
            printf("O Numero %d impar\n",x);
        
        if (x < 0)
            printf("O numero é negativo");
        else if (x == 0)
            printf("O numero eh nulo");
        else
            printf("O numero eh positivo");
        
            return 0;
}
