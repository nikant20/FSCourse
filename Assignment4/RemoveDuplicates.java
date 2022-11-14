package Assignment4;

import java.util.Arrays;

//Q. WAP to remove Duplicates from a String.(Take any String ex with duplicates
//character)
public class RemoveDuplicates {
	
	public static String removeDuplicates(char[] str) {
		int n = str.length;
        int index = 0;
 
        for (int i = 0; i < n; i++)
        {
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }

            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
	}

	public static void main(String[] args) {
		String input = "nikant";
		String answer = removeDuplicates(input.toCharArray());
		System.out.println("String after removing Duplicates: "+answer);
	}

}