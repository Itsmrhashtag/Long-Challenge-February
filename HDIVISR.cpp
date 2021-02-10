#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;cin >> n;
    if(n <= 10)
    {
        cout << n << endl;
    }
    else
    {
        int ans =0;
        for(int i = 10;i > 0;i --)
        {
            if(n % i == 0)
            {
                ans = i;
                break;
            }
        }
        cout << ans;
    }
}