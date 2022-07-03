package interviewJavaPrograms;

public class ExtractNumbersFromStringAndAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  input = "Ashok9600";
		int total=0;
		int length=input.length();
		for(int i=0;i<length;i++) {
			char character=input.charAt(i);
			if(Character.isDigit(character)) {
				total=total+Character.getNumericValue(character);
			} 
		 } 
		System.out.println(total);
	}

}
