#include <iostream>
using namespace std;

int main(int argc, char *argv[]) {
	float primero;
	float segundo;
	float tercero;
	printf("ingrese el primer valor: ");
	cin >> primero;
	printf("\n");
	printf("ingrese el segundo valor: ");
	cin >> segundo;
	printf("\n");
	printf("ingrese el tercer valor: ");
	cin >> tercero;
	printf("\n");
	if((primero>=segundo) && (primero>=tercero)){
		printf("El valor mayor es el primero ");
		if(primero == segundo){
			printf("y el segundo ");
		}
		if(primero == tercero){
			printf("y el tercero ");
		}
		printf(".\n");
		if(segundo>=tercero){
			printf("Los numeros ordenados en orden creciente son: %f, %f, %f", tercero, segundo, primero);
		}
		else{
			printf("Los numeros ordenados en orden creciente son: %f, %f, %f", segundo, tercero, primero);
		}
	}
	else if(segundo>=tercero){
		printf("El segundo valor es el mayor");
		if(segundo ==tercero){
			printf(" y el tercero");
		}
		printf(".\n");
		if(primero>=tercero){
			printf("Los numeros ordenados en orden creciente son: %f, %f, %f", tercero, primero, segundo);
		}
		else{
			printf("Los numeros ordenados en orden creciente son: %f, %f, %f", primero, tercero, segundo);
		}
	}
	else{
		printf("El tercer valor es el mayor \n");
		if(primero>=segundo){
			printf("Los numeros ordenados en orden creciente son: %f, %f, %f", segundo, primero, tercero);
		}
		else{
			printf("Los numeros ordenados en orden creciente son: %f, %f, %f", primero, segundo, tercero);
		}
	}	
	return 0;
}

