#include <stdio.h>
#include <math.h>

int main(){
    int corte, tab, Ttab, quant, sobra;

    printf("Tamanho da tabua em M: \n");
    scanf("%d%*c", &Ttab);

    printf("Tamanho do corte em CM: \n");
    scanf("%d%*c", &corte);

    tab= Ttab * 100;
    quant= tab / corte;
    sobra= tab - corte * quant;

    printf("A quantidade de pedacos da tabua e de: %d pedacos\n", quant);
    printf("A sobra de pedacos da tabua e de: %d CM \n", sobra);

    return 0;
}