import java.util.Scanner;
class OrDemo{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please any char:");

		char ch = sc.next().charAt(0);

		//check whether the char is lower or upper case
		//ascii range for lower : 97 - 122
		Boolean lower = ch >= 97 && ch <= 122;
		System.out.println(ch + " is in lowercase: " + lower);

		//ascii range for upper : 65 - 90
		Boolean upper = ch >= 65 && ch <= 90;
		System.out.println(ch + " is in upper case: " + upper);

		//check if it is an alphabet or not
		Boolean result = lower || upper;
		
		System.out.println(ch + " is an alphabate or not : " + result);

	
	}
}