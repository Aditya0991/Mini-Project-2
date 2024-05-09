#include<stdio.h>
int main(){
    char ch ='a';
    printf("character from a to z:",ch);
    while(ch<='z'){
        printf("%c\t",ch);
        ch++;
    }
    return 0;
}