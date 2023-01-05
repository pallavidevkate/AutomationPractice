package day28Collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("key1", "admin");  //upcasting
		m1.put("key2", "admin");  //upcasting
		m1.put(null, "admin123");  //upcasting
          System.out.println("Map elements are: "+m1);
          System.out.println("Map elements count: "+m1.size());
      	m1.put("key2", "manager"); 
     	m1.put(458, "manager"); 
     	m1.put(null, 1234); 
     	System.out.println("Map elements are: "+m1);
        System.out.println("Map elements count: "+m1.size());
        
        System.out.println("values of map: "+m1.values());
	}

}
