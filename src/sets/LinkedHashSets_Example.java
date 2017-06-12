package sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> lnkdhashset = new LinkedHashSet<String>();
		lnkdhashset.add("Z");
		lnkdhashset.add("AAA");
		lnkdhashset.add("CCC");
		lnkdhashset.add("BBB");
		
		System.out.println(lnkdhashset);
		
		lnkdhashset.remove("Z");
		
		System.out.println("After removing the element from set: "+ lnkdhashset);
		//linked hashset to array
		
		
		String[] str = lnkdhashset.toArray(new String[lnkdhashset.size()]);
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println("Converted array list is: "+ str[i]);
		}

	}

}
