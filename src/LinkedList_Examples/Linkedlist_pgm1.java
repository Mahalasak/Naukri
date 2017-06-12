package LinkedList_Examples;

import java.util.LinkedList;

public class Linkedlist_pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> lst =new  LinkedList<String>();
		lst.add("Team A");
		lst.add("Team B");
		lst.add("Team C");
		
		System.out.println("The linked list elements are: "+ lst.size());
		
		lst.offerFirst("Team");
		System.out.println("Linked list after addition:"+ lst);
		
		int firstIndex= lst.indexOf("Team C");
		System.out.println("First occurance: "+ firstIndex);
		
		int lastIndex = lst.lastIndexOf("Team A");
		System.out.println("Last occurance: "+lastIndex);
		
		
	}

}
