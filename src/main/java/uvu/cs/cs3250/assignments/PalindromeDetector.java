package uvu.cs.cs3250.assignments;

//Try to do it in a single loop
public class PalindromeDetector {
	
	public static void main(String args[]) {
		System.out.println(isPalindrome("#B%ob"));
	}
	public static boolean isPalindrome(String str) {
		int lastIndex, firstIndex;
		if(str == null || str == "" || str == " ") {
			return false;
		}
		else{
			str = str.replaceAll("\\W", "").toLowerCase();
			lastIndex = str.length()-1; 
			firstIndex = 0;
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(lastIndex) != str.charAt(firstIndex)) {
					return false;
				}
				lastIndex--;
				firstIndex++;
			}
			return true;
		}
	}
	
	//Try to find a way that doesn't use repla


}
