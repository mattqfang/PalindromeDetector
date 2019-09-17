package uvu.cs.cs3250.assignments;

public class PalindromeDetector {
	public static boolean isPalindrome(String word) {
		if (word.isEmpty()) {
			return false;
		}
		
		word = word.toLowerCase();
		int wordLength = word.length();
		char[] charWord = word.toCharArray();
		
		char[] reverseWord = charWord;
		int j = 0;
		for (int i = (wordLength - 1); i >= 0; i--) {
			reverseWord[j] = charWord[i];
			j++;
		}
		
		
		for (int i = 0; i < wordLength; i++) {
			if (charWord[i] != reverseWord[i]) {
				return false;
			}
		}
		return true;
	}
}
