#include<stdio.h>
int main(){
    int n,i,j,swap;
    printf("enter the size of array: ");
    scanf("%d",&n);
    int x[n];
    printf("enter the element of array:");
    for(i=0;i<n;i++){
        scanf("%d",&x[i]);
    }
    for(i=0;i<(n-1);i++){
        for(j=0;j<(n-i-1);j++){
            if(x[j]>x[j+1]){
                swap       = x[j];
                x[j+1]   = x[j];
                x[j+1] = swap;
            }
        }
    }
    printf("acending order:");
    for(i=0;i<n;i++){
        printf("%d  ",x[i]);
    }
    return 0;
}