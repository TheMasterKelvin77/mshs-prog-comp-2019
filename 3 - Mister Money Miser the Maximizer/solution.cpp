#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int ar[5];
    cin >> ar[0];
    cin >> ar[1];
    cin >> ar[2];
    cin >> ar[3];
    cin >> ar[4];
    int currentMax = 0;
    for (int i=0; i<5; i++) {
        if (currentMax < ar[i])
            currentMax = ar[i];
    }
    cout << currentMax;
    return 0;
}
