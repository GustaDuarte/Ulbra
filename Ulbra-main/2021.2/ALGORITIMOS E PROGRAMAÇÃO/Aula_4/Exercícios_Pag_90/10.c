#include <stdio.h>
#include <stdlib.h>
int main()
{
     float custo, porcentagem, impostos, soma;
     printf("\nDigite o valor do custo de fabrica:\n");
     scanf("%f%*c", &custo);
    if (custo <= 12000)
    {
         soma = custo*1.05;
         printf("Preco: %f\n", soma);
         
    }
    else{
        if (custo <= 25000)
        {      porcentagem = custo*1.10-custo;
               impostos = custo*1.15-custo;
               soma = custo+porcentagem+impostos;
               printf("Preco: %f\n", soma);
        }
                if (custo > 25000)
                {
                   porcentagem = custo*1.15-custo;
                    impostos = custo*1.20-custo;
                    soma = custo+porcentagem+impostos;
                    printf("Preco: %f\n", soma);   
                }
        
        }
        
        
        
    
    

    return 0;
}