//Print the ASCII value of the character inputted by user

import java.util.Scanner;
class AsciiValue{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any character");
		char ch = sc.next().charAt(0);

		int value = (int)(ch);
		System.out.println("ascii value are " +  ch + "is: " + value);
	}
}