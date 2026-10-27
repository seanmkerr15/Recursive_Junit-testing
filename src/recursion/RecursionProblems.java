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
 }
}




