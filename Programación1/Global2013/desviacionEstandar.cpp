#include "desviacionEstandar.h"


void prepararVector(const vector<vector <double>> &matriz, vector <double> &auxiliar){

  for (int i = 0; i < matriz.size(); i++ ){
    for (int j = 0; j < matriz[i].size(); j++){
      if (pertenecePatron(i, j, matriz.size())){
        auxiliar.push_back(matriz[i][j]);
      }
    }
  }
}

bool pertenecePatron(int i, int j, int dimension){
  if ( i - j >= 0) return true; //Triangular inferior, incluida diagonal
  if ( j - i >= 0) return true; //Triangular superior, incluida diagonal
  if ( i + j >= dimension - 1) return true; //Triangular inferior de la antidiagonal
  if ( i + j <= dimension - 1) return true; //Triangular superior de la antidiagonal

  if ( i + j >= (dimension - 1)/2) return true; //Excluye el minitriangulo superior izquierdo
  if ( j - i <= (dimension - 1)/2) return true; //Excluye el minitriangulo superior derecho
  if ( i + j <= (dimension - 1)*1.5) return true; //Excluye el minitriangulo inferior derecho
  if ( i - j <= (dimension - 1)/2) return true; //Excluye el minitriangulo inferior izquierdo

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
