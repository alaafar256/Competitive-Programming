#include <iostream>
#include <bits/stdc++.h>
using namespace std ;
int main() {
 int number_of_problems ;
 cin >> number_of_problems ;
 int p , v , t ;
 int counterforproblems = 0 ;
 for (int i = 0 ; i < number_of_problems ; i++ )
 {
     cin >> p >> v >> t ;
     if (p+v+t>1) {counterforproblems++ ;}
 }
 cout << counterforproblems << endl ;



    return 0;
}
