package day03Overriding;

public class Z2 {
    void msg() {
     System.out.println("Hello"); 
		}
  }
 class B2 {
	 void msg( ) {
		 System.out.println("Welcome");
		 
	 }
 }
 class testOverriding extends Z2{
	 testOverriding(){
		 super(); //confusion
	 }
	 public static void main(String args[]) {
		 testOverriding obj = new
				 testOverriding();
		 obj.msg();
	 }
 }
