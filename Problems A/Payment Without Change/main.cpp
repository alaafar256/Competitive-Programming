#include <iostream>

using namespace std;

int main()
{
    int q  ;
    long long a , b , n , s ;
    long long c ;
    cin >> q ;
    while (q--)
    {
        cin >> a >> b >> n >> s ;
        c = s%n ;
      //  cout << c << endl ;
    //    cout << endl ;
        if (c <= b  && a*n+b >= s)
        {
            cout << "YES" << endl ;
        }
        else
        {

            cout << "No" << endl ;
        }
    }
    return 0;
}
