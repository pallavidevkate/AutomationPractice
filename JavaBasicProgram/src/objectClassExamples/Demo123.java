package objectClassExamples;

 class Demo123 {
	void display() {
		System.out.println("I am display() of class Demo123");
	}
	
}

   class Example3 extends Demo123 {
		static int last_roll = 100;
		int roll_no;
		// constructor
		Example3()
		{
			roll_no = last_roll;//100
			last_roll++;//101
		}
void disply() {
	System.out.println("I am display() of class objectclass2");
}
public int hashcode() {
	return roll_no;
}
public static void main (String args[]) {
	Example3 s = new Example3();
	System.out.println(s);
	System.out.println(s.toString());
	System.out.println("hashCode() value from objectClass2 : "+s.hashcode());//
	s.display();//
	
	Demo123 d2=new Demo123();
	System.out.println(d2);
	System.out.println("hashCode() value from Demo123: "+d2.hashCode());


}
	

}
