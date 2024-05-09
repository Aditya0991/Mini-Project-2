#include<stdio.h>
int main(){
    char ch;
    printf("enter the charcter:");
    scanf("%c",&ch);
    if(ch =='a'||ch=='e'||ch=='i'||ch== 'o' || ch=='u'){
        printf("its a vowel");
    }
    else{
        printf("its a consonet");
    }
    return 0;
}