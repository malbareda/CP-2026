package introbucles;

import java.util.Scanner;

public class IntroduccioWhile {
	
	
	public static void main(String[] args) {
		
		//nosaltres coneixem un if
		//if(condicio booleana){
		// el que es fa si la condicio es true
		// }
		
		
		//while(condicio booleana){
		//   Es repeteix aixo si la condicio es true
		//}
		
		if(4<5) {
			System.out.println("A");
		}
		
		//while(4<5) {
			//el programa NUNCA llega al final porque se queda atrapado en el bucle
			//eso se llama bucle infinito
			//System.out.println("A");
		//}
		
		//la gracia dels bucles es que la condició canvii
		//es a dir, la condicio es modifica dintre del mateix bucle
		
		int a = 1; //contador
		while(a<10) {
			
			System.out.println(a);
			a++; //a = a+1;
		}
		
		
		//bucle para verificar
		System.out.println("----------------------");
		System.out.println("bucle para verificar");
		Scanner sc = new Scanner(System.in);
		
		//GENERALMENTE CUANDO QUIERES HACER UN BUCLE PARA VERIFICAR LA PRIMERA VEZ LEES FUERA DEL BUCLE
		int loQueHemosLeido = sc.nextInt();
		while(loQueHemosLeido!=0) { //RECORDAD; ES LA CONDICION DE ESTAR DENTRO, NO LA DE SALIR
			
			System.out.println("No hemos leido un 0, hemos leido un "+loQueHemosLeido);
			System.out.println("dime otro numero");
			loQueHemosLeido = sc.nextInt();
		}
		
	}

}
