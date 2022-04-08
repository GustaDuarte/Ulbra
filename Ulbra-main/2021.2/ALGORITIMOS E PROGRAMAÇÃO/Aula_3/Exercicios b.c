#include <stdio.h>
#include <stdlib.h>

int main()
{
   //declaração de variáveis
   float pol, conv;
   
   //Exibe uma mensagem na tela solicitando o valor do produto
   printf("Valor em CM: \n", pol);
   scanf("%f", &pol);
   conv=pol/2.54;
   printf("Resultado= %.2f \n", conv);
   printf("+10= %.2f CM: \n", conv=(pol+10)/2.54);
   printf("+20= %.2f CM: \n", conv=(pol+20)/2.54);
   printf("+30= %.2f CM: \n", conv=(pol+30)/2.54);
   printf("+40= %.2f CM: \n", conv=(pol+40)/2.54);
   printf("+50= %.2f CM: \n", conv=(pol+50)/2.54);
   printf("+60= %.2f CM: \n", conv=(pol+60)/2.54);
   printf("+70= %.2f CM: \n", conv=(pol+70)/2.54);
   printf("+80= %.2f CM: \n", conv=(pol+80)/2.54);
   printf("+90= %.2f CM: \n", conv=(pol+90)/2.54);
   printf("+100= %.2f CM: \n", conv=(pol+100)/2.54);

   return 0;
}