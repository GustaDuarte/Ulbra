#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    float op, n1, n2;
    float pot, rn1, rn2, rc1, rc2;

    printf("DIGITE O PRIMEIRO NUMERO:\n");
    scanf("%f%*c", &n1);

    printf("DIGITE O SEGUNDO NUMERO:\n");
    scanf("%f%*c", &n2);

    printf("ENTRE COM UMA DAS OPCOES!...\n");
    printf("1--PRIMEIRO NUMERO ELEVADO AO SEGUNDO\n");
    printf("2--RAIZ QUADRADA DE CADA UM DOS NUMEROS\n");
    printf("3--RAIZ CUBICA DE CADA UM DOS NUMEROS\n");
    scanf("%f%*c", &op);

    if (op == 1)
    {
        pot = pow(n1, n2);
        printf("PRIMEIRO NUMERO ELEVADO AO SEGUNDO: %2.f%*c\n", pot);
    }else
    {
        if (op == 2)
        {
            rn1 = sqrt(n1);
            rn2 = sqrt(n2);
            printf("A RAIZ QUADRADA DE N1 EH...\n");
            printf("------> %.2f <------\n", rn1);
            printf("A RAIZ QUADRADA DE N2 EH...\n");
            printf("------> %.2f <------\n", rn2);
        }
        else
        {
            if (op == 3)
            {
                printf("A RAIZ CUBICA DE N1 EH...\n");
                printf("-----> %.2f <------\n", cbrt(n1));
                printf("A RAIZ CUBICA DE N2 EH...\n");
                printf("-----> %.2f <------\n", cbrt(n2));
            }
            else
            {
                printf("OPCAO INVALIDA.\nSELECIONE OPCOES 1, 2 OU 3\n");
            }
            
        }
        
    }
    return 0;

}