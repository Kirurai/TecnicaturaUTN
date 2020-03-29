#include "inicializarDatos.h"


void cargarMatriz(vector<vector <vector<double>>> &matriz){
  int dimension;
  double elemento;
  vector <double> profundidad;
  vector <vector <double>> columna;

  dimension = dimensionMatriz();

  for (int i = 0; i < dimension; i++){
    for (int j = 0; j < dimension; j++){
      for (int k = 0; k< dimension; k++){
        cout << "Inserte el elemento " << i << ", " << j << ", " << k << " de la matriz cúbica: " <<endl;
        cin >> elemento;
        profundidad.push_back(elemento);
      }
      columna.push_back(profundidad);
      profundidad.clear();
    }
    matriz.push_back(columna);
    columna.clear();
  }
}
//-------------------------------------------------------

int dimensionMatriz(){
  int dimension;

  cout << "Ingrese el tamaño de la matriz cúbica: ";
  cin >> dimension;
  cout << endl;
  if (!dimensionValida(dimension)){
    dimension=dimensionMatriz();
  }
  return dimension;

}

bool dimensionValida(int dimension){
  if ((dimension > 20) || (dimension < 1)){
    return false;
  }
  return true;
}
