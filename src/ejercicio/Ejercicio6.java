package ejercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		
		int number1=0, number2=0;
		
		boolean correcto = false, correcto2 = false;
		
		String mensajeN="Introduce el primer divisor", mensajeN2="Introduce el segundo divisor";

		do {
			try {
				/*1-Le pedimos el primer divisor al usuario*/
				System.out.println(mensajeN);
				number1 = keyboard.nextInt();
				correcto = true;
//				if(number1<=0) {
//					System.out.println("Los números como el 0 o números negativos no tienen divisores positivos "
//							+ "Introduce un número superior a 0");
//					correcto=false;
//				}
				
				/*1.1-Nos aseguramos que el número introducido es correcto y lo volvemos a pedir si no lo es*/

			} catch (InputMismatchException e) {
				System.out.println("Número fuera de rango");
				correcto = false;
			}

			finally {
				keyboard.nextLine();
			}
		}

		while (!correcto);
		

		do {
			try {
				/*2-Le pedimos el segundo divisor al usuario*/

				System.out.println(mensajeN2);
				number2 = keyboard.nextInt();
				correcto2 = true;
				
//				if(number2<=0) {
//					System.out.println("Los números como el 0 o números negativos no tienen divisores positivos "
//							+ "Introduce un número superior a 0");
//					correcto2=false;
//				}
				
				/*2.1-Nos aseguramos que el número introducido es correcto y lo volvemos a pedir si no lo es*/

			} catch (InputMismatchException e) {
				System.out.println("Número fuera de rango");
				correcto2 = false;
			}

			finally {
				keyboard.nextLine();
			}
		}

		while (!correcto2);
		
		/*4-Le mostramos el MCD de los números introducidos*/
		
		System.out.println("El Máximo común divisor de los números introducidos es: " + MCD(number1,number2));
		
		
		keyboard.close();
	}
	
	/*3- La función se encarga de determinar el MCD de dos números*/
	
	public static int MCD(int número1, int número2) {
		
		int MCD=0;
		for (int divisor=1; divisor<=número1; divisor++) {
			
			if (número1%divisor==0) {
			if (número2%divisor==0) {
				MCD=divisor;
			}
					
			}
			
			
		}
		return MCD;
	} 
	
}
