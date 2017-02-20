package agenda;


import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Agenda {
	
	//Covertir la clase a un ArrayLiast
	static ArrayList<Personas> personas = new ArrayList<>();

	public static void main(String[] args) {
		
		personas.add(new Personas("0","marcos","marcos@gmail.com",44));
		personas.add(new Personas("1","marco","marco@gmail.com",77));
		personas.add(new Personas("2","edgar","edgar@gmail.com",66));
		personas.add(new Personas("3","franco","franco@gmail.com",66));
		
		//Guardar variables
		Scanner per = new Scanner(System.in);
		
		boolean contador= true;
		
		
		do {
			
			//Menu
			
			System.out.println("\n1 Ingresa un contacto");
			System.out.println("2 Mostrar todos los contactos ");
			System.out.println("3 Eliminar persona ");
			//System.out.println("4 Modificar");
			System.out.println("5 Salir");
			
		
		switch (per.nextInt()) {
		case 1:
			
			agregarPersonas(personas);
			
			break;
		case 2 :
			
			mostrarTodos(personas);
			
			break;
		case 3 :
			eliminarPersonas(personas);
			
			break;
		case 4 :
			
			modificarPersona(personas);
			
			break;

		default:
			
			System.out.println("Opcion no valida\n");
			break;
		}
		}while(contador);
		
	}
	
	//Metodo para agregar
	public static void agregarPersonas(ArrayList<Personas> personas) {
		
		int indice=0;
		
		try {
			Scanner per = new Scanner(System.in);
			Personas entrada = new Personas("4", null, null, indice);
			System.out.println("Ingresa tu nombre: ");
			entrada.setNombre(per.nextLine());
			System.out.println("Ingresa tu correo: ");
			entrada.setCorreo(per.nextLine());
			System.out.println("Ingresa tu edad:");
			entrada.setEdad(per.nextInt());
			
			//validacion para que no se dupliquen
			
			
			//Agregar los datos al ArrayList
			personas.add(entrada);
			
			
		} catch (InputMismatchException e) {
			// imprimir ex
			e.printStackTrace();
		}
		
		
		
	}
	
	//Metodo para mostrar
	public static void mostrarTodos(ArrayList<Personas> personas){
		
		for(Personas entrada : personas){
			
			System.out.println("\nEl id es: "+ entrada.getId());
			System.out.println("El nombre es: "+ entrada.getNombre());
			System.out.println("El correo es: "+ entrada.getCorreo());
			System.out.println("La edad es: "+ entrada.getEdad());
		}
	}
	
	//Metodo eliminar
	public static void  eliminarPersonas(ArrayList<Personas> personas){
		Scanner per = new Scanner(System.in);
		String personaNombre= "";
		int indice = 0;
		try {
			System.out.println("Ingresa el id que quiere eliminar: ");
			personaNombre = per.nextLine();
			
			for(Personas pers: personas){
				if (pers.getId().equals(personaNombre)){
					personas.remove(indice);
					for(Personas persona : personas){
						
					}
					break;
				}
				indice++;
				
				//size tamaño del arreglo 
				if(indice==personas.size()){					
					System.out.println("No se encontro el usuario");
				}
			}
			
		} catch (InputMismatchException me) {
			me.printStackTrace();
		}
		
		
		
			
	}
	
	//Metodo para modificar
		public static void modificarPersona(ArrayList<Personas> personas) {
			
			Scanner per = new Scanner(System.in);
			String personaNombre= "";
			int indice = 0;
			
			try {
				
				System.out.println("Ingresa el id que quiere eliminar");
				personaNombre = per.nextLine();
				
				
				
				
				
			} catch (InputMismatchException e) {
				e.printStackTrace();
			}
				
				
			
		}	
			
		}
	
	
