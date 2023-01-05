package objectClassExample;

public class TestSample {
	void callMe() {
		System.out.println("Hello");
	}
}
 class Example4 extends TestSample{
	static int Last_roll = 100;
	int roll_no;
	//constructor
	Example4()
	{
		roll_no = Last_roll;
		Last_roll++;
	}
	@Override
	public int hashCode() {
		return 505;
	}
	@Override
	public String toString()
	{
		return "BasicCoreJava";
		
	}
	// driver code
	public static void main(String[] args) {
		Example4 s = new Example4();
		System.out.println(s.hashCode());
		System.out.println(s);
	    TestSample t1=new TestSample();
	    System.out.println(t1);
	    System.out.println(t1.hashCode());

	}

}
