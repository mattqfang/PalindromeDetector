package uvu.cs.cs3250.assignments;

public class PalindromeDetector {
	
	public static boolean isPalindrome(String tocheck)
	{
		if(tocheck == null)
		{
			return false;
		}
		boolean toret = false;
		if( tocheck == "")
		{
			return true;
		}
		else
		{
			String stripped = tocheck.replaceAll("\\W", "");
			String lowered = stripped.toLowerCase();
			StringBuilder sb = new StringBuilder(lowered);
			String reversed = sb.reverse().toString();
			if (lowered.equals(reversed))
			{
				toret = true;
			}
		}
		return toret;
	}
}
