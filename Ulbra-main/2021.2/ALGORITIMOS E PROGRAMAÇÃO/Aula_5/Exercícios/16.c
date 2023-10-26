//Escrever um programa que lê as 3 notas obtidas por ele em provas. Para cada aluno, calcular a média de aproveitamento, usando a fórmula:
//MA = (Nl + N2 + N3)
        //div 3
//A atribuição de conceitos obedece à tabela abaixo:
//Média de Aproveitamento    Conceito
//>= 9.0                           A
//>= 7.5 e < 9.0                   B
//>= 6.0 e < 7.5                   c
//>= 4.0 e < 6.0                   D
//< 4.0                            E
//O programa deve escrever as notas, a média de aproveitamento, o conceito correspondente e a mensagem: "APROVADO" se o conceito for A, B, ou C e "REPROVADO" se conceito for D ou E.

#include <stdio.h>

int main(){
    float n1, n2, n3, MA;
    char conceito;

    printf("Qual foi a sua primeira nota?\n");
    scanf("%f%*c", &n1);
    printf("Qual foi a sua segunda nota?\n");
    scanf("%f%*c", &n2);
    printf("Qual foi a sua terceira nota?\n");
    scanf("%f%*c", &n3);

    MA = (n1 + n2 + n3) / 3;

    if(MA >= 9.0){
        conceito = 'A';
    }else if(MA >= 7.0 && MA < 9.0){
        conceito = 'B';
    }else if(MA >= 6.0 && MA < 7.5){
        conceito = 'C';
    }else if(MA >= 4.0 && MA < 6.0){
        conceito = 'D';
    }else if(MA < 4.0){
        conceito = 'E';
    }

    printf("As suas notas sao respectivamente %.2f, %.2f e %.2f, a sua media de aproveitamento eh %.2f, o conceito correspondente as suas notas eh %c\n", n1, n2, n3, MA, conceito);
    if(conceito == 'A' || conceito == 'B' || conceito == 'C'){
        printf("Voce foi aprovado");
    } else if(conceito == 'D' || conceito == 'E'){
        printf("Voce foi reprovado");
    }

    return 0;
}