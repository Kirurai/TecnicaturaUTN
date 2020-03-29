#include "inicializarDatos.h"
#include "moverAscensores.h"


int main(int argc, char const *argv[]) {
  int cantidadCosas[2];
  vector <vector <int>> ascensores; //se organizará como [0] numero de ascensor, [1] piso y [2] distancia recorrida

  //Inicializando
  cantidadObjetos(cantidadCosas);
  cargarVector(ascensores, cantidadCosas);

  //Empezando el ejercicio
  encontrarClientes(ascensores, cantidadCosas);
  //TODO agregar final.

  return 0;
}
