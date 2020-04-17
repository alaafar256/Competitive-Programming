#include <iostream>

using namespace std;

int main()
{
   int x ;
   int n , k ;
   cin >> x ;
   int a ;
   int res ;
   for (int i = 1 ; i <=x ;i++)
   {
      cin>> n>>k ;
      a = n%k ;
  //    cout << a << endl ;
      res = n - a ;
    //  cout << res << endl ;
      res += min(a , k/2) ;
      cout << res << endl ;
   }
    return 0;
}
