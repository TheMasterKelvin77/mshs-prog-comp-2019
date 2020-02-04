//This solution was written by Kevin Robb

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int N;
    cin >> N;
    int num;
    char n;
    for (int i=0; i<N; i++){
        cin >> num;
        if (num == 1)
            n = 'q';
        else if (num == 2)
            n = 'm';
        else if (num == 3)
            n = 'l';
        else if (num == 4)
            n = 'j';
        else if (num == 5)
            n = 'v';
        else if (num == 6)
            n = 't';
        else if (num == 7)
            n = 'r';
        else if (num == 8)
            n = 'g';
        else if (num == 9)
            n = 'p';
        else if (num == 10)
            n = 'u';
        else if (num == 11)
            n = 'o';
        else if (num == 12)
            n = 'f';
        else if (num == 13)
            n = 'b';
        else if (num == 14)
            n = 'z';
        else if (num == 15)
            n = 'a';
        else if (num == 16)
            n = 'i';
        else if (num == 17)
            n = 'n';
        else if (num == 18)
            n = 'w';
        else if (num == 19)
            n = 'h';
        else if (num == 20)
            n = 'x';
        else if (num == 21)
            n = 'k';
        else if (num == 22)
            n = 's';
        else if (num == 23)
            n = 'y';
        else if (num == 24)
            n = 'e';
        else if (num == 25)
            n = 'd';
        else if (num == 26)
            n = 'c';
        
        cout << n;
    }
    
    return 0;
}
