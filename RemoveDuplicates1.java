package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates1 {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
			String[] charArray = text.split(" ");
			Set<String> set = new LinkedHashSet<String>();
			for (int i = 0; i < charArray.length; i++) {
				set.add(charArray[i]);
			}
				for(String str: set) {
					
				
			System.out.println(str);
	}
	}}
		
	

