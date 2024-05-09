#include<stdio.h>
int main(){
    int days;
    printf("enter the number of days:\n");
    scanf("%d",&days);
    printf("in years:%d\n",days/356);
    printf("in weeks:%d\n",days/7);
    return 0;
}
