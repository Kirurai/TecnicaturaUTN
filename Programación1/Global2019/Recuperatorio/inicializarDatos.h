#ifndef INICIALIZARDATOS_H
#define INICIALIZARDATOS_H

#include <iostream>
#include <fstream>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <cstdlib>
#include <vector>

#include "inicializarDatos.h"

using namespace std;

int dimensionMatriz();

void cargarMatriz(vector<vector <double>> &);

bool dimensionValida(int);

bool elementoValido(double);

void bienvenida();



#endif
