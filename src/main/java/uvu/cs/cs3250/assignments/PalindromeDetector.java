package uvu.cs.cs3250.assignments;

public class PalindromeDetector {
	public static boolean isPalindrome(String s) {
		if (s == null)
			return false;

		s = s.replaceAll("\\W", "");
		s = s.toLowerCase();
		int len = s.length();
		
		for (int i = 0; i <= len / 2; i++)
			if (s.charAt(i) != s.charAt(len-1-i))
				return false;
		
		return true;
	}
}
