#include <iostream>
#include <iomanip>
#include <fstream>
#include <math.h>
#include <time.h>
#include <vector>
using namespace std;

//Prototipo de funciones
bool verificarDimension(int);
int pedirFila();
int pedirColumna();

int main(int argc, char const *argv[]) {
  int filas;
  int columnas;

  //Método principal
  filas = pedirFila();
  columna = pedirColumna();


  return 0;
}


bool verificarDimension(int dimension){
  if (dimension >=  2){
    if ((dimension%2 == 1) || (dimension%2 == 2) || (dimension%2 == 3) || (dimension%2 == 4) || (dimension%2 == 5)){
      return true;
    }
  }
  return false;
}
int pedirFila(){
  int filas;
  cout << "Ingrese la cantidad de filas: ";
  cin >> filas;
  cout << endl;
  if (!verificarDimension(filas)){
    cout << "Error de ingreso. Vuelva a intentarlo." << endl;
    filas = pedirFila();
  }
  return filas;
}

int pedirColumna(){
  int columnas;
  cout << "Ingrese la cantidad de columnas: ";
  cin >> columnas;
  if (!verificarDimension(columnas)){
    cout << "Error de ingreso. Vuelva a intentarlo." << endl;
    columnas = pedirColumna();
  }
  return columnas;
}
