
public class VariablesInt {
	
	public static void main(String[] args) {
		
		int a = 0;
		
		//nomes poses el tipus quan la declares, despres no poses mai el tipus
		a = 10;
		
		System.out.println("1.");
		System.out.println(a);
		System.out.println("-----------");
		
		a = 4 + 3;
		System.out.println("2.");	
		System.out.println(a);
		System.out.println("-----------");
		
		a = 4 + a; //las variables se pueden acumular
		System.out.println("3.");	
		System.out.println(a);
		System.out.println("-----------");
		
		a = a + a;
		System.out.println("4.");	
		System.out.println(a);
		System.out.println("-----------");
		
		a = 5;
		//(22 * 22) + 22
		a = a * a + a;
		System.out.println("5.");	
		System.out.println(a);
		System.out.println("-----------");
	}

}
