#include<stdio.h>

int main(){
    int n,i,element;
    
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

    printf("Enter the position where you want to search element: ");
    scanf("%d",&element);

    for(i=0;i<n;i++){
        if(x[i]==element){
            printf("%d is found at position %d",element,i+1);
        }
        else{
            printf("Element is not found");
        }
    }

    return 0;
}