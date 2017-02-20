package calculadora;

public class Operaciones {
	
	int numero1, numero2, resultado=0;
	
	public void Suma(int a, int b){
		
		this.numero1=a;
		this.numero2=b;
		this.resultado=numero1+numero2;
		
		System.out.println("El resultado es: "+resultado);
		
		
	}
	
     public void Resta(int a, int b){
		
		this.numero1=a;
		this.numero2=b;
		this.resultado=numero1-numero2;
		
		System.out.println("El resultado es: "+resultado);
		
		
	}

     public void Multiplicacion(int a, int b){
	
	    this.numero1=a;
	    this.numero2=b;
	    this.resultado=numero1*numero2;
	
	  System.out.println("El resultado es: "+resultado);
	
}
     public void Division(int a, int b){
 		
 		this.numero1=a;
 		this.numero2=b;
 		this.resultado=numero1/numero2;
 		
 		System.out.println("El resultado es: "+resultado);
 		
 		
 	}

      


}
