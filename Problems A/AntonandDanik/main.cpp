#include <iostream>
#include <bits/stdc++.h>
using namespace std ;
int main() {
    int number_of_games ;
    cin >> number_of_games;
    string str;
    cin >> str ;
    int counterforA = 0 ;
    int counterforB = 0 ;
    for (int i = 1 ; i <=number_of_games ; i++ )
    {
        if (str[i]=='A')
        {
            counterforA++ ;
        }
        else if (str[i]=='B')
        {
            counterforB++ ;
        }
    }
    if (counterforA>counterforB) { cout << "Anton" << endl ; }
    else if (counterforB>counterforA) {cout << "Danik" << endl ; }
    else {cout << "Friendship" << endl ;}
    return 0;
}
