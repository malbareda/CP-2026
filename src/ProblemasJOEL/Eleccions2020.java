package ProblemasJOEL;

import java.util.Scanner;

public class Eleccions2020 {
	
	public static void main(String[] args) {
		
		
		//COM ES L'ENTRADA
		Scanner sc = new Scanner(System.in);
		
		int jiden = sc.nextInt();
		int drump = sc.nextInt();
				
		//COM FUNCIONA L'IF I LA SORTIDA
		if(jiden>drump) {
			System.out.println("Jiden");
		}else if(drump>jiden) {
			System.out.println("Drump");
		}
		
		
	}

}
