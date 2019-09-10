package uvu.cs.cs3250.assignments;

// I, Dallen Baldwin, assert that this code was written by myself
// and not copied from any other students.

// A palindrome is a word, phrase, number, or other sequences of characters which reads the same backward as forward, such as “madam” or “racecar”. It is not case sensitive.

public class PalindromeDetector {
    public static boolean isPalindrome(String input) {
        if (input == null) return false;

        // fix the string
        String fixedString = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.toLowerCase().charAt(i) >= 'a' && input.toLowerCase().charAt(i) <= 'z') {
                fixedString += input.toLowerCase().charAt(i);
            }
        }

        // check the fixed string
        int mid = fixedString.length() / 2; // 5 / 2 = 2.5 -> 2, 4 / 2 = 2
        int last = fixedString.length() - 1;
        for (int i = 0; i < mid; i++) {
            if (fixedString.charAt(i) != fixedString.charAt(last - i)) { // check the two sides
                return false;
            }
        }

        return true;
    }
}