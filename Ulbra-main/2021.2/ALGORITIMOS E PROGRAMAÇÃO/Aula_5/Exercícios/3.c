//FUP para ler dois valores numéricos e apresentar a diferença do maior pelo menor. 
#include <stdio.h>
int main(){
    int n1, n2, dif;
    printf("Digite os dois numeros:\n");
        scanf("%i %i", &n1, &n2);
    if (n1 > n2)
    {
        printf("O resultado eh: %i\n", n1-n2);

    }
    else if (n1 < n2)
    {
        dif = n2-n1;
        printf("A diferença eh:%i", dif);
    }
    else{
        printf("Os dois numeros apresentam o mesmo valor...\n");
    }
    
    return 0;
    
}