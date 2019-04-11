/*
 * Author: Sean Stitzer
 * Date: 3/1/19
 * This is a simple calculator to convert numbers to decimal, binary, and hexadecimal by taking an input
 * number and printing the converted number
 */
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Headers.welcomeH();
//		boolean run = true;
//		while(run) {
//			int opCode = Prompts.promptOperation();
//			if(opCode == 1) {
//				Headers.decToBinaryH();
//				System.out.println(Conversions.decToBinary(Prompts.promptOperand()));
//			}
//			else if(opCode == 2) {
//				Headers.decToHexH();
//				System.out.println(Conversions.decToHex(Prompts.promptOperand()));
//			}
//			else if(opCode == 3) {
//				Headers.binToDecH();
//				System.out.println(Conversions.binaryToDec(Prompts.promptOperand()));
//			}
//			else if(opCode == 4) {
//				Headers.hexToDecH();
//				System.out.println(Conversions.hexToDec(Prompts.promptOperand()));
//			}
//			else if(opCode == 0) {
//				System.out.println("Thank you for using CS Number Converter. Terminating program.");
//				run=false;
//			}
//		}	
		System.out.println(Conversions.hexToDec("4D494C4B"));
	}
}