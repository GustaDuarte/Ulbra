#include <stdio.h>
#include <stdlib.h>
int main()
{
    float salario, salarioR, salarioA;
    printf("\nDigite o valor do seu salario:\n");
    scanf("%f%*c", &salario);
    if (salario <= 300)
    {
        salarioR = salario*1.35;
        printf("Salario reajustando com mais 35 por cento: %2.f\n", salarioR);
    }
    else{
        if (salario > 300);
        {
        salarioA = salario*1.15;
        printf("Salario reajustando com mais 15 por cento: %2.f\n", salarioA);

        }
        
    }
    


    return 0;
}