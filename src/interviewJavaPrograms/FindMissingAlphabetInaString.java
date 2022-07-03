package interviewJavaPrograms;
import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAlphabetInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given= "a";
		given =given.toLowerCase();
		given =given.replaceAll(" ", "");
		String [] userArray=given.split("");
		System.out.println(given);	
		String [] alphabets ="abcdefghijklmnopqrstuwxyz".split("");
		// Second Method - 
		HashSet <String> set1= new HashSet <String> (Arrays.asList(userArray));
		
		/* First Method - This Program is known as Pangram
		 * HashSet <String> set1= new HashSet <String> ();
		 * for (String s: userArray) {
			set1.add(s);
			// created one HashSet and added the element to it 
		}*/
		
		HashSet <String> set2= new HashSet <String>(Arrays.asList(alphabets));
		set2.removeAll(set1);
		System.out.println(set2);
	}

}

        