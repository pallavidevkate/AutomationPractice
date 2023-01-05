package day10This;

 class A {

	void m() {
		System.out.println("hello m");
	}
	void n() {
	    System.out.println("hello n");
	    //m();//or
	    this.m();
		}
}
	class Thiskeyword3 {
		void methodOne() {
			System.out.println("Inside method One");
			
		}
		void methodTwo() {
			System.out.println("Inside method Two");
			this.methodOne();
		}
		public static void main(String args[]) {
			Thiskeyword3 obj = new Thiskeyword3();
			obj.methodTwo();
			A a = new A();
			a.n();
		}
		

}
