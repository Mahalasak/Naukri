package LinkedList_Examples;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> lst = new LinkedList<String>();
		lst.add("AA");
		lst.add("BB");
		
		ArrayList<String> arrlist= new ArrayList<String>(lst);
		
		
		for(String str: arrlist){
			System.out.println("Array list elements are: "+ str);
		}
	}

}
