package Assignment4;


//Q3. WAP to check if “2552” is palindrome or not.
public class CheckPalindrome {
	
	public static boolean checkPalindrome(char[] str) {
		
		int j = str.length-1;
		for(int i = 0;i<j;i++,j--) {
			if(str[i]!=str[j]) {
				return false;
			}
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {
		String input = "2552";
		boolean checkPalindrome = checkPalindrome(input.toCharArray());
		System.out.print("Input is Palindrome?  ");
		System.out.println(checkPalindrome);
	}

}