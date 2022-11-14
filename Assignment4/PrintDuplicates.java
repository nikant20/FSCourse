package Assignment4;

import java.util.HashSet;
import java.util.Set;

//2. WAP to print Duplicates characters from the String.
public class PrintDuplicates {
	
	public static void printDuplicates(char[] str) {
		Set<Character> set = new HashSet<>();
		
		for(char c : str) {
			if(set.contains(c)) {
				System.out.print(c+" ");
			}else {
				set.add(c);
			}
			
		}
	}

	public static void main(String[] args) {
		String input = "nikant";
		printDuplicates(input.toCharArray());
	}

