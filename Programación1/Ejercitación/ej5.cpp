#include <iostream>
using namespace std;
/*Desarrolle dos programas para:

    Dado un año y un mes, muestre la fecha del último día de ese mes y ese año.
    Dado un año, un mes y un día, calcule el número de días transcurridos desde el 31 de diciembre del año anterior.
*/
int main() {
  int year;
  int mes;
  int diasTotales = 0;
  int diaIngresado;
//-----------PEDIDO DE DATOS Y COMPROBACION
  do{
    printf("Ingrese el año: ");
    cin >> year;
    printf("\nIngrese el mes, como número: ");
    cin >> mes;
    cout << "\n";
    if ((year <0) || (mes>12) || (mes<1)){
      printf("Ha ingresado una fecha incorrecta, vuelva a intentarlo.\n");
    }
  } while ((year <0) || (mes>12) || (mes<1));

//-----------Cuentas para calcular días de ese mes
  if ((mes%2==1 && mes<=7) || (mes%2==0 && mes>=8)){
    diasTotales+=31;
  }
  else if(mes==2){
    diasTotales+=28;
    if(((year%4==0) && (year%100!=0)) || (year%400==0)){
      diasTotales+=1;
    }
  }
  else{
    diasTotales+=30;
  }
  printf("En el mes %d del año %d hay %d días ", mes, year, diasTotales);

//-----------PEDIDO DE DATOS, PUNTO 2
  diasTotales==0;
  cout<<"\n Segunda parte \n ";
  do{
    printf("Ingrese el año: ");
    cin >> year;
    printf("\nIngrese el mes, como número: ");
    cin >> mes;
    printf("\nIngrese el día: ");
    cin >>diaIngresado;
    cout << "\n";
    if ((year <0) || (mes>12) || (mes<1) || (diaIngresado>31) || (diaIngresado<1)){
      printf("Ha ingresado una fecha incorrecta, vuelva a intentarlo.\n");
    }
  } while ((year <0) || (mes>12) || (mes<1));
  //-----------
  if(((year%4==0) && (year%100!=0)) || (year%400==0)){
    if (mes>=2){
      diasTotales=1;
    }
  }
  for (int i=1; i<mes; i++){
    diasTotales+=30;
    if ((i%2==1 && i<=7) || (i%2==0 && i>=8)){
      diasTotales+=1;
    }
    if(i==2){
      diasTotales-=2;
    }
  }
  diasTotales+=diaIngresado;
  printf("Hasta la fecha %d/%d/%d hay un total de %d días",diaIngresado, mes, year, diasTotales);
  return 0;
}
