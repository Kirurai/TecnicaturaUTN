#include <iostream>
#include <fstream>    // ofstream, ifstream
#include <stdio.h>    //printf, scanf, puts, NULL
#include <stdlib.h>   //srand, rand
#include <math.h>     //time

using namespace std;

double crearIngreso();
double crearDecimales(double &);
double darSigno(double &);

int main(int argc, char const *argv[]) {
  ofstream outfile {"datos.txt"};
  int filas;
  int columnas;
  double numero;
  srand(time(NULL));

  cout << "Ingrese cantidad de filas que desea tener en txt: ";
  cin >> filas;
  cout << endl << "Ingrese cantidad de columnas que desea tener en el txt: ";
  cin >> columnas;
  cout << endl;
  for (int i = 0; i < filas; i++){
    for (int j = 0; j < columnas; j++){
      numero = crearIngreso();
      outfile << numero << " ";
    }
    outfile << endl;
  }
  return 0;
}


double crearIngreso(){
  double numero = rand()%250+1; //numero entero entre 1 y 250
  crearDecimales(numero); //da la parte decimal
  darSigno(numero); //numero con flotante entre -250 y 250 excluyendo el 0
  return numero;
}

double crearDecimales(double &numero){
  numero = numero + (rand()%100)/100.0;
  return numero;
}

double darSigno(double &numero){
  if (rand()%2 == 0){
    numero = numero - numero*2;
  }
  return numero;
}
