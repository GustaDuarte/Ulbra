#include <stdio.h>

int main(){

   float num1, num2, num3;
   /* obtem 2 numeros do usuario */
   printf("Digite o valor de N1: ");
   scanf("%f", &num1);
   printf("Digite o valor de N2: ");
   scanf("%f", &num2);
   printf("Digite o valor de N3: ");
   scanf("%f", &num3);
   /* mostra a mensagem de comparacao */
   {
      if(num1 > num2, num1 > num3) 
      printf("N1 e maior\n");
      if(num2 > num1, num2 > num3)
      printf("N2 e maior\n");
      if(num3 > num1, num3 > num2)
      printf("N3 e maior\n");
   }
   
   return 0;
}
