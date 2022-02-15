package infosys.demo2.object;

public class StudentMain {

	public static void main(String[] args) {
		Student studentObj1=new Student();
		Student studentObj2=new Student();
		studentObj1.setRoll(1);
		studentObj1.setName("Rajiv");
		studentObj1.setMarks(78);
		studentObj2.setRoll(1);
		studentObj2.setName("Rajiv");
		studentObj2.setMarks(78);
		System.out.println(studentObj1==studentObj2);    // false
		System.out.println(studentObj1.equals(studentObj2));   //false 
		// From where we are getting this equals method? We have not created the equals method
		// in our class Student. So it is inherited from the Object class. So the objects are
		// invoking the equals method of the Object class
		// boolean equals(Object object)
		 // equals method is having the return type as boolean and parameter as Object type
		 // equals method in the Object class also compares the address whether two references
		 // are pointing the same object or not
      System.out.println(studentObj1.hashCode());
      System.out.println(studentObj2.hashCode());
      // If two objects return true for equals than they should return the same hashCode value
      // So for both hashCode and equals method , we have to override the methods.
      
	}

}
