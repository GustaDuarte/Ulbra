//FUP que leia o nome e o sobrenome de uma pessoa em duas variáveis distintas, o programa deve armazenar os dois valores uma terceira variável.

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

    int main(){
        char nome[20];
        char sobre_nome[30];
        char completo[50];

        printf("\nINFORME SEU NOME:\n");
        scanf("%s", &nome);
        printf("\nINFORME SEU SOBRENOME:\n");
        scanf("%s", &sobre_nome);

        strncat (nome, sobre_nome, 50);
        printf("\nNOME COMPLETO: %s\n", nome);


        return 0;
    }