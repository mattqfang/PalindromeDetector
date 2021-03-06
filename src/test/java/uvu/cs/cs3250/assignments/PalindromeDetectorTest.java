package uvu.cs.cs3250.assignments;

import org.junit.Test;

public class PalindromeDetectorTest {
	@Test
	public void testIsPalindrome_null() {
		assertFalse(PalindromeDetector.isPalindrome(null));
	}
	
	@Test
	public void testIsPalindrome_true_noSpecialChar() {
		assertTrue(PalindromeDetector.isPalindrome("bob"));
	}
	
	@Test
	public void testIsPalindrome_true_diffCases() {
		assertTrue(PalindromeDetector.isPalindrome("boB"));
	}
	
	@Test
	public void testIsPalindrome_true_wihSpecialChar() {
		assertTrue(PalindromeDetector.isPalindrome("b,o$b!"));
	}
	
	@Test
	public void testIsPalindrome_false() {
		assertFalse(PalindromeDetector.isPalindrome("trigger"));
	}
}
