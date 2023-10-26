//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){

 int idade,contador21=0,contador50=0;

 printf("\n DIGITE A IDADE: ");
 scanf("%d",&idade);

 while(idade!=-99){
 if(idade<21)
 contador21++;
 if(idade>50)
 contador50++;
 printf("\n DIGITE A IDADE(PARA ENCERRAR DIGITE -99) : ");
 scanf("%d",&idade);
 }

 printf("\n O TOTAL DE PESSOAS COM MENOS DE 21 ANOS E:%d",contador21);
 printf("\n O TOTAL DE PESSOAS COM MAIS DE 50 ANOS E:%d",contador50);

    return 0;
}