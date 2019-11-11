package uvu.cs.cs3250.assignments;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PalindromeDetectorTest {
	private PalindromeDetector pd;
	
	@Before
	public void setUp() {
		pd = new PalindromeDetector();
	}
	
	@Test
	public void testIsPalindrome_null() {
		assertFalse(pd.isPalindrome(null));
	}
	
	@Test
	public void testIsPalindrome_true_noSpecialChar() {
		assertTrue(pd.isPalindrome("bob"));
	}
	
	@Test
	public void testIsPalindrome_true_diffCases() {
		assertTrue(pd.isPalindrome("boB"));
	}
	
	@Test
	public void testIsPalindrome_true_wihSpecialChar() {
		assertTrue(pd.isPalindrome("b,o$b!"));
	}
	
	@Test
	public void testIsPalindrome_false() {
		assertFalse(pd.isPalindrome("trigger"));
	}
}
