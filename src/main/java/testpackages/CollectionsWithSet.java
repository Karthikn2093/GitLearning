package testpackages;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class CollectionsWithSet {

	public static void main(String[] args) {
		
		LinkedHashSet set = new LinkedHashSet();
		set.add("Name");
		set.add(1000);
		set.add(true);
		
		System.out.println(set);
		System.out.println(set.size());
		
		ArrayList list = new ArrayList(set);
		System.out.println(list.get(0));

	}

}
