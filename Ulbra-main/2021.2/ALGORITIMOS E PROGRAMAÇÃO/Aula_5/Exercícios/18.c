#include <stdio.h>

int main()
{
    float peso,altura,resultado;
    char sexo;
    printf("Digite sua altura:");
    scanf("%f",&altura);
    printf("Digite seu peso:");
    scanf("%f",&peso);
    printf("Digite seu sexo [F] ou [M]:");
    scanf("%s",&sexo);

    if(sexo == 'M')
    {
         resultado = 72.7*altura - 58;
        printf("O seu peso ideal eh:%.2f\n", resultado);
    }
    else if(sexo == 'F')
    {
        resultado = 62.1*altura - 44.7;
        printf("O seu peso ideal eh:%.2f\n", resultado);
    }
    return 0;
}