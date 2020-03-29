#include <iostream>

using namespace std;
//Leer un valor y determinar si es par o impar.
int main(){
  int numero;
  printf("Ingrese el número para determinar si par o no: ");
  cin >> numero;
  printf("\n");
  if(numero%2 == 0){
    printf("El número %d es par.", numero);
  }
  else {
    printf("El número %d es impar.", numero);
  }
}
