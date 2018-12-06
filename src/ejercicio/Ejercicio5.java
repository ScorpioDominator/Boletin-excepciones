package ejercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		
		int number=0;
		
		boolean correcto = false;
		
		/*1-Le pedimos al usuario un número que quiera saber si es perfecto*/
		
		String mensajeN="Introduce el número que deseas saber si es perfecto";

		do {
			try {
				
		/*1.1-Controlamos que el usuario mete el dato correcto y si no lo hace volverselo a pedir hasta que lo haga*/
				
				System.out.println(mensajeN);
				number = keyboard.nextInt();
				correcto = true;
				

			} catch (InputMismatchException e) {
				System.out.println("Error en la introducción del número");
				correcto = false;
			}

			finally {
				keyboard.nextLine();
			}
		}

		while (!correcto);

		/*3-Sólo si el número introducido es perfecto le decimos que si lo es*/
		if (perfecto(number)==true) {
			System.out.println("El número introducido es perfecto");
			}
		else {System.out.println("El número introducido no es perfecto");}
		
		/*5- Imprimimos todos los números perfectos desde el 1 al 10000 y sus respectivos divisores*/
		for(number=1; number<=10000-1; number++) {
			
		if (perfecto(number)==true) {
			System.out.println("El número es: " +number+ " y sus divisores son: ");
			printdivisores(number);
		}
		}
		
		keyboard.close();

	}
	
	/*2- La función se encarga de determinar si el número introducido es perfecto o no*/

	public static boolean perfecto (int number) {
		
		int result=number;
		boolean perfecto=false;
		
		for (int divisor=1; divisor<=number-1; divisor++) {
			if (number%divisor==0) {
				result-=divisor;
			}
			if (result==0) {
				perfecto=true;
			}
			else if (result!=0) {
				perfecto=false;
			}
		
			
		}
		return perfecto;
	}
	
	/*4- La función se encarga de determinar los divisores de un número dado*/
	
	public static void printdivisores (int number){
		
		for (int divisor=1; divisor<=number-1; divisor++) {
			if (number%divisor==0) {
				System.out.printf("%d %n", divisor);
				
			}
		}
	}
}
