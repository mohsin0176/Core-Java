#include <iostream>
#include <fstream>
#include <sstream>
using namespace std;
int main() {
string filename;
 ofstream files;
for (int i = 1; i < 12; i++) {
stringstream a;
a << i;
filename = "Collection_Classes" + a.str();
filename += ".java";
cout << filename << endl;
files.open(filename.c_str(), ios::out);
files.close();
}
}
