#include <stdio.h>
#include <math.h>
    int main(){

        int corte, tab3, tab4, tab5, quant3, quant4, quant5, sobra3, sobra4, sobra5;

        corte= 45;
        tab3= 3 * 100;
        tab4= 4 * 100;
        tab5= 5 * 100;
        quant3= tab3 / corte;
        quant4= tab4 /  corte;
        quant5= tab5 / corte;
        sobra3= tab3 - corte * quant3;
        sobra3= tab4 - corte * quant4; 
        sobra3= tab5 - corte * quant5;  
        

        printf("Quantidade de pedacos de 45 CM na tabua de 3 M: %d \n", quant3);
        printf("Sobra de pedacos na tabua de 3 M: %d \n", sobra3); 

        printf("Quantidade de pedacos de 45 CM na tabua de 4 M: %d \n", quant4);
        printf("Sobra de pedacos na tabua de 4 M: %d \n", sobra4);

        printf("Quantidade de pedacos de 45 CM na tabua de 5 M: %d \n", quant5);
        printf("Sobra de pedacos na tabua de 5 M: %d \n", sobra5);

        return 0;
}