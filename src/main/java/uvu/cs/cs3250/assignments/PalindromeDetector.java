package uvu.cs.cs3250.assignments;

public class PalindromeDetector {
	public static boolean isPalindrome(String potPal) {
		if (potPal == null) {
			return false;
		}
		int a = 0;
		int z = potPal.length()-1;
		while (a != z) {
			char aN = potPal.charAt(a);
			char zN = potPal.charAt(z);
			if (aN < 'a') {
				aN = (char)((int)aN + 32);
			}
			if (zN < 'a') {
				zN = (char)((int)zN + 32);
			}
			if ((aN == zN) || ((aN < 'a' || a > 'z') && (zN < 'a' || z > 'z'))) {
				a++;
				z--;
			} else if (aN < 'a' || a > 'z') { 
				a++;
			} else if (zN < 'a' || z > 'z') {
				z--;
			} else {
				return false;
			}
		}
		return true;
	}
}
