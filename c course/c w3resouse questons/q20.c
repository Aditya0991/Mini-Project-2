#include<stdio.h>
int main(){
    int a,b,c,D,x,y;
    printf("enter the value of a,b,c: ");
    scanf("%d %d %d",&a,&b,&c);

    D=b*b-4*a*c;

    if(D<0){
        printf("roots are imaginary");
    }
    if(D==0){
        printf("both roots are equal");
    }
    if(D>0){
        printf("roots are real or distinct");
    }


}