#include<stdio.h>
int main(){
    int num,rem,i=0,a[10];
    printf("enter the number:");
    scanf("%d",&num);
    while(num){
        rem =num%2;
        num=num/2;
        a[i]=rem;
        i++;
    }
    for(int j=i-1;j>=0;j--){
        printf("%d",a[j]);
    }
    return 0;

}