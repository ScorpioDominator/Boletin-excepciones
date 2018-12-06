package ejercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);

		int divisible = 2, number=0;
		
		boolean correcto = false;
		
		/*1-Le pedimos al usuario un número que quieras descomponer*/
		
		String mensajeN="Introduce el número que deseas descomponer";

		do {
			try {
				System.out.println(mensajeN);
				number = keyboard.nextInt();
				correcto = true;
				
		/*1.1-Controlamos que el usuario mete el dato correcto y si no lo hace volverselo a pedir hasta que lo haga*/
				
				if (number<=0) {
					System.out.println("Los números como el 0 o negativos no están compuestos por números primos "
							+ "vuelve a introducir un número esta vez superior a 0");
					correcto=false;
				}

			} catch (InputMismatchException e) {
				System.out.println("Error en la introducción del número");
				correcto = false;
			}

			finally {
				keyboard.nextLine();
			}
		}

		while (!correcto);


		while (divisible <= number) {

			if (Calcprimo(divisible) == true && number % divisible == 0) {
				number = number / divisible;
				
				/*Pasamos por pantalla aquellos números por los que sean divisibles el número dado por el usuario*/
				
				System.out.print(divisible + " ");  /*el " " determina que divisible aparecerá las veces que sea necesaria*/
				divisible = 2;

			} else {
				divisible++;
			}

		}
		
		keyboard.close();

	}
	/*2- La función se encarga de determinar si el número introducido es primo o no*/
	public static boolean Calcprimo(int número) {
		int incremento=0;
		boolean primo=false;
		for (int divisor=1; divisor<=número; divisor++) {
//			if (número==1) {
//				primo=true;
//			}
			
			if (número%divisor==0) {
				incremento++;
			}
			
		}
		if (incremento==2) {
			primo=true;
		}
		return primo;
	
	}

}
