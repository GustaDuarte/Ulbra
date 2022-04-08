//FUP que leia uma string e um caracter, o programa deve informar quantas vezes o caracter lido aparece na string.

#include<stdio.h>

int main()
{
	int i, cont = 0;
	char caracteres[50], c;

	printf("\nDigite uma string:\n");
	gets(caracteres);

	printf("\nInforme um caracter: \n");
	scanf("%c", &c);

	for(i=0; caracteres[i]!='\0'; i++) {
		if(caracteres[i]==c)
			cont++;
	}

	if(cont==0) {
		printf("Caracter nao encontrado");
	} else {
		printf ("Contagem de caracteres = %d\n", cont);
	}
}