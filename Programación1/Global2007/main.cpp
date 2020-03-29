#include "inicializarDatos.h"
#include "promedio.h"
#include "dividirMatriz.h"



int main(int argc, char const *argv[]) {
  vector <vector <vector <double>>> matriz;



  cargarMatriz(matriz);
  dividirMatriz(matriz);

  system("pause");


  return 0;
}
