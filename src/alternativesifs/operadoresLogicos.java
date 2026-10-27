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
		
		
	}

}
