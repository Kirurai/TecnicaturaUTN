#include "inicializarDatos.h"
#include "desviacionEstandar.h"


int main(int argc, char const *argv[]) {
  vector <vector <double>> matriz;
  vector <double> auxiliar;
  double desviacionTipica;

  bienvenida();
  cargarMatriz(matriz);
  prepararVector(matriz, auxiliar);
  desviacionTipica=calcularDesviacionEstandar(auxiliar);
  cout << "La desviacion estandar del patron es: " << desviacionTipica << "."<< endl;

  return 0;
}
