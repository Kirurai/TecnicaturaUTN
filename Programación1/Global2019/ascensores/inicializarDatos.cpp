#include "inicializarDatos.h"



void cantidadObjetos(int cantidad[2]){
 cout << "Ingrese la cantidad de pisos: ";
 cin >> cantidad[0];
 cout << endl << "Ingrese la cantidad de ascensores: ";
 cin >> cantidad[1];
 if (!dimensionValida(cantidad)){
   cout << endl << "Error en el ingreso, ambos objetos deben ser mayor o igual a 1. Vuelva a intentarlo." << endl;
   cantidadObjetos(cantidad);
 }
}

bool dimensionValida(const int cantidad[2]){
  if ((cantidad[0] < 1) || (cantidad[1] < 1)) return false;
  return true;
}

void cargarVector(vector<vector <int>> &ascensores, const int cantidad[]){
  vector <int> numeroAscensor;
  for (int i = 0; i < cantidad[1]; i++){
    numeroAscensor.push_back(i); //numero de Ascensor
    numeroAscensor.push_back(0); //piso ene l que está, empieza en planta baja
    numeroAscensor.push_back(0); //distancia recorrida;
    ascensores.push_back(numeroAscensor);
    numeroAscensor.clear();
  }
}
