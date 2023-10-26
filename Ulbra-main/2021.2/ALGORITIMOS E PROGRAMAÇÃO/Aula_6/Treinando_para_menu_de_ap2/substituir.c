//faz a leitura de um texto livre (de no máximo 50 caracteres) e substitui escrevendo todos os espaços em branco do texto livre por underline( _ )
#include <stdio.h>
#include <string.h>

main()
{
    char texto[100];
    int i, l;

    printf ("Digite uma frase:\n");
    gets(texto);

    l=strlen(texto);
    for (i = 0; i < l; i++){
        if (texto[i]==' '){
            texto[i]='_';
        }
    }
    printf ("%s", texto);
    return 0;
}