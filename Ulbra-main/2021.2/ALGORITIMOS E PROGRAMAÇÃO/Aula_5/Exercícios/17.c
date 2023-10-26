#include <stdio.h>
#include <string.h>

int main(){

    float sal, salN; 
    char nome[61];

    printf("Digite seu nome: ");
        scanf("%s",nome);

    printf("Digite seu salario atual:\n\n");
        scanf("%f", &sal);
    if (sal <= 400.00)
    {
        printf("Nome: %s\n", nome);
        printf("Salario atual: %.2f\n", sal);
        printf("Percentual de aumento: 15 por cento.\n");
        printf("Salario com o acrescimo: %.2f\n",salN = (sal*0.15)+sal, salN);
    }
    else if (sal >= 400.01 && sal <= 700.00)
    {
        printf("Nome: %s\n", nome);
        printf("Salario atual: %.2f\n", sal);
        printf("Percentual de aumento: 12 por cento.\n");
        printf("Salario com o acrescimo: %.2f\n",salN = (sal*0.12)+sal, salN);
    }
    else if (sal >= 700.01 && sal <= 1000.00)
    {
        printf("Nome: %s\n", nome);
        printf("Salario atual: %.2f\n", sal);
        printf("Percentual de aumento: 10 por cento.\n");
        printf("Salario com o acrescimo: %.2f\n",salN = (sal*0.10)+sal, salN);
    }
    else if (sal >= 1000.01 && sal <= 1800.00)
    {
        printf("Nome: %s\n", nome);
        printf("Salario atual: %.2f\n", sal);
        printf("Percentual de aumento: 7 por cento.\n");
        printf("Salario com o acrescimo: %.2f\n",salN = (sal*0.07)+sal, salN);
    }
    else if (sal >= 1800.01 && sal <= 2500.00)
    {
        printf("Nome: %s\n", nome);
        printf("Salario atual: %.2f\n", sal);
        printf("Percentual de aumento: 4 por cento.\n");
        printf("Salario com o acrescimo: %.2f\n",salN = (sal*0.04)+sal, salN);
    }
    else if (sal > 2500.00)
    {
        printf("Nome: %s\n", nome);
        printf("Salario atual: %.2f\n", sal);
        printf("Sem aumento!\n");
    }
    
    
    return 0;
}