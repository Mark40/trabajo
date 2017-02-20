package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Operaciones operacion = new Operaciones();
	    int numero1,numero2,opcion = 0;
		Scanner entrada = new Scanner(System.in);
		
		
		try{
		
		do {
		
		System.out.println("1 Suma");
		System.out.println("2 Resta");
		System.out.println("3 Multiplicacion");
		System.out.println("4 Division");
		System.out.println("5 Salir");
		opcion=entrada.nextInt();
		
		
		
		switch (opcion) {
		case 1:
			
			System.out.println("Ingresa un numero: ");
			numero1=entrada.nextInt();
			System.out.println("Ingresa un numero: ");
			numero2=entrada.nextInt();
			
			operacion.Suma(numero1,numero2);
				
				
			break;
			
         case 2:
			
			System.out.println("Ingresa un numero: ");
			numero1=entrada.nextInt();
			System.out.println("Ingresa un numero: ");
			numero2=entrada.nextInt();
			
			operacion.Resta(numero1,numero2);
			
			
			break;
			
         case 3:
   			
   			System.out.println("Ingresa un numero: ");
   			numero1=entrada.nextInt();
   			System.out.println("Ingresa un numero: ");
   			numero2=entrada.nextInt();
   			
   			operacion.Multiplicacion(numero1,numero2);
   			
   			break;
   			
         case 4:
  			
             try {	 
             	 
      			System.out.println("Ingresa un numero: ");
      			numero1=entrada.nextInt();
      			System.out.println("Ingresa un numero: ");
      			numero2=entrada.nextInt();
      			
      			operacion.Division(numero1,numero2);
             } catch (ArithmeticException ea){
             	
             	System.out.println("No se puede dividir entre cero!!");
             }
      			
      			break;
			
         case 5:
 			
 			System.out.println("Gracias...");
 			
 			
 			break;
 			
         
 			
         
 			
		default:
			
			System.out.println("Opcion no valida");
			break;			
		}
		} while(opcion<5 || opcion>5);
			
	}catch (Exception e) {
		
		System.out.println("No puedes ingresar letras");
	}
		
	}
	
	}
