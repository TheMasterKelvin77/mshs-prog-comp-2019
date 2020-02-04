//This solution was written by Kevin Robb.

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int N;
    cin >> N;
    double xVal[N];
    double yVal[N];
    for (int i=0; i<N; i++) {
        cin >> xVal[i];
        cin >> yVal[i];
    }
    //calculation time babey
    bool flag = false;
    for (int r=0; r<N; r++) {
        for (int c=0; c<N; c++) {
            if (r == c) 
                continue;
            if (powf(xVal[r] - xVal[c], 2.0) + powf(yVal[r] - yVal[c], 2.0) <= 1.0) {
                flag = true;
                break;
            }
        }
    }
    if (flag)
        cout << "Unsafe!";
    else
        cout << "Safe!";
    return 0;
}
