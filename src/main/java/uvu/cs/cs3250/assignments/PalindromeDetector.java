package uvu.cs.cs3250.assignments;

import java.lang.Character;

public class PalindromeDetector {

    public static Boolean isPalindrome(String s){
        Boolean isPal = false;
        if(s != null){
            s = s.replaceAll("\\W","").toLowerCase();
            StringBuffer sb = new StringBuffer(s).reverse();
            if(s.equals(sb.toString())) isPal = true;
        }
        return isPal;
    }
}
