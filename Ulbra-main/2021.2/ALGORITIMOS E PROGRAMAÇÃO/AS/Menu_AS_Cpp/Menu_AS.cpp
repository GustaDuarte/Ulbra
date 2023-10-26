/*Faça um programa que :
Tenha um menu com as seguintes funcionalidades;
Ler o vetor de  6 números inteiros 
Exibir Os números pares digitados; 
Exibir A soma dos números pares digitados; 
Exibir Os números ımpares digitados; 
A quantidade de números ımpares digitados;*/

#include <stdio.h>
#include <ctype.h>
#include <string.h>

int main(){
   int op=0;
   int vetores[6];

   for (int i = 0; i <= 5; i++)
   {
       printf("INFORME UM NUMERO INTEIRO:\n");
       scanf("%d%*c", &vetores[i]);  
   }  
   do{
       printf("1 - EXIBIR OS NUMEROS PARES DIGITADOS:\n");
       printf("2 - EXIBIR A SOMA DOS NUMEROS PARES DIGITADOS:\n");
       printf("3 - EXIBIR OS NUMEROS IMPARES DIGITADOS:\n");
       printf("4 - A QUANTIDADE DE NUMEROS IMPARES DIGITADOS:\n");
       printf("5 - ENCERRAR\n");
       scanf("%d%*c",&op);

        switch(op)
        {
            case 1:
                {   
                    for (int i = 0; i <= 5; i++)
                    {
                        if (vetores[i] %2 == 0)
                        {
                            printf("NUMEROS PARES: %d\n", vetores[i]);
                        }                       
                    }                   
                    break;
                }  
            case 2:
                {   int soma;
                    for (int i = 0; i <= 5; i++)
                    {
                        if (vetores[i] %2 == 0)
                        {
                            soma = soma + vetores[i];
                        }                       
                    }
                    printf("A SOMA DOS NUMEROS PARES EH: %d\n", soma)                   ;
                    break;
                }
            case 3:
                { 
                    for (int i = 0; i <= 5; i++)
                    {
                        if (vetores[i]%2 != 0)
                        {
                            printf("NUMEROS IMPARES: %d\n", vetores[i]);
                        }
                    }                
                    break;
                }
                case 4:
                {
                    int cont = 0;
                    for (int i = 0; i <= 5; i++)
                    {
                        if (vetores[i]%2 != 0)
                        {
                            cont++;
                        }                       
                    }
                    printf("QUANTIDADE DE NUMEROS IMPARES DIGITADOS: %d\n", cont);                   
                    break;
                }
                case 5:
                {
                    printf("Encerrando...\n");
                    return 0;
                }   
        }
   }while (op!=6);
  
    return 0;
}
