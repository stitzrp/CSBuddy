import java.util.Scanner;

/*
 * Author: Sean Stitzer
 * Date: 4/1/19
 */
public class Prompts {
	/*
	 * Prompts the user for an operation and returns an op code indicating the desired operation
	 * 1 = decimal to binary conversion
	 * 2 = decimal to hexadecimal conversion
	 * 3 = binary to decimal conversion
	 * 4 = hexadecimal to decimal conversion
	 */
	protected static int promptOperation() {
		boolean valid = false;
		Scanner scan = new Scanner(System.in);
		int op = -1;
		String in = "";
		while(!valid) {
			System.out.println("Enter 0 to exit the program\nEnter 1 for decimal to binary\nEnter 2 for decimal to hexadecimal"
				+ "\nEnter 3 for binary to decimal\nEnter 4 for hexadecimal to decimal");
			in = scan.nextLine();
			if(in.equals("0") || in.equals("1") || in.equals("2") || in.equals("3") || in.equals("4")) {
				op = Integer.parseInt(in);
				valid = true;
			}
			else 
				System.out.println("Error: could not read input, please try entering again");
		}
		return op;
	}
	
	/*
	 * prompts the user for the input number
	 */
	protected static String promptOperand() {
		boolean valid = false;
		Scanner scan = new Scanner(System.in);
		String operand = "";
		while(!valid) {
			System.out.print("Enter a number greater than zero to be converted\t");
			operand = scan.nextLine();
			long inLong = Long.parseLong(operand);
			if(inLong > 0)
				valid = true;
			else
				System.out.println("Error: could not read input, please try entering again");
		}
		return operand;
	}
}