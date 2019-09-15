package uvu.cs.cs3250.assignments;

public class PalindromeDetector {
	
	static boolean isPalindrome(String word) {
		if (word == null) {
			return false;
		}
		else if (word.equalsIgnoreCase(new StringBuilder(word).reverse().toString())) {
			return true;
		}
		else {
			String temp = word.replaceAll("[^A-Za-z]", "");
			
			if (temp.equalsIgnoreCase(new StringBuilder(temp).reverse().toString())) {
				return true;
			}
		}
		
		return false;
	}
}
