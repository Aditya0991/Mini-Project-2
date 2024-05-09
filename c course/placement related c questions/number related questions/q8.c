#include<stdio.h>
int main()
{
    int n1,n2,n3,i,great;
    printf("enter number 1,number 2,number3:");
    scanf("%d %d %d",&n1,&n2,&n3);
    if(n1>n2 && n1>n3)
    {
        printf("number 1 is greater");
    }
    else if(n2>n1 && n2>n3)
    {
        printf("number 2 is greater");
    }
    else if(n3>n1 && n3>n2)
    {
        printf("number 3 is greater");
    }
    return 0;
}