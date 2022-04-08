#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main()
{
   float opcao, n1, n2, pot, rn1, rn2, rc1, rc2; 

    printf("\nDigite o primeiro numero:\n");
     scanf("%f%*c", &n1);
    printf("\nDigite o segundo numero:\n");
     scanf("%f%*c", &n2);
    printf("\nDigite uma das Opcoes:\n");
    printf("\nopcao 1: Primeiro numero elevado ao segundo\n"); 
    printf("\nopcao 2: Raiz quadrada de cada um dos numeros\n");
    printf("\nopcao 3: Raiz cubica de cada um dos numeros\n");
     scanf("%f%*c", &opcao);
    if(opcao==1)
    {
        pot = pow (n1, n2);
        printf("\nPrimeiro numero elevado ao segundo eh: %.2f%*c\n",pot);
    }
    else
    {
        if(opcao==2)
        {
            rn1 = sqrt(n1);
            rn2 = sqrt(n2);
            printf("\nA raiz quadrada de eh n1: %.2f\n",rn1);
            printf("\nA raiz quadrada de eh n2: %.2f\n",rn2);
        }
        else
        {
            if(opcao==3)
            {
                rc1 = n1;
                rc2 = n2;
                printf("\nO valor da raiz cubica de n1 eh: %.2f\n",cbrt(rc1));
                printf("\nO valor da raiz cubica de n2 eh: %.2f\n",cbrt(rc2));
            }
            else
            {
                
                printf("\nopcao invalida. Digite opcoes 1, 2 ou 3\n");

            }
            
        }
    }
    


    return 0;
}