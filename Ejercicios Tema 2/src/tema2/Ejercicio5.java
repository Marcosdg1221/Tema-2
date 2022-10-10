package tema2;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio5 {

		public static void main(String[] args) {

					//Doy el scanner y las variables necesarias

					Scanner all = new Scanner(System.in);
					
					//Meto las variables necesarias
					
					int numero;
					int numero2;
					int numero3;
					
					//Para los números que se pedirá al usuario
					
					int posicion;
					int posicion2;
					int posicion3;
					
					//Para sus posiciones
					
					System.out.println("Por favor introduce un número");
					
					//Pido al usuario un número, y lo que escriba será su valor
					
					numero = all.nextInt();
					System.out.println("Por favor introduce otro número");
					
					//Pido al usuario el segundo número, y lo que escriba será su valor
					
					numero2 = all.nextInt();
					
					//Pido al usuario el otro número, y lo que escriba será su valor
					
					System.out.println("Por favor introduce un último número, se mostrará el resultado de menor a mayor");
					numero3 = all.nextInt();
					
					//Si el número1 es mayor que el dos, y este mayor que 3, el dos tomará la segunda posición. 
					//El 3 la última y el 1 la primera
					
					if (numero > numero2) {
						posicion = numero;
						if (numero2 > numero3) {
						posicion2 = numero2;
						posicion3 = numero3;
						}
						
					//Si el 3 es mayor que dos, el tres tomará la primera, el dos la segunda y el 1 la primera
						
						else {
							posicion2 = numero3;
							posicion3 = numero2;
						}
							
					//Si el num1 es menor que el dos, y si el num3 es menor que 3, la posición1 será para el dos 
					//la pos2 para el uno y el otro para el tres.
						
					}
					else {
					if (numero > numero3) {
						posicion = numero2;
						posicion3 = numero3;
						posicion2 = numero;
						
					}
					
					//Si el tres es mayor que el dos, la pos3 será el 3, el dos será la pos2, y el uno la última
					
					else if (numero3 > numero2) {
						posicion2 = numero2;
						posicion = numero3;
						posicion3 = numero;
					}
					
					//Si el dos es mayor que el tres, el tres tomará la pos2, el dos la pos1 y el uno la última  
					
					else {
						posicion2 = numero3;
						posicion = numero2;
						posicion3 = numero;
						}
					}
					
					//Muestro el resultado con sus posiciones
					
				System.out.print("Números introducidos ordenados de mayor a menor; " + posicion + ", " + posicion2 + ", " + posicion3);
				
				//Cierra el scanner
				
				all.close();
		}
}