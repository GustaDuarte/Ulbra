#include <stdio.h>
int main()
{
   //declaração de variáveis
   float p1, p2, pfinal, notaEx, notafinal;
   
   printf("digite a nota de p1:\n");
   scanf("%f%*c", &p1);
      printf("digite a nota de p2:\n");
   scanf("%f%*c", &p2);
      printf("digite a nota da prova final:\n");
   scanf("%f%*c", &pfinal);
   notaEx = ((p1*1)+(p2*2))/3;
   printf(" Sua media de exercicios e: = %.f\n", notaEx);
   notafinal= ((notaEx*2)+(pfinal*8))/10;
   printf(" Sua media na nota final e: = %.f\n", notafinal);

    return 0;
}