/*FUP que leia o código de um aluno e suas três notas. Calcule a média ponderada do aluno, considerando que o peso para a maior nota seja 4 e para as duas restantes, 3. Mostre o código do aluno, suas três notas, a média calculada e a mensagem “ APROVADO” se a média for maior ou igual a 7 e “REPROVADO” se a média for menor que 7.*/

#include <stdio.h>

int main(){

    int n1, n2, n3, id, media;

    printf("digite o seu id\n");
        scanf("%d", &id);
    printf("Digite o valor de n1 :\n");
        scanf("%d", &n1);
    printf("Digite o valor de n2 :\n");
        scanf("%d", &n2);
    printf("Digite o valor de n3 :\n");
        scanf("%d", &n3);
    media = n1*n2*n3/3;
     
    if (media >= 7)
    {
        printf("Codigo do aluno:\n%d", id);
        printf("Voce esta aprovado!\n");
    }
    else if (media < 7)
    {
        printf("Codigo do aluno:\n%d", id);
        printf("Voce esta reprovado!\n");
    }
    else if (n1 >4)
    {
        printf("Invalido, voce digitou sua nota errada...\n");
    }
     else if (n2 >3)
    {
        printf("Invalido, voce digitou sua nota errada...\n");
    }
     else if (n3 >3)
    {
        printf("Invalido, voce digitou sua nota errada...\n");
    }
    
    return 0;
}