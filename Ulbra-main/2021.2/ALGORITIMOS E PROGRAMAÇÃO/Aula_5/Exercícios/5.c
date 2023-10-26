//FUP para ler dois números. Se os números forem iguais imprimir a mensagem: "NÚMEROS IGUAIS" e encerrar a execução; caso contrário, imprimir o de maior valor.
#include <stdio.h>
int main(){
    int n1, n2;

    printf("Digite os dois numeros:\n");
        scanf("%i %i", &n1, &n2);
    if (n1 == n2)
    {
        printf("Numeros iguais...\n");
    }
    else if (n1 > n2)
    {
        printf("O valor de n1 eh:%i\n", n1);
    }
    else{
        printf("O valor de n2 eh:%i\n", n2);
    }
    
    return 0;
    
}