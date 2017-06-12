package com.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Synchronise_Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map hmap = new HashMap<Integer,String>();
		hmap.put(22, "Robert");
		hmap.put(33, "Vittoria");
		hmap.put(44, "Vettra");
		
		Map map = Collections.synchronizedMap(hmap);
		Set set = hmap.entrySet();
		
		synchronized (map) {
			Iterator iterate = set.iterator();
			while(iterate.hasNext())
			{
				Map.Entry etry = (Entry) iterate.next();
				System.out.println("The key and value is :"+ "Key: "+ etry.getKey()+ "Value: "+ etry.getValue());
			}
		}
		
		

	}

}
