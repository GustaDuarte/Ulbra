#include <stdio.h>
#include <string.h>

int main(){

    char menu;
    int i, y, manter = 0;
    char string[51];
    char aux;

    do
    {
        printf("MENU DE OPCOES:\n");
        printf("1 - ORDENAR\n");
        printf("2 - SUBSTITUICAO\n");
        printf("3 - ENCERRAR\n");
        printf("    Escolha a opcao:\n");
        scanf("%c%*c", &menu);

        switch (menu)
        {
            case '1':
                printf("STRING DE ATE 50 CARACTERES: \n");
                gets(string);

                for (i =0 ; string[i] != '\0'; i++)//para poder digitar "espaço" na string sem que ocorra erro.
                {
                    switch(string[i])
                    {
                        case ' ':

                            string[i] = ' ';
        
                        break;
                    }
                }
                for(i = 0; i <= strlen(string); i++)
                {
                    for(y = i + 1; y <= strlen(string); y++)
                    {
                        if(string[i] > string[y] && string[y] != '\0')
                        {
                            aux = string[i];
                            string[i] = string[y];
                            string[y] = aux;
                        }
                    }
                }
                printf("STRING ORDENADA: %s\n", string);
                break;

            case '2':
                printf("STRING DE ATE 50 CARACTERES: \n");
                gets(string);

                for (i =0 ; string[i] != '\0'; i++)
                {
                    switch(string[i])
                    {
                        case ' ':

                            string[i] = '_';

                        break;
                    }
                }
                for(i=strlen(string) - 1; i>=0; i--)
                {
                    printf("%c", string[i]);
                }
                printf("\n \n");
                break;

            case '3':
                return 0;

            default:
                    printf("OPCAO INVALIDA!\n");
                    break;   
        }     
    } while (manter == 0);

    return 0;
}