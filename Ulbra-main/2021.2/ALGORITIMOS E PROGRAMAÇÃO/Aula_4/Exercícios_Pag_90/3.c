#include <stdio.h>

int main(){

   float num1, num2;
   /* obtem 2 numeros do usuario */
   printf("Digite o valor de N1: ");
   scanf("%f", &num1);
   printf("Digite o valor de N2: ");
   scanf("%f", &num2);
   /* mostra a mensagem de comparacao */
   {
      if(num1 < num2) 
      printf("N1 e menor\n");
      else
      printf("N2 e menor\n");

   }
   
   return 0;
}

