package day22Opps;


	public class vehicle {
		public void wheels() {
			System.out .println("I have wheels");

			}

		}
		// first child class of vehicle class 
		 class bike extends vehicle{
			 public void countwl() {
					System.out .println("I am a bike and has 2 wheels");

			 }
		 }
		 //second child class of vehicle class
		 class car1 extends vehicle{
			 public void countwlc() {
					System.out .println("I am a car and has 4 wheels");
		}
		 }
		//third child class of vehicle class
		class scooter extends vehicle {
			 public void countwls() {
					System.out .println("I am a car and has 2 wheels");
			 }
		}
		  class Inheritance4 {
			public static void main (String[] args) { 
				scooter sc = new scooter(); // object of scooter class
			    sc.wheels();
			    sc.countwls();
			    car1 c = new car1(); // object of scooter class
			    c.wheels();
			    c.countwlc();
			    bike b = new bike(); // object of scooter class
			    b.wheels();
			    b.countwl();
			
			
			}
		

	}


