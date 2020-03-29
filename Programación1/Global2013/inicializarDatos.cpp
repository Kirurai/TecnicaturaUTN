#include "inicializarDatos.h"


void cargarMatriz(vector<vector <double>> &matriz){
  int dimension;
  double elemento;
  vector <double> columna;


  dimension = dimensionMatriz();

  for (int i = 0; i < dimension; i++){
    for (int j = 0; j < dimension; j++){
      cout << "Inserte el elemento " << i << ", " << j << " de la matriz cuadrada: " <<endl;
      cin >> elemento;
      columna.push_back(elemento);
    }
    matriz.push_back(columna);
    columna.clear();
  }
}
//-------------------------------------------------------

int dimensionMatriz(){
  int dimension;

  cout << "Ingrese el tamaño de la matriz cuadrada: ";
  cin >> dimension;
  cout << endl;
  if (!dimensionValida(dimension)){
    dimension=dimensionMatriz();
  }
  return dimension;

}

bool dimensionValida(int dimension){
  if (dimension%2 == 0){
    return false;
  }
  return true;
}
