#include <iostream>
#include <bits/stdc++.h>
using namespace  std ;
int main() {
    int weight_for_L ;
    int weight_for_B ;
    cin >> weight_for_L >> weight_for_B ;
    int counterforyear=0;
    int l = 0;
    int b = 0;
    while (true){
        weight_for_L*=3 ;
        weight_for_B*=2 ;
            counterforyear++  ;
        if (weight_for_L>weight_for_B) break ;

    }
    cout << counterforyear << endl ;



    return 0;
}
