package ejercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		
		int number=0;
		
		boolean correcto = false;
		
		String mensajeN="Introduce el número que deseas saber si es perfecto";

		do {
			try {
				System.out.println(mensajeN);
				number = keyboard.nextInt();
				correcto = true;

			} catch (InputMismatchException e) {
				System.out.println("Número fuera de rango");
				correcto = false;
			}

			finally {
				keyboard.nextLine();
			}
		}

		while (!correcto);

		
		if (perfecto(number)==true) {
			System.out.println("El número introducido es perfecto");
			}
		for(number=1; number<=10000-1; number++) {
			
		if (perfecto(number)==true) {
			System.out.println("El número es: " +number+ " y sus divisores son: ");
			printdivisores(number);
		}
		}
		
		

	}
	
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
	public static void printdivisores (int number){
		
		for (int divisor=1; divisor<=number-1; divisor++) {
			if (number%divisor==0) {
				System.out.printf("%d %n", divisor);
				
			}
		}
	}
}
