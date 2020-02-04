//This solution was written by Kevin Robb.

#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;
int main() {
    int N;
    cin >> N;
    int die;
    double sum;
    for (int i=0; i<N; i++) {
        cin >> die;
        sum += (die + 1.0) / 2.0;
    }
    printf("%.3f", sum / N);
    return 0;
}
