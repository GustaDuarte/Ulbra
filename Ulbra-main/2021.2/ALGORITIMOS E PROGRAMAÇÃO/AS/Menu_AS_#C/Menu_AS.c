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
    int numeros[6];
    
    for(int i = 0; i < 6; i++){
        printf("Informe um numero inteiro \n");
        scanf("%d%*c", &numeros[i]);
    }

    do{
        printf("\n Digite o numero da opcao para selecionar: \n");
        printf("1- Exibir os numeros pares digitados \n");
        printf("2- Exibir a soma dos numeros pares digitados \n");
        printf("3- Exibir os numeros impares digitados \n");
        printf("4- A quantidade de numeros impares digitados \n");
        printf("5- ENCERRAR \n");
        scanf("%i%*c", &op);

        switch(op){
            case 1:{
                for(int i = 0; i < 6; i++){
                    if(numeros[i]%2 == 0){
                        printf("Os numeros pares sao: %d \n",numeros[i]);  
                    }  
                }
                break;
                }
            case 2:{
                int soma;
                for(int i = 0; i < 6; i++){
                    if(numeros[i]%2 == 0){
                    soma = soma + numeros[i];     
                    }   
                }              
                printf("\nA soma dos numeros pares eh: %d \n",soma);
                break;
            }
            case 3:{
                for(int i = 0; i < 6; i++){
                    if(numeros[i]%2 != 0){
                        printf("\n Os numeros impares sao: %d \n",numeros[i]);  
                    }  
                }
                break;
            }
            case 4:{
                int cont = 0;
                for(int i = 0; i < 6; i++){
                    if(numeros[i]%2 != 0){
                        cont++; 
                    }  
                }
                printf("\n A quantidade de numeros impares sao: %d \n", cont); 
                break;
            }
            case 5:{
                return 0;
                break;
           }
        }
    }while(op!=6);


    return 0;
}