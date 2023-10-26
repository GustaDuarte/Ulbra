#include <stdio.h>
#include <stdlib.h>
int main()
{
    float n1,n2,media,diferenca,produto,divisao;
    int opcao;
    printf("Entre com dois numeros:\n");
    scanf("%f",&n1);
    scanf("%f",&n2);
    printf("escolha umas das opcoes:\n");
    printf("1 - Media entre os numero digitados\n");
    printf("2 - Diferenca do maior pelo menor\n");
    printf("3 - Produto entre os numeros digitados\n");
    printf("4 - Divisao do primeiro pelo segundo\n");
    scanf("%d",&opcao);
    if(opcao==1)
    {
        media = (n1+n2)/2;
        printf("\nA media entre os numeros eh: %.2f\n",media);
    }
    else
    {
        if(opcao==2)
        {
            diferenca=n1-n2;
            printf("\nA diferenca do primeiro pelo segundo eh: %.2f\n",diferenca);
        }
        else
        {
            if(opcao==3)
            {
                produto=n1*n2;
                printf("\nO produto entre os numeros digitados eh: %.2f\n",produto);
            }
            else
            {
                if(opcao==4 && n1!=0 && n2!=0)
                {
                    divisao=n1/n2;
                    printf("\nA divisao dp primeiro pelo segundo eh: %.2f\n",divisao);
                }
                else
                {
                    printf("\nopcao invalida\n");
                }
               
            }
        }
    }
   
    return 0;
}