#include <iostream>

using namespace std;

int main()
{
        int number_of_friends , height ;
    cin >> number_of_friends >> height ;
    int height_for_each_friend ;
    int sum=0;
    int cnt=0;
    for (int i = 0 ;i < number_of_friends ; i++ )
    {
        cin >> height_for_each_friend ;
        if(height_for_each_friend<=height)
        {
            cnt++;
        }
        else
        {
            cnt+=2 ;
        }

    }
    cout << cnt << endl ;

    return 0;


}
