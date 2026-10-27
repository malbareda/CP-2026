package ProblemasJOEL;

import java.util.Scanner;

public class Eleccions20203 {
	
	public static void main(String[] args) {
		
		
		//COM ES L'ENTRADA
		Scanner sc = new Scanner(System.in);
		
		int jiden = sc.nextInt();
		int drump = sc.nextInt();
		int banders = sc.nextInt();
				
		//COM FUNCIONA L'IF I LA SORTIDA
		if(jiden>drump && jiden>banders) {
			System.out.println("Jiden");
		}else if(drump>jiden && drump>banders) {
			System.out.println("Drump");
		}else if(banders>jiden && banders>drump) {
			System.out.println("Banders");
		}
		
		
	}

}
