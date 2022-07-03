package SampleOwnPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicatesInString {

	private static final String[] Character = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str0 ="AshokKumar";	 
		String str= str0.toLowerCase();
        Map<Character,Integer> list = new HashMap<Character,Integer> ();
	    char[] Char = str.toCharArray();

	    for(Character ch : Char) {
	    	System.out.println(list);
	    	if (list.containsKey(ch)) {
	    		list.put(ch, list.get(ch)+1);
	    	}else {
	    		list.put(ch, 1);
	    }
	  }System.out.println(list);
	    /*Set<Character> list2 = list.keySet();
	    for(Character ch : list2) {
	    	if(list.get(ch)>1) {
	    		System.out.println(ch + " "+ "-" + " " + list.get(ch) + " " + "times ");
	    	}
	    }*/
	  }
	}

