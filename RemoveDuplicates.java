package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
String str = "PayPal";
char[] charArray = str.toCharArray();
Set<Character> charSet  = new LinkedHashSet<Character>();
for(char dup : charArray) {
	charSet.add(dup);
	
}System.out.println(charSet);

}
}