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
				System.out.println(mensajeN);
				number1 = keyboard.nextInt();
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
		

		do {
			try {
				System.out.println(mensajeN2);
				number2 = keyboard.nextInt();
				correcto2 = true;

			} catch (InputMismatchException e) {
				System.out.println("Número fuera de rango");
				correcto2 = false;
			}

			finally {
				keyboard.nextLine();
			}
		}

		while (!correcto2);
		
		System.out.println(MCD(number1,number2));
		
		

	}
	
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
