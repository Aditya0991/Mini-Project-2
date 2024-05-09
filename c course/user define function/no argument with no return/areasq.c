#include<stdio.h>
int area()
{
    int length,breath,area;
    printf("enter length and breath:");
    scanf("%d %d",&length,&breath);
    area=length*breath;
    printf("area:%d",area);
    return area;
}
int main()
{  
    area();
    return 0;
}