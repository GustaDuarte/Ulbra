//Escrever um programa que leia, valores inteiros, até ser lido o valor-99. Quando isso acontecer o programa deverá escrever a soma e a média dos valores lidos.

#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
    
 int num, soma=0;
 float media=0, cont=0;

 printf("\n DIGITE UM NUMERO INTEIRO: ");
 scanf("%d",&num);
 while(num!=-99){
 soma=soma+num;
 cont++;

 printf("\n DIGITE UM NUMERO INTEIRO: ");
 scanf("%d",&num);
 }
 media=soma/cont;

 printf("\n\n A soma dos numeros e: %d ",soma);
 printf("\n\n A media dos numeros e: %3.2f ",media);
 
  return 0;
}