#include "inicializarDatos.h"


void cargarMatriz(vector<vector <double>> &matriz){
  int dimension;
  double elemento;
  double desperdicio;
  vector <double> fila;


  dimension = dimensionMatriz();
  //Abriendo Archivo.
      ifstream inFile;

      inFile.open("datos.txt"); //lectura de archivo
      if (!inFile) {
        cout << "No se puede abrir el archivo";
        exit(1); // terminar con error
      }
    //Eliminando el primer elemto. Que ya se uso.
      for (int i = 0; i < 1; i++){
        inFile >> desperdicio;
      }

  for (int i = 0; i < dimension; i++){
    for (int j = 0; j < dimension; j++){
      inFile >> elemento;
      if (elementoValido(elemento)){
        //cout << "Cargando el elemento " << i << ", " << j << " de la matriz cuadrada: " << elemento <<endl;
        fila.push_back(elemento);
      }else{
        //cout << "El numero " << elemento << " es invalido. se va a ignorar" << endl;
        j--;
      }
    }
    matriz.push_back(fila);
    fila.clear();
  }
}


//-------------------------------------------------------


int dimensionMatriz(){
  int dimension;
  //Abriendo Archivo.
      ifstream inFile;

      inFile.open("datos.txt"); //lectura de archivo
      if (!inFile) {
        cout << "No se puede abrir el archivo";
        exit(1); // terminar con error
      }

  inFile >> dimension;
  cout << "El tamaÒo de la matriz cuadrada:  "<< dimension << endl;
  if (!dimensionValida(dimension)){
    cout << "Error. DimensiÛn Invalida. Edite el archivo datos.txt y vuelva a intentarlo." << endl;
    cout << endl << endl;
    exit(1); //Finaliza con error
  }
  return dimension;

}

bool dimensionValida(int dimension){
  if (dimension%2 == 0){ //Condicion que la matriz sea impar
    return false;
  }
  if (dimension > 33){ //La matriz no uede tener m√°s de 33 elementos.
    return false;
  }
  if (dimension < 1){ //La matriz debe tener al menos un elemento.
    return false;
  }
  return true;
}

bool elementoValido(double elemento){
  if (abs(elemento) > 107){
    return false;
  }
  return true;
}

void bienvenida(){
  cout << "Bienvenido al ejercicio de DesviaciÛn Estandar de una matriz dado un patrÛn" << endl;
  cout << "El patrÛn actual es un triangulo isoceles con 2 vertices en los extremos de la columna central y el tercero en el extremo izquierdo de la fila central. " << endl;
  cout << "Se leer· un archivo de texto denominado 'datos.txt' que tendr· el siguiente formato: " << endl;
  cout << "-Un primer valor T que ser· la dimensiÛn cuadrada de la matriz a calcular. Deber· ser impar y estar entre 1 y 33." << endl;
  cout << "    De no cumplir la condiciÛn. El ejercicio finalizar· en ese momento." << endl;
  cout << "-Una cantidad de T cuadrado valores que ser·n los valores de la matriz. Si alguno es mayor a 107 se omitr·" << endl;
  cout << endl << endl;
}
