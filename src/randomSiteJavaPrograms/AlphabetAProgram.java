package randomSiteJavaPrograms;

public class AlphabetAProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int n=10;
	    {
	    // Outer for loop for number of lines
	    for (int i = 0; i<=n; i++) {
	    // Inner for loop for logic execution
	    for (int j = 0; j<= n / 2; j++) {
	    // prints two column lines
	    if ((j == 0 || j == n / 2) && i != 0 ||
	    // print first line of alphabet
	    i == 0  && j != n / 2 ||
	    // prints middle line
	    i == n / 2)
	    System.out.print("*");
	    else
	    System.out.print(" ");
	    }
	    System.out.println();
	    }
	    }
	    }
	}
