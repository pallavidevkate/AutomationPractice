package ObjectClassExample2;

public class Example2 extends Demo {
       // Driver code
	public static void main(String[] args) {
		Example2 s = new Example2();
		System.out.println(s);  //s.tostring()--string representation of an object
        System.out.println(s.toString());  //s.tostring()--string representation of an object
        System.out.println(s.hashCode()); //it convert hexadecimal address in to decimal and return the value
           Demo d1=new Demo();
           System.out.println(d1);
           System.out.println(d1.toString());
           System.out.println(d1.hashCode());
                                      
	}
	

}
