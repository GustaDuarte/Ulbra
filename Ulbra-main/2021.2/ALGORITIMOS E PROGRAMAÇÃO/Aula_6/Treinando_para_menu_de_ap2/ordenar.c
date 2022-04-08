//ler uma palavra (de no máximo 50 caracteres), o programa deverá  e apresentar a palavra com as letras ordenadas em ordem alfabética.

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>

char string[50];
   
main (){

int x, y;
char aux;
  printf("STRING DE NO MAXIMO 50 CARACTERES:\n");
  gets(string);
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
  printf("\nSTRING ORDENADA:\n");
  puts(string);                    
}

/*void main (){
  printf("Digite uma string de no maximo 50 caracteres:\n");
  gets(string);
  OrdemAlfabetica ();
  printf("String Ordenada");
  puts(string);                   
}*/