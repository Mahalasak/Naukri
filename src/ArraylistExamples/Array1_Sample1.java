package ArraylistExamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array1_Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arrlist= new ArrayList<String>();
		arrlist.add("Ajeeth");
		arrlist.add("kini");
		arrlist.add("XYZ");
		arrlist.add("XYZ");
		
		System.out.println("ArrayList is: "+ arrlist);
		
		ArrayList<String> arrlist2 = new ArrayList<String>();
		arrlist2.addAll(arrlist);
		System.out.println("Array list 2: "+ arrlist2);
		
		arrlist.add(0, "Mahalasa");
		
		System.out.println("Elements after adding: "+ arrlist);
		
		arrlist.set(0, "Rashmi");
		System.out.println("Elements after updating: "+ arrlist);
		
		int position= arrlist.indexOf("XYZ");
		System.out.println("Position is: "+ position);
		
		
		
		ArrayList<String> arrlist3 = new ArrayList<String>(Collections.nCopies(10, arrlist.get(2)));
		System.out.println("Array List is: "+ arrlist3);
		arrlist.clear();
		System.out.println("Arraylist after clearing: "+ arrlist);
	}

}
