//O hotel Pica-Pau cobra 50,00 Reais a diária e mais uma taxa de serviços. A taxa de serviços é de:
//1,50 por dia, se número de diárias <15
//1,00 por dia, se número de diárias =15
//0,50 por dia, se número de diárias >15
//FUP que lê o número de diárias e calcula o total a ser pago pelo cliente.

#include <stdio.h>
int main(){
    float diariaP, diaria,  total;

    printf("Informe o numero de diarias:\n");
        scanf("%f", &diaria);
    if (diaria < 15)
    {
        diariaP = 50.00;
        total = ((diaria * diariaP) + (diaria * 1.50));
        printf("O valor a ser pago eh de: %.2f\n", total);
    }
    if (diaria == 15)
    {
        diariaP = 50.00;
        total = ((diaria * diariaP) + (diaria * 1.00));
        printf("O valor a ser pago eh de: %.2f\n", total);
    }
    if (diaria > 15)
    {
        diariaP = 50.00;
        total = ((diaria * diariaP) + (diaria * 0.50));
        printf("O valor a ser pago eh de: %.2f\n", total);
    }

    return 0;
}