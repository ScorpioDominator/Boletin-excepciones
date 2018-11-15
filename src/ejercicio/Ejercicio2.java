package ejercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 1) Pedimos al usuario si quiere trabajar con enteros o con decimales
 * 2) Pedimos los números y el carácter al usuario
 * 3) Nos aseguramos de que si sale alguna excepción esta sea notificada
 * 4) En caso de no haber excepciones se ejecuta la operación matemática deseada*/

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int number1, number2;
		double numberA, numberB;
		String string1, string2, total;
		boolean operadorI=true, operadorD=true, selector=true;

		/*3) Nos aseguramos de que si sale alguna excepción esta sea notificada*/
		try {
		/* 1) Pedimos al usuario si quiere trabajar con enteros o con decimales*/
		
		do {
		System.out.println("¿Desea trabajar con \"enteros\" o con \"decimales\"?");
		string1 = keyboard.nextLine();
		if (string1.equals("enteros")) {
			
			/* 2) Pedimos los números y el carácter al usuario tipo Int*/	
			System.out.println("Introduce el primer entero");
			number1 = keyboard.nextInt();
			keyboard.nextLine();
			System.out.println("Introduce el segundo entero");
			number2 = keyboard.nextInt();
			keyboard.nextLine();
			do {
				System.out.println("introduce \"suma\" \"resta\" \"multiplicar\" o \"dividir\" ");
				string2 = keyboard.nextLine();
				if (string2.equals("suma") || string2.equals("resta") || string2.equals("multiplicar") || string2.equals("dividir"))
					{operadorI=true;
				}
				else {operadorI=false;}
				
			} while (operadorI==false);
				
			selector=true;
			total = CalcInt(number1, number2, string2);
			System.out.printf("El total es=%s, %n", total);
		}
		
		else if (string1.equals("decimales")) {
			
			/* 2) Pedimos los números y el carácter al usuario tipo double*/	
			System.out.println("Introduce el primer entero");
			numberA = keyboard.nextDouble();
			keyboard.nextLine();
			System.out.println("Introduce el segundo entero");
			numberB = keyboard.nextDouble();
			keyboard.nextLine();
			do {
				System.out.println("introduce \"suma\" \"resta\" \"multiplicar\" o \"dividir\" ");
				string2 = keyboard.nextLine();
				if (string2.equals("suma") || string2.equals("resta") || string2.equals("multiplicar") || string2.equals("dividir"))
					{operadorD=true;
				}
				else {operadorD=false;}
				
			} while (operadorD==false);
			
			selector=true;
			total = CalcDou(numberA, numberB, string2);
			System.out.printf("El total es=%s, %n", total);
		}
		else {selector=false;}
		}
		while (selector=false);
		}
		catch (InputMismatchException e) {
			System.out.println("El parámetro introducido no es un número");
		}
		
		catch (NumberFormatException e) {
			System.out.println("El parámetro introducido no es un número");
		}
		finally {keyboard.close();}

	}

	public static String CalcInt(int number1, int number2, String condition) {

		Integer total = 0;
		String operation;
		switch (condition) {
		case "suma":
			total = number1 += number2;
			break;
		case "resta":
			total = number1 -= number2;
			break;
		case "multiplicar":
			total = number1 *= number2;
			break;
		case "dividir":
			total = number1 /= number2;
			break;
		}

		operation = Integer.toString(total);
		return operation;

	}
	public static String CalcDou(double number1, double number2, String condition) {

		Double total = 0.0;
		String operation;
		switch (condition) {
		case "suma":
			total = number1 += number2;
			break;
		case "resta":
			total = number1 -= number2;
			break;
		case "multiplicar":
			total = number1 *= number2;
			break;
		case "dividir":
			total = number1 /= number2;
			break;
		}
		

		operation = Double.toString(total);
		return operation;
	}
	
	

}
