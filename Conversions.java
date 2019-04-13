/*
 * Author: Sean Stitzer
 * Date: 3/1/19
 */
public class Conversions {
	private static String[] hexAlphabet={"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
	/*
	 * Recursively calculates an output string that contains the 
	 * binary representation of a decimal number
	 */
	//test change
	
	protected static String decToBinary(String i) {
		long num=Long.parseLong(i);
		if(num>0)
			return decToBinary(num/2+"")+(num%2);
		else
			return "";
	}
	
	
	/*
	 * Calculates a hex number using an array alphabet
	 */
	protected static String decToHex(String input) {
		String output="";
		long num=Long.parseLong(input);
		while(num!=0) {	
			output=hexAlphabet[(int)(num % 16)]+output;
			num/=16;
		}
		return output;
	}
	
	/*
	 * returns an int which is a decimal version of an input binary string
	 */
	protected static String binaryToDec(String input) {
		int output=0;
		for(int i=0; i<input.length(); i++)
			if(input.substring(i, i+1).equals("1"))
				output+=Utility.power(input.length()-i-1, 2);
		return output+"";
	}
	
	protected static String hexToDec(String input) {
		int output=0;
		for(int i=0; i<input.length(); i++) {
			output+=Utility.arrIndexOf(hexAlphabet, input.substring(i, i+1))*
					(Utility.power(input.length()-(i+1), 16));
		}
		return output+"";
	}
}
