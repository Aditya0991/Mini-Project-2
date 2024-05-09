#include<stdio.h>
int main(){
    int a;
    long b;
    long int c;
    double d;
    long double e;
    float f;
    printf("size of integer is:%d\n",sizeof(a));
    printf("size of long is:%d\n",sizeof(b)); 
    printf("size of long integer :%d\n",sizeof(c));
    printf("size of double is:%ld\n",sizeof(d));
    printf("size of long double is:%d\n",sizeof(e));
    printf("size of float is:%d\n",sizeof(f));
    return 0;
}