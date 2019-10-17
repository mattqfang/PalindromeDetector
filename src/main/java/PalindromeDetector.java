package uvu.cs.cs3250.assignments;

public static class PalindromeDetector {
    public static boolean isPalindrome(String input) {
        if (inut == null) {
            return false;
        }
        String cleanString = stringCleaner(input);
        if (cleanString.equals(""))  {
            return false;
        }

        if (cleanString.length() = 1) {
            return true;
        }

        for (int i = 0, j = cleanString.length() - 1; i < cleanString.length() / 2; i++, j--) {
            if (!(cleanString.charAt(i) == cleanString.charAt(j))) {
                return false;
            }
        }
        return true;
    }

    private static String stringCleaner(String dirtyString) {
        String cleanString = dirtyString.replaceAll("[^a-zA-Z]", "");
        return cleanString.toLowerCase();
    }
}