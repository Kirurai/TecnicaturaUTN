#ifndef DESVIACIONESTANDAR_H
#define DESVIACIONESTANDAR_H

#include <iostream>
#include <fstream>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <cstdlib>
#include <vector>

#include "desviacionEstandar.h"

using namespace std;

void prepararVector( const vector<vector <double>> &, vector <double> &);

bool pertenecePatron(int, int, int);

double calcularDesviacionEstandar(const vector <double> &);

double calcularVarianza(const vector <double> &);

double promediar(const vector <double> &);



#endif
