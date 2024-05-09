#include<stdio.h>
int main(){
    int a,b,c,greatest;
    printf("enter the value of a");
    scanf("%d",&a);

    printf("enter the value of b");
    scanf("%d",&b);

    printf("enter the value of c");
    scanf("%d",&c);

    if(a>b)
    {
        greatest=a;
    }
    else{
        greatest = b;
    }

    if(greatest>c)
    {
        greatest;
    }
    else
    {
        greatest = c;
        }

    printf("the gratest between %d %d %d is %d",a,b,c,greatest);
    return 0;

}