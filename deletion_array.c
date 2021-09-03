#include<stdio.h>

int main(){
    int n,i,pos;
    
    printf("Enter the size of array: \n");
    scanf("%d",&n);

    int x[n];
    printf("Enter elements of array: \n");
    for(i=0;i<n;i++){
        scanf("%d",&x[i]);
    }

    printf("Elements of array are: \n");
    for(i=0;i<n;i++){
        printf("%d ", x[i]);
    }

    printf("Enter the position where you want to delete element: ");
    scanf("%d",&pos);

    if(pos>n){
        printf("Invalid Position\n");
    }
    else{
        for(i=pos-1;i<n-1;i++){
            x[i] = x[i+1];
        }
    }

    printf("Elements of updated array are : \n");

    for(i=0;i<n-1;i++){
        printf("%d\n",x[i]);
    }
    return 0;
}