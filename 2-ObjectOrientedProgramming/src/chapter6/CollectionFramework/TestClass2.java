package chapter6.CollectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestClass2 {
	
	//Create a map for 4 fruits with keys as integers and values as Strings,
	//on a certain key add a certain fruit to be apple 
	//then using get function get the fruit that is apple 
	//to rename it as pineapple.
	//Use LinkedHashMap.
	
	public static void main(String[] args) {
		Map<Integer, String> fruitMap= new LinkedHashMap<>();
		
		fruitMap.put(1, "orange");
		fruitMap.put(2, "guava");
		fruitMap.put(3, "mango");
		fruitMap.put(4, "apple");
		
		System.out.println("BEfore Update");
		System.out.println(fruitMap);
		
		int mapSize=fruitMap.keySet().size();
		
		for(int i=1;i<=mapSize;i++)
		{
			if(fruitMap.get(i).equals("apple"))
			{
				fruitMap.put(i, "pineapple");
			}
		}
		
		System.out.println("After Update");
		System.out.println(fruitMap);
		
		
	}

}
