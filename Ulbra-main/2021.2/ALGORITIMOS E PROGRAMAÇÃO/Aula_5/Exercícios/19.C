//Escrever um programa que lê o número de um funcionário, o número de horas por ele trabalhadas, o valor que recebe por hora, o número de filhos com idade inferior a 14 anos, a idade, o tempo de serviço do funcionário e o valor do salário família por filho. Calcular o salário bruto, o desconto do INSS (8,5% do salário bruto) e o salário família. Calcular o IR (Imposto de Renda) como segue: 
//Se SB > 1.500,00 então IR = 15% do SB
//Se SB > 500,00 e SB <= 1.500,00 então IR = 8% do SB
//Se SB <= 500,00 então IR = 0. 
//Escrever o número do funcionário, salário bruto, total dos descontos, e salário líquido.

#include <stdio.h>

int main(){

    float numf, Htrab, Hval, Nfil, Tserv, salL, salf, sb, desc, ir;

    printf("Digite o numero de funcionario:\n");
        scanf("%f", &numf);
    printf("Numero de horas trabalhadas:\n");
        scanf("%f", &Htrab);
    printf("Valor que recebe por hora:\n");
        scanf("%f", &Hval);
    printf("Numero de filhos com idade inferior a 14 anos:\n");
        scanf("%f", &Nfil);
    printf("Tempo de servico do funcionario:\n");
        scanf("%f", &Tserv);
    printf("Valor do salario familia por filho:\n");
        scanf("%f", &salf);

    salL = Htrab*Hval;
    sb = salL+salf;
    desc = sb*0.085;
    //percentual de reajusto do salario familia por filho com ate 14 anos...2,65%
    
    if (sb > 1500.00)
    {
        ir = (sb*0.15)-sb; 
        printf("Numero do funcionario:%.2f\n", numf);
        printf("Salario Bruto:%f\n", sb);
        printf("Total dos descontos:%f\n", desc);
        printf("Salario liquido:%f\n", salL);
    }
    else if (sb > 500.00 && sb <= 1500.00)
    {
        ir = (sb*0.08)-sb; 
        printf("Numero do funcionario:%.2f\n", numf);
        printf("Salario Bruto:%f\n", sb);
        printf("Total dos descontos:%f\n", desc);
        printf("Salario liquido:%f\n", salL);
    }
    else if (sb <= 500.00)
    {
        printf("Numero do funcionario:%.2f\n", numf);
        printf("Salario Bruto:%f\n", sb);
        printf("Total dos descontos:%f\n", desc);
        printf("Salario liquido:%f\n", salL);
    }

    
    return 0;

}