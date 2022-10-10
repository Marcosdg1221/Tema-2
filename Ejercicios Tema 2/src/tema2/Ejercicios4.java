package tema2;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicios4 {

		public static void main(String[] args) {

					//Doy el scanner y las variables necesarias

					Scanner all = new Scanner(System.in);
					//Meto las variables necesarias
					
					int numero; //Para el primer número a introducir
					int numero2; //Para el segundo número a introducir
					int posicion; //Para la primera posición
					int posicion2; //Para la segunda posición
					
					//Pido al usuario los números para las variables numero y numero2;
					//Lo que escriba será su valor
					
					System.out.println("Por favor introduce un número");
					numero = all.nextInt();
					System.out.println("Por favor introduce otro número, se mostrará el resultado de menor a mayor");
					numero2 = all.nextInt();
					
					//Si el 1er número es menor que 2, la posición 1 tomará el primer número, y la 2ª posición, el segundo número.
					//Si no, se tomará a la inversa.
					
					if (numero < numero2) {
						posicion = numero;
						posicion2 = numero2;
						
					}
					else
					{	
						posicion = numero2;
						posicion2 = numero;
					}
					
					//Muestro al usuario el resultado, más la posición.
					
					System.out.println("Números introducidos ordenados de menor a mayor; " + posicion + ", " + posicion2);
					
					//Cierra el scanner
					
					all.close();
			}

}
