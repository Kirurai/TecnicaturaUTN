#ifndef MOVERASCENSORES_H
#define MOVERASCENSORES_H

#include <iostream>
#include <fstream>    //ifstream, ofstream
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <cstdlib>
#include <vector>

#include "moverAscensores.h"

using namespace std;


void encontrarClientes(vector <vector <int>> &, const int [2]);

bool validarLlamada(const vector <int> &, const int &);

void elegirAscensor(vector < vector <int>> &,const vector <int> &llamada);

int distanciaAscensor(const int &, const int &);

void cambiarEleccion(int [4], vector <int> &, int);

void actualizarAscensor(int [4],const vector <int> &, vector < vector <int>> &);



#endif
