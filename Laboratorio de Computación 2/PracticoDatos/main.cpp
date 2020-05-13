#include <iostream>
#include <string>   //getline(ifstream, string)
#include <fstream>  // ofstream, ifstream
#include <stdio.h>  //printf, scanf, puts, NULL
#include <stdlib.h> //srand, rand
#include <ctype.h> //isalpha()
#include <math.h>   
#include <vector>

using namespace std;

//Prototipos de funciones
bool comparar(string, string);
int buscarSeparacion(string);

    int main(int argc, char const *argv[])
{
    ofstream outfile{"Entregar.txt"};
    ifstream infile;
    vector <string> ordenar;
    string datoProvisorio;

    infile.open("Recibir.txt"); //lectura de archivo
    if (!infile){
        cout << "No se puede abrir el archivo denominado Recibir.txt";
        exit(1); // terminar con error
    }

    //Cargando el vector ordenar
    while (!infile.eof()){
        getline(infile, datoProvisorio);
        ordenar.push_back(datoProvisorio);
    }
    cout << "Se ordenará el archivo Recibir.txt de manera alfabética. En caso de mismo nombre, se pondrá quien tenga la nota más bajo primero\n";
    for (int i = 0; i < ordenar.size() - 1; i++){
        for (int j = 0; j < ordenar.size() - i - 1; j++){
            if (comparar(ordenar[j], ordenar[j + 1])){
                ordenar[j].swap(ordenar[j+1]);
            }
        }
    }
    // A está altura el vector ordenar, está ordenado

    for (int i = 0; i < ordenar.size(); i++){
        outfile << ordenar[i] + "\n";
    }


    outfile.close();
    infile.close();
    return 0;
}


bool comparar (string primero, string segundo){
    string first = primero.substr(0, buscarSeparacion(primero));
    string second = segundo.substr(0, buscarSeparacion(segundo));
    
    if (first.compare(second) == 0){
        first = primero.substr(buscarSeparacion(primero) + 1);
        second = segundo.substr(buscarSeparacion(segundo) + 1);

        if (first.compare(second) > 0){
            return true;
        }
        return false;

    }else if (first.compare(second) > 0){
        return true;
    }else{
        return false;
    }
}


int buscarSeparacion(string palabra){

    for (int i = 0; i < palabra.size(); i++){
        if (!(isalpha(palabra[i]))){
            return i;
        }
    }
    return palabra.size();
}