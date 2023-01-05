package day21Opps;
   //parent class
  public class fruits {
	int fruitAge;
	fruits() {
		System.out.println("fruit class cons. .");
		fruitAge =7;
	}

	public void taste()  {
		System.out.println("fruits are sweet");
		
    }
}
 //child class of fruit
class orange extends fruits{
	int fruitAge;
	orange() {
		// super(); //java compiler will write default super()
		System.out.println("orange class cons. .");
		fruitAge = 5;
	}
	public void taste()  {
		System.out.println("orange are sweet");
	}
	public void shape() {
		System.out.println("orange is round");
		System.out.println("orange fruitAge: "+fruitAge);
		System.out.println("fruits fruitsAge: "+super.fruitAge);
		taste();
		super.taste();
	}
}

   class Inheritance7 {
	public static void main(String[] arg) {
		System.out.println("*****************************");
		orange o1=new orange();
		o1.shape();
		System.out.println("*****************************");
		
	}
}

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   