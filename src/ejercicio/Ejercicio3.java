package ejercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		boolean correcto=false;
		int número=0, número2=1;
		boolean primo;
		Scanner keyboard=new Scanner(System.in);
		
		
		
		do {
			try {
				/*1-Le pedimos al usuario un número que quiera saber si es primo*/

				System.out.println("Introduce el número que deseas saber si es primo");
				número=keyboard.nextInt();
				correcto = true;
				/*1.1-Controlamos que el usuario mete el dato correcto y si no lo hace volverselo a pedir hasta que lo haga*/
			} catch (InputMismatchException e) {
				System.out.println("Error en la introducción del número");
				correcto = false;
			}

			finally {
				keyboard.nextLine();
			}
		}
		while (!correcto);
		
		primo=Calcprimo(número);
		
		if (primo==true) {
			/*3-Si el número introducido es primo le decimos que si lo es*/
		System.out.printf("El número %d es primo %n", número);
		}
		else {
			/*4-Si el número introducido no es primo le decimos que no lo es*/

			System.out.printf("El número %d no es primo %n", número);
		}
		
		keyboard.close();
		
		/*5- Usando la función hacemos un algoritmo que nos de todos los números primos desde 0 a 10000*/
		
		System.out.println("Los números primos del 1 al 10000 son:");
		
		while (número2<10000) {
			primo=Calcprimo(número2);
		if (primo==true)
			{
			System.out.println(número2);
			}
		número2++;
		}


	}
	/*2- La función se encarga de determinar si el número introducido es primo o no*/

	
	public static boolean Calcprimo(int número) {
		int incremento=0;
		boolean primo=false;
		for (int divisor=1; divisor<=número; divisor++) {
			if (número==1) {
				primo=true;
			}
			
			else if (número%divisor==0) {
				incremento++;
			}
			
		}
		if (incremento==2) {
			primo=true;
		}
		return primo;
	
	}
	
}

