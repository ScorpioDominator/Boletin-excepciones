package ejercicio;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int carta=0, palo=0, total1=0, turno1=1, total2=0, turno2=0;
		boolean AS1=false, rondaJug1=false, repeat1=false, blackjack1=false, AS2=false,
		rondaJug2=false, repeat2=false, blackjack2=false, victoria1=false, victoria2=false, empate=false;
		String añadirCarta;
		
		Random numcarta=new Random();
		Random numpalo=new Random();
		Scanner keyboard= new Scanner(System.in);
		
		
//		carta=(numcarta.nextInt(13)+1);
//		palo=(numpalo.nextInt(4)+1);
		
//		carta=randomcarta(carta);
//		palo=randompalo(palo);
//		
		while (rondaJug1==false) {
			
		carta=randomcarta(carta);
		if (carta==1) {
			AS1=true;
		}
		palo=randompalo(palo);
		System.out.println("Es el turno del primer jugador");
		System.out.println("Su carta es: "+ card(carta) + palo(palo));
		total1+=calctotal(carta);
		if (total1>21 && AS1==true) {
			total1-=10;
			}
		System.out.println("El total del jugador 1 es= "+total1);
		
		
		turno1++;
		
		if (turno1>2) {
			do {
			System.out.println("¿Quieres más cartas?, di \"si\" o \"no\" ");
			añadirCarta=keyboard.nextLine();
			if (añadirCarta.equals("si") || añadirCarta.equals("Si")) {
				rondaJug1=false; repeat1=true;
			}
			if (añadirCarta.equals("no") || añadirCarta.equals("No")) {
				rondaJug1=true; repeat1=true;
			}
		}
			while (repeat1=false);
		
		}
		if (total1==21) {
			blackjack1=true; rondaJug1=true;
		}
	}
		while (rondaJug2==false) {
			
		carta=randomcarta(carta);
		if (carta==1) {
			AS2=true;
		}
		palo=randompalo(palo);
		System.out.println("Es el turno del segundo jugador");
		System.out.println("Su carta es: "+ card(carta) + palo(palo));
		total2+=calctotal(carta);
		if (total2>21 && AS2==true) {
			total2-=10;
		}
		System.out.println("El total del jugador 2 es= "+total2);
		
		turno2++;
		
		if (turno2>2) {
			do {
			System.out.println("¿Quieres más cartas?, di \"si\" o \"no\" ");
			añadirCarta=keyboard.nextLine();
			if (añadirCarta.equals("si") || añadirCarta.equals("Si")) {
				rondaJug2=false; repeat2=true;
			}
			if (añadirCarta.equals("no") || añadirCarta.equals("No")) {
				rondaJug2=true; repeat2=true;
			}
		}
			while (repeat2=false);
		
		}
		if (total2==21) {
			blackjack2=true; rondaJug2=true;
		}
	}
		if (total1>total2 || blackjack1==true) {
			System.out.println("Ha ganado el Jugador 1");
		}
		else if (total2>total1 || blackjack2==true) {
			System.out.println("Ha ganado el Jugador 2");
		}
}
	
	public static String card(int number) {
		String carta=" ";
			if (number==1) {
				carta="AS";
			}
			else if ((number>1) && (number<=10)) {
				carta=Integer.toString(number);
			}
			else if (number==11) {
				carta="Sota";
			}
			else if (number==12) {
				carta="Reina";
			}
			else if (number==13) {
				carta="Rey";
			}
		return carta;
	}
	public static String palo(int number) {
		String palo=" ";
		
			if (number==1) {
				palo=" ♠";
			}
			else if (number==2) {
				palo=" ♥";
			}
			else if (number==3) {
				palo=" ♦";
			}
			else if (number==4) {
				palo=" ♣";
			}
		return palo;
	}
	
	public static int calctotal(int number) {
			int number2=0;
			if (number==1) {
				number2+=11;
			}
			if ((number>1) && (number<=10)) {
				number2+=number;
			}
			if ((number==11) || (number==12) || (number==13)) {
				number2+=10;
			}
		return number2;
	}
	public static int randomcarta(int number) {
		Random numcarta=new Random();
		int carta;
		carta=(numcarta.nextInt(13)+1);
		return carta;
	}
	public static int randompalo(int number) {
		Random numpalo=new Random();
		int palo=(numpalo.nextInt(4)+1);
		return palo;
	}
}
