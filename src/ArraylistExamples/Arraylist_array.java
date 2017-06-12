package ArraylistExamples;

import java.util.ArrayList;

public class Arraylist_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("AA");
		arrlist.add("BB");
		arrlist.add("CC");
		
		
		String[] arrayStr = arrlist.toArray(new String[arrlist.size()]);
		
		System.out.println("Array list elements are: ");
		for(int i=0;i<arrayStr.length;i++)
		{
			System.out.println(arrayStr[i]);
		}
	}

}
