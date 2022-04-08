//FUP para ler três valores quaisquer e escrever o maior dos 3.
#include <stdio.h>
int main(){
    int n1, n2, n3;
    printf("Digite tres numeros:\n");
    scanf("%i %i %i", &n1, &n2, &n3);
    if (n1 > n2 && n1 > n3)
    {
        printf("N1 eh maior:%d\n", n1);
    }
    else if (n2 > n1 && n2 > n3)
    {
        printf("N2 eh maior:%d\n", n2);
    }
    else if (n3 > n1 && n3 > n1)
    {
        printf("N3 eh maior:%d\n", n3);
    }
    

    return 0;
}