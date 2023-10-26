/*------------------------------------------------------------------*/
/* Programa de conversao de bases ----------------------------------*/
/* Versão 1 --------------------------------------------------------*/

#include <stdio.h>
char string[50];
int auxiliar;
main()
{
int entrada, opcao = 0;
char opcao_c;

/* Loop principal do programa --------------------------------------*/
while (opcao != 5)
{
       printf("\n\n");

       /* Imprime a tela */
       printf("\n\n\t< Conversao de base >");
       printf("\n  1: decimal para hexadecimal");
       printf("\n  2: hexadecimal para decimal");
       printf("\n  5: Encerra");

       printf("\n\n\t\tOpcao: ");
       scanf("%d", &opcao);
       if ((opcao > 3)||(opcao <1))
          continue;           /* Opcao invalida ou saida */
                              /* Volta ao inicio do loop */

       printf("\nEntre com o numero: ");
       switch (opcao)
       {
          case 1:
                    printf("Digite uma string de no maximo 50 caracteres:\n");
                    gets(string);
                    OrdemAlfabetica ();
                    printf("String Ordenada\n");
                    puts(string);     

        break;
          case 2:
                  scanf("%x", &entrada);
                  printf("Numero convertido: %d", entrada);
          break;
          case 3:
                  scanf("%d", &entrada);
                  printf("Numero convertido: %o", entrada);
          break;
          case 4:
                  scanf("%o", &entrada);
                  printf("Numero convertido: %d", entrada);
          break;
       }
}
}

void OrdemAlfabetica ()
{
int x, y;
char aux;

    for ( x = 0; x <= 49; x++)
    {
    for (y = x + 1; y <= 49; y++)
    if (string[x] > string[y] && string[y] != '\0')
        {
            aux = string[x];
            string[x] = string[y];
            string[y] = aux;
        }

    }
                        
}