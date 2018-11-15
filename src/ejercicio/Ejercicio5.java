package ejercicio;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		int number=6;
		
//		if (perfecto(number)==true) {
//			System.out.println("oh si");}
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
