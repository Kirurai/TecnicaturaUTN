#include "promedio.h"
#include "dividirMatriz.h"

void dividirMatriz(vector <vector <vector <double>>> &matriz){
  mostrarPromedio(matriz);
  //mostrarMatriz(matriz);
  if (matriz.size() != 1){
    eliminarElementos(matriz);
    dividirMatriz(matriz);
  }

}

void eliminarElementos(vector <vector <vector <double>>> &matriz){
  int cuarto = (int)floor(matriz.size()/4); //elimino un cuarto de cada lado, y queda la mitad

  if (cuarto == 0) cuarto = 1;
//Eliminando los planos superiores e inferiores
  matriz.erase(matriz.begin(), matriz.begin()+cuarto);
  matriz.erase(matriz.end()-cuarto, matriz.end());

//Eliminando las columnas más laterales
  for (int i = 0; i < matriz.size(); i++){
    for (int j = 0; j < matriz[i].size(); j++){
      matriz[i].erase(matriz[i].begin(), matriz[i].begin()+cuarto);
      matriz[i].erase(matriz[i].end()-cuarto, matriz[i].end());
    }
  }

  //Eliminando los bloques frontales y
  for (int i = 0; i < matriz.size(); i++){
    for (int j = 0; j < matriz[i].size(); j++){
      for (int k = 0; k < matriz[i][j].size(); k++){
        matriz[i][j].erase(matriz[i][j].begin(), matriz[i][j].begin()+cuarto);
        matriz[i][j].erase(matriz[i][j].end()-cuarto, matriz[i][j].end());
      }
    }
  }

}


void mostrarMatriz(vector <vector <vector <double>>> &matriz){
  for (int i = 0; i < matriz.size(); i++){
    for (int j = 0; j < matriz[i].size(); j++){
      for (int k = 0; k < matriz[i][j].size(); k++){
        cout << matriz[i][j][k] << " ";
      }
      cout << endl;
    }
  }
}
