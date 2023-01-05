package day11Constructor;

public class ConsOverloading2 {
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

	

}
