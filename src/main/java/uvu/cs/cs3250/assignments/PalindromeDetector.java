package uvu.cs.cs3250.assignments;

public class PalindromeDetector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean isPalindrome(String toTest) {
		//false if null (empty string)
		if(toTest==null) {
			return false;
		}
		//only letters
		String onlyLetters = ""; 
		//char[] onlyLetters = new char[toTest.length()];
		//int onlyLetterIndex = 0;
		
		for(int i=0; i<toTest.length(); i++) {
			char ch = toTest.charAt(i);
			if( Character.isLetter(ch) ) {
				onlyLetters = onlyLetters + ch;
			}
		}
		
		//same case
		onlyLetters = onlyLetters.toLowerCase();
		
		//compare
		for(int i=0; i<onlyLetters.length(); i++) {
			if( onlyLetters.charAt(i) != onlyLetters.charAt(onlyLetters.length() - 1 - i) ) {
				return false;
			}
		}
		return true;
	}
}
