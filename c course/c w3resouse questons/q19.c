#include<stdio.h>
int main(){
    int p,q,r,s;
    printf("enter the value of p:");
    scanf("%d",&p);

    printf("enter the value of q:");
    scanf("%d",&q);

    printf("enter the value of r:");
    scanf("%d",&r);

    printf("enter the value of s:");
    scanf("%d",&s);


    if((p%2==0)&&(q>r)&&(s>p)&&(r+s)>(p+q)&&(r>0)&&(s>0))
    {
        printf("correct value");
    }

    else
    {
        printf("wrong value");
    }
    return 0;

}
