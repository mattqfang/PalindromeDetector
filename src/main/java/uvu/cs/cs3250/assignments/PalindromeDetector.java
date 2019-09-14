package uvu.cs.cs3250.assignments;

public class PalindromeDetector {
	 static boolean isPalindrome(String word){
		 
		 if(word.isEmpty()) {
			 return false;
		 }
		
		String lcWord = word.toLowerCase();
		String cleanWord = lcWord.replaceAll("[^0-9a-z]", "");
		char[] wordArray = cleanWord.toCharArray();
		
		int begin = 0;
		int end = wordArray.length - 1;
		
		while(begin < end) {
			if(wordArray[begin] != wordArray[end]) {
				return false;
			}else {
				++begin;
				--end;
			}
		}
		return true;
	}

}
