
#include <iostream>
#include <fstream>    //ifstream, ofstream
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <cstdlib>
#include <vector>


using namespace std;
void probando(int[5]);

int main(int argc, char const *argv[]) {
  int prueba[5];
  cout << "Dando valores: " << endl;
  for (int i = 0; i < 5; i++){
    prueba[i]=i;
    cout << prueba[i] << " ";
  }
  cout << endl;

  probando(prueba);
  cout << "Fuera del método." << endl;
  for (int i = 0; i < 5; i++){
    cout << prueba[i] << " ";
  }
  cout << endl;

  return 0;
}

void probando(int prueba[5]){
  cout << "Dentro del método los valores son: " << endl;
  for (int i = 0; i < 5; i++){
    prueba[i]=4*prueba[i];
    cout << prueba[i] << " ";
  }
  cout << endl;
}
