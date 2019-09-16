package uvu.cs.cs3250.assignments;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeDetectorTest {
	@Test
	public void testIsPalindrome_null() {
		System.out.println("null()");
		assertFalse(PalindromeDetector.isPalindrome(null));
	}
	
	@Test
	public void testIsPalindrome_true_noSpecialChar() {
		System.out.println("true_noSpecialChar()");
		assertTrue(PalindromeDetector.isPalindrome("bob"));
	}
	
	@Test
	public void testIsPalindrome_true_diffCases() {
		System.out.println("true_diffCases");
		assertTrue(PalindromeDetector.isPalindrome("boB"));
	}
	
	@Test
	public void testIsPalindrome_true_wihSpecialChar() {
		System.out.println("true_withSpecialChar()");
		assertTrue(PalindromeDetector.isPalindrome("b,o$b!"));
	}
	
	@Test
	public void testIsPalindrome_false() {
		System.out.println("false()");
		assertFalse(PalindromeDetector.isPalindrome("trigger"));
	}
}
