/*FUP para efetuar a leitura de quatro números e apresentar os números que são divisíveis por 2 e por 3.*/

#include <stdio.h>
#include <math.h>

int main(){

        int n1, n2, n3, n4;

            printf("Digite o valor de num1:\n");
                scanf("%d*c",&n1);
            printf("Digite o valor de num2:\n");
                scanf("%d*c",&n2);
            printf("Digite o valor de num3:\n");
                scanf("%d*c",&n3);
            printf("Digite o valor de num4:\n");
                scanf("%d*c",&n4);    

        if (n1 % 2 ==0) 
            printf("O seguinte numero eh divisivel por dois: %d\n",n1);
        if (n1 % 3 ==0)
            printf("O seguinte numero eh divisivel por tres: %d\n",n1);
        if (n2 % 2 ==0) 
            printf("O seguinte numero eh divisivel por dois: %d\n",n2);
        if (n2 % 3 ==0)
            printf("O seguinte numero eh divisivel por tres: %d\n",n2);
        if (n3 % 2 ==0) 
            printf("O seguinte numero eh divisivel por dois: %d\n",n3);
        if (n3 % 3 ==0)
            printf("O seguinte numero eh divisivel por tres: %d\n",n3);
        if (n4 % 2 ==0) 
            printf("O seguinte numero eh divisivel por dois: %d\n",n4);
        if (n4 % 3 ==0)
            printf("O seguinte numero eh divisivel por tres: %d\n",n4);
        
            return 0;
}
