package uvu.cs.cs3250.assignments;

// I, Dallen Baldwin, assert that this code was written by myself
// and not copied from any other students. 

// A palindrome is a word, phrase, number, or other sequences of characters which reads the same backward as forward, such as “madam” or “racecar”. It is not case sensitive.

public class PalindromeDetector {
    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        
        String lower = input.toLowerCase();
        String fixedString = "";
        for (int i = 0; i < lower.length(); i++) {
            if (lower.charAt(i) >= 'a' && lower.charAt(i) <= 'z') {
                fixedString += lower.charAt(i);
            }
        }

        for (int i = 0; i < fixedString.length() / 2; i++) {// 5 / 2 = 2.5 -> 2, 4 / 2 = 2
            if (fixedString.charAt(i) != fixedString.charAt(fixedString.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}