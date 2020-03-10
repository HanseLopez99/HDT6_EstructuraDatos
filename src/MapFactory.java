public class MapFactory{

	public Map getMap(String mapType){

		if(mapType == null){
			return null;
		}

		if(mapType.equalsIgnoreCase("HashMap")){
			return new HashMap();
		}

		if(mapType.equalsIgnoreCase("TreeMap")){
			return new TreeMap();
		}

		if(mapType.equalsIgnoreCase("LinkedHashMap")){
			return new LinkedHashMap();
		}

		return null;
	}
}