package SampleOwnPrograms;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner scan =new Scanner(System.in);
	String userInput = scan.nextLine();
	System.out.println("Your words are :" + userInput);
	//String userInput = 
	String[] list =userInput.trim().split("[.,@#$& *-]+");
	for(int i=0;i<list.length;i++){
		System.out.print(" "+ list[i] );
	}   System.out.println();
	System.out.println("Words count :"+ list.length);
	}
}
  

