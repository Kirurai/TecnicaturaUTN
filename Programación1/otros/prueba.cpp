#include <iostream>
#include <iomanip>
#include <fstream>
#include <math.h>
#include <vector>
using namespace std;

int main(int argc, char const *argv[]) {
// https://www.geeksforgeeks.org/vector-in-cpp-stl/
vector <vector <double>> matriz;
int filas = 5;
int columnas = 5;
for (int i = 0; i < filas; i++){
	vector <double> row;
	matriz.push_back(row);
	for int j = 0; j < columnas; j++){
		matriz[i].push_back(i+j);
	}
}

for (auto i = matriz.begin(); i!=matriz.end(); i++){
	for (auto j = matriz[i].begin(); j!=matriz[i].end(); j++){
		cout << matriz[i][j] << " ";
	}
	cout << endl;
}
	return 0;
}
