#include<stdio.h>
int main(){
    char ch;
    printf("enter the character:");
    scanf("%c",&ch);
    if(ch>'a' && ch<'z' ||ch=='a'||ch=='z'){
        printf("its a alphabet");
    }
    else if(ch>'A' && ch<'Z' || ch=='A' ||ch=='Z'){
        printf("its a alphabet");
    }
    else{
        printf("not a alphabet");
    }
    return 0;
}