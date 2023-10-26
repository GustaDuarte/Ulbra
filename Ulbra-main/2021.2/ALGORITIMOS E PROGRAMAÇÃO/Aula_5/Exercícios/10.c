//FUP que leia o número da conta bancária e o saldo de um cliente. Caso a conta tenha saldo negativo, o programa deve enviar a seguinte mensagem: CONTA ESTOURADA, caso contrário CONTA NORMAL.
#include <stdio.h>
int main(){
    float saldo;
    char conta;
    printf("Conta bancaria:\n");
        scanf("%d", &conta);
    printf("Informe o saldo da conta:\n");
        scanf("%f", &saldo);
    if (saldo < 0)
    {
        printf("CONTA ESTOURADA\n");
    }
    else
    {
        printf("CONTA NORMAL.\n");
    }

        return 0;
}