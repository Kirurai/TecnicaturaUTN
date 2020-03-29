#include <iostream>

using namespace std;
/*Leer 2 valores y:

    Si se puede, dividir el primero por el segundo.
    Dividir el mayor de los dos por el menor.
*/
int main(){
  float primero;
  float segundo;
  printf("Ingrese el primer número: ");
  cin>>primero;
  printf("\n Ingrese el segundo número: ");
  cin>>segundo;
  if (segundo != 0.0){
    printf("\n La división entre el primero y el segundo es: %f \n", primero/segundo);
  }
  if ((primero>=segundo) && (segundo!=0.0)){
    printf("el mayor es %f y divido por %f es igual a: %f",primero, segundo, primero/segundo);
  }
  else if(primero !=0.0){
    printf("el mayor es %f y divido por %f es igual a: %f",segundo, primero, segundo/primero);
  }
}
