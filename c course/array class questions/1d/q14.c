#include<stdio.h>
int main()
{
    int size,i,even=0,odd=0;
    printf("enter the size of array:");
    scanf("%d",&size);
    int x[size];
    printf("enter the element of array:");
    for(i=0;i<size;i++)
    {
        scanf("%d",&x[i]);
    }
    for(i=0;i<size;i++)
    {
        if(x[i]%2==0){
            even++;
        }
        else{
            odd++;
        }
    }
    printf("total even number :%d\n",even);
    printf("total odd number :%d\n",odd);
    return 0;
}