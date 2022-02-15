package infosys.demo.wrapperclasses;

public class Demo1 {

	public static void main(String[] args) {
		int i=10;
		Integer intObj=i;  // AutoBoxing ===> when we are converting from primitivre type to Reference type
    	int num=intObj;     // Unboxing ===> Reference type to primitive type
		Integer intObj2=15; // AutoBoxing
		int num2=intObj2;
		System.out.println(i);
		System.out.println(intObj);
		System.out.println(intObj2);
		System.out.println(num2);

	}

}
