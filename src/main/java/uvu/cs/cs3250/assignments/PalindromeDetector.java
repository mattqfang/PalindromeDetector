package uvu.cs.cs3250.assignments;

import java.util.function.Function; 

public class PalindromeDetector {

  private static Function<String,String> clean = x -> x.replaceAll("[^a-zA-Z]", "");
  private static Function<String,String> reverse = x -> new StringBuilder(x).reverse().toString();
  private static Function<String,String> cleanReverse = clean.compose(reverse);

  public static Boolean isPalindrome(String word) {
    return (word == null) ?
      false : clean.apply(word).equalsIgnoreCase(cleanReverse.apply(word));
  }

  public static Boolean isPalindromeBasic(String dirtyWord) {
    if (dirtyWord == null) return false;
    String word = dirtyWord.toLowerCase().replaceAll("[^a-z]", "");
    return word.equals(new StringBuilder(word).reverse().toString());
  }

  public static Boolean isPalindromeEfficient(String dirtyWord) {
    if (dirtyWord == null) return false;
    
    String word = dirtyWord.toLowerCase().replaceAll("[^a-z]", "");
    Boolean returnVal = true;
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) != word.charAt(word.length()-i-1)) {
        returnVal = false;
      }
    }
    return returnVal;
  }
}
