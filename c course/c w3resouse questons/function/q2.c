#include<stdio.h>
int sq(int a)
{
    
    return (a*a);
}
int main()
{
    int num;
    printf("enter the number:");
    scanf("%d",&num);
    sq(num);
    printf("%d",sq);
    return 0;
}