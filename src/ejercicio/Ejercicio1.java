package ejercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 1) Pedimos los números y el carácter al usuario
 * 2) Nos aseguramos de que si sale alguna excepción esta sea notificada
 * 3) En caso de no haber excepciones se ejecuta la operación matemática deseada*/

public class Ejercicio1 {

	public static void main(String[] args) {

		int number1, number2, calc, resultado = 0, total;
		String string1;

		Scanner keyboard = new Scanner(System.in);

		//		1) Pedimos los números y el carácter al usuario

		try {
			System.out.println("Introduce el primer número");
			number1 = keyboard.nextInt();
			keyboard.nextLine();

			System.out.println("Introduce el segundo número");
			number2 = keyboard.nextInt();
			keyboard.nextLine();

			do {

				System.out.println("Introduce 1, para sumar, 2, para restar, 3, para multiplicar y 4 para dividir");
				string1 = keyboard.nextLine();

				calc = Integer.parseInt(string1);

				total = calculadora(number1, number2, calc, resultado);
			} while (calc < 0 || calc >= 5);

			/* 3) En caso de no haber excepciones se ejecuta la operación matemática deseada*/

			System.out.printf("El resultado es= %d %n", total);

		}
		/*2) Nos aseguramos de que si sale alguna excepción esta sea notificada*/

		catch (InputMismatchException e) {
			System.out.println("El parámetro introducido no es un número");
		} catch (NumberFormatException e) {
			System.out.println("El parámetro introducido no es un número");
		}

		finally {
			keyboard.close();
		}

	}

	public static int calculadora(int number1, int number2, int calc, int resultado) {
		if (calc == 1) {
			resultado = number1 + number2;
		} else if (calc == 2) {
			resultado = number1 - number2;
		} else if (calc == 3) {
			resultado = number1 * number2;
		} else if (calc == 4) {
			resultado = number1 / number2;
		}
		return resultado;
	}

}



