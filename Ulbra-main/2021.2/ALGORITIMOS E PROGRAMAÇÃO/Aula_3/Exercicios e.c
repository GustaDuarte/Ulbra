#include <stdio.h>
#include <stdio.h>
    int main(){
        float m1, m2, mf;
        printf("Digite a medida 1:\n");
        scanf("%f%*c", &m1);
        printf("Digite a medida 2:\n");
        scanf("%f%*c", &m2);
        mf= m1*m2;
        printf("O valor e:%.1f M", mf);

        return 0;
}