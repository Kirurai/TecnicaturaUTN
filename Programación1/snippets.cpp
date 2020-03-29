#include <iostream>
#include <iomanip>
#include <fstream>
#include <math.h>
#include <time.h>
#include <stdio.h>
#include <stdlib.h>
#include <cstdlib>
#include <vector>

using namespace std;

//Prototipo de funciones
double desviacionEstandar(double, int, double[33][33], int);
double calcularPromedio(double, int);
double calcularVarianza(double , int, double[33][33], int);
bool pertenecePatron(int, int, int); //dimensiones, fila, columna TODO: forma de elegir patrón por argumento:




double desviacionEstandar(double suma, int total, double matriz[33][33], int dimension){
  double promedio;
  double varianza;
  double desviacion;
  promedio = calcularPromedio(suma, total);
  varianza = calcularVarianza(promedio, total, matriz, dimension);
  desviacion = sqrt(varianza);
  return double;
}

double calcularPromedio(double suma, int total){
  double promedio;
  promedio = suma/total;
  return promedio;
}

double calcularVarianza(double promedio, int total, double matriz[33][33], int dimension){
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

bool diagonalPrincipal(int dimension, int fila, int columna){
  // diagonal principalpara la mitad de un lado agregar && (fila <= (dimension/2)) este caso acepta la diagonal por arriba de la mitad
  if (fila==columna) return true;
  return false;
}

bool AntiDiagonal(int dimension, int fila, int columna){
  //antidiagonal para la mitad de un lado agregar && (fila <= (dimension/2)) este caso acepta la diagonal por arriba de la mitad
  if ((fila+columna)==(dimension-1)) return true;
  return false;
}

bool filaCentral(int dimension, int fila, int columna){
  //Fila del medio, para la mitad de un lado agregar && (columna <= (dimension/2)) este caso acepta el izquierdo
  if (fila==floor(dimension/2)) return true;
  return false;
}

bool columnaCentral(int dimension, int fila, int columna){
  //Columna del medio para la mitad de un lado agregar && (fila <= (dimension/2)) este caso acepta el superior
  if (columna==floor(dimension/2)) return true;
  return false;
}

bool pertenecePatron(int dimension, int fila, int columna){ //dimensiones, fila, columna TODO: forma de elegir patrón por argumento:
//Comentar los patrones que no se desean.
//Los siguientes condicionales, toman una sola hilera, para la mitad de una hilera, ver el comentario, si se desea el otro lado invertir la comparación.
if(diagonalPrincipal(dimension, fila, columna)) return true;
if(AntiDiagonal(dimension, fila, columna)) return true;
if(filaCentral(dimension, fila, columna)) return true;
if(columnaCentral(dimension, fila, columna)) return true;
/* Se buscará un triángulo en correspondencia con el siguiente, con la diagonal en correspondencia con la principal
0 1 0 2 0
8 0 0 0 3   //Los que son 0 ya se encontraban en el código superior (Diagonales e hileras centrales)
0 0 0 0 0
7 0 0 0 4
0 6 0 5 0
*/

/* 1 */ if ((columna > fila) && (fila < dimension) && (columna < dimension)) return true;
/* 2 */ if ((columna > fila) && (fila < dimension) && (columna > dimension)) return true;
/* 3 */ if ((columna > fila) && (fila < dimension) && (columna < dimension)) return true;
/* 4 */ if ((columna > fila) && (fila < dimension) && (columna < dimension)) return true;
/* 5 */ if ((columna > fila) && (fila < dimension) && (columna < dimension)) return true;
/* 6 */ if ((columna > fila) && (fila < dimension) && (columna < dimension)) return true;
/* 7 */ if ((columna > fila) && (fila < dimension) && (columna < dimension)) return true;
/* 8 */ if ((columna > fila) && (fila < dimension) && (columna < dimension)) return true;

return false;
}


int polaresCuadrantePerteneciente(double angulo, double distancia){
  int cuadrante = 0;
  if ((distancia != 0) && (angulo%90 != 0.0)){ //Si no es el origen, o no está sobre un eje cartesiano, entonces tiene un cuadrante
    cuadrante = ((int)angulo/90) + 1;
  }
  return cuadrante;
}

int cartesianasCuadrantePerteneciente (double abscisa, double ordenada){
  int cuadrante = 0; //Cero es ningún cuadrante. El punto pertenece a un eje
  if ((abscisa != 0) && (ordenada != 0)){ //Si una componente es cero, está sobre el eje
    if (abscisa > 0) { //cuadrantes superiores. 1 o 2
      if (ordenada > 0) { //Cuadrante 1
        cuadrante = 1;
      }else{
        cuadrante = 2;
      }
    }else{ //cuadrantes inferiores. 3 o 4
      if (ordenada > 0){
        cuadrante = 4;
      }else {
        cuadrante = 3;
      }
    }
  }
  return cuadrante;
}
