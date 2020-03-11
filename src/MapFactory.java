import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapFactory{

	public static Map<String, String> getMap(String mapType){

		if(mapType == null){
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

		return null;
	}
}