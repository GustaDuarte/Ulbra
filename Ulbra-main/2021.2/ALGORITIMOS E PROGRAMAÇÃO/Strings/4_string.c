//FUP que leia 3 strings e escreva em ordem alfabética.

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>

    char string[50];
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
    printf("DIGITE UMA STRING DE NO MAXIMO 50 CARACTERS:\n");
    gets(string);
    OrdemAlfabetica ();
    printf("STRING ORDENADA:\n");
    puts(string);                   
}