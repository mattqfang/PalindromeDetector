package uvu.cs.cs3250.assignments;

public class PalindromeDetector{
    static Boolean isPalindrome(String arg){
        String target = arg;
        target = target.replaceAll("^a-zA-Z0-9_-", "");
        arg = arg.replaceAll("^a-zA-Z0-9_-", "");
        int result = target.compareToIgnoreCase(arg);
        if(result == 0){
            return true;
        }
        else{
            return false;
        }


    }
}