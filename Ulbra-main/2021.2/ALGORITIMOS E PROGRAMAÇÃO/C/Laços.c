/*Praticando laços*/
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int test;

    printf("INDICE O NUMERO DE TEST:\n");
    scanf("%d", &test);

    for (test; test <= 4; test++)
    {
        printf("VARIAVEL TEST ESTA EM...%i\n", test);
    }
    return 0;
}