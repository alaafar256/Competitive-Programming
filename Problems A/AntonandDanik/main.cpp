#include <iostream>
#include <bits/stdc++.h>
using namespace std ;
int main() {
    int number_of_games ;
    cin >> number_of_games;
    string str;
    cin >> str ;
    int counterforA = 0 ;
    int counterforD = 0 ;
    for (int i = 0 ; i <number_of_games ; i++ )
    {
        if (str[i]=='A')
        {
            counterforA++ ;
        }
        else if (str[i]=='D')
        {
            counterforD++ ;
        }
    }
    if (counterforA>counterforD) { cout << "Anton" << endl ; }
    else if (counterforD>counterforA) {cout << "Danik" << endl ; }
    else if (counterforD==counterforA){cout << "Friendship" << endl ;}
    return 0;
}
