package uvu.cs.cs3250.assignments;

public class PalindromeDetector {

	static public boolean isPalindrome(String palindrome)
	{
		// Makes sure there is a non-null value passed in
		if (palindrome == null)
			return false;
		
		// Converts the string entered into an all lowercase char array
		char[] pOrig = palindrome.toLowerCase().toCharArray();
		int numLetters = 0, i = 0;
		
		// Determines how many letters are in the array
		for (i = 0; i < pOrig.length; i++)
			if (Character.isLetter(pOrig[i]))
				++numLetters;
		// Print contents of original array
		System.out.println(pOrig);
		
		// Create char arrays only as big as there are letters in original
		char[] pForward = new char[numLetters];
		char[] pReverse = new char[numLetters];
		int j = 0;
		
		// Add only the letters from original into a char array
		for (i = 0; i < pOrig.length; i++)
			if (Character.isLetter(pOrig[i]))
				pForward[j++] = pOrig[i];
		// Print contents of forward array
		System.out.println(pForward);
		
		// Add all the letters back to front into another char array
		j = numLetters - 1;
		for (i = 0; i < numLetters; i++)
			pReverse[i] = pForward[j--];
		// Print contents of reversed array
		System.out.println(pReverse);
		
		String forward = "", reverse = "";
		
		for (i = 0; i < numLetters; i++)
		{
			forward += pForward[i];
			reverse += pReverse[i];
		}
		
		if (forward.equals(reverse))
			return true;
		else
			return false;
	}

}
