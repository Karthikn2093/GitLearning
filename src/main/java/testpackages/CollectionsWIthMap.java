package testpackages;

import java.util.LinkedHashMap;

public class CollectionsWIthMap {

	public static void main(String[] args) {
		
		LinkedHashMap map = new LinkedHashMap();
		map.put(100, "Name1");
		map.put(200, "Name2");
		map.put(300, "Name3");
		
		
		System.out.println(map.entrySet());
	}

}
