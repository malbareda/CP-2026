package alternativesswitch;

import java.util.Scanner;

public class exempleNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriu quin número de dia és:");
		int dia = sc.nextInt();
		int i = 0;

		switch (dia) {
			case 1:
				System.out.println("Dilluns");
				break;
			case 2:
				System.out.println("Dimarts");
				break;
			case 3:
				System.out.println("Dimecres");
				// Aquí podem fer moltes instruccions
				int numero = 54;
				i++;
				i = i + numero;
				System.out.println("La i val " + i);
				// Hem d'acabar cada "case" amb un break, obligatori.
				break;
			case 4:
				System.out.println("Dijous");
				break;
			case 5:
				System.out.println("Divendres");
				break;
			case 6:
				System.out.println("Dissabte");
				break;
			case 7:
				System.out.println("Diumenge");
				break;

			default:
				System.out.println("No has posat un número correcte");
				break;		
		}
		
		// Fem un exemple amb estacions de l'any:
		System.out.println("Escriu un número de mes");
		int mes = sc.nextInt();
		switch (mes) {
			case 12, 1, 2:
				System.out.println("És hivern");
			break;
			case 3, 4, 5:
				System.out.println("És primavera");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("És estiu");
				break;
			case 9, 10, 11:
				System.out.println("És tardor");
			
			default:
				System.out.println("No has escrit un número de mes correcte");
			
		}
		
		sc.close();
	}
}
