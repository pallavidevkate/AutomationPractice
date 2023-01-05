package day1.basics;

public class Operators {

	public static void main(String[] args) {
		int num1=50,num2=5,res;
		res=num1+num2;
		System.out.println("After Addition result is: "+res);
		res=num1-num2;
		System.out.println("After Substraction result is: "+res);
		res=num1*num2;
		System.out.println("After Multipication result is: "+res);
		res=num1/num2;
		System.out.println("After Division result is: "+res);
		res=num1%num2;
		System.out.println("After Mod result is: "+res);
		
		int a= 0, b;
		b = a++ + ++a + ++a + a;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		a = -5;
		b = --a + --a + --a + a + ++a + a++ ;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);

				
		


		
		
		
		
		

	}

}
