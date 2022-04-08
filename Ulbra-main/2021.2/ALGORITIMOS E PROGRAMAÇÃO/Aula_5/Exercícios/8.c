//FUP que lê dois valores e escreve cada um juntamente com a mensagem: “É múltiplo de 2” ou “Não é múltiplo de dois”.

#include <stdio.h>

int main(){

        int n1, n2;

            printf("Digite dois numeros:\n");
                scanf("%d %d",&n1, &n2);

        if (n1 % 2 == 0) 
        {
            printf("%d eh multiplo de 2\n",n1);
        }
        if (n2 % 2 == 0)
        {
            printf("%d eh multiplo de 2\n",n2);
        }
        if(n1 % 2 != 0)
        {
            printf("%d nao eh multiplo de 2\n",n1);
        }
        if(n2 % 2 != 0)
        {
            printf("%d nao eh multiplo de 2\n",n2);
        }


        return 0;
}       