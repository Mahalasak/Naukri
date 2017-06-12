package ArraylistExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Sort_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("India");
		arrlist.add("Japan");
		arrlist.add("Germany");
		arrlist.add("Italy");
		
		System.out.println("Before Sorting");
	   System.out.println(arrlist);
	   
	   Collections.sort(arrlist);
	   System.out.println("After Sorting: "+ arrlist);
	   
	   TreeSet ts = new TreeSet();
	   ts.addAll(arrlist);
	   System.out.println(ts);
	   
	   //sorting in ascending and descending order
	   
	   Collections.sort(arrlist);
	   System.out.println("Collections list is: "+ arrlist);
	   
	   Collections.reverse(arrlist);
	   System.out.println("Descending order: "+ arrlist);
	   

	}

}
