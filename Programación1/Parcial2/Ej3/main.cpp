#include <iostream>
#include <iomanip>
#include <fstream>
#include <math.h>
using namespace std;

bool dimensionExcedida(int filas, int columnas){//si son menores a 2 o mayores a 15, salir
  if (filas>15 || filas<2 || columnas<2 || columnas>15){
    return true;
  }
  return false;
}

float promedio(float vector[], int largoVector){
  float resultado;
  float suma = 0;
  for (int i=0; i<largoVector; i++){
    suma = suma+vector[i];
  }
  resultado = suma/largoVector;
  return resultado;
}
int main (int argc, char *argv[]) {

  ifstream inFile;

	inFile.open("datos.txt"); //lectura de archivo
	if (!inFile) {
		cout << "No se puede abrir el archivo";
		exit(1); // terminar con error
  }

  //Declaración de variables
  int cFil;
  int cCol;
  inFile >> cFil;
  inFile >> cCol;
  float matrizDato[15][15];
  float promedioCol[1][15];
  float vectorAyuda[15]; //Una fila, donde cada elemento, será el elemento por fila de la matrizDato
  int consigna; //Ultimo dato del datos.txt
  float respuesta;

  if(dimensionExcedida(cFil, cCol)){
    return 1;
  }
  for (int horizontal=0; horizontal < cFil; horizontal++){
    for (int vertical=0; vertical < cCol; vertical++){
      inFile >> matrizDato[horizontal][vertical]; //Matriz cargada

    }

  }
  inFile >> consigna;


  for (int row=0;row<cFil; row++){
    vectorAyuda[row]=matrizDato[row][consigna];
  }
  respuesta=promedio(vectorAyuda, cFil);
  cout <<"El promedio de la columna "<< consigna << " es: "<< respuesta <<endl;

  system("pause");
return 0;

}
