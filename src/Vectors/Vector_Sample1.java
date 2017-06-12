package Vectors;

import java.util.Vector;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;

public class Vector_Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<String>(3);
		vec.addElement("AA");
		vec.addElement("BB");
		vec.addElement("CC");
		vec.addElement("DD");
		
		System.out.println("Vector elements are: "+ vec.size());
		System.out.println("Default capacity increment: "+ vec.capacity());
		
		vec.addElement("EE");
		
		System.out.println("Size after addition: "+ vec.size());
		System.out.println(" capacity increment: "+ vec.capacity());
	}

}
