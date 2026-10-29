package recursion;

public class RecursionProblems {
	public static int countEight(int number) {
		
		//base case
		if (number == 0) {
			return 0;
		}
		
		//get the ones place and see if it is an 8
		int onesPlace = number % 10;
		//get rid of the ones place.
		number /= 10;
		if (onesPlace == 8) {
			int tensPlace = number % 10;
			if (tensPlace == 8) {
				return 2 + countEight(number); //means we have 2-8
			}
			else {
				return 1 + countEight(number); //means we have 1-8
			}
		}
		return countEight(number);
	}
		public static int countCat(String str, String sub) {
			//base case
			if(sub == null)
				return 0;
			if(sub.length() == 0) {
				return 0;
			}
			if(str.length() < sub.length())
				return 0;
			
			String substr = str.substring(0, sub.length());
			if(substr.equals(sub)) {
				return 1 + countCat(str.substring(sub.length()), sub);
			}
			//did not find the sub word
			//take out first letter in str
			return countCat(str.substring(1), sub);
				
		}
		public static String noRepeat(String str) {
	if(str == null)
	return str;
	
	
	if(str.length() <= 1)
		return str;
	
	if(str.charAt(0) == str.charAt(1))
		//the first 2 letters are the same so call again minus that.
		return noRepeat(str.substring(1));
	//the first 2 letters are different.
	return str.charAt(0) + noRepeat(str.substring(1));
}
/*	public static int countHi(String word) {
		if (word.length() == 0) {
			return 0;
		}
		int count = 0;
		//get the last letter of the word
		int firstletter = word % 10;
	}
*/
	
public static void main (String[] args) {
    System.out.println(countEight(287789788));
    countCat("catcowcatcow", "cat");
 }
}




