#include<stdio.h>
int main()
{
    int x[10]={1,2,3,4,5,6,7,8,10},i,a=1;
    for(i=0;i<10;i++)
    {
        if(x[i]==(i+1))
        {
            a++;   
        }
    }
    printf("element %d is not present",a);
    return 0;
}