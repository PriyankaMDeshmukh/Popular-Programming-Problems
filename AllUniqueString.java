// Check whether all characters in the given string are unique or not.
// I have tried solving this problem using 3 methods:
//        1. Using an additional data structure (an array of int or boolean which can keep track of all the characters encountered in the string)
//        2.) Using bit manipulation 
//        3.) Using 2 for loops (no space but complexity O( n^2) )


public class AllUniqueString {

	//method using additional data structure
	public static boolean allUniqueOrNot(String input) {
		int checkValue=0;
		int[] charAscii = new int[256]; // all chars ascii
		for(int i=0; i<input.length();i++) {
			checkValue = input.charAt(i);
			if(charAscii[checkValue]==1) {
				return false;
			}
			charAscii[checkValue]=1;
		}
		return true;
	}

	//bit manipulation
	public static boolean allUniqueOrNotBit(String input) {
		int checkValue=0;
		int setThatBit=0;
		for(int i=0; i<input.length();i++) {
			checkValue = input.charAt(i)-'a';
			if((setThatBit&(1<<checkValue))>0)
				return false;
			setThatBit=setThatBit|(1<<checkValue);

		}
		return true;
	}

	//no data structure
	public static boolean allUniqueOrNotNoDS(String input) {

		for(int i=0; i<input.length();i++) {
			for(int j=i+1; j<input.length();j++) {
			if(input.charAt(i)==input.charAt(j))
				return false;

			}
		}
		return true;
	}


	public static void main(String args[]) {
		System.out.println(allUniqueOrNot("abcda"));
		System.out.println(allUniqueOrNotBit("abcda"));
		System.out.println(allUniqueOrNotNoDS("abcda"));
	}
}
