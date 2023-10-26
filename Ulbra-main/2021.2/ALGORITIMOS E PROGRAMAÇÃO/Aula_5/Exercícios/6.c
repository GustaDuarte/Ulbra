//FUP para ler e escrever três números. Se o primeiro for positivo, imprimir sua raiz quadrada, caso contrário, imprimir o seu quadrado; se o segundo número for maior que 10 e menor que 100, imprimir a mensagem: "NÚMERO ESTÁ ENTRE 10 E 100 - INTERVALO PERMITIDO"; se o terceiro número for menor que o segundo, calcular e escrever a diferença entre eles, caso contrário, calcular e escrever a soma entre eles. 
#include <stdio.h>
#include <math.h>

float n1, n2, n3;
int main(){
    printf("Digite tres numeros:\n");
        scanf("%f %f %f", &n1, &n2, &n3);
    if (n1 > 0)
    {
        printf("A raiz quadrada de N1 eh:%.2f\n", sqrt(n1));
    }
    else if (n1 < 0)
    {
        printf("N1 elevado ao quadrado eh:%2.f\n", pow(n1, 2)); 
    }
    if (n2 > 10, n2 < 100)
    {
        printf("NUMERO ESTA ENTRE 10 E 100 - INTERVALO PERMITIDO\n");
    }
    if (n3 < n2)
    {
        printf("A diferenca entre n3 e n2 eh de:%.2f\n", n2-n3);
    }
    else if (n2 < n3)
    {
        printf("A diferença entre n3 e n2 eh de:%.2f\n", n3-n2);
    }
    

    return 0;
}