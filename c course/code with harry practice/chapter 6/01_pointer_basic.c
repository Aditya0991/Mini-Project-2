#include<stdio.h>
int main()
{
    int i=5;
    int *p=&i;
    printf("value of i:%u\n",i);
    printf("value through pointer:%u\n",*p);
    printf("address of i:%u\n",&i);
    printf("address through pointer:%u\n",p);
    printf("copying address of p as value :%u\n",*(&p));
    printf("address of p %u",p);
    return 0;
}