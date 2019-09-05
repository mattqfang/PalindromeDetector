package uvu.cs.cs3250.assignments;

// I, Dallen Baldwin, assert that this code was written by myself
// and not copied from any other students. 


// A palindrome is a word, phrase, number, or other sequences of characters which reads the same backward as forward, such as “madam” or “racecar”. It is not case sensitive.

public class PalindromeDetector {
    public static boolean isPalindrome(String input) {
        String[] characters = input.toLowerCase().split("");
        String fixedString = "";

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] && characters[i]) {
                fixedString += lowerString.at(i);
            }
        }

        // switch (input){
        //     case "null": 
        //         return false;
        //     default: return false;
        // }
        return false;
    }
}