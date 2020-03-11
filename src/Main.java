/*
* @author: Hansel Lopez 19026 & Eduardo Ramírez 19946
*	Hoja de Trabajo #6
*	Algoritmos y estructuras de datos 
*/

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.ArrayList;


public class Main{

    public static void main(String [] args) {
		
		ArrayList<String> nombresCartas = new ArrayList<String>();
		ArrayList<String> tipos = new ArrayList<String>();
		Map<String, String> map = null;
    	Scanner sc = new Scanner(System.in);
    	String input = null;
		MapFactory factory = new MapFactory();
		int opt;
		Iterator<String> it;
		String nombre;
		String tipo;
		boolean valido = false;

    	fileRead file = new fileRead();

    	System.out.println("________________________________________________________--");
    	System.out.println("                 Hoja de Trabajo 6");
    	System.out.println("________________________________________________________--\n");
    	System.out.println("Que implementacion de MAP desea utilizar: \n");
    	System.out.println("Escribir: 'HashMap', 'TreeMap' o 'LinkedHashMap'");
		
		//Solicitando datos
		while(map == null){
			input = sc.nextLine();		
			map = factory.getMap(input);//Instanciando MAP elegido por medio patron factory
		}
		
    	
		nombresCartas = file.Reader(); //Separando todos los nombres de cartas del archivo txt
		tipos = file.Reader2(); //Separando todos los tipos de cartas del archivo txt

		//Agregando todas las llaves y valores al mapa seleccionado
		
		
		// Se imprime el Map con un Iterador
		it = map.keySet().iterator();
		while(it.hasNext()){
  			String key = it.next();
  			System.out.println("Nombre Carta: " + key + " -> Tipo: " + map.get(key));	
		}
        System.out.println("\n -- Fin de la ejecucion...");


		//Menu de opciones disponibles
		System.out.println("MENU:");
        System.out.println("________________________________________________________--");
        System.out.println("1. Agregar una carta a la coleccion");
        System.out.println("2. Mostrar el tipo de una carta específica en la coleccion");
        System.out.println("3. Mostrar el nombre, tipo y cantidad de cada cartas en la coleccion");
        System.out.println("4. Mostrar el nombre, tipo y cantidad de cada cartas que tiene en su colección, ordenadas por tipo.");
        System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes.");
        System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.");
        System.out.println("________________________________________________________--");
		System.out.println("Seleccione una opcion:");
		opt = sc.nextInt();

		if (opt == 1) {
			System.out.println("1. Agregar una carta a la coleccion");
			
			for(int i=0; i<nombresCartas.size();i++){
				map.put(nombresCartas.get(i),tipos.get(i));
			}
			while(valido == false){
				System.out.println("");
				System.out.println("Ingrese el nombre de la carta que desea agregar: ");
				nombre = sc.nextLine();

				System.out.println("");
				tipo = sc.nextLine();
				System.out.println("Ingrese el tipo de la carta que desea agregar: ");
				tipo = sc.nextLine();
				if(map.containsValue(tipo)){
					map.put(nombre,tipo);
					it = map.keySet().iterator();
					while(it.hasNext()){
						String key = it.next();
						System.out.println("Nombre Carta: (" + key + ") -> Tipo: (" + map.get(key)+")");   
					}
					System.out.println("\n-Se ha agregado con exito");
					valido = true;
				}else{
					System.out.println("-Lo siento... El tipo que desea agregar no exite en el juego...");
					continue;
				}
			}
		}

	   if (opt == 2) {

			System.out.println("2. Mostrar el tipo de una carta especifica en la coleccion");           

            for(int i=0; i<nombresCartas.size();i++){
                map.put(nombresCartas.get(i),tipos.get(i));
            }

			System.out.println("Ingrese la carta que desea consultar: ");
			
			input = sc.nextLine();
			input = sc.next();
			System.out.println((map.get(input)));
			
		
		   
	   }

	   if (opt == 3) {

			System.out.println("3. Mostrar el nombre, tipo y cantidad de cada carta en la coleccion");
			
             
			for(int i=0; i<nombresCartas.size();i++){
				map.put(nombresCartas.get(i),tipos.get(i));
			}

			it = map.keySet().iterator();
			while(it.hasNext()){
			   String key = it.next();
			   System.out.println("Nombre Carta: " + key + " -> Tipo: " + map.get(key));
			}

			System.out.println("---------------------------------");

			System.out.println("Hay: "+map.size() + " cartas en su coleccion");

		   
	   }

	   if (opt == 4) {

			System.out.println("4. Mostrar el nombre, tipo y cantidad de cada cartas que tiene en su coleccion, ordenadas por tipo.");
			for(int i=0; i<nombresCartas.size();i++){
				map.put(nombresCartas.get(i),tipos.get(i));
			}
			it = map.keySet().iterator();
			while(it.hasNext()){
				String key = it.next();
				System.out.println("Tipo: (" + key + ") -> Nombre Carta: (" + map.get(key)+")");     
			}
			System.out.println("Hay: "+map.size() + " cartas en su coleccion");

	   }

	   if (opt == 5) {

			System.out.println("5. Mostrar el nombre y tipo de todas las cartas existentes.");
			for(int i=0; i<nombresCartas.size();i++){
				map.put(nombresCartas.get(i),tipos.get(i));
			}

			it = map.keySet().iterator();
			while(it.hasNext()){
			   String key = it.next();
			   System.out.println("Nombre Carta: " + key + " -> Tipo: " + map.get(key));
			}

			System.out.println("---------------------------------");   
	   }

	   if (opt == 6) {

			System.out.println("6. Mostrar el nombre y tipo de todas las cartas existentes, ordenadas por tipo.");
			
			it = map.keySet().iterator();
			while(it.hasNext()){
				String key = it.next();
				System.out.println("Nombre Carta: " + key + " -> Tipo: " + map.get(key));   
		   }
		}
    }
}
