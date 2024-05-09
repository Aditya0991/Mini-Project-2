#include<stdio.h>
int main(){
    int size1,i,trump1=0,biden1=0,sum_trump,tot_pop,per_trump,sum_biden,per_biden;
    
    // CITY 1-
    printf("enter the population of city A:");
    scanf("%d",&size1);
    int ary1[size1] ;

    printf("enter 1 to vote for trump and 2 to vote for biden:\n");

    for(i=0;i<size1;i++){
        printf("Give Your vote: ");
        scanf("%d",&ary1[i]);
        if(ary1[i]==1){
            trump1++;
        }
        else if(ary1[i]==2){
            biden1++;
        }
    }
    printf("total vote for trump in city A:%d \n",trump1);
    printf("total vote for biden in city A:%d \n",biden1);

    printf("\n");

    // CITY2-
    int trump2=0,biden2=0,size2;

    printf("enter the population of city B:");
    scanf("%d",&size2);

    int ary2[size2];

    printf("enter 1 to vote for trump and 2 to vote for biden:\n");

    for(i=0;i<size2;i++){
        printf("Give Your vote: ");
        scanf("%d",&ary2[i]);
        if(ary2[i]==1){
            trump2++;
        }
        else if(ary2[i]==2){
            biden2++;
        }
    }
    printf("total vote for trump in city B:%d \n",trump2);
    printf("total vote for biden in city B:%d \n",biden2);

    printf("\n");

// CITY3-

int trump3=0,biden3=0,size3;
 printf("enter the population of city C:");
    scanf("%d",&size3);

    int ary3[size3];

    printf("enter 1 to vote for trump and 2 to vote for biden:\n");

    for(i=0;i<size3;i++){
        printf("Give Your vote: ");
        scanf("%d",&ary3[i]);
        if(ary3[i]==1){
            trump3++;
        }
        else if(ary3[i]==2){
            biden3++;
        }
    }
    printf("total vote for trump in city C:%d \n",trump3);
    printf("total vote for biden in city C:%d \n",biden3);

    printf("\n");

// CITY4-

int trump4=0,biden4=0,size4;

 printf("enter the population of city D:");
    scanf("%d",&size4);

    int ary4[size4];

    printf("enter 1 to vote for trump and 2 to vote for biden:\n");

    for(i=0;i<size4;i++){
        printf("Give Your vote: ");
        scanf("%d",&ary4[i]);
        if(ary4[i]==1){
            trump4++;
        }
        else if(ary4[i]==2){
            biden4++;
        }
    }
    printf("total vote for trump in city D:%d \n",trump4);
    printf("total vote for biden in city D:%d \n",biden4);

    printf("\n");

// CITY5-
int trump5=0,biden5=0,size5;

 printf("enter the population of city E:");
    scanf("%d",&size5);
    printf("Give Your vote: ");
    int ary5[size5];

    printf("enter 1 to vote for trump and 2 to vote for biden:\n");

    for(i=0;i<size5;i++){
        printf("Give Your vote: ");
        scanf("%d",&ary5[i]);
        if(ary5[i]==1){
            trump5++;
        }
        else if(ary5[i]==2){
            biden5++;
        }
    }
    printf("total vote for trump in city E:%d \n",trump5);
    printf("total vote for biden in city E:%d ",biden5);
    printf("\n");
    

    sum_trump=trump1+trump2+trump3+trump4+trump5;
    tot_pop=size1+size2+size3+size4+size5;
    per_trump=sum_trump*100/tot_pop;
    
    sum_biden=biden1+biden2+biden3+biden4+biden5;
    
    per_biden=sum_biden*100/tot_pop;


    if(per_trump>50){
        printf("Trump is are new prime minister by %d percent of votes",per_trump);
    }

    else if(per_trump==per_biden){
        printf("Draw");
    }
    else if(per_biden>50){
        printf("Biden is are new prime minster by %d percent of votes",per_biden);
    }
    
    return 0;

    
}