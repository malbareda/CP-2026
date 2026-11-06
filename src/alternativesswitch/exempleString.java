package alternativesswitch;

import java.util.Scanner;

public class exempleString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Què vols fer? (cafe/cine/sopar)");
		String txt = sc.nextLine();
		
		switch (txt) {
		case "cafe":
			System.out.println("Anem al bar");
			break;
		case "cine":
			System.out.println("Quina pelicula vols?");
			break;
		case "sopar":
			System.out.println("Vols un sushi?");
			break;
		
		default:
			System.out.println("No has posat una opció vàlida");
		
		}
		sc.close();
	}

}
