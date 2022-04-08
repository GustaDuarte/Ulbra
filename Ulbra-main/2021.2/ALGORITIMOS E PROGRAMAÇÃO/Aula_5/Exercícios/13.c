//O departamento que controla o índice de poluição do meio ambiente mantém 3 grupos de indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0.05 até 0.25. Se o índice sobe para 0.3 as indústrias do primeiro grupo são intimadas a suspenderem suas atividades, se o índice cresce para 0.4 as do primeiro e segundo grupo são intimadas a suspenderem suas atividades e se o índice atingir 0.5 todos os 3 grupos devem ser notificados a paralisarem suas atividades. FUP que lê o índice de poluição medido e emite a notificação adequada aos diferentes grupos de empresas.

#include <stdio.h>

int main(){

    int i;
    float a, b, c;

    printf("Digite o valor de 'a': \n");
    scanf("%f%*c", &a);
    printf("Digite o valor de 'b': \n");
    scanf("%f%*c", &b);
    printf("Digite o valor de 'c': \n");
    scanf("%f%*c", &c);

    printf("Digite a opcao escolhida: \n");
    printf("Opcao 1 \n");
    printf("Opcao 2 \n");
    printf("Opcao 3 \n");
    scanf("%d%*c", &i);

    switch (i){
    case 1:
         if (a <= b && b <= c)
    {
      printf("A ordem crescente: %.2f %.2f %.2f\n", a, b, c);
    }
        else if (a <= c && c <= b)
    {
      printf("A ordem crescente: %.2f %.2f %.2f\n", a, c, b);
    }
        else if (b <= a && a <= c)
    {
      printf("A ordem crescente: %.2f %.2f %.2f\n", b, a, c);
    }
        else if (b <= c && c <= a) 
    {
      printf("A ordem crescente: %.2f %.2f %.2f\n", b, c, a);
    }
        else if (c <= a && a <= b) 
    {
      printf("A ordem crescente: %.2f %.2f %.2f\n", c, a, b);
    }
         else /* n3 <= n2 && n2 < n1 */
    {
      printf("A ordem crescente: %.2f %.2f %.2f\n", c, b, a);
    }
    break;
    
    case 2:

    if (a >= b && b >= c)
    {
      printf("A ordem decrescente: %.2f %.2f %.2f\n", a, b, c);
    }
        else if (a >= c && c >= b)
    {
      printf("A ordem decrescente: %.2f %.2f %.2f\n", a, c, b);
    }
        else if (b >= a && a >= c)
    {
      printf("A ordem decrescente: %.2f %.2f %.2f\n", b, a, c);
    }
        else if (b >= c && c >= a) 
    {
      printf("A ordem decrescente: %.2f %.2f %.2f\n", b, c, a);
    }
        else if (c >= a && a >= b) 
    {
      printf("A ordem decrescente: %.2f %.2f %.2f\n", c, a, b);
    }
         else /* n3 <= n2 && n2 < n1 */
    {
      printf("A ordem decrescente: %.2f %.2f %.2f\n", c, b, a);
    }
    break;
    case 3:

     if (a >= b && b >= c)
    {
      printf("O maior valor no meio: %.2f %.2f %.2f\n", b, a, c);
    }
    else if (b >= a && a >= c)
    {
      printf("O maior valor no meio: %.2f %.2f %.2f\n", a, b, c);
    }
    else{
        printf("O maior valor no meio: %.2f %.2f %.2f\n", a, c, b);
    }
    break;
    default:
      printf("Opcao invalida!!! :( Digite novamente.");
        break;
    }