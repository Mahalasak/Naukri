package sets;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSet_to_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hashStr = new HashSet<String>();
		hashStr.add("AAA");
		hashStr.add("ZZZ");
		hashStr.add("CCC");
		
		System.out.println("Hash set elements are: "+ hashStr);
		
		TreeSet<String> strTree= new TreeSet<String>(hashStr);
		
		for(String str: strTree)
		{
			System.out.println("The treeset elements are: "+ str);
		}

	}

}
