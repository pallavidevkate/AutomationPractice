package day3.Method;

public class NonStaticGlobalVariable
{
	int empId=1002;
    double salary;
    public static void main(String[] args)
    {
    	 NonStaticGlobalVariable n1 = new NonStaticGlobalVariable();

      System.out.println("program starts");
	  System.out.println("NSGV empId: "+n1.empId);
	  System.out.println("NSGV empId: "+n1.salary);
      System.out.println("program ends");


	}

}
