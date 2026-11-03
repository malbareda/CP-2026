package alternativesifs;

public class modulos {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;
		
		System.out.println(a/b); //el resultado de la division, quociente, divisor, dividendo
		System.out.println(a%b); //el residuo
		
		
		//PARA QUE SIRVE EL RESIDUO?
		
		
		int par = 233281903;
		
		if(par%2==0) {
			System.out.println(par+" ES PAR");
		}else {
			System.out.println(par+ " ES IMPAR");
		}
		
		
		//pero no te lo haria con decimales?
		
		System.out.println("---Pero no te lo haria con decimales?");
		double entero = 5.0/2;
		System.out.println(entero);
		
		//en una division si el numerador y el denominador (el de arriba y el de abajo) son enteros, la division es entera y sale recortada. RECORDATADA, NO REDONEADA
		//si uno de los dos (o los dos) son dobles (decimales) entonces el resultado es doble (decimal)
		
		//VALE PERO PARA QUE MAS SIRVE EL RESIDUO
		
		long segundos = 846551231;
		
		long minutos = segundos/60;
		long segundosSobrantes = segundos%60;
		
		long horas = minutos/60;
		long minutosSobrantes = minutos%60;
		
		
		System.out.println(segundos + " segundos equivalen a "+horas+ " horas " + minutosSobrantes + " minutos "+segundosSobrantes+ " segundos");
		long dias = horas / 24;
		long horasSobrantes = horas % 24;
		
		long anos = dias / 365;
		long diasSobrantes = dias % 365;
		System.out.println(segundos + " segundos equivalen a "+anos+ " años "+diasSobrantes+" dias "+ horasSobrantes+ " horas " + minutosSobrantes + " minutos "+segundosSobrantes+ " segundos");
		
		
		
	}

}
