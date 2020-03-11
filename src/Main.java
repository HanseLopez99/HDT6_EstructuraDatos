/*
* @author: Hansel Lopez 19026 & Eduardo Ramírez 19946
*	Hoja de Trabajo #6
*	Algoritmos y estructuras de datos 
*/

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class Main{

    public static void main(String [] args) {

    	Scanner sc = new Scanner(System.in);
    	String input;
    	MapFactory factory = new MapFactory();

    	fileRead file = new fileRead();

    	System.out.println("________________________________________________________--");
    	System.out.println("                 Hoja de Trabajo 6");
    	System.out.println("________________________________________________________--\n");
    	System.out.println("Que implementacion de MAP desea utilizar: \n");
    	System.out.println("Escribir: 'HashMap', 'TreeMap' o 'LinkedHashMap'");
    	
    	input = sc.nextLine();
    	Map<String, String> map = factory.getMap(input);
    	file.Reader();
        

        System.out.println("\n -- Fin de la ejecucion...");

    }
}
