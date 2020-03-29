#ifndef INICIALIZARDATOS_H
#define INICIALIZARDATOS_H

#include <iostream>
#include <fstream>    //ifstream, ofstream
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <cstdlib>
#include <vector>

#include "inicializarDatos.h"

using namespace std;

void cantidadObjetos(int [2]);//pisos y ascensores

bool dimensionValida(const int [2]);

void cargarVector(vector<vector <int>> &, const int [2]);



#endif
