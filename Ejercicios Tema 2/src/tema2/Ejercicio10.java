package tema2;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio10 {

	public static void main(String[] args) {

//Doy el scanner y las variables necesarias
		Scanner all = new Scanner(System.in);
		//Meto las variables necesarias

	int num1; //Para el primer número
	int num2; //Para el segundo número
	int suma; //Para la suma de los dos números
	final int total; //Para la comprobación
	
	//Pido al usuario el primer número
	
	System.out.println("Introduzca un número, se sumará con el siguiente para saber si da como resultado otro número");
	
	//El número introducido será su valor
	
	num1 = all.nextInt();
	
	//Pido al usuario el segundo número
	
	System.out.println("Introduzca otro número");
	
	//El número introducido será su valor
	
	num2= all.nextInt();
	
	//Pido al usuario el tercer número que cree que será la suma de los dos anteriores
	
	System.out.println("Introduzca un número aleatorio para comprobar si es la suma de los dos anteriores");
	
	//total tomará su valor
	
	total= all.nextInt();
	
	//la variable suma será el numero1 más el número2;
	
	suma = (num1 + num2);
	
	//Si la suma es igual a total, se tomará la primera condición, si no, la segunda.
	
	if(suma == total){
		
		//Primera condición
		
		System.out.println("la suma es correcta; el tercer número introducido es su suma");
	}
	else {
		
		//Segunda condición
		
		System.out.println("la suma es incorrecta; el tercer número introducido no es su suma");
	}
	
	//Cierra scanner
	
	all.close();
	}
}