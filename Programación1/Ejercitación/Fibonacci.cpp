#include <iostream>
#include <stdlib.h>
#include <stdio.h>

using namespace std;

void sucesionFibonacci(int actual, int anterior, int contador, int elemento){
	int nuevo;
	if (contador != elemento){
		contador++;
		nuevo=actual+anterior;
		cout << "El  " << contador << "° termino es: " << nuevo << "\n";
		sucesionFibonacci(nuevo, actual, contador, elemento);
	}
	//return 0;
}
int main (int argc, char *argv[]){
	int elemento;
	int anterior = 0;
	int actual = 1;
	int contador=2;
	cout << "Elija cuantos elementos de la sucesion de Fibonacci desea: ";
	cin >> elemento;
	cout << "\n";
	cout << "el 1° y 2° termino de la sucesión de Fibonacci son 0 y 1 respectivamente.\n";
	sucesionFibonacci(actual, anterior, contador, elemento);
	return 0;
}

int sucesionFibonacci(int actual, int anterior){
  int nuevo;
  if (contador != elemento){
    contador++;
    nuevo=actual+anterior;
    actual=anterior;
    fprintf("El  %i° termino de la sucesión de Fibonacci es: %i", contador, nuevo );
    sucesionFibonacci(nuevo, actual);
  }
}
