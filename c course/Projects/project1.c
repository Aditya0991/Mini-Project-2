#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main(){
    int number,guess,n_of_guess;
    srand(time(0));
    number = rand()*100+1;
    printf("enter the number is :",number);
    
    do
    {
        printf("guess the number between 1 to 100:");
        scanf("%d",&guess);
        if(guess>number)
        {
            printf("enter smaller number");
        }
        else if(guess<number)
        {
            printf("enter greater number");
        }
        else
        {
            printf("congratulation! you find the right number.in%d ",n_of_guess);
            n_of_guess++;
        }

    }
    while(guess!=0);
    return 0;
    
}