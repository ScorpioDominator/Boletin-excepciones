package ejercicio;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int número, número2=1;
		boolean primo;
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("Introduce el número que deseas que sea primo");
		número=keyboard.nextInt();
		
		primo=Calcprimo(número);
		
		if (primo==true) {
		System.out.printf("El número %d es primo %n", número);
		}
		else {
			System.out.printf("El número %d no es primo %n", número);
		}
		
		
		keyboard.close();
		
		while (número2<10000) {
			primo=Calcprimo(número2);
		if (primo==true)
			{
			System.out.println(número2);
			}
		número2++;
		}


	}
	
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

