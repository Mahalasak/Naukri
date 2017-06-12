package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap_sortingbyValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hMapValue= new HashMap<Integer,String>();
		hMapValue.put(1, "Anitha");
		hMapValue.put(23, "Rashmi");
		hMapValue.put(23, "Ramya");
	
		
		System.out.println("Before Sorting");
		Set set = hMapValue.entrySet();
		Iterator iterate = set.iterator();
		
		while(iterate.hasNext())
		{
			Map.Entry<Integer, String> etry = (Entry<Integer, String>) iterate.next();
			System.out.println("The elements are: "+ etry.getKey()+"---"+ etry.getValue());
			
		}
		
		System.out.println("Size of the hashmap is: "+ hMapValue.size());

	}

}
