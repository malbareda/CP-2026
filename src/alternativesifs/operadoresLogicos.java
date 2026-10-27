package alternativesifs;

public class operadoresLogicos {
	
	public static void main(String[] args) {
		
		//operador aritmetico, suma es int = int+int;
		
		
		int a = 4;
		int b = 5;
		
		//operador logico es el que el resultado es un booleano
		boolean masGrande = a > b;
		System.out.println("masGrande? "+masGrande);
		boolean masPequeño = a < b;
		System.out.println("masPqueño "+masPequeño);
		boolean masGrandeOIgual = a >= b;
		System.out.println("masGrandeoIgual? "+masGrandeOIgual);
		boolean masPequeñoOIgual = a <= b;
		System.out.println("masPequeñooIgual? "+masPequeñoOIgual);
		boolean igual = a == b; // == implica "igual que"
		System.out.println("igual? "+igual);
		boolean desigual = a != b;
		System.out.println("desigual "+desigual);
		
		boolean contrari = !igual; //! inverteix la variable booleana
		System.out.println("contrari "+contrari);
		
		
		
		//OR  || <- altGr+1
		//SUMAR BOOLEANS
		//en l'or, si un dels dos es true, aleshores es true, si els dos son falses, aleshores es false
		boolean or = true || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false || false;
		System.out.println("or "+or);
		//AND  &&  (shift+6)
		//en l'and, nomes es true si TOTS son true. Si un no ho es, és false
		boolean and = true && true && false;
		System.out.println("and "+and);
		
		
		int num = 0;
		if(num > 0 && num < 100) {
			System.out.println("num entre 0 i 100");
		}else {
			System.out.println("nope");
		}
		
	}

}
