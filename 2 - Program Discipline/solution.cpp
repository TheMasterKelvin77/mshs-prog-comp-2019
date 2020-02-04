//This solution was written by Kevin Robb.

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    string command;
    getline(cin, command);
    string newCommand = "Did " + command.substr(3, command.length());
    cout << newCommand;
    return 0;
}
