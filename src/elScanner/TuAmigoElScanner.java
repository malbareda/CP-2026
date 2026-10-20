package elScanner;
//para usar el scanner se tiene que importar
import java.util.Scanner;

public class TuAmigoElScanner {
	
	public static void main(String[] args) {
		
		//Como declarar un Scanner
		//Magia negra, creanme*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("LEER INTS");
		//leer ints
		int a = sc.nextInt(); //lee el siguiente int
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(a+b+c);
		
		System.out.println("------------------------------");
		//leer doubles
		System.out.println("LEER DOUBLES");
		double da = sc.nextDouble();
		double db = sc.nextDouble();
		double dc = sc.nextDouble();
		
		System.out.println(da*db*dc);
		System.out.println("------------------------------");
		//leer Strings
		
		//SI TU LEES NUMEROS Y LUEGO LINEA DE TEXTO, TIENES QUE PONER UN SC.NEXTLINE SUELTO
		sc.nextLine();
		
		
		System.out.println("LEER STRINGS (lineas de texto)");

		String linea = sc.nextLine();
		System.out.println(linea);
		
		
	}

}
