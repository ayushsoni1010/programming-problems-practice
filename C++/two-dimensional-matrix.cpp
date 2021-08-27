#include<iostream>
using namespace std;

int main() {
    int x,y;

    cout<<"Enter the number of rows in matrix : ";
    cin>>x;
    cout<<"Enter the number of columns in matrix : ";
    cin>>y;

    int mat[x][y];

    for (int i = 1; i <= x; i++)
    {
        for (int j = 1; j <= y; j++)
        {
            cout<<"Enter element of row "<<i<<" column "<<j<<" : ";
            cin>>mat[i][j];
        }       
    }

    cout<<"The matrix formed is :"<<endl;

    for (int i = 1; i <= x; i++)
    {
        for (int j = 1; j <= y; j++)
        {
            cout<<mat[i][j]<<"  ";
        }       
    }  
    return 0;
}