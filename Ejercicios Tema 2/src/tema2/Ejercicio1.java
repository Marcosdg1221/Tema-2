package tema2;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio1 {

public static void main(String[] args) {
		
		//Doy el scanner y las variables necesarias
		
		Scanner all = new Scanner(System.in);
		
		//Meto las variables necesarias
		
		int numero;
		double resto;
		
		System.out.println("Por favor introduce un número, se determinará si es o no par ");
		
		//Lo que escriba el usuario en las siguientes cuestiones serán las respectivas variables

		numero = all.nextInt();
		
		//Ahora, aplicamos la fórmula
		
		resto = numero % 2;
		
		//Si el resto es 0, el número será par, si no, es impar
		
		if (resto == 0) {
			System.out.println("El número es par ");
			
		}
		else
		{	
			System.out.println("El número es impar ");
		}
		
		//Teniendo ya el resultado, mostramos la solución al usuario

		//Cerramos el scanner
		
		all.close();
	}
}
