package uvu.cs.cs3250.assignments;

public class PalindromeDetector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static boolean isPalindrome(String input)
	{
		//variables and constants
		final int CAPS_UPPER_BOUND = 90;
		final int CAPS_LOWER_BOUND = 65;
		final int LOWER_UPPER_BOUND = 122;
		final int LOWER_LOWER_BOUND = 97;
		final int NUM_UPPER_BOUND = 57;
		final int NUM_LOWER_BOUND = 48;
		final int UPPER_LOWER_DIFFERENCE = 32;
		
		int counter = 0;
		int marker = 0;
		int size = 0;
		boolean isPalindrome = true;
		
		//Make sure it's not empty.
		
		if (input == null)
		{
			isPalindrome = false;
		}
		
		else
		{
			//Format the array
			char[] inputFormatted = input.toCharArray();
			size = input.length();
		
			//identify only letters and numbers and rewrite over the array.
			while (marker < size)
			{
				//Check if it's a capital letter
				if (inputFormatted[marker] <= CAPS_UPPER_BOUND && inputFormatted[marker] >= CAPS_LOWER_BOUND)
				{
					inputFormatted[counter] = inputFormatted[marker];
					counter++;
					marker++;
				}
			
				//check if it's a lower case letter
				else if (inputFormatted[marker] <= LOWER_UPPER_BOUND && inputFormatted[marker] >= LOWER_LOWER_BOUND)
				{
					inputFormatted[counter] = inputFormatted[marker];
					counter++;
					marker++;
				}
			
				//check if it's a number
				else if (inputFormatted[marker] <= NUM_UPPER_BOUND && inputFormatted[marker] >= NUM_LOWER_BOUND)
				{
					inputFormatted[counter] = inputFormatted[marker];
					counter++;
					marker++;
				}
			
				//if it's a special character, don't augment the counter in order to write over that spot.
				else
				{
					marker++;
				}
			}
		
		
			//Check if it's a palindrome
			marker = 0;
			counter--;
			while (marker <= counter && isPalindrome == true)
			{
				//If it's an uppercase letter
				if (inputFormatted[marker] <= CAPS_UPPER_BOUND && inputFormatted[marker] >= CAPS_LOWER_BOUND)
				{
					if (inputFormatted[marker] == inputFormatted[counter] || (inputFormatted[marker] + UPPER_LOWER_DIFFERENCE) == inputFormatted[counter])
					{
						counter--;
						marker++;
					}
				}
			
				//If it's a lowercase letter
				else if (inputFormatted[marker] <= LOWER_UPPER_BOUND && inputFormatted[marker] >= LOWER_LOWER_BOUND)
				{
					if (inputFormatted[marker] == inputFormatted[counter] || (inputFormatted[marker] - UPPER_LOWER_DIFFERENCE) == inputFormatted[counter])
					{
						counter--;
						marker++;
					}
				}
			
				//If it's a number
				else if (inputFormatted[marker] <= NUM_UPPER_BOUND && inputFormatted[marker] >= NUM_LOWER_BOUND)
				{
					if (inputFormatted[marker] == inputFormatted[counter])
					{
						counter--;
						marker++;
					}
				}
			
				else
					isPalindrome = false;
			}
		}
		return isPalindrome;
	}

}
