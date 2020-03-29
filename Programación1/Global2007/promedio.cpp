#include "promedio.h"


void mostrarPromedio(vector <vector <vector <double>>> &elementos){
  cout <<"El promedio de la matriz cúbica de " << elementos.size() << " elementos es: " << promediar(elementos) << endl;
}

double promediar(const vector <vector <vector <double>>> &elementos){
  double suma = 0;
  int contador = 0;
  double prom;

  for (int i=0; i < elementos.size(); i++){
    for (int j = 0; j < elementos[i].size(); j++){
      for (int k = 0; k<elementos[i][j].size(); k++){
        suma = suma + elementos[i][j][k];
        //cout << elementos[i][j][k] << " ";
        contador++;
      }
    }
  }
  //cout << endl;
  prom = suma/contador;
  return prom;
}
