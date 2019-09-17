package uvu.cs.cs3250.assignments;

public class PalindromeDetector {
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        int n = str.length();
        String strLower = str.toLowerCase();
        for (int i = 0, j = n; i <= j;) {
            //Check whether the characters are alphanumberic
            if (!(Character.isDigit(strLower.charAt(i))) && !(Character.isLetter(strLower.charAt(i)))) {
                ++i;
                continue;
            }
            if (!(Character.isDigit(strLower.charAt(j - 1))) && !(Character.isLetter(strLower.charAt(j - 1)))) {
                --j;
                continue;
            }
            
            if (strLower.charAt(i) != strLower.charAt(j - 1)) {
                return false;
            }   
            ++i;
            --j;
         }
       
         return true;
    }
}
