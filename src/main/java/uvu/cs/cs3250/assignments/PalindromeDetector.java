package uvu.cs.cs3250.assignments;

public class PalindromeDetector {
    static boolean isPalindrome(String s) {
        //If 's' is null then return false before attempting to clean and reverse, because it's unnecessary
        if (s == null){
            return false;
        }
        //Call StringCleaner() to remove all special characters and numbers
        s = StringCleaner(s);

        //Reverse string with function StringReverser() and compare to original s with equalsIgnoreCase()
        return s.equalsIgnoreCase(StringReverser(s));
    }

    //Takes initial string and appends to a StringBuilder it then reverses using the .reverse() method.
    //Converts the reversed StringBuilder variable to a string using toString() and returns it.
    private static String StringReverser(String s){
        StringBuilder reverseString = new StringBuilder();

        reverseString.append(s);
        reverseString.reverse();

        return reverseString.toString();
    }

    //Return the string calling .replaceAll() passing a regex to remove numbers and special characters
    private static String StringCleaner(String s){
        return s.replaceAll("[^a-zA-Z]","");
    }
}


