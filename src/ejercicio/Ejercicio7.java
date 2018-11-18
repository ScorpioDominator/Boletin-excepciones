package ejercicio;

/* 1)Se hace la función que determine el número de la carta de forma aleatoria.
 * 2)Se hace la función que determine el tipo de palo al que pertenece la carta.
 * 3)Se hace la función que organice el número de puntos totales de cada jugador, sumando
 * el número de las cartas anteriormente traidas aleatoriamente.
 * 4)Se organizan los turnos de los jugadores.
 * 5)En caso de que el los dos primeros turnos de cada jugador si uno de ellos saca blackjack gana
 * directamente.
 * 6)En caso de que el número total de puntos de uno de los jugadores se pase de 21, gana automáticamente
 * el jugador contrario.
 * 7)Si no se da ninguno de los casos anteriores el jugador que tenga más puntos gana.
 * 8)Se determina el sistema de apuestas que desde el principio te pide el dinero que apuesta cada uno
 * 	8.1)En si gana un jugador se le suma la puntuación apostada al ganador y se le resta al perdedor
 * 	en caso de ser un blackjack por parte de uno de los jugadores, el ganador suma el doble de la cantidad
 * 	apostada y el perdedor se le resta esa misma cantidad.
 * 9)En caso de que cada jugador se quede sin puntos o decidan no seguir jugando, el juego terminará.
 * */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		int carta = 0, palo = 0, total1 = 0, turno1 = 1, total2 = 0, turno2 = 1, dinero1 = 100, dinero2 = 100, apuesta;
		boolean AS1 = false, rondaJug1 = false, repeat1 = false, blackjack1 = false, AS2 = false, rondaJug2 = false,
				repeat2 = false, blackjack2 = false, victoria1 = false, victoria2 = false, empate = false,
				finJuego = false, repeat3 = false;
		String añadirCarta, seguirJuego;

		Random numcarta = new Random();
		Random numpalo = new Random();
		Scanner keyboard = new Scanner(System.in);
