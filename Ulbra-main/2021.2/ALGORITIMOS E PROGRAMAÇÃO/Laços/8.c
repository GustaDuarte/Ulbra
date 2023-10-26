//Solicitar um número entre 1 e 4. Se a pessoa digitar um número diferente, mostrar a mensagem "entrada inválida" e solicitar o número novamente. Se digitar correto mostrar o número digitado

#include<stdio.h>
#include<stdlib.h>
main(){
 int num;

 printf("\n INFORME UM NUMERO ENTRE 1 e 4: ");
 scanf("%d",&num);

 while(num<1 || num>4){
    printf("\nNUMERO INVALIDO...");
    printf("\nDIGITE NOVAMENTE: ");
    scanf("%d",&num);
 }

 printf("\n\n O NUMERO DIGITADO E:% d",num);

 return 0;
 }
