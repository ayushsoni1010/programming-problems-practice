#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        int arr[n];
        for(int i=0;i<n;i++)
        cin>>arr[i];
        
        int minm=arr[0];
        for(int i=0;i<n;i++)
        {
            minm=min(minm,arr[i]);
        }
        int ratio=1;
        bool flag;
        for(int i=1;i<=minm;i++)
        {
            flag =true;
           for(int k=0;k<n;k++)
           {
                if(arr[k]%i!=0)
            {
                flag=false;
                break;
            }
            if(flag==true)
            ratio=i;
           }
            
        }
        for(int j=0;j<n;j++)
        {
            cout<<arr[j]/ratio<<" ";
            
        }
        cout<<endl;
    }
}
