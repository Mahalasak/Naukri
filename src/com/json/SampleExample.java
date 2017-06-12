package com.json;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import net.minidev.json.JSONValue;

public class SampleExample {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser parser = new JSONParser();
		
		Object obj = parser.parse(new FileReader("E:\\Workspace_Nag\\Project_Sample\\src\\com\\json\\Sample.json"));
		
		JSONObject jobject= (JSONObject)obj;
		
		//Read the string
		/*String name = (String)jobject.get("Name");
		long age = (long)jobject.get("Age");
		
		System.out.println("Name is:"+ name);
		System.out.println("Age is: "+ age);*/
		
		JSONArray jarray = (JSONArray)jobject.get("Students");
		
		for(Object ob1: jarray){
			System.out.println("Objects are:"+ ob1.toString());
			JSONObject jobject1= (JSONObject)ob1;
			
			JSONArray arr1 = (JSONArray)jobject1.get("Countries");
			for(Object ctry: arr1)
			{
				System.out.println("Countries are:"+ ctry.toString());
			}
			
			String names= (String)jobject1.get("Name");
			System.out.println("Name is: "+ names.toString());
			
		}
		
		
	}

}