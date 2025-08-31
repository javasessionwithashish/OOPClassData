package chapter6.CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class TestClass {
	
	public static void main(String[] args) {
	//Collection Framework:
		//1. List
		//2. Set
		//3. Map
	
	//Why collection framework?
	//Collection framework is an abstract data type that 
		//stores value through a variable which is dynamic
		//in nature.
		int a=5;//simple integer variable
		int[] a2= {1,2};//simple array of integer with size 2
		//Array size is static
		//When we need to use variables that can store dynamic
		//nature values, then we use collection framework.
		
	//What is dynamic in nature?
		//Dynamic is when values in a variable can grow 
		//or shrink in size.
		
		//List - Collection Framework
	//types of lists:
		//1. array list
		//2. linked list
		//3. vector
		//although, all the lists works the same, their performance
		//are different.
		//data are inserted according to index but, list is dynamic.
		
		List<Integer> l1= new ArrayList<>();
		l1.add(1);
		l1.add(55);
		l1.add(27);
		l1.add(55);
		//l1.remove(1);
		
		for(int t: l1)
		{
			System.out.println(t);
		}
		
		List<Integer> l2= new LinkedList<>();
		l2.add(2);
		l2.add(29);
		l2.add(55);
		
		List<Integer> l3= new Vector<>();
		l3.add(3);
		l3.add(33);
		l3.add(43);
		
//		System.out.println(l1);
//		System.out.println(l2);
//		System.out.println(l3);
		
//		for(int l:l1)    			//for-each loop
//		{
//			System.out.println(l);
//		}
		
		
		List<String> names= new ArrayList<>();
		names.add("abc");
		names.add("def");
		names.add("ghi");
		
//		for(String s:names)
//		{
//			System.out.println(s);
//		}
		
		
		/*
		 * Types of Set:
		 * 1. HashSet - Irregular Order
		 * 2. TreeSet -Sorted/Ordered Form
		 * 3. LinkedHashSet - As it is
		 */
		
		
		Set<Integer> intSet=new HashSet<>();
		intSet.add(4);
		intSet.add(3);
		intSet.add(22);
		intSet.add(10);
		
		//System.out.println(intSet);
		
		//Map
		//Map is a collection framework that holds its data-values
		//according to its keys
		//Map types:
		/*
		 * 1. HashMap
		 * 2. TreeMap
		 * 3. LinkedHashMap
		 */
		
		Map<Integer, Integer> testMap = new LinkedHashMap<>();
		testMap.put(1, 27);
		testMap.put(2, 30);
		testMap.put(3, 45);
		testMap.put(3, 52);//update key 3
		
		Map<Integer,String> studentMap= new HashMap<>();
		studentMap.put(1,"rocky");
		studentMap.put(2,"jocky");
		studentMap.put(3,"hari");
		
		//System.out.println(testMap.values());
		//System.out.println(studentMap.values());
		
		for(String b:studentMap.values()) //for-each loop
		{
			//System.out.println(b);
		}
		
		//System.out.println(studentMap.entrySet());
		//System.out.println(studentMap);
		
		System.out.println(studentMap.get(1));
		
		
	}

}
