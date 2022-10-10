package tema2;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio9 {

	public static void main(String[] args) {

//Doy el scanner y las variables necesarias

Scanner all = new Scanner(System.in);
//Meto las variables necesarias

	int j1,j2; //Para el jugador uno y dos
	final int piedra = 1; //El valor de piedra será uno
	final int papel = 2; //El valor de papel será dos
	final int tijera = 3; //El valor de tijera será tres
	
	//Pido al usuario que introduzca 1,2 o 3, explicando que cada uno equivale a piedra, papel o tijera.
	
	System.out.println("Jugador uno, comienza con el juego de piedra papel o tijera, equivalen 1,2 y 3 respectivamente");
	
	//jugador uno toma el valor
	
	j1 = all.nextInt();
	System.out.println("Jugador dos, introduzca piedra papel o tijera");
	
	//jugador dos toma el valor
	
	j2 = all.nextInt();
	
	if (j1 == j2) {
		System.out.println("Empate");
	}
	
	//Si los dos valores son los mismos, será empate, si no, se toman las siguientes condiciones;
	
	if (j1 == 2 && j2 == 1) {
		
		//Si j1 introdujo 2 y j2 introdujo uno, papel gana a piedra y gana j1, muestro resultado
		
		System.out.println("Ganó el jugador 1");
	}
	if (j1 == 2 && j2 == 3) {
		
		//Si j1 introdujo 2 y j2 introdujo tres, tijera gana a papel y gana j2,, muestro resultado
		
		System.out.println("Ganó el jugador 2");		
	}
	if (j1 == 3 && j2 == 1) {
		
		//Si j3 introdujo 3 y j2 introdujo uno, piedra gana a tijeras y gana j2,, muestro resultado
		
		System.out.println("Ganó el jugador 2");
	}
	if (j1 == 3 && j2 == 2) {
		
		//Si j3 introdujo 3 y j2 introdujo dos, papel gana a piedra y gana j1, muestro resultado
		
		System.out.println("Ganó el jugador 1");
	}
	if (j1 == 1 && j2 == 2) {
		
		//Si j1 introdujo uno y j2 introdujo 2, papel gana a piedra y gana j2, muestro resultado
		
		System.out.println("Ganó el jugador 2");
	}
	if (j1 == 1 && j2 == 3) {
		
		//Si j3 introdujo 1 y j2 introdujo tres, piedra gana a tijeras y gana j1, muestro resultado
		
		System.out.println("Ganó el jugador 1");
		
		//Si el usuario introdujo algo distinto de 1,2 o 3 en j1 o j2, aviso al usuario
		
	}
	if (j1 < 1 | j2 < 1 | j1 > 3 | j2 > 3)  {
		System.out.println("Por favor, elija sólo 1, 2 o 3");
	}
	
	//Cerramos scanner
	
	all.close();
	}
	
}
