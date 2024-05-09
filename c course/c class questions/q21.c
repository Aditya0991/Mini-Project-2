#include<stdio.h>
int main(){
    int c;
    printf("enter temperature in celcius:");
    scanf("%d",&c);
    printf("temperature in fahrenheit:%f",(1.8*c)+32);
    return 0;
}