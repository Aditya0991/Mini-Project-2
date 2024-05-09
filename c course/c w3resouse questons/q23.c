#include<stdio.h>
int main()
{
    float a,b,c,p;
    
    printf("enter the value of side a:");
    scanf("%f",&a);

    printf("enter the value of side b:");
    scanf("%f",&b);

    printf("enter the value of side c:");
    scanf("%f",&c);

    if((a+b)>c && (b+c)>a && (c+a)>b)
    {
        printf("triangle exist");
        p=a+b+c;
        printf("\nthe perimeter of triangle:%.lf",p);
    }
    else
    {
        printf("triangle does not exist");
    }
    
    
return 0;

}