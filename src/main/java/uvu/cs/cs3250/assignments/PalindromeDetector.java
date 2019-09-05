package uvu.cs.cs3250.assignments;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static java.lang.Character.isLetter;

public class PalindromeDetector {
    public static boolean isPalindrome(String word) {
        if(word == null) return false;

        String lowerCaseWord = word.toLowerCase();
        Stack backward = new Stack();
        Queue frontward = new LinkedList();
        boolean isPalindrome = true;

        for(int i = 0; i < lowerCaseWord.length(); i++) {
            if(isLetter(lowerCaseWord.charAt(i))) {
                backward.push(lowerCaseWord.charAt(i));
                frontward.add(lowerCaseWord.charAt(i));
            }
        }

        while(isPalindrome && !backward.empty()) {
            char stackChar = (char) backward.pop();
            char queueChar = (char) frontward.remove();
            isPalindrome = stackChar == queueChar;
        }
        return isPalindrome;
    }
}
