package tema2;

import java.util.Scanner; //Importamos el java.util que necesitamos

public class Ejercicio6 {

		public static void main(String[] args) {

					//Doy el scanner y las variables necesarias

					Scanner all = new Scanner(System.in);
					
					//Meto las variables necesarias
					
					int a; //Para el coeficiente a
					int b; //Para el coeficiente b
					int c; //Para el coeficiente c
					double resultado; //Para el resultado
					double resultado1; //Para el otro resultado posible 
					
					//Pido la variable a
					
					System.out.println("Introduzca el valor de a");

					//el numero introducido será su valor

					a = all.nextInt();
					
					//Pido la variable b
					
					System.out.println("Introduzca el valor de b");

					//el numero introducido será su valor

					b = all.nextInt();
					
					//Pido la variable c
					
					System.out.println("Introduzca el valor de c");

					//el numero introducido será su valor

					c = all.nextInt();
					
					//Aplico la fórmula y la igualo con el resultado, si es cero, sólo puede tener una solución
					
					   resultado = ((-b) - (4 * a * c)) / (2 * a);
					   if(resultado == 0){
				 
				           System.out.println("La ecuación tiene una solución; cero");
				 
				        //Aunque la ecuación puede tener dos soluciones
				           
				        }if (resultado<0){
				        	
				        	//Puede que no tenga solución en absoluto, en ese caso aviso de que no hay solución
				        	System.out.println("No hay solución");
				        		
				        }
				        else {
				        	
				        	//Si la solución no es 0, entonces tendrá dos; se aplican ambas fórmulas y muestro los resultados
				        	
				        	resultado=(-b+Math.sqrt(resultado)/2*a);
				        	resultado1=(-b-Math.sqrt(resultado/2*a));
				        	
				        	//Muestro el resultado
				        	
				        	System.out.println("La ecuación tiene dos soluciones; " + resultado + " y " + resultado1);
				        }
				        
					   
					   //Cierro scanner
					   
				  all.close();
				}
}