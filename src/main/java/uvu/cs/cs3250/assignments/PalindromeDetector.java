package uvu.cs.cs3250.assignments;

public class PalindromeDetector {
    public static boolean isPalindrome(String string) {
        // check for null strings
        if (string != null) {
            // lowercase the string
            string = string.toLowerCase();

            // remove special characters using regex
            string = string.replaceAll("[^a-zA-Z0-9]", "");

            // put string into array
            String[] stringArr = string.split("");

            // loop through and check for palindrome
            for (int i = 0; i < string.length() / 2; i++) {
                if (!stringArr[i].equals(stringArr[(string.length() - 1) - i])) {
                    return false;
                }
            }

            // if all in loop matches, return that it is a palindrome
            return true;
        }
        return false;
    }
}
