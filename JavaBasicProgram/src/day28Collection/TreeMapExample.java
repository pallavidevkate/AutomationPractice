package day28Collection;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map m1=new TreeMap();
		m1.put("Key1", "admin");
		m1.put("Key5", "admin");
		m1.put("Key3", "admin123");
		m1.put("Key0", "admin");
		
		System.out.println("Map elements are: "+m1);
		System.out.println("Map elements count: "+m1.size());

	}

}
