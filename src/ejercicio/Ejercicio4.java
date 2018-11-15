package ejercicio;

public class Ejercicio4 {

	public static void main(String[] args) {

		int número = 8128, divisible = 2;

		while (divisible <= número) {

			if (Calcprimo(divisible) == true && número % divisible == 0) {
				número = número / divisible;
				System.out.print(divisible + " ");
				divisible = 2;

			} else {
				divisible++;
			}

		}

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
