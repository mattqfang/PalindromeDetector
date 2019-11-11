package uvu.cs.cs3250.assignments;

public class PalindromeDetector {

	public boolean isPalindrome(String str) {
		if (str == null || str.isEmpty())
			return false;

		return cleanString(str)
				.equals(new StringBuilder(cleanString(str))
						.reverse()
						.toString());
	}
	
	private String cleanString(String str) {
		return str.
				replaceAll("[^a-zA-Z0-9]", "")
				.toLowerCase();
	}
}
