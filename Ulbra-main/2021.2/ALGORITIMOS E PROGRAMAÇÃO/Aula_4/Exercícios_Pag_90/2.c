#include <stdio.h>

int main(){

   float num1, num2, Media;
      printf("Digite o valor da nota 1\n");
      scanf("%f*c", &num1);
      printf("Digite o valor da nota 2\n");
      scanf("%f*c", &num2);
      Media = (num1+num2)/2;

      if((Media >= 0 && Media < 3)){
      printf("Voce esta reprovado!%f\n");
      }else if((Media >= 3 && Media < 7)){
         printf("Voce esta reprovado!%f\n");
      }else if ((Media>=7) && (Media<=10))
      {
         printf("Voce esta aprovado!\n");
      }else{
         printf("Nao foi possivel calcular sua nota...\n");
      }

      return 0;
}

