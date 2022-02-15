package infosys.demo.wrapperclasses;

public class Demo5 {

	public static void main(String[] args) {
		int sum=0;
		int num;
		for(String str : args)
		{
			num=Integer.parseInt(str); 
			// In line 10 the command line
			// arguments which are getting
			// stored in str one by one 
			// is converted into primitive int
			sum+=num; // sum=sum+num;
			
		}
		System.out.println(sum);
	}

}
