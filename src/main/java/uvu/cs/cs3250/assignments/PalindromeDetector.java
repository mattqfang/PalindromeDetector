package uvu.cs.cs3250.assignments;

//Try to do it in a single loop
public class PalindromeDetector {
	
	public static void main(String args[]) {
		System.out.println(isPalindrome("#B%ob"));
	}
	public static boolean isPalindrome(String str) {
		String backwardString, forwardString;
		char lastChar, firstChar;
		int lastIndex, firstIndex;
		if(str == null) {
			return false;
		}
		else if(str == "") {
			return false;
		}
		else{
			str.toLowerCase();
			lastIndex = str.length()-1; 
			firstIndex = 0;
			forwardString = "";
			backwardString = "";
			for(int i = 0; i < str.length(); i++) {
				lastChar = str.charAt(lastIndex);
				firstChar = str.charAt(firstIndex);
				if(!isSpecialCharacter(firstChar)) {
					forwardString += firstChar;
				}
				if(!isSpecialCharacter(lastChar)) {
					backwardString += lastChar;
				}
				lastIndex--;
				firstChar++;
			}
			return forwardString.equals(backwardString);
		}
	}
	
	public static boolean isSpecialCharacter(char c) {
		char[] normalChar = {}
	}

}
