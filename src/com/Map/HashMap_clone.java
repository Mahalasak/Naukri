package com.Map;

import java.util.HashMap;

public class HashMap_clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hmap= new HashMap<Integer,String>();
		hmap.put(11, "India");
		hmap.put(22, "Canada");
		hmap.put(52, "USA");
		hmap.put(92, "Germany");
		hmap.put(26, "Australia");
		hmap.put(12, "China");
		
		System.out.println("Hashmap contains: "+ hmap);
		
		HashMap<Integer, String> hmap2= new HashMap<Integer,String>();
		hmap2= (HashMap<Integer, String>) hmap.clone();
		System.out.println("Cloned hash map contains: "+ hmap2);
	}

}
