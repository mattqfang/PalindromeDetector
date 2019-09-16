package uvu.cs.cs3250.assignments;

public class PalindromeDetector {
	public static boolean isPalindrome(String input) {
		if (input == null){
			return false;
		}
		if (input == ""){
			return true;
		}
		
		String low = input.toLowerCase().replaceAll("[^a-z]", "");
		String broke[] = low.split("", 0);
		

		boolean answer = true;
		for(int i = 0; i < low.length(); i++){
			if(!broke[i].equals(broke[low.length() - 1 - i]))
			{
				answer = false;
			}
			
		}
		return answer;
		
	}
}
