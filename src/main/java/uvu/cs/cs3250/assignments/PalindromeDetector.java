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
		//int word = low.length();
		String broke[] = low.split("", 0);
		
		//int len = broke.length();
		//int mod =  % 2;
		boolean answer = true;
		for(int i = 0; i < low.length(); i++){
			if(!broke[i].equals(broke[low.length() - 1 - i]))
			{
				answer = false;
			}
			// else {
			// 	return true;
			// }
		}
		return answer;
		// if (mod == 0){
		// 	if (broke[0] == broke[word-1]){

		// 	}
		// 	else{
		// 		return false;
		// 	}
		// }
		// if (mod == 1){
		// 	if (broke[0] == broke[word-1]){
				
		// 	}
		// 	else{
		// 		return false;
		// 	}
		// }
	}
}
