package com.Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Multimap_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiMap<Integer, ?> mulmap= new MultiValueMap();
		mulmap.put(1, 22);
		mulmap.put(1, "GGG");
		mulmap.put(1, "RRR");
		mulmap.put(2, "Robert");
		mulmap.put(2, "Langdon");
		mulmap.put(2, "Vittoria");
		System.out.println("The values inside the multimap is: "+ mulmap);
		System.out.println("The size of the multimap is: "+ mulmap.size());
		
		//iterate through multi map
		Set s = mulmap.entrySet();
		for(Map.Entry etry: mulmap.entrySet())
		{
			System.out.println(etry.getKey()+"----"+ etry.getValue());
		}
		
		ArrayList<String> arrlist=  (ArrayList<String>) mulmap.get(1);
		System.out.println("The array list is: "+ arrlist);

	}

}
