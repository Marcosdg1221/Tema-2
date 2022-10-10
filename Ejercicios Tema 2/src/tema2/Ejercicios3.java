package tema2;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicios3 {

	public static void main(String[] args) {

		//Doy el scanner y las variables necesarias

				Scanner all = new Scanner(System.in);
				//Meto las variables necesarias, que será un double, ya que necesitamos decimales.
				
				double numero;
				
				//Pido al usuario un número decimal
				
				System.out.println("Por favor introduce un número decimal");
				
				//El valor de la variable será ese número
				
				numero = all.nextDouble();
				
				//Hago la operación AND de que, si el número introducido es menor que uno pero mayor que -1,
				//Se mostrará que el número es casi 0, si no, no lo es.
				
				if (numero < 1 && numero > -1) {
					if (numero == 0) {
						System.out.println("El número es 0");
					}
					else  {
					System.out.println("El número es casi 0");
					
				}
				}
				else
				{	
					System.out.println("El número no es casi 0 ");
				}
				
				//Cerramos el scanner
				
				all.close();
		}
}
	
