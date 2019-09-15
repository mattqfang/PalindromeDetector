package uvu.cs.cs3250.assignments;


public class PalindromeDetector 
{
	boolean sValue;
	//create a constructor
	public PalindromeDetector()
	{
		//yes no switch value
		sValue = false;
	}
	
	
	//Method to detectPalindrome...isPalindrome
	public boolean isPalindrome(String aWord)
	{
	//is string null?
		if (aWord == null)
			sValue = true;
	//two counters start and finish
		else if (aWord.length()==1)
			sValue = true;
		
		else 
		{
			int f = 0;
			int l = aWord.length()-1;
			char first = aWord.charAt(f);
			char last = aWord.charAt(l);
			do {
				if (!Character.isLetterOrDigit(first))
				  {
					do {
						f++;
						first = aWord.charAt(f);
					   }while(!Character.isLetterOrDigit(first));
					
				  }
				if (!Character.isLetterOrDigit(last))
				{
					do {
						l--;
						last = aWord.charAt(l);
					   }while(!Character.isLetterOrDigit(last));
				}
				
				
				if ((Character.toUpperCase(first) == Character.toUpperCase(last)))
				  sValue = true;
				else sValue = false;
				if(f<l)
				f++;l--;
			}while((f<l));
				
	     }
		return sValue;
	}
	
	
}

