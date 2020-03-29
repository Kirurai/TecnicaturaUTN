#include <iostream>
#include <iomanip>
#include <fstream>
#include <math.h>
using namespace std;
/*
Ejercicio 1: Enunciado: Dada una secuencia de valores
no nulos como datos, RTA: obtiene la mayor suma entre 2 consecutivos crecientes
*/
int main (int argc, char *argv[]) {

float ant = 0;
float act;
float s2;
float s2n;
bool hay2 = false;

do{
  cout << "Valor: ";
  cin >> act;
  cout << "\n";
  if (act !=0.0){
    if(hay2 && act>ant){
      s2=ant+act;
      if(s2n < s2){
        s2n=s2;
      }
    }
    else if(act>ant){
      hay2 = true;
      s2n=ant+act;
    }
  }
  ant=act;
}while (act != 0.0);
if (hay2){
  cout << s2n << endl;
}
system("pause");
}
