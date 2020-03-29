#include <iostream>
#include <iomanip>
#include <fstream>
#include <math.h>
#include <time.h>
#include <array>
using namespace std;

//Prototipo de funciones
void global();
void presentacion();
bool matrizValida(int);
bool esPar(int);
bool datoValido(double);
double calculoPorPatron(double [33][33], int);
int existenciaEnPatron(double [33][33], int);
bool pertenecePatron(int, int, int);
void desviacionEstandar(double, int, double[33][33], int);
double calculoPromedio(double, int);
double calculoVarianza(double, int, double[33][33], int);
void respuesta(double);




//programa principal
int main(int argc, char const *argv[]) {

  global();

  //system("pause"); //cortesía de la casa
  return 0;
}



//Métodos adicicionales
void global(){
  //Declaración de variables
  int dimensionMatriz; //Es el valor de T en el global
  double matriz[33][33];
  double dato;
  double suma;
  int contadorPatron;
  ifstream inFile;

  //apertura de archivo
  inFile.open("datos.txt"); //lectura de archivo
	if (!inFile) {
		cout << "No se puede abrir el archivo denominado datos.txt";
		exit(1); // terminar con error
  }


  //comienzo del método
  presentacion();
  inFile >> dimensionMatriz;
  if(!matrizValida(dimensionMatriz)){
    cout << "dimensiones invalidas. Edite el archivo y vuelva a intentarlo. " << endl;
    exit(1); //termina con error TODO opcional: regresar un valor
  }


  for (int i = 0; i < dimensionMatriz; i++){
    for (int j = 0; j < dimensionMatriz; j++){
      do{
        inFile >> dato;
        matriz[i][j] = dato;
      }while(!datoValido(dato));
    }
  }
//  for (size_t i = 0; i < count; i++) {
    /* code */
  //}
  suma = calculoPorPatron(matriz, dimensionMatriz);
  contadorPatron = existenciaEnPatron(matriz, dimensionMatriz);
  desviacionEstandar(suma, contadorPatron, matriz, dimensionMatriz);




}

void presentacion(){
  cout << "Buen día. Para el correcto funcionamiento del programa deberá tener en la misma carpeta un archivo llamado datos.txt con la siguientes caracterísitcas:" << endl;
  cout << "- El primer renglón debe tener un valor T que represente el tamaño de la matriz cuadrada." <<endl;
  cout << "- El segundo renglón debera tener T² valores, que representarán los valores con los que se llenará la matriz." <<endl;
  cout << "- El valor T no debe ser un entero entre 1 y 33, con valores impares." << endl;
  cout << "- Los valores dados por T² deben ser reales entre -107 y 107. Cualquier valor fuera de este será omitido y el archivo debera brindar un valor extra."  <<endl;
  //system("pause"); //cortesía de enunciado

  //cout << "Por defecto existe un datos.txt para su referencia" << endl;
  cout << "Los calculos se harán automáticos con el ya existente datos.txt" << endl;
  cout << endl << endl;
}

bool matrizValida(int dimension){
  if ((dimension > 33) || (dimension < 1)){
    return false;
  }
  if (esPar(dimension)){
    return false;
  }
  return true;
}

bool esPar(int x){
  if (x%2==0){
    return true;
  }
  return false;
}

bool datoValido(double dato){
  if (abs(dato)>107){
    return false;
  }
  return true;
}

double calculoPorPatron(double matriz[33][33], int dimension){
  double suma = 0;
  for (int i = 0; i < dimension; i++){
    for (int j = 0; j < dimension; j++){
      if(pertenecePatron(i, j, dimension)){
        suma = suma + matriz[i][j];
      }
    }
  }
  return suma;
}

int existenciaEnPatron(double matriz[33][33], int dimension){
  double contador = 0;
  for (int i = 0; i < dimension; i++){
    for (int j = 0; j < dimension; j++){
      if(pertenecePatron(i, j, dimension)){
        contador++;
      }
    }
  }
  return contador;

}


bool pertenecePatron(int fila, int columna, int dimension){
  if (columna >= fila) { //Existencia en matriz triangular superior
    columna= dimension - columna;
    if (columna <= fila){ //Me fijo que el dato sea de la triangular inferior en la diagonal invertida
      return true;
    }
  }
  else {
    return false;
  }
}

void desviacionEstandar(double suma, int total, double matriz[33][33], int dimension){
  double promedio;
  double varianza;
  double desviacion;
  promedio = calculoPromedio(suma, total);
  varianza = calculoVarianza(promedio, total, matriz, dimension);
  desviacion = sqrt(varianza);
  respuesta(desviacion);
}

double calculoPromedio(double suma, int total){
  double promedio;
  promedio = suma/total;
  return promedio;
}

double calculoVarianza(double promedio, int total, double matriz[33][33], int dimension){
  double varianza = 0.0;
  double errorPromedio = 0.0;
  double errorCuadratico = 0.0;
  for  (int i = 0; i < dimension; i++){
    for (int j = 0; j< dimension; j++){
      if(pertenecePatron(i, j, dimension)){
        errorPromedio = matriz[i][j] - promedio;
        errorCuadratico = pow(errorPromedio, 2);
        varianza = varianza + errorCuadratico;
      }
    }
  }
  varianza = varianza/total;
  return varianza;
}

void respuesta( double desviacion){
 cout << "La desviacion estandar siguiendo el patron es: " << desviacion << endl;
 cout << endl;
}
