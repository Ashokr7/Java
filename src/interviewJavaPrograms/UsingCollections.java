package interviewJavaPrograms;

public class UsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given = "Agni";
		char [] CharacterArray = given.toCharArray();
		String reversed =" ";
		
		for (int i =CharacterArray.length-1 ; i>=0;i--) {
			reversed =reversed+ CharacterArray[i];
 			
		}

	}

}
