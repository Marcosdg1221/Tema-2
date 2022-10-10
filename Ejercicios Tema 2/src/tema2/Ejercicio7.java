package tema2;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio7 {
	public static void main(String[] args) {

//Doy el scanner y las variables necesarias

Scanner all = new Scanner(System.in);

//Meto las variable necesaria

int numero;

//Pido al usuario un numero del 1 al 99999

System.out.println("Introduzca un número del 0 al 99999");

//el numero introducido será su valor

numero = all.nextInt();

//Si ese numero es menor que 10, tendrá una sola cifra

if (numero < 10) {
	
	//Muestro resultado
	
	System.out.println("Tiene una cifra");
	}
else { 
	
	//Si ese numero es mayor que 10, tendrá más de una cifra, se sigue las siguientes condiciones;
	//Si es menor que 100, tendrá dos cifras
	if (numero <100) {
		
		//Muestro resultado
		
		System.out.println("Tiene dos cifras");
	}
	
	//Si ese numero es mayor que 99, pero menor que mil, tendrá tres cifras
	
	if (numero > 99 && numero < 1000) {
		
		//Muestro resultado
		
		System.out.println("Tiene tres cifras");
	}
	
	//Si ese numero es mayor que 999, pero menor que diez mil, tendrá cuatro cifras
	
	if ( numero > 999 && numero < 10000) {
		
		//Muestro resultado
		
		System.out.println("Tiene cuatro cifras");
	}
	
	//Si ese numero es mayor que 9999, pero menor que cien mil, tendrá cinco cifras
	
	if (numero > 9999 && numero < 100000) {
		
		//Muestro resultado
		
		System.out.println("Tiene cinco cifras");
	}
	
	//Si el usuario introdujo más de cinco cifras, avisa al usuario de introducir de una a cinco cifras.
	
	if (numero > 99999) {
		
		//Muestro resultado
		
		System.out.println("Tiene más de cinco cifras, por favor solo introduzca un número de una a cinco cifras.");
	}
}

//Cierro scanner

all.close();
}

}
