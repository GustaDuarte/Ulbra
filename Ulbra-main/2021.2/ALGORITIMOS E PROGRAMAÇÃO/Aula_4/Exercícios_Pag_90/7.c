#include <stdio.h>
#include <stdlib.h>
int main()
{
    float salario, salarioR;
    printf("\nDigite o valor do seu salario:\n");
    scanf("%f%*c", &salario);
    if (salario < 500)
    {
        salarioR = salario*1.3;
        printf("Salario reajustando: %2.f\n", salarioR);
    }
    else{
        if (salario > 500);
        {
            printf("Voce nao tem direito ao aumento!\n");
        }
        
    }
    


    return 0;
}