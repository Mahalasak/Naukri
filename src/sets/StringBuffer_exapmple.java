package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class StringBuffer_exapmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lst = new ArrayList<String>();
		
		for(int i=0;i<5;i++)
		{
			lst.add(String.valueOf(i));
		}
		
		for(int i=0;i<5;i++)
		{
			lst.add(String.valueOf(i));
		}
		
		System.out.println("List with duplicate elements: "+ lst);
		System.out.println("List without duplicate elements: "+ processedList(lst));
		
		String inputStr= "try   to   move  to  abroad";
		
		StringTokenizer token = new StringTokenizer(inputStr, " ");
		StringBuffer buffer = new StringBuffer();
		
		while(token.hasMoreElements())
		{
			buffer.append(token.nextElement()).append(" ");
			
		}
		
		System.out.println("process string "+ buffer.toString().trim());
		
		
	}
public static Set<String> processedList(List<String> listContainsduplicates)
{
	
	Set<String> resultSet= new HashSet<String>();
	
	for(String result: listContainsduplicates)
	{
		
			resultSet.add(result);
	}	
	
	return resultSet;
}
}
