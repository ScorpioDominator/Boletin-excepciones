package ejercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);

		int divisible = 2, number=0;
		
		boolean correcto = false;
		
		String mensajeN="Introduce el número que deseas descomponer";

		do {
			try {
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


		while (divisible <= number) {

			if (Calcprimo(divisible) == true && number % divisible == 0) {
				number = number / divisible;
				System.out.print(divisible + " ");
				divisible = 2;

			} else {
				divisible++;
			}

		}
		
		keyboard.close();

	}
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
