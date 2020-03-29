#include "desviacionEstandar.h"


void prepararVector(const vector<vector <double>> &matriz, vector <double> &auxiliar){

  for (int i = 0; i < matriz.size(); i++ ){
    for (int j = 0; j < matriz[i].size(); j++){
      if (pertenecePatron(i, j, matriz.size())){
		  //cout << "Se usará el elemento " << i << ", " << j << " con valor: " << matriz[i][j] << endl;
        auxiliar.push_back(matriz[i][j]);
      }
    }
  }
}

bool pertenecePatron(int i, int j, int dimension){

  if (j <= (dimension - 1)/2){
    if ( i + j >= (dimension - 1)/2){
      if ( i - j <= (dimension - 1)/2) {
        return true;
      }
    }
  }
  return false;
}

double calcularDesviacionEstandar(const vector <double> &auxiliar){
  //double desviacionTipica;
  //desviacionTipica = sqrt(calcularVarianza(auxiliar));
  return sqrt(calcularVarianza(auxiliar));
}

double calcularVarianza(const vector <double> &auxiliar){
  double errorCuadraticoMedio = 0;
  for (int i = 0; i < auxiliar.size(); i++){
    errorCuadraticoMedio = errorCuadraticoMedio + pow( (auxiliar[i] - promediar(auxiliar)),2);
  }
  errorCuadraticoMedio = errorCuadraticoMedio/auxiliar.size();
  cout << endl << "Se utilizaron " << auxiliar.size() << " elementos" << endl << endl;
  cout << "La media aritmetica es: " << promediar(auxiliar) << endl;
  return errorCuadraticoMedio;
}

double promediar(const vector <double> &auxiliar){
  double suma = 0;
  double promedio;

  for (int i = 0; i < auxiliar.size(); i++){
    suma = suma + auxiliar[i];
  }
  promedio = suma/auxiliar.size();
  return promedio;
}
