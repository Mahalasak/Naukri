package sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("AAA");
		treeSet.add("ZZZ");
		treeSet.add("PPP");
		treeSet.add("MMM");
		treeSet.add("XXX");
		
		System.out.println(treeSet);
	
		TreeSet<Integer> treeInt = new TreeSet<Integer>();
		treeInt.add(100);
		treeInt.add(10);
		treeInt.add(50);
		treeInt.add(20);
		treeInt.add(5);
		
		System.out.println(treeInt);
		
		
	}

}
