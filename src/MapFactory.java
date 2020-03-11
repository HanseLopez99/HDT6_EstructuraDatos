/*
* @author: Hansel Lopez 19026 & Eduardo Ramírez 19946
*	Hoja de Trabajo #6
*	Algoritmos y estructuras de datos 
*/
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapFactory{

	public Map<String, String> getMap(String mapType){

		if(mapType == null){
			System.out.println("-Se ha ingresado un valor no valido, por favor ingresar de nuevo...");
			return null;
		}

		if(mapType.equalsIgnoreCase("HashMap")){
			return new HashMap<String, String>();
		}

		if(mapType.equalsIgnoreCase("TreeMap")){
			return new TreeMap<String, String>();
		}

		if(mapType.equalsIgnoreCase("LinkedHashMap")){
			return new LinkedHashMap<String, String>();
		}
		System.out.println("-Se ha ingresado un valor no valido, por favor ingresar de nuevo...");
		return null;
	}
}