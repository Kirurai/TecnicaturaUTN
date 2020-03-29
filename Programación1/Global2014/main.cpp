#include <iostream>
#include <iomanip>
#include <fstream>
#include <math.h>
#include <time.h>
#include <array>
using namespace std;

//Prototipo de métodos
bool ingresoValido(int);
bool existenciaEnCuadrante(int, double[2]);
double distancia(double[2]);
srand(time(0));

int main(int argc, char const *argv[]) {
  //Declaración de variables
  int cantidadPuntos;
  double matrizPuntos[100][2]; //Abscisa y ordenada
  double vectorSuma[1][2] = {{0.0, 0.0}}; //1 fila 2 columnas
  double promedio=0.0;
  int cuadranteElejido;
  aray <double> vectorDistancia[101][3]; //abscisa, ordenada, distancia al origen
  int contador=0;
  srand(time(0));

  //LLeno matrices de 0
  for (int i = 0; i < 100; i++) {
    matrizPuntos[i][0]=0.0;
    matrizPuntos[i][1]=0.0;
    vectorDistancia[i][0]=0.0;
    vectorDistancia[i][1]=0.0;
    vectorDistancia[i][2]=0.0;
    vectorDistancia[101][0]=0.0;
    vectorDistancia[101][1]=0.0;
    vectorDistancia[101][2]=0.0;
  }


  do {
    cout << "ingrese la cantidad de puntos deseados: ";
    cin >> cantidadPuntos;
    cout << "\n";
  } while(!ingresoValido(cantidadPuntos));

//Rellenando matriz ---- TODO: pedir al usuario si subirla random o automático
  for (int i = 0 ; i < cantidadPuntos ; i++){
    for (int j = 0 ; j < 2 ; j++){
      matrizPuntos[i][j]=rand()%500-250;
    }
  }
  cout << "EL TAMAÑO DE LA MATRIZ ES: " << cantidadPuntos << "." << endl;

  //Promedio de cuadrante
  /*
    TODO selección de cuadrante
    cout << "Elija el cuadrante que quiere promediar: " ;
    cin >> cuadranteElejido
    cout << "\n";
  */
  cuadranteElejido=3; //Punto A
  for (int i = 0; i < cantidadPuntos; i++){
    if (existenciaEnCuadrante(cuadranteElejido, matrizPuntos[i])){
      vectorSuma[0][0] = vectorSuma[0][0] + matrizPuntos[i][0];
      vectorSuma[0][1] = vectorSuma[0][1] + matrizPuntos[i][1];
      promedio+=1;
    }
  }
  if (promedio>1){
    cout << "El promedio en el cuadrante " << cuadranteElejido << " es el punto (" << vectorSuma[0][0]/promedio << ";" << vectorSuma[0][1]/promedio << ")." << endl;
  }
  else{
    cout << "No existen puntos en el cuadrante: " << cuadranteElejido << "." << endl;
  }



  cuadranteElejido=1; //Punto B
  for (int i = 0; i<cantidadPuntos; i++){
    if(existenciaEnCuadrante(cuadranteElejido, matrizPuntos[i])) {
      vectorDistancia[contador][0] = matrizPuntos[i][0];
      vectorDistancia[contador][1] = matrizPuntos[i][1];
      vectorDistancia[contador][2] = distancia(matrizPuntos[i]);
      contador++;
    }
  }

  for(int i = 0; i<contador-1; i++){
    /*if (vectorDistancia[i][2] == 0.0){
      break; //Por si me llena la matriz de ceros
    }*/
    for (int j=0; j<contador-i-1; j++){
    /*  if (vectorDistancia[j+1][2] == 0.0){
        break;
      }*/
       if (vectorDistancia[j][2] > vectorDistancia[j+1][2]){
        /*vectorDistancia[101] =  {vectorDistancia[j][0], vectorDistancia[j][1], vectorDistancia[j][2]};
        vectorDistancia[j] =    vectorDistancia[j+1];
        vectorDistancia[j+1] =  vectorDistancia[101];*/
        vectorDistancia[j].swap(vectorDistancia[j+1]);
      }
    }
  }
  if (vectorDistancia[0][2] == 0.0){
    cout << "No hay elementos en el cuadrante " << cuadranteElejido << "." << endl;
  }
  else{
    cout <<"Los puntos ordenados de menor distancia a mayor son: \n X \t Y \t distancia al origen " << endl;
    for (int i = 0; i<contador; i++){
      if (vectorDistancia[i][2] == 0.0){
        break;
      }
      else{
          cout << vectorDistancia[i][0] << "\t" << vectorDistancia[i][1] << "\t" << vectorDistancia[i][2] << endl;
      }
    }
  }


  return 0;
}


//-------------------------------------------------


//MÉTODOS ADICIONALES
bool ingresoValido(int ingreso){
  if ((ingreso < 2) || (ingreso > 100)){
    cout << "Ingreso invalido, vuelva a intentarlo.";
    return false;
  }
  return true;
}

bool existenciaEnCuadrante(int cuadrante, double punto[2]){
  if      ((cuadrante == 1) && punto[0] > 0 && punto[1] > 0){ return true; }
  else if ((cuadrante == 2) && punto[0] < 0 && punto[1] > 0){ return true; }
  else if ((cuadrante == 3) && punto[0] < 0 && punto[1] < 0){ return true; }
  else if ((cuadrante == 4) && punto[0] > 0 && punto[1] < 0){ return true; }

  return false;
}

double distancia(double vectorPunto[2]){
  double distanciaOrigen;
  distanciaOrigen = sqrt(pow(vectorPunto[0],2)+pow(vectorPunto[1],2));
  return distanciaOrigen;
}
