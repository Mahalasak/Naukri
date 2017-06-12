package com.String.Example;

public class StringBuilder_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=" My name is Mahalasa";
		StringBuilder builders = new StringBuilder(str);
		builders.reverse();
		
		
		System.out.println(builders);
	
		System.out.println(builders.charAt(9));
		
		try{
			System.out.println("statement inside the try block");
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("The statement inside the finally block");
		}

	}

}
