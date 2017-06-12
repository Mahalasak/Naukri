package ArraylistExamples;

import java.util.ArrayList;
import java.util.Iterator;

public class Loops_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrlistInt = new ArrayList<Integer>();
		arrlistInt.add(14);
		arrlistInt.add(300);
		arrlistInt.add(500);
		arrlistInt.add(340);
		System.out.println("_______________");
		for(int i=0;i<arrlistInt.size();i++)
		{
			System.out.println(arrlistInt.get(i));
		}
		System.out.println("_______________");
		for(Integer list1: arrlistInt)
		{
			System.out.println(list1);
		}
		System.out.println("_______________");
		Iterator iteratorr = arrlistInt.iterator();
		while(iteratorr.hasNext())
		{
			System.out.println(iteratorr.next());
			
		}

	}

}
