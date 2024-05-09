#include<stdio.h>
int main(){
    int cm;
    printf("length in centimeter:\n");
    scanf("%d",&cm);
    printf("in meters:%d\n",cm/100);
    printf("in kilometer:%d\n",cm/1000*100);
    return 0;
}