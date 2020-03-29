#include "moverAscensores.h"


void encontrarClientes(vector <vector <int>> &ascensores, const int cantidadCosas[2]){
  double desperdicio;
  int dato;
  ifstream inFile;
  vector <int> llamada;

	inFile.open("datos.txt"); //lectura de archivo
	if (!inFile) {
		cout << "No se puede abrir el archivo";
		exit(1); // terminar con error
  }

  //Elimina los primeros 2 datos, cantidad de pisos y ascensores
  for (int i = 0; i < 2; i++){
    inFile >> desperdicio;
  }

  while (true){
    inFile >> dato; //Lugar del cliente
    llamada.push_back(dato);
    if (llamada[0] < 0) break; //condicion del ejercicio
    inFile >> dato; //Destino del cliente
    llamada.push_back(dato);
    if (!validarLlamada(llamada, cantidadCosas[0])){
      elegirAscensor(ascensores, llamada);

    }
    llamada.clear();
  }
  inFile.close();
}


bool validarLlamada(const vector <int> &llamada, const int &qPisos){
  if (llamada[0] > qPisos) return false; //si el origen, es mayor a la cantidad de piso, falso. si es menor a cero ya se valido y cerro el programa
  if ((llamada[1] > qPisos) && (llamada[1] < 0)) return false; //si el destino  está fuera del edificio, es falso
  if (llamada[0] == llamada[1]) return false; //no se usa ascensor para bajar donde te subir
  return true;
}

void elegirAscensor(vector < vector <int>> &ascensores,const vector <int> &llamada){
  int mejorEleccion[4] = {-1, 0, 0, 0}; //numero de ascensor,piso en el que está, distancia recorrida, distancia al que está de la llamada
  for (int i = 0; i < ascensores.size(); i++){
    //                 num. ascen.        pisos             dist. recorri.    distancia a recorrer
//      mejorEleccion = {ascensores[i][0], ascensores[i][1], ascensores[i][2], distanciaAscensor(ascensores[i], llamada[0])};
    if (mejorEleccion[0] < 0) { //primer ascensor siempre es el mejor para empezar
      cambiarEleccion(mejorEleccion, ascensores[i], distanciaAscensor(ascensores[i][1], llamada[0]));
    }
    else if (mejorEleccion[3] > distanciaAscensor(ascensores[i][1], llamada[0])) {
      cambiarEleccion(mejorEleccion, ascensores[i], distanciaAscensor(ascensores[i][1], llamada[0]));
    }
    else if (mejorEleccion[3] == distanciaAscensor(ascensores[i][1], llamada[0])) {
      if (mejorEleccion[2] > ascensores[i][2]) {
        cambiarEleccion(mejorEleccion, ascensores[i], distanciaAscensor(ascensores[i][1], llamada[0]));
      }
      else if (mejorEleccion[2] == ascensores[i][2]) {
        if (mejorEleccion[0] > ascensores[i][0]){ //no debería entrar nunca, pero por si cambio de lugar los ascensores. NO DEBERIA CAMBIAR NUNCA, sino cambiar lo siguiente al for
          cambiarEleccion(mejorEleccion, ascensores[i], distanciaAscensor(ascensores[i][1], llamada[0]));
        }
      }
    }

  }
  actualizarAscensor(mejorEleccion, llamada, ascensores);

}

int distanciaAscensor(const int &lugarAscensor, const int &lugarCliente){
  int distancia = (lugarAscensor - lugarCliente);
  return distancia;
}
void cambiarEleccion(int actual[4], vector <int> &ascensor, int distanciaARecorrer){
  actual[0] = ascensor[0]; //Numero de ascensor
  actual[1] = ascensor[1]; //piso en el que está
  actual[2] = ascensor[2]; //distancia total recorrida
  actual[3] = distanciaARecorrer;
}

void actualizarAscensor(int mejorEleccion[4],const vector <int> &llamada, vector < vector <int>> &ascensores){
  //El ascensor con subindice en mejorEleccion se le suma, la distancia de donde está el ascensor a donde está el cliente y                 la distancia al destino
  ascensores[mejorEleccion[0]][2] = ascensores[mejorEleccion[0]][2] + distanciaAscensor(ascensores[mejorEleccion[0]][1], llamada[0]) + distanciaAscensor(ascensores[mejorEleccion[0]][1], llamada[1]);
  //Psio en el que se queda
  ascensores[mejorEleccion[0]][1] = mejorEleccion[1];
}
