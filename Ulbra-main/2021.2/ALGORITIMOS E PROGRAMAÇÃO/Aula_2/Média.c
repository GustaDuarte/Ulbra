 #include <stdio.h>
 
 int main(){
        float n1;
        float n2;
        float n3;
        float soma;
        float media;
        printf("Digite a nota 1\n");
        scanf("%f%*c",&n1);
        printf("Digite a nota 2\n");
        scanf("%f%*c",&n2);
        printf("Digite a nota 3\n");
        scanf("%f%*c",&n3);
        soma =n1+n2+n3;
        media=soma/3;
        printf("A média eh:%f\n", media);

        return 0;
}