#include <iostream>
#include <iomanip>
#include <fstream>
#include <math.h>
using namespace std;

/*Ejercicio 2 - Corregir errores "dada uuna secuencia
de valores no nulos, calcular la secuencia
más corta de negativos" */

int main (int argc, char *argv[]) {

  ifstream inFile;

	inFile.open("datos.txt"); //lectura de archivo
	if (!inFile) {
		cout << "No se puede abrir el archivo";
		exit(1); // terminar con error
  }

//declaracion de variables
float nro;
float cNeg=0;
float cNMn=4000; //numero innecesariamente grande, asi calcular la secuencia más corta de negativos
while (!inFile.eof()){
  inFile >> nro;
  if (nro==0.0){
    break;
  }
  if (nro>0.0){
    cNeg++;
    if(cNeg<cNMn){
      cNMn=cNeg;
    }
    else{
      cNeg=0;
    }
  }
}
if (cNMn>0){
  cout << "La secuencia más corta de negativos es: " << cNMn << endl;
}
system("pause");
return 0;
}
