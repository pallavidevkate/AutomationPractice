package day20Opps;
class A2
{
 void msg() {
		System.out.println("Hello");
			}

}
 class B2 {
	 void msg() {
		 System.out.println("welcome"); 
	 }

 }
 class Inheritance5 extends B2 {
	 Inheritance5(){
		 super();//confusion
	 }
	 public static void main (String args[]) {
		 Inheritance5 obj =new Inheritance5();
		 obj.msg();
	 }
 }
