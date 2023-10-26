#include <stdio.h>

int main(){
    int x, y;
        printf("Coloque dois numeros\n");
            scanf("%d %d", &x,&y);
        if (x > y)
        {
            printf("A soma final eh: %d\n", x + 100);
        }
        else{
            printf("A soma final eh: %d\n", y + 100);
        }
        return 0;
        
}
