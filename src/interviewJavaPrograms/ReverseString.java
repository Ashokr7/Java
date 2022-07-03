package interviewJavaPrograms;

public class ReverseString {

	//First method
			public static void main(String[] args) {
			/*// Using StringBuffer class
			StringBuffer a = new StringBuffer("TaTA");
			// use reverse() method to reverse string
			System.out.println(a.reverse());*/
			
			//Second method
		    String input="Agni";
			StringBuilder input1 = new StringBuilder();
			input1.append(input);
			input1=input1.reverse(); 
			for (int i=0;i<input1.length();i++)
			System.out.print(input1.charAt(i));
			
			//Fibonacci series
			
			/*int a = 0, b = 1, c, i, count = 10;
			// To print 0 and 1
			System.out.print(a + " " + b);
			// loop starts from 2. We have already printed 0 and 1 in the previous step
			for (i = 2; i < count; i++) {
				c = a + b;
				System.out.print(" " + c);
				a = b;
				b = c;*/
	}
			}

