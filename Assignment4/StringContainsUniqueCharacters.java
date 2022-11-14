package Assignment4;

import java.util.HashSet;
import java.util.Set;

//Q7. WAP to find if String contains all unique characters.
public class StringContainsUniqueCharacters {
	
	public static void checkUnique(char[] str) {
		
		Set<Character> set = new HashSet<>();
		
		boolean result = true;
		for(char c:str) {
			if(set.contains(c)) {
				result = false;
				break;
			}else {
				set.add(c);
			}
		}
		
		if(result) {
			System.out.println("String is Unique");
		}else {
			System.out.println("String contains duplicate");
		}
	}

	public static void main(String[] args) {
		String input = "nikant";
		checkUnique(input.toCharArray());
	}

}