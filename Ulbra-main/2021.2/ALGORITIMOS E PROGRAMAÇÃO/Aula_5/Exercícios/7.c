//FUP para ler dois valores: NUM1 e NUM2, e se NUM1 for maior que NUM2 executa a soma de NUM1 e NUM2; caso contrário, executa uma subtração.

#include <stdio.h>

float num1, num2;
int main(){
    printf("Digite dois numeros:\n");
        scanf("%f %f", &num1, &num2);
    if (num1 > num2)
    {
        printf("A soma de Num1 e Num2 eh:%.2f\n", num1 + num2);
    }
    else{
        printf("A subtracao de Num1 e Num2 eh:%.2f\n", num1 - num2);
    }

        return 0;
    
}