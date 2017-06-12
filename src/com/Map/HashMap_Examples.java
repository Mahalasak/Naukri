package com.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(12, "AAA");
		hMap.put(12, "AAA");
		hMap.put(13, "BBB");
		hMap.put(1, "NNN");
		hMap.put(22, "XXX");

		System.out.println(hMap);

		// get values based on key
		String s = hMap.get(13);
		System.out.println(s);
		
		//remove valu based on key
		String removeValue = hMap.remove(22);
		System.out.println("Removed hasmap value is: "+ removeValue);

		for (Map.Entry<Integer, String> entrymap : hMap.entrySet()) {
			System.out.println("The key is: " + entrymap.getKey() + "--- Value is: " + entrymap.getValue());
		}

		// using iterator
		Set sets = hMap.entrySet();
		Iterator iterates = sets.iterator();

		while (iterates.hasNext()) {
			Map.Entry<Integer, String> entrysee = (Entry<Integer, String>) iterates.next();
			System.out.println("The key is: " + entrysee.getKey() + "Value is : " + entrysee.getValue());
		}
		
		if(hMap.containsKey(22))
		{
			System.out.println("Key and its value is: "+ hMap.get(13));
		}
		else
		{
			System.out.println("Key not found");
		}
		
		

	}

}
