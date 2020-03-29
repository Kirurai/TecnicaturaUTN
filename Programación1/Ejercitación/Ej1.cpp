#include <iostream>
#include <stdlib.h>

using namespace std;
/*Dado un número entero, calcular si:

    Tiene un dígito.
    Tiene 2 dígitos.
    Tiene 3 dígitos.
    Tiene 4 o más dígitos.
*/
int main(){
  int numero;
  printf("Ingrese un entero para calcular su cantidad de digitos: ");
  cin >> numero;
  numero=abs(numero);
  cout << "\n";
  if (numero >= 1000){
    printf("El numero %d tiene al menos 4 digitos", numero);
  }
  else if(numero>=100){
    printf("El numero %d tiene digitos", numero);
  }
  else if(numero>=10){
    printf("El numero %d tiene 2 di�gitos", numero);
  }
  else{
    printf("El numero %d tiene 1 di�gito", numero);
  }
  return 0;
}
