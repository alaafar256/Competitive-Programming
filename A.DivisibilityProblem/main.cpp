#include <iostream>
#include <bits/stdc++.h>
using namespace std;

#include <iostream>
#include <vector>

void print(vector<int> input)
{
  //  input.clear() ;
	for (int i = 0; i < input.size(); i++) {
		cout << input.at(i) << ' ';
	}
}
int main()
{
    vector <int> vec ;
    int a , b , t ;
    cin >> t  ;
    while (t--)
    {
        int c = 0 ;
        cin >> a >> b ;
        if (a%b==0)
        {
            c = 0 ;

        }
        else
        {
            c = b - a%b ;
        }
        vec.push_back(c) ;
       print(vec) ;
       cout << endl ;
       vec.clear() ;
    }

    return 0;
}
