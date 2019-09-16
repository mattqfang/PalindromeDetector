package uvu.cs.cs3250.assignments;

//Try to do it in a single loop
public class PalindromeDetector {

	public static boolean isPalindrome(String str) {
		if(str == null || str.isEmpty()) {
			return false;
		}
		StringBuilder fixedString = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))) {
				fixedString.append(Character.toLowerCase(str.charAt(i)));
			}
		}
		return fixedString.toString().equals(fixedString.reverse().toString());
		
	}


}