//		try {
		while (dinero1 > 0 && dinero2 > 0 && finJuego == false) {

			System.out.println("El dinero por parte del primer jugador es: " + dinero1
					+ " y por parte del segundo jugador es: " + dinero2);
			do {
				//		8)Se determina el sistema de apuestas que desde el principio te pide el dinero que apuesta cada uno

				System.out.println("¿Cuanto dinero se desea apostar por ambas partes?");
				apuesta = keyboard.nextInt();
				keyboard.nextLine();
			} while (apuesta > (dinero1 / 2) || apuesta > (dinero2 / 2));
			System.out.println("Su apuesta ha sido de: " + apuesta);
			//			4)Se organizan los turnos de los jugadores.
			while (rondaJug1 == false) {

				carta = randomcarta(carta);
				if (carta == 1) {
					AS1 = true;
				}
				palo = randompalo(palo);
				System.out.println("Es el turno del primer jugador");
				System.out.println("Su carta es: " + card(carta) + palo(palo));
				total1 += calctotal(carta);
				if (total1 > 21 && AS1 == true) {
					total1 -= 10;
					AS1 = false;
				}

				System.out.println("El total del jugador 1 es= " + total1);

				if (total1 > 21) {
					System.out.println("Te pasaste");
					rondaJug1 = true;
				}
				//			6)En caso de que el número total de puntos de uno de los jugadores se pase de 21, gana automáticamente
				//			 * el jugador contrario.
				else {

					turno1++;
					//				5)En caso de que el los dos primeros turnos de cada jugador si uno de ellos saca blackjack gana
					//				 * directamente.
					if (turno1 == 2 && total1 == 21) {
						blackjack1 = true;
						rondaJug1 = true;
					}

					else {

						if (turno1 > 2) {
							do {
								/*4.1)Una vez pasado el segundo turno se le pide al jugador si desea obtener más cartas*/
								System.out.println("¿Quieres más cartas?, di \"si\" o \"no\" ");
								añadirCarta = keyboard.nextLine();
								if (añadirCarta.equals("si") || añadirCarta.equals("Si")) {
									rondaJug1 = false;
									repeat1 = true;
								}
								if (añadirCarta.equals("no") || añadirCarta.equals("No")) {
									rondaJug1 = true;
									repeat1 = true;
								}
							} while (repeat1 = false);

						}

					}
				}
			}

			if (total1 < 21) {
				//			4.1)Se organizan los turnos de los jugadores.
				while (rondaJug2 == false) {

					carta = randomcarta(carta);
					if (carta == 1) {
						AS2 = true;
					}
					palo = randompalo(palo);
					System.out.println("Es el turno del segundo jugador");
					System.out.println("Su carta es: " + card(carta) + palo(palo));
					total2 += calctotal(carta);
					if (total2 > 21 && AS2 == true) {
						total2 -= 10;
						AS2 = false;
					}
					System.out.println("El total del jugador 2 es= " + total2);

					//				6.1)En caso de que el número total de puntos de uno de los jugadores se pase de 21, gana automáticamente
					//				 * el jugador contrario.

					if (total2 > 21) {
						System.out.println("Te pasaste");
						rondaJug2 = true;
					}

					else {
						turno2++;
						//					5.1)En caso de que el los dos primeros turnos de cada jugador si uno de ellos saca blackjack gana
						//					 * directamente.
						if (turno2 == 2 && total2 == 21) {
							blackjack2 = true;
							rondaJug2 = true;
						}

						else {

							if (turno2 > 2) {
								/*4.1)Una vez pasado el segundo turno se le pide al jugador si desea obtener más cartas*/
								do {
									System.out.println("¿Quieres más cartas?, di \"si\" o \"no\" ");
									añadirCarta = keyboard.nextLine();
									if (añadirCarta.equals("si") || añadirCarta.equals("Si")) {
										rondaJug2 = false;
										repeat2 = true;
									}
									if (añadirCarta.equals("no") || añadirCarta.equals("No")) {
										rondaJug2 = true;
										repeat2 = true;
									}
//									else if (throw new DataFormatException("Error en la introdicción de datos"));
									

								}
								while (repeat2 = false);

						}
					}
				}

			}
			if (total1 > 21) {
				System.out.println("Ha ganado el jugador 2");
				victoria2 = true;
			} else if (total2 > 21) {
				System.out.println("Ha ganado el jugador 1");
				victoria1 = true;
			}
			//		7)Si no se da ninguno de los casos anteriores el jugador que tenga más puntos gana.
			else if (total1 > total2 || blackjack1 == true) {
				System.out.println("Ha ganado el Jugador 1");
				victoria1 = true;
			} else if (total2 > total1 || blackjack2 == true) {
				System.out.println("Ha ganado el Jugador 2");
				victoria2 = true;
			} else {
				System.out.println("Ambos jugadores han empatado");

			}

			//		8.1)En si gana un jugador se le suma la puntuación apostada al ganador y se le resta al perdedor
			//		 * 	en caso de ser un blackjack por parte de uno de los jugadores, el ganador suma el doble de la cantidad
			//		 * 	apostada y el perdedor se le resta esa misma cantidad.
			if (victoria1 == true) {
				dinero2 -= apuesta;
				dinero1 += apuesta;
				System.out.println(
						"El jugador 1 tiene: " + dinero1 + " puntos y el jugador 2 tiene: " + dinero2 + " puntos");
			} else if (victoria2 == true) {
				dinero1 -= apuesta;
				dinero2 += apuesta;
				System.out.println(
						"El jugador 1 tiene: " + dinero1 + " puntos y el jugador 2 tiene: " + dinero2 + " puntos");
			} else if (blackjack1 == true) {
				dinero2 -= (apuesta * 2);
				dinero1 += (apuesta * 2);
				System.out.println(
						"El jugador 1 tiene: " + dinero1 + " puntos y el jugador 2 tiene: " + dinero2 + " puntos");
			} else if (blackjack2 == true) {
				dinero1 -= (apuesta * 2);
				dinero2 += (apuesta * 2);
				System.out.println(
						"El jugador 1 tiene: " + dinero1 + " puntos y el jugador 2 tiene: " + dinero2 + " puntos");
			} else {
				System.out.println("Ha sido empate, por lo tanto las puntuaciones no se ven alteradas");
			}

			do {
				//	9)En caso de que cada jugador se quede sin puntos o decidan no seguir jugando, el juego terminará,
				//si no, pues continuará, con el contador del dinero de ambos jugadores tal y como ha quedado resultado
				//				de la ronda anterior.
				System.out.println("¿Se desea seguir jugando? \"si\" o \"no\" ");
				seguirJuego = keyboard.nextLine();

				if (seguirJuego.equals("si") || seguirJuego.equals("Si")) {
					finJuego = false;
					repeat3 = true;
					rondaJug1 = false;
					rondaJug2 = false;
					total1 = 0;
					total2 = 0;
					blackjack1 = false;
					blackjack2 = false;
					turno1 = 1;
					turno2 = 1;
					victoria1 = false;
					victoria2 = false;

				} else if (seguirJuego.equals("no") || seguirJuego.equals("No")) {
					finJuego = true;
					repeat3 = true;
					System.out.println("Fin del juego");
				} else {
					System.out.println("Dato introducido erróneo");
					repeat3 = false;
				}

			} while (repeat3 == false);
			repeat3 = false;

		}
//		}
//		catch (DataFormatException e) {System.out.println(e.getMessage());
		}
		keyboard.close();
	}

	//	1)Se hace la función que determine el número de la carta de forma aleatoria.
	public static String card(int number) {
		String carta = " ";
		if (number == 1) {
			carta = "AS";
		} else if ((number > 1) && (number <= 10)) {
			carta = Integer.toString(number);
		} else if (number == 11) {
			carta = "Sota";
		} else if (number == 12) {
			carta = "Reina";
		} else if (number == 13) {
			carta = "Rey";
		}
		return carta;
	}

	//	2)Se hace la función que determine el tipo de palo al que pertenece la carta.
	public static String palo(int number) {
		String palo = " ";

		if (number == 1) {
			palo = " ♠";
		} else if (number == 2) {
			palo = " ♥";
		} else if (number == 3) {
			palo = " ♦";
		} else if (number == 4) {
			palo = " ♣";
		}
		return palo;
	}

	//	3)Se hace la función que organice el número de puntos totales de cada jugador, sumando
	//	 * el número de las cartas anteriormente traidas aleatoriamente.
	public static int calctotal(int number) {
		int number2 = 0;
		if (number == 1) {
			number2 += 11;
		}
		if ((number > 1) && (number <= 10)) {
			number2 += number;
		}
		if ((number == 11) || (number == 12) || (number == 13)) {
			number2 += 10;
		}
		return number2;
	}

	public static int randomcarta(int number) {
		Random numcarta = new Random();
		int carta;
		carta = (numcarta.nextInt(13) + 1);
		return carta;
	}

	public static int randompalo(int number) {
		Random numpalo = new Random();
		int palo = (numpalo.nextInt(4) + 1);
		return palo;
	}

}
