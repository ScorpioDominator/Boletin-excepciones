package ejercicio;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int número1=85, número2=40;
		
		System.out.println(MCD(número1,número2));
		
		

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
