package day4Constructor;

class ConsOverloading2 {
	int age;
	double salary;
	ConsOverloading2() {
         System.out.println("===========Zero- Parameterized constructor started==========");
         System.out.println("having no parameters");
         System.out.println("===========Zero- Parameterized constructor Ends...==========");
    }
	ConsOverloading2(int a) {
		 System.out.println("===========int Parameterized constructor started==========");
		 System.out.println("having int parameters");
		 age=a;
		 System.out.println("===========int Parameterized constructor Ends...==========");
	}
	ConsOverloading2(double b) {
		System.out.println("===========double Parameterized constructor started==========");
		System.out.println("having double parameters");
		salary=b;
		System.out.println("===========double Parameterized constructor Ends...==========");
	}
	ConsOverloading2(int a, double b) {
		System.out.println("===========int-double Parameterized constructor started==========");
		System.out.println("having int-double parameters");
		age=a;
		System.out.println("===========int-double Parameterized constructor Ends...==========");
	}
		public static void main(String args[]) {
			ConsOverloading2 pc1 = new ConsOverloading2();
			System.out.println("After Zero-para constructor,Age= "+pc1.age);
			System.out.println("After Zero-para constructor,Salary= "+pc1.salary);
			
			ConsOverloading2 pc2 = new ConsOverloading2(33);
			System.out.println("After Zero-para constructor,Age= "+pc2.age);
			System.out.println("After Zero-para constructor,Salary= "+pc2.salary);
			
			ConsOverloading2 pc3 = new ConsOverloading2(3400.34);
			System.out.println("After Zero-para constructor,Age= "+pc3.age);
			System.out.println("After Zero-para constructor,Salary= "+pc3.salary);
			
			ConsOverloading2 pc4 = new ConsOverloading2(30,95000.34);
			System.out.println("After Zero-para constructor,Age= "+pc4.age);
			System.out.println("After Zero-para constructor,Salary= "+pc4.salary);
			
			
			
		
		
	}
}
