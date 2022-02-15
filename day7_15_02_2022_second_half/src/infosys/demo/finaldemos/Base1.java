package infosys.demo.finaldemos;

public class Base1 {
   public final void display()
   {
	   System.out.println("Hello");
	   
   }
}


class Derived1 extends Base1 {
// In the base class we have the final 
	// method display so in the 
	// derived class we cannot override the
	// method. It will show compilation error
	public void display()
	{
		System.out.println("Hello from Derived1");
	}
}