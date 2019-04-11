/*
 * Author: Sean Stitzer
 * Date: 3/1/19
 */
public class Utility {
	
	protected static int power(int exp, int base) {
		if(exp==0)
			return 1;
		else
			return base*power(exp-1, base);
	}
	
	/*
	 * takes in an input array and a target to be found in the array. returns -1 if it is not found
	 * and if the target is found, the position of the last instance of the target in the array
	 */
	protected static int arrIndexOf(String inputArr[], String target) {
		int targetIndex=-1;
		for(int i=0; i<inputArr.length; i++) {
			if(inputArr[i].equals(target))
				targetIndex=i;
		}
		return targetIndex;
	}
}
