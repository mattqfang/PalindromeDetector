public class PalindromeDetector{
        // pass a string to be tested
        // testing 
        //     get rid of caps, spaces, and special chars
        //     do the following at the same time
        //         look through string front to back 
        //         look through string back to front
        //     if equal its a Palindrome return to main
        //show true, false
//        String q;
//        System.out.println("Please enter a word or phrase.");
//        q = in.nextLine();
//        System.out.println("You Entered " + q);
//        q.isPalindrome(q);

    public static boolean isPalindrome(String nicompoop) {
        boolean sleepy;
	    if(nicompoop == null) {
	    	return false;
	    }
        nicompoop.toLowerCase();
        replace(nicompoop);
        sleepy = testMe(nicompoop);
        return sleepy;
    }
    public static void replace(String birdBrain) {
    	System.out.println(birdBrain);
    	birdBrain.replaceAll("\\W", "");
    	System.out.println(birdBrain);
//        birdBrain.replaceAll(" ","");
//        birdBrain.replaceAll("!","");
//        birdBrain.replaceAll("@","");
//        birdBrain.replaceAll("#","");
//        birdBrain.replaceAll("$","");
//        birdBrain.replaceAll("%","");
//        birdBrain.replaceAll("^","");
//        birdBrain.replaceAll("&","");
//        birdBrain.replaceAll("(","");
//        birdBrain.replaceAll(")","");
//        birdBrain.replaceAll("{","");
//        birdBrain.replaceAll("}","");
//        birdBrain.replaceAll("[","");
//        birdBrain.replaceAll("]","");
//        birdBrain.replaceAll("*","");
//        birdBrain.replaceAll("/","");
//        birdBrain.replaceAll("|","");
//        birdBrain.replaceAll(";","");
//        birdBrain.replaceAll(":","");
//        birdBrain.replaceAll("<","");
//        birdBrain.replaceAll(">","");
//        birdBrain.replaceAll(",","");
//        birdBrain.replaceAll(".","");
//        birdBrain.replaceAll("-","");
//        birdBrain.replaceAll("+","");
//        birdBrain.replaceAll("=","");
//        birdBrain.replaceAll("_","");
    }
    public static boolean testMe(String flubber){
    	int len = flubber.length();
    	int gen = len;
    	int low = 0;
    	char check1 = ' ';
    	char check2 = ' ';
    	do {
    		check1 = flubber.charAt(low);
    		check2 = flubber.charAt(len - 1);
    		System.out.println(check1);
	        System.out.println(check2);
    		if(check1 == check2) {
    			low += 1;
    			len -= 1;
    			}
    		else {
    			low = gen;
    		}
    	}while(low != gen);
    	if(low == gen) {
    		return true;
    	}
    	return false;
    }
}