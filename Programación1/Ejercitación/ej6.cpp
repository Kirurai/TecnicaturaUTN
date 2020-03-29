#include <iostream>
#include <math.h>

using namespace std;

//Desarrolle un programa para encontrar las raíces de una cuadrática:
int main(){
  float a;
  float b;
  float c;
  float raiz1;
  float raiz2;
  float discriminante;
  printf("Teniendo en cuenta una función del tipo f(x)=ax²+bx+c, donde a,b,c son reales. \n");
  do {
    printf("Ingrese el valor de a: ");
    cin >> a;
    printf("\nIngrese el valor de b: ");
    cin >> b;
    printf("\nIngrese el valor de c: ");
    cin >> c;
    if (a==0.0){
      printf("El coeficiente a no puede ser 0, vuelva a intentarlo. \n");
    }
  } while(a==0.0);
  printf("\n");
  discriminante=b*b-4*a*c;
  raiz1=(-b)/(2*a);
  raiz2=raiz1;
  if (discriminante<0){
    discriminante=sqrt(abs(discriminante));
    printf("Las raices son imaginarias, y sus valores son: %.2f + %.2f*i y %.2f - %.2f*i",raiz1, discriminante, raiz2, discriminante);
  }
  else if(discriminante==0){
    printf("La raíz es doble, y su valores es: %.2f", raiz1);
  }
  else{
    discriminante=sqrt(discriminante);
    raiz1+=(discriminante/(2*a));
    raiz2-=(discriminante/(2*a));
    printf("Las raices son reales y su valores son: %.2f y %.2f", raiz1, raiz2);
  }
  return 0;
}
