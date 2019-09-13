package uvu.cs.cs3250.assignments;

public class PalindromeDetector {

	public static boolean isPalindrome(String potentialPalindrome) {
		
		if(potentialPalindrome == null) {
			return false;
		} else if(potentialPalindrome == "") {
			return true;
		}
		
		String potentialPalindromeCleaned = potentialPalindrome.replaceAll("[^\\p{Alnum}]", "");
		
		System.out.println(potentialPalindromeCleaned);
		
		StringBuffer reversedString = new StringBuffer(potentialPalindromeCleaned);
		reversedString.reverse();
		
		System.out.println(reversedString);
		
		String reversedStringConverted = new String(reversedString);
		if (potentialPalindromeCleaned.equalsIgnoreCase(reversedStringConverted)) {
			return true;
		} else {
			return false;
		}
	}

}
