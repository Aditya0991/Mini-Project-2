#include<stdio.h>
int main(){
    int size,i,j=0,k=0,a=0,b=0;
    printf("enter the size:");
    scanf("%d",&size);
    int x[size],y[size],z[size];
    for(i=0;i<size;i++){
        printf("enter the %d of array: ",i+1);
        scanf("%d",&x[i]);
        
    }
    for(i=0;i<size;i++){
        printf("%d\t",x[i]);

        if(x[i]%2==0){
            printf("number is even\n");
            y[j]=x[i];
            j++;
            a++;
        }
        else{
            printf("number is odd\n");
            z[k]=x[i];
            k++;
            b++;
        }
    }
    printf("\n");
    printf("array of even number:\t");
    for(j=0;j<a;j++){
        printf("%d\t",y[j]);
    }
    printf("\n");


    printf("array of odd number:\t");
    for(k=0;k<b;k++){
        printf("%d\t",z[k]);
    }
    return 0;
}