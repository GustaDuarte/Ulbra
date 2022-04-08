#include <stdio.h>

int main() {
     float assin, chamadasINT, chamadasCEL, contaTOTAL; 
     printf("Digite o numero de chamadas: \n", chamadasCEL);
     scanf("%f%*c", &chamadasCEL);
     assin= 17.90;
     chamadasINT= 34.29;
     chamadasCEL= 0.20*chamadasCEL;
     contaTOTAL= assin+chamadasINT+chamadasCEL;
     printf("O valor da sua conta foi de:R$%.2f \n", contaTOTAL);
     printf("Assinatura: R$%.2f \n", assin); 
     printf("Chamadas Interurbanas:R$%.2f \n", chamadasINT); 
     printf("Chamadas p/ Celular:R$%.2f \n", chamadasCEL);

     return 0;    
}