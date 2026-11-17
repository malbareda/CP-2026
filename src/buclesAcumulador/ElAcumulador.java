package buclesAcumulador;

import java.util.Random;
import java.util.Scanner;

public class ElAcumulador {
	
	public static void main(String[] args) {
		
		//contador
		//tipo: int
		//funcion: contar
		//a++; o a--;
		
		//Acumulador
		//tipo: int, double, String
		//funcion: acumular
		//acc = acc + ALGO    o   acc = acc - ALGO;
		
		System.out.println("acumulador estatico");
		//me llegan 5 numeros
		//tengo que sumarlos
		Scanner sc = new Scanner(System.in);
		int acc = 0;
		for(int i=0;i<5;i++) {
			int numero = sc.nextInt();
			acc = acc + numero;
		}
		System.out.println(acc);
		
		System.out.println("acumulador hasta que pasa algo");
		//me llegan numeros hasta que leo un numero negativo
		//tengo que sumarlos
		int acc2 = 0;
		int numero = sc.nextInt();
		while(numero>=0) {
			acc = acc+numero;
			numero = sc.nextInt();
		}
		System.out.println(acc);
		
		
		System.out.println("acumulador negativo");
		
		int perrosCalientes = 100;
		Random r = new Random();
		while(perrosCalientes>0) {
			System.out.println("viene un cliente");
			int numeroAleatorio = r.nextInt(0,21);
			perrosCalientes = perrosCalientes - numeroAleatorio;
			System.out.println("me quedan "+perrosCalientes+" perros");
		}
		
		
	}

}
