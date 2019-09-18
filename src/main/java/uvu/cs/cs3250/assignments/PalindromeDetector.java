package uvu.cs.cs3250.assignments;

public class PalindromeDetector {

	static boolean isPalindrome(String target) {
		
		String testString = target;
		
		if(testString != null && !testString.isEmpty()) {    //check for null/empty string
			testString = testString.replaceAll("[^A-Za-z0-9]", "");   //removes any non alphanumeric characters
			testString = testString.toLowerCase();           //makes the string all lower case
			char[] stringToCharArray = testString.toCharArray();    // converts the string to a char array
		
			int forward = 0;	//these two variables denote the beginning and ending of the target word
			int backward = (stringToCharArray.length) - 1;
			
			while (backward > forward){		//check for parity of the individual chars of the array until the middle is reached
				char startChar = stringToCharArray[forward++];
		        char endChar = stringToCharArray[backward--];
		        if (startChar != endChar)
		            return false;	//if the mirrored chars are not equal returns false
			}
			
			return true;   //if the entire char array is parsed and the values were equal return true
		}
		else {
			return false;	//false if the string is null or empty
		}
		
	}

}
