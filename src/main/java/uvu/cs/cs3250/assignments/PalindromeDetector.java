package uvu.cs.cs3250.assignments;

public class PalindromeDetector{
    static Boolean isPalindrome(String arg){
       if(arg == null){
           return false;
       } 
        String target = arg;
        target = target.replaceAll("[^a-zA-Z0-9]", "");
        arg = arg.replaceAll("[^a-zA-Z0-9]", "");
        target = new StringBuilder(target).reverse().toString();
        int result = target.compareToIgnoreCase(arg);
        if(result == 0){
            return true;
        }
        else{
            return false;
        }


    }
}