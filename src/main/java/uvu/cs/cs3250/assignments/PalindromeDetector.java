package uvu.cs.cs3250.assignments;

//Try to do it in a single loop
public class PalindromeDetector {
	
	/*public static void main(String args[]) {
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
	}*/
	
	//a way that doesn't use replaceAll()
	public static boolean isPalindrome(String str) {
		if(str == null || str.isEmpty()) {
			return false;
		}
		StringBuilder fixedString = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))) {
				fixedString.append(Character.toLowerCase(str.charAt(i)));
			}
		}
		return fixedString.toString().equals(fixedString.reverse().toString());
		
	}


}
