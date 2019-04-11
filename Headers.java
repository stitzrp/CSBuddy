/*
 * Author: Sean Stitzer
 * Date: 2/27/19
 * This is a collection of graphical headers unique to each function to spruce up the console
 * and make it more user friendly
 */
public class Headers {

	protected static void welcomeH() {
		System.out.println("----------------------------------------------------------------");
		System.out.println("Welcome to the Computer Science Number Converter Tool!\n");
		System.out.println("This is a tool made by Sean Stitzer to make an easy offline");
		System.out.println("number conversion tool for annoyed computer scientists");
		System.out.println("----------------------------------------------------------------");
	}
	
	protected static void decToBinaryH() {
		System.out.println("Decimal To Binary Converter");
		System.out.println("================================================================");
	}
	
	protected static void decToHexH() {
		System.out.println("Decimal To Hexadecimal Converter");
		System.out.println("================================================================");
	}
	
	protected static void binToDecH() {
		System.out.println("Binary To Decimal Converter");
		System.out.println("================================================================");
	}
	
	protected static void hexToDecH() {
		System.out.println("Hexadecimal To Decimal Converter");
		System.out.println("================================================================");
	}
}
