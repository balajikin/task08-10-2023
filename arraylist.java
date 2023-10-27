package Balaji;

import java.util.ArrayList;


import java.util.TreeSet;



public class NameOrder {

	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Krithi");
		list.add("GK");
		list.add("Gopal");
		list.add("GK");
		list.add("Sakthi");
		list.add("Mano");
		list.add("Sakthi");
		list.add("Gopal");
		list.add("Arun");	
		list.add("Balaji");
		System.out.println("Lists :"+list);
		
						
		
		TreeSet<String> uniqueName = new TreeSet<String>(list);
		list =  new ArrayList<>(uniqueName);
		System.out.println("Duplicated value removed list :"+uniqueName);
		
		
				
			
			
			
		
		

	}

}