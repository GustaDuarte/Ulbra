//FUP que leia uma string e a escreva em letras maiúsculas e letras minúsculas.

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

    int main(){
        int i = 7;
        char string[40];

        printf("INFORME A STRING:\n");
        scanf("%s", &string);

        if (i != 0)
        {
            strupr(string);
            printf("\nMAIUSCULA: %s\n", string);
            strlwr(string);
            printf("\nMINUSCULA: %s\n", string);
        }
        


        return 0;
    }

