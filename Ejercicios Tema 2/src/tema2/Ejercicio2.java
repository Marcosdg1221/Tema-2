package tema2;


import java.util.Scanner; //Importamos el java.util que necesitamos


public class Ejercicio2 {

	public static void main(String[] args) {

//Doy el scanner y las variables necesarias

		Scanner all = new Scanner(System.in);

		//Meto las variables necesarias
		
		int numero;
		int numero2;

		//Pido al usuario los números necesarios
		
		System.out.println("Por favor introduce un número ");
		
		//Lo que ponga el usuario será su valor
		
		numero = all.nextInt();
		
		System.out.println("Por favor introduce otro número, se determinará si son iguales ");
		
		//Lo mismo en este caso
		
		numero2 = all.nextInt();
		
		//Si el número es equivalente al segundo, se cumplirá la condición;
		// Se mostrará el print de if, si no, el de else
		
		if (numero == numero2) {
			System.out.println("Los numeros son iguales ");
			
		}
		else
		{	
			System.out.println("Los numeros son diferentes ");
		}
		
		//Cerramos el scanner
		
				all.close();

}
}