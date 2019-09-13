package uvu.cs.cs3250.assignments;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PalindromeDetectorTestForEmptyString {
	@Test
	public void testIsPalindrome_emptyString() {
		assertTrue(PalindromeDetector.isPalindrome(""));
	}
	
}
