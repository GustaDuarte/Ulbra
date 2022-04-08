//inverter a ordem do texto. Por exemplo, para a string "O TRABALHO E FACIL", será: LICAF_E_OHLABART_O

#include<stdio.h>
#include<string.h>
#include<stdlib.h>

#define TAMANHO_MAXIMO_DA_FRASE 50
char trocar_letras(char letra);
int main(){
       char string2[50], auxiliar[50];
       int a,b;
       char frase[TAMANHO_MAXIMO_DA_FRASE];
       int i;

       printf("STRING DE 50 CARACTERES: ");
       gets(string2); 
       b = strlen(string2)-1;    //strlen calcula a quantidade de caracteres que tem a string
       for ( a=0;string2[a]!='\0';a++ )
       {                        //Repete enquanto nao chegar ao final da string
       auxiliar[b]=string2[a];
       b--;     
       }
       auxiliar[a]='\0';      //Se nao colocar essa parte, o programa pode mostrar LIXO
       strcpy(string2,auxiliar);    //Copia para a variável string o conteúdo da variável auxiliar
       strcpy(frase, string2);
       
       i=0;
       while (frase[i] != '\0')
       {
              frase[i] = trocar_letras(frase[i]);
              i++;
       }
       printf("%s", frase);
}


char trocar_letras(char letra)
{
    char nova_letra;

    switch (letra)
    {
    case ' ':
        nova_letra = '_';
        break;
    
    default:
    nova_letra = letra;
        break;
    }
    return nova_letra;
}
