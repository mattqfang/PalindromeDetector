package uvu.cs.cs3250.assignments;

public class PalindromeDetector {
	public static boolean isPalindrome(String string) {
		if (string == null) {
			System.out.println("No input.");
			return false;
		}
		else {
			String newStr = string;
			newStr = string.replaceAll("\\p{Punct}",""); 
			newStr = newStr.toLowerCase();
			int a = newStr.length() - 1;
			for (int i = 0; i < newStr.length(); i++) {
				if (newStr.charAt(i) != newStr.charAt(a)) {
					System.out.println(string + " is not palindrome.");
					return false;
				}
				else if ( i >= a) {
					System.out.println(string + " is palindrome.");
					return true;
				}
				else {
					a--;
				}
			}
			return false;
		}
		
	}
	
}
