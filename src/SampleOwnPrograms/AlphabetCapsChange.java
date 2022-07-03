package SampleOwnPrograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlphabetCapsChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String Userstr = scan.nextLine();
		System.out.println("String before case convension :" + Userstr);
        StringBuffer newStr= new StringBuffer(Userstr);    
		for(int i=0;i<Userstr.length();i++) {
		if(Character.isLowerCase(Userstr.charAt(i))) {
			newStr.setCharAt(i, Character.toUpperCase(Userstr.charAt(i)));
		}
		else if(Character.isUpperCase(Userstr.charAt(i))) {
			newStr.setCharAt(i, Character.toLowerCase(Userstr.charAt(i)));
		}
        }System.out.print("String after case convension :" + newStr );
}
}