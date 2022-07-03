package interviewJavaPrograms;

public class CountTheVowelsInYourName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="AshokKumar Raviraja";
		int vowelsCount=0;
		name=name.toLowerCase();
		int length=name.length();
		for (int i=0;i<length;i++) {
			if(name.charAt(i)=='a' || name.charAt(i)=='e' || 
					name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u')
			{
				//vowelsCount++;
				vowelsCount=vowelsCount+1;
					
			}
		}
		System.out.println("Your name has " + vowelsCount +" " + "vowel(s)");
		
	}

}
