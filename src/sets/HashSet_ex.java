package sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> setst= new HashSet<String>();
		setst.add("Apple");
		setst.add("Mango");
		setst.add("Orange");
		setst.add("Juice");
		setst.add(null);
		
		System.out.println(setst);
		
		String[] arr1= new String[setst.size()];
		setst.toArray(arr1);
		
		for(String st : arr1)
		{
			System.out.println(st);
		}
		
		String[] arr = setst.toArray(new String[setst.size()]);
		System.out.println("the array elements are: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
