/*
* @author: Hansel Lopez & Eduardo Ramírez
*	Hoja de Trabajo #6
*	Algoritmos y estructuras de datos //lectura de archivo .txt
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main{

    public static void main(String [] args) {

    	Map<Integer, String> map = new HashMap<Integer, String>();
    	Map<Integer, String> treeMap = new TreeMap<Integer, String>();
    	Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
    	
        fileRead f = new fileRead();
        f.Reader();
        
        
    }
}
