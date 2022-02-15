package infosys.demo.finaldemos;


// final variable cannot be reinitialised
class Number4 {
	final int num=10;
 
	  public void setData() {
		  num=20;  // So reinitialisation is not possible
	  }

}

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
