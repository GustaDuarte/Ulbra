#include <stdio.h>
#include <stdlib.h>
int main()
{
     int saldo, credito, valorF;
     printf("\nDigite o valor do saldo do ultimo ano:\n");
     scanf("%i%*c", &saldo);
    if (saldo <= 200)
    {
         credito = saldo*1.10-saldo;
         printf("Saldo Medio: %i\n", saldo);
         printf("Valor do credito: %i\n", credito);
    }
    else{
        if (saldo <= 300)
        {
             credito = saldo*1.20-saldo;
             printf("Saldo Medio: %i\n", saldo);
             printf("Valor do credito: %i\n", credito);
        }
        else{
            if (saldo <=400)
            {
                 credito = saldo*1.25-saldo;
                 printf("Saldo Medio: %i\n", saldo);
                 printf("Valor do credito: %i\n", credito);
            }
            else{
                if (saldo > 400)
                {
                     credito = saldo*1.30-saldo;
                     printf("Saldo Medio: %i\n", saldo);
                     printf("Valor do credito: %i\n", credito);
                }
                
            }
            
        }
        
    }
    return 0;
}