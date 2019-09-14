package uvu.cs.cs3250.assignments;

public class PalindromeDetector {

	public static boolean isPalindrome(String testWord) {
		if (testWord == null) {
			return false;
		}
		
		else {
			String pattern = "[ ,$!&.\\?+]";
			String trimWord = testWord.replaceAll(pattern, "");
			trimWord = trimWord.toLowerCase();
			
			char leadChar;
			char trailChar;
			
			for(int i = 0; i < (trimWord.length() / 2); i++) {
				leadChar = trimWord.charAt(i);
				trailChar = trimWord.charAt((trimWord.length() -1) - i);
				
				if(leadChar != trailChar) {
					return false;
				}
			}
			
			return true;
		}
	}
}
