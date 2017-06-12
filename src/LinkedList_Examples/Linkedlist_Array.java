package LinkedList_Examples;

import java.util.LinkedList;

public class Linkedlist_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> lst= new LinkedList<String>();
		lst.add("AA");
		lst.add("BB");
		lst.add("CC");
		lst.add("CC");
		lst.add(null);
		lst.add(null);
		System.out.println("Accessing the null value: "+ lst);
		String[] arry = lst.toArray(new String[lst.size()]);
		
		System.out.println("Array Elements are: ");
		for(int i=0;i<arry.length;i++)
		{
			System.out.println(arry[i]);
		}
	}

}
