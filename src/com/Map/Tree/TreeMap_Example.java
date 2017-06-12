package com.Map.Tree;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> treeMap= new TreeMap<Integer,String>(Collections.reverseOrder());
		treeMap.put(22, "India");
		treeMap.put(55, "Canada");
		treeMap.put(44, "USA");
		
		//Display the contents 
		Set set = treeMap.entrySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry entry= (Entry) iterator.next();
			System.out.println("The list of elements in TreeMap is: "+ entry);
		}
		
		String str="hello";
		str="new world";
		
		System.out.println("The string is: " +str);
		
	}

}
