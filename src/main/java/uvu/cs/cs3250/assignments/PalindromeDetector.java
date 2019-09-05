package uvu.cs.cs3250.assignments;

public class PalindromeDetector {
	public static boolean isPalindrome (String word) {
		if (word == null) { return false; }
		int l_index = 0;
		int r_index = word.length() - 1;
		while (l_index < r_index) {
			char l_char = Character.toLowerCase(word.charAt(l_index));
			char r_char = Character.toLowerCase(word.charAt(r_index));
			if (!Character.isLetter(l_char)) {
				l_index++;
			} else if (!Character.isLetter(r_char)) {
				r_index--;
			} else if (l_char != r_char) {
				return false;
			} else {
				l_index++;
				r_index--;
			}
		}
		return true;
	}
}
