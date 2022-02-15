package infosys.demo.wrapperclasses;

public class Demo2 {

	public static void main(String[] args) {
		int i=10;
		Integer intObj=new Integer(i);
      // In line7 we are are wrapping a primitive type and 
	 // converting it into object
		int num=intObj.intValue();
		// The statement in line 7 is
		// converting from object to 
		// primitive type

	}

}
