package introbucles;

import java.util.Scanner;

public class introduccioFor {
	
	public static void main(String[] args) {
		
		//bucle for
		
		//es un bucle que sirve para hacer una cosa en concreto
		//que es cuando sabes donde esta el inicio y donde esta el final
		
		//i es el contador, se llama siempre i por convenio
		//for(int i = VALOR_INICIAL; CONDICION DE MANTENERSE (que casi siempre sera i< VALOR FINAL) ; Incremento (que casi siempre sera i++)){
		
		System.out.println("For de inicio a fin");
		for(int i=0;i<5;i++) { //compta de 0 a 5
			System.out.println("A");
		}
		
		for(int i=0;i<5;i++) { //compta de 0 a 5
			System.out.println(i);  //la i no només serveix per comptar, es pot utilitzar!
		}
		
		System.out.println("El final es indeterminado");
		
		Scanner sc = new Scanner(System.in);
		int fin = sc.nextInt();
		
		for(int i=0;i<fin;i++) { //compta de 0 a fin, no sabem que es fin,pero sabem que entrara per teclat i es una variable
			System.out.println(i);
		}
		System.out.println("-----------");
		for(int i=0;i<fin;i++) { //compta de 0 a fin...
			System.out.println(fin-i); //pero aqui sortirà al reves
		}
		
		System.out.println("el inicio es indetermiando");
		
		int inicio = sc.nextInt();
		
		for(int i = inicio; i<10;i++) {  //compta de inicio a 10, inicio vindra per teclat
			System.out.println(i);
		}
		
		
		System.out.println("PERO OJO QUE PODEMOS CONTAR HACIA ATRAS");
		inicio = sc.nextInt();
		
		for(int i = inicio;i>=0;i--) {
			System.out.println(i);
		}
		
		System.out.println("Y DE FORMAS RARAS TAMBIEN");
		for(int i=0;i<10;i=i+2) {
			System.out.println(i);
		}
		System.out.println("-----------");
		for(int i=1;i<100;i=i+i) {
			System.out.println(i);
		}
		System.out.println("-----------");
		for(int i=1;i<100;i=i*2) {
			System.out.println(i);
		}
		System.out.println("-----------");
		for(int i=2;i<1000;i=i*i) {
			System.out.println(i);
		}
		
		
	}

}
