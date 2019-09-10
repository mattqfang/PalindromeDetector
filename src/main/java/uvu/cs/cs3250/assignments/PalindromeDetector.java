package uvu.cs.cs3250.assignments;
//TODO: Add regex to remove invalid characters, (anything that's not a letter or a number?)

public class PalindromeDetector {
    static boolean isPalindrome(String s) {
        String reverseString = StringReverser(s);
        return s.equals(reverseString);
    }

    private static String StringReverser(String s){
        StringBuilder reverseString = new StringBuilder();
        reverseString.append(s);
        reverseString.reverse();

        return reverseString.toString();
    }

    public static void main(String[] args) {
        System.out.println("This is a test!");
        System.out.println("Input of \'val\' should return \"false\" let's see: " + isPalindrome("val"));
        System.out.println("The string \'assa\' should return true, does it... " + isPalindrome("assa"));
        System.out.println("I'm going to reverse the string: hubba");
        System.out.println(StringReverser("hubba"));
    }
}


