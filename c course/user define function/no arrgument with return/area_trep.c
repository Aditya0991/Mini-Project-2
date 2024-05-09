#include<stdio.h>
int trep()
{
    int a,b,h;
    printf("enter the parralel side a and b:\n");
    scanf("%d %d",&a,&b);
    printf("enter the height:\n");
    scanf("%d",&h);
    a=0.5*(a+b)*h;
}
int main()
{
    float trep1;
    trep1=trep();
    printf("area of trepasium:%f",trep1);
    return 0;
}