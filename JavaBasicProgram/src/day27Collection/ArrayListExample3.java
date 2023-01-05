package day27Collection;
import java.util.ArrayList;

public class ArrayListExample3 {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(12);
		ArrayList<Boolean> l2 = new ArrayList<Boolean>();
		l2.add(true);
		ArrayList<Character> l3 = new ArrayList<Character>();
		l3.add('a');
		
		//Using genric way
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Ravi");
		a1.add("Vijay");
		a1.add("Ajay");
		a1.add("Anuj");
		a1.add("Gaurav");
		System.out.println("An intitial list of elements: " + a1);
		System.out.println("remove vijay from collection: " +a1.remove("Vijay"));
		System.out.println("After invoking remove(object) method: " + a1);
		
		System.out.println("remove index 0 from collection: " + a1.remove(0));
		System.out.println("After invoking remove(index) method: " + a1);
		System.out.println("***********************************************************");
		//Creating another arraylist

	}

}
