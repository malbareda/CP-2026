package alternativesifs;

public class ElTeuAmicElseIf {
	
	public static void main(String[] args) {
		
		
		//if
		
		//if(BOOLEA){
			//cosa que passa si la condicio es TRUE
			//mes coses que passen si la condicio es TRUE
			//encara mes coses
		//}else if(BOOLEA2){
			//cosa que passa si BOOLEA es FALSE i BOOLEA2 ES TRUE
			//només si es compleixen les dues coses
		//}else{
			//coses que passen si la condicio es FALSE
			//mes coses que passen si la condicio es FALSE
			// etc
		//}
		
		boolean b = true;
		
		int a = 4;
		int c = 3;
		
		if(a>c) {
			System.out.println("A");
		}else if(c>a){
			System.out.println("C");
		}else {
			System.out.println("IGUALES");
		}
		
		
		
		
		int q = 11;
		int t = 20;
		
		if(q>10) {
			System.out.println("Q MAYOR 10");
		}else if(t>10) {
			System.out.println("T MAYOR 10");
		}else {
			System.out.println("NINGUNO MAYOR 10");
		}
		
		
	}

}
