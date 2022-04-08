//FUP que leia 3 strings e escreva o total de caracteres que cada uma possui.


#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <conio.h>

main(void)
{           
          char string[50];
          char menu, resposta, continuar;
          int primeira = 0, segunda = 0;
          printf("MENU DE OPÇÕES\n");
         
           
          do{
          printf("1 - ORDENAR\n");
          printf("2 - SUBSTITUICAO\n");
          printf("3 - ENCERRAR\n");
          printf("    Escolha a opcao:\n");
          scanf("%c", &menu);
          fflush(stdin);
          
          switch(menu)
            {
                case '1':
                    primeira++;
                    break;
                        void OrdemAlfabetica (){
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
                    void main (){
                        printf("Digite uma string de no maximo 50 caracteres:\n");
                        gets(string);
                        OrdemAlfabetica ();
                        printf("String Ordenada");
                        puts(string);                   
                    }
                case '2':
                    segunda++;
                    break;
                case '3':
                    exit(0); // função que força o programa a encerrar quando o usuario teclar o número '3'.
                    break;
                    
                default:
                    printf("Erro!");
            }
              
          
             
              
          }while(continuar == '3');
          printf("\n------------------: %d", primeira);
          system("pause");
}