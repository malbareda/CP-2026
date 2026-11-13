package ProblemasJOEL;

import java.util.Scanner;

public class segonDeBucles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int casos;

		/*
		 * RESOLUCIÓ UTILITZANT BUCLES FOR
		 */
		
		casos = sc.nextInt();
		// BUCLE PRINCIPAL QUE CONTROLA ELS CASOS
		for (int i=0; i<casos; i++) {
			int num = sc.nextInt();
			
			// BUCLE INTERN QUE ES DEDICA A LLEGIR UN NUMERO I DONAR LA RESPOSTA
			for (int j=0; j<num; j++) {
				// FAIG EL TRACTAMENT DEL NUMERO
				int n = sc.nextInt();
				n = n + 1;
				System.out.println(n);				
			}			
		}
		
		/*
		 * RESOLUCIÓ UTILITZANT BUCLES WHILE
		 */
		
		casos = sc.nextInt();
		while (casos > 0) {

			// Resoldre un cas
			int N = sc.nextInt();
			while (N > 0) {
				int variable = sc.nextInt();
				variable++;
				System.out.println(variable);
				N--;
			}
			casos--;
		}
		
		sc.close();
	}
}
