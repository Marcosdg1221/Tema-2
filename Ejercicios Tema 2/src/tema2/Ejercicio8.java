package tema2;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio8 {


	public static void main(String[] args) {

//Doy el scanner y las variables necesarias

Scanner all = new Scanner(System.in);

//Meto las variable necesaria, que será un double

double nota;

//Pido al usuario la nota

System.out.println("Introduzca la nota que sacó el alumno");

//Lo que introduzca será su valor

nota = all.nextDouble();

//Si la nota es menor a cinco y mayor o igual a 0, la nota es insuficiente 

if (nota < 5 && nota >= 0) {
	System.out.println("La nota es insuficiente");
	}

//Si no, se tomarán las siguientes condiciones;

else{
	
	if (nota > 4.99 && nota < 6) {
		
		//Si la nota es mayor que 4.99 pero menor que 6, será una nota suficiente, muestro resultado.
		
		System.out.println("La nota es suficiente");
	}
	if (nota > 5.99 && nota < 7) {
		
		//Si la nota es mayor que 5.99 pero menor que 7, será un bien como nota, muestro resultado.
		
		System.out.println("La nota da como resultado un bien");
	}
	
		//Si la nota es mayor que 6.99 pero menor que 9, será un notable como nota, muestro resultado.
	
	if (nota > 6.99 && nota < 9) {
		System.out.println("Notable es la nota");
	}
	if (nota > 8.99 && nota < 10.01) {
		
		//Si la nota es mayor que 8.99 pero menor que 10.01, será un sobresaliente como nota, muestro resultado.
		
		System.out.println("Sobresaliente");
	}
	
	if (nota < 0 | nota > 10) {
		
		//Si la nota es mayor que 10 o menor que 0, se avisará al usuario de que es incorrecto, muestro resultado.
		
		System.out.println("Su nota está fuera del 0 al 10");
	}
	
	//Cierro scanner
	
	all.close();
	}
	}
}

